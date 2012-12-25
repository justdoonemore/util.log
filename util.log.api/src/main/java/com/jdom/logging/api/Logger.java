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
public interface Logger {

	void trace(String message);

	void debug(String message);

	void info(String message);

	void warn(String message);

	void error(String message);

	void fatal(String message);
	
	void trace(String message, Throwable throwable);

	void debug(String message, Throwable throwable);

	void info(String message, Throwable throwable);

	void warn(String message, Throwable throwable);

	void error(String message, Throwable throwable);

	void fatal(String message, Throwable throwable);

	boolean isTraceEnabled();

	boolean isDebugEnabled();

	boolean isInfoEnabled();

}
