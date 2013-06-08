package com.jdom.logging.android;

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

import com.jdom.logging.api.Logger;
import com.jdom.logging.api.LoggerFactory;

/**
 * @author djohnson
 * 
 */
public class AndroidLoggerFactory implements LoggerFactory {

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.jdom.logging.api.LoggerFactory#getLogger(java.lang.Class)
	 */
	@Override
	public Logger getLogger(Class<?> clazz) {
		return new AndroidLogger(clazz);
	}

}
