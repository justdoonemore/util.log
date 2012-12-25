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

import com.jdom.logging.api.Logger;

/**
 * @author djohnson
 * 
 */
public class Log4jLogger implements Logger {

	private final org.apache.log4j.Logger logInstance;

	public Log4jLogger(Class<?> clazz) {
		this.logInstance = org.apache.log4j.Logger.getLogger(clazz);
	}

	@Override
	public void trace(String message) {
		this.logInstance.trace(message);
	}

	@Override
	public void debug(String message) {
		this.logInstance.debug(message);
	}

	@Override
	public void info(String message) {
		this.logInstance.info(message);
	}

	@Override
	public void warn(String message) {
		this.logInstance.warn(message);
	}

	@Override
	public void error(String message) {
		this.logInstance.error(message);
	}

	@Override
	public void fatal(String message) {
		this.logInstance.fatal(message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#trace(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void trace(String message, Throwable throwable) {
		this.logInstance.trace(message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#debug(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void debug(String message, Throwable throwable) {
		this.logInstance.debug(message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#info(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void info(String message, Throwable throwable) {
		this.logInstance.info(message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#warn(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void warn(String message, Throwable throwable) {
		this.logInstance.warn(message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#error(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void error(String message, Throwable throwable) {
		this.logInstance.error(message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#fatal(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void fatal(String message, Throwable throwable) {
		this.logInstance.fatal(message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isTraceEnabled()
	 */
	@Override
	public boolean isTraceEnabled() {
		return this.logInstance.isTraceEnabled();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isDebugEnabled()
	 */
	@Override
	public boolean isDebugEnabled() {
		return this.logInstance.isDebugEnabled();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isInfoEnabled()
	 */
	@Override
	public boolean isInfoEnabled() {
		return this.logInstance.isInfoEnabled();
	}

}
