/** 
 *  Copyright (C) 2012  Just Do One More
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jdom.logging.log4j;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import com.jdom.logging.api.Logger;

/**
 * @author djohnson
 * 
 */
public class Log4jLoggerTest {

	private static final File logFile = new File("build", "test.log");

	private static final String LOGGED_MESSAGE = "logged message";

	private final Logger logger = new Log4jLogger(Log4jLoggerTest.class);

	private final Logger onlyFatalLevelEnabledLogger = new Log4jLogger(
			OnlyInfoLevelEnabled.class);

	private String beforeTestFileContents;

	@Before
	public void setUp() throws IOException {
		beforeTestFileContents = FileUtils.readFileToString(logFile);
	}

	@Test
	public void log4jLoggerCanLogTrace() throws IOException {
		logger.trace(LOGGED_MESSAGE);

		String logMessage = readLogMessage();

		assertThat(logMessage, is(equalTo(expectedLogMessageForLevel("TRACE"))));
	}

	@Test
	public void log4jLoggerCanLogDebug() throws IOException {
		logger.debug(LOGGED_MESSAGE);

		String logMessage = readLogMessage();

		assertThat(logMessage, is(equalTo(expectedLogMessageForLevel("DEBUG"))));
	}

	@Test
	public void log4jLoggerCanLogInfo() throws IOException {
		logger.info(LOGGED_MESSAGE);

		String logMessage = readLogMessage();

		assertThat(logMessage, is(equalTo(expectedLogMessageForLevel("INFO"))));
	}

	@Test
	public void log4jLoggerCanLogWarn() throws IOException {
		logger.warn(LOGGED_MESSAGE);

		String logMessage = readLogMessage();

		assertThat(logMessage, is(equalTo(expectedLogMessageForLevel("WARN"))));
	}

	@Test
	public void log4jLoggerCanLogError() throws IOException {
		logger.error(LOGGED_MESSAGE);

		String logMessage = readLogMessage();

		assertThat(logMessage, is(equalTo(expectedLogMessageForLevel("ERROR"))));
	}

	@Test
	public void log4jLoggerCanLogFatal() throws IOException {
		logger.fatal(LOGGED_MESSAGE);

		String logMessage = readLogMessage();

		assertThat(logMessage, is(equalTo(expectedLogMessageForLevel("FATAL"))));
	}

	@Test
	public void isTraceEnabledDelegatesToLog4jLogger() {
		assertThat(logger.isTraceEnabled(), is(true));
		assertThat(onlyFatalLevelEnabledLogger.isTraceEnabled(), is(false));
	}

	@Test
	public void isDebugEnabledDelegatesToLog4jLogger() {
		assertThat(logger.isDebugEnabled(), is(true));
		assertThat(onlyFatalLevelEnabledLogger.isDebugEnabled(), is(false));
	}

	@Test
	public void isInfoEnabledDelegatesToLog4jLogger() {
		assertThat(logger.isInfoEnabled(), is(true));
		assertThat(onlyFatalLevelEnabledLogger.isInfoEnabled(), is(true));
	}

	private String readLogMessage() throws IOException {
		String currentFileContents = FileUtils.readFileToString(logFile);
		return currentFileContents.substring(beforeTestFileContents.length());
	}

	private static String expectedLogMessageForLevel(String level) {
		return "[" + level + "] [" + Log4jLoggerTest.class.getName() + "] ["
				+ LOGGED_MESSAGE + "]\n";
	}
}
