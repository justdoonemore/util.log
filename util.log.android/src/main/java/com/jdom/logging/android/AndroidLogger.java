package com.jdom.logging.android;

import android.util.Log;

import com.jdom.logging.api.LogLevel;
import com.jdom.logging.api.Logger;

/** 
 *  Copyright (C) 2013  Just Do One More
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

/**
 * @author djohnson
 * 
 */
public class AndroidLogger implements Logger {

	private final String className;

	/**
	 * @param clazz
	 */
	public AndroidLogger(Class<?> clazz) {
		this.className = clazz.getSimpleName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#trace(java.lang.String)
	 */
	@Override
	public void trace(String message) {
		Log.v(className, message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#debug(java.lang.String)
	 */
	@Override
	public void debug(String message) {
		Log.d(className, message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#info(java.lang.String)
	 */
	@Override
	public void info(String message) {
		Log.i(className, message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#warn(java.lang.String)
	 */
	@Override
	public void warn(String message) {
		Log.w(className, message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#error(java.lang.String)
	 */
	@Override
	public void error(String message) {
		Log.e(className, message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#fatal(java.lang.String)
	 */
	@Override
	public void fatal(String message) {
		Log.wtf(className, message);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#trace(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void trace(String message, Throwable throwable) {
		Log.d(className, message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#debug(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void debug(String message, Throwable throwable) {
		Log.d(className, message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#info(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void info(String message, Throwable throwable) {
		Log.i(className, message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#warn(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void warn(String message, Throwable throwable) {
		Log.w(className, message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#error(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void error(String message, Throwable throwable) {
		Log.e(className, message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#fatal(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void fatal(String message, Throwable throwable) {
		Log.wtf(className, message, throwable);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isTraceEnabled()
	 */
	@Override
	public boolean isTraceEnabled() {
		return isEnabledFor(LogLevel.TRACE);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isDebugEnabled()
	 */
	@Override
	public boolean isDebugEnabled() {
		return isEnabledFor(LogLevel.DEBUG);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isInfoEnabled()
	 */
	@Override
	public boolean isInfoEnabled() {
		return isEnabledFor(LogLevel.INFO);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isEnabledFor(com.jdom.logging.api.LogLevel)
	 */
	@Override
	public boolean isEnabledFor(LogLevel level) {
		switch (level) {
		case TRACE:
			// Intentional fall-through
		case DEBUG:
			return Log.isLoggable(className, Log.DEBUG);
		case INFO:
			return Log.isLoggable(className, Log.INFO);
		case WARN:
			return Log.isLoggable(className, Log.WARN);
		case ERROR:
			// Intentional fall-through
		case FATAL:
			return Log.isLoggable(className, Log.ERROR);
		default:
			throw new IllegalArgumentException("LogLevel [" + level
					+ "] is not currently supported by the Android logger!");
		}
	}
}
