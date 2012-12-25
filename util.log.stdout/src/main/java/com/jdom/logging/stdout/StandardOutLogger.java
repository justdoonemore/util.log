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
package com.jdom.logging.stdout;

import com.jdom.logging.api.Logger;

/**
 * @author djohnson
 * 
 */
public class StandardOutLogger implements Logger {

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#trace(java.lang.String)
	 */
	@Override
	public void trace(String message) {
		log("TRACE", message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#debug(java.lang.String)
	 */
	@Override
	public void debug(String message) {
		log("DEBUG", message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#info(java.lang.String)
	 */
	@Override
	public void info(String message) {
		log("INFO", message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#warn(java.lang.String)
	 */
	@Override
	public void warn(String message) {
		log("WARN", message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#error(java.lang.String)
	 */
	@Override
	public void error(String message) {
		log("ERROR", message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#fatal(java.lang.String)
	 */
	@Override
	public void fatal(String message) {
		log("FATAL", message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#trace(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void trace(String message, Throwable throwable) {
		log("ERROR", message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#debug(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void debug(String message, Throwable throwable) {
		logStacktrace("DEBUG", message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#info(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void info(String message, Throwable throwable) {
		logStacktrace("INFO", message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#warn(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void warn(String message, Throwable throwable) {
		logStacktrace("WARN", message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#error(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void error(String message, Throwable throwable) {
		logStacktrace("ERROR", message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#fatal(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void fatal(String message, Throwable throwable) {
		logStacktrace("FATAL", message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isTraceEnabled()
	 */
	@Override
	public boolean isTraceEnabled() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isDebugEnabled()
	 */
	@Override
	public boolean isDebugEnabled() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isInfoEnabled()
	 */
	@Override
	public boolean isInfoEnabled() {
		return true;
	}

	/**
	 * @param logLevel
	 * @param message
	 */
	private void log(String logLevel, String message) {
		System.out.println("[" + logLevel + "] " + message);
	}

	/**
	 * @param string
	 * @param message
	 * @param throwable
	 */
	private void logStacktrace(String string, String message,
			Throwable throwable) {
		log(string, message);
		throwable.printStackTrace();
	}
}
