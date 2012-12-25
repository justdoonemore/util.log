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
package com.jdom.logging.api;

/**
 * @author djohnson
 * 
 */
public class MockLogger implements Logger {

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#trace(java.lang.String)
	 */
	@Override
	public void trace(String message) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#debug(java.lang.String)
	 */
	@Override
	public void debug(String message) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#info(java.lang.String)
	 */
	@Override
	public void info(String loggedMessage) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#warn(java.lang.String)
	 */
	@Override
	public void warn(String message) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#error(java.lang.String)
	 */
	@Override
	public void error(String message) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#fatal(java.lang.String)
	 */
	@Override
	public void fatal(String message) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isTraceEnabled()
	 */
	@Override
	public boolean isTraceEnabled() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isDebugEnabled()
	 */
	@Override
	public boolean isDebugEnabled() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#isInfoEnabled()
	 */
	@Override
	public boolean isInfoEnabled() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#trace(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void trace(String message, Throwable throwable) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#debug(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void debug(String message, Throwable throwable) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#info(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void info(String message, Throwable throwable) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#warn(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void warn(String message, Throwable throwable) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#error(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void error(String message, Throwable throwable) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.Logger#fatal(java.lang.String,
	 *      java.lang.Throwable)
	 */
	@Override
	public void fatal(String message, Throwable throwable) {

	}

}
