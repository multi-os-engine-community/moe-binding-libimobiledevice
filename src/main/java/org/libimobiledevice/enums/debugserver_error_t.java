/*
 * Java binding for libimobiledevice and libplist.
 * 
 * Copyright 2014-2016 Intel Corporation
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.libimobiledevice.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class debugserver_error_t {
	@Generated
	private debugserver_error_t() {
	}

	@Generated
	public static final int DEBUGSERVER_E_SUCCESS = 0x00000000;
	@Generated
	public static final int DEBUGSERVER_E_INVALID_ARG = 0xFFFFFFFF;
	@Generated
	public static final int DEBUGSERVER_E_MUX_ERROR = 0xFFFFFFFE;
	@Generated
	public static final int DEBUGSERVER_E_SSL_ERROR = 0xFFFFFFFD;
	@Generated
	public static final int DEBUGSERVER_E_RESPONSE_ERROR = 0xFFFFFFFC;
	@Generated
	public static final int DEBUGSERVER_E_UNKNOWN_ERROR = 0xFFFFFF00;
}
