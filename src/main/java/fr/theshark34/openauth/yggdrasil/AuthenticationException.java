/*
 * Copyright 2015 TheShark34
 *
 * This file is part of OpenAuth.

 * OpenAuth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenAuth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with OpenAuth.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.theshark34.openauth.yggdrasil;

import fr.theshark34.openauth.yggdrasil.model.AuthErrorModel;

/**
 * Authentication exceptions
 *
 * @version 1.0.0-RELEASE
 * @author TheShark34
 */
public class AuthenticationException extends Exception {

    /**
     * The given JSON model instance of the error
     */
    private AuthErrorModel model;

    /**
     * Create a new Authentication Exception
     *
     * @param model
     *            The given JSON model instance of the error
     */
    public AuthenticationException(AuthErrorModel model) {
        this.model = model;
    }

    /**
     * Returns the given JSON model instance of the error
     *
     * @return The error model
     */
    public AuthErrorModel getErrorModel() {
        return model;
    }

}