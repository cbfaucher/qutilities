/**
 * @LoggingInitialisationException.java
 *
 * Copyright © Axa Canada Tech.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Axa Canada Tech. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Axa Canada Tech.
 */

package com.quartz.qutilities.logging;

/**
 * Exception thrown by {@link LogManager} when it fails to initialise Java-Excel logging properly.
 *
 * @author Christian Faucher (fauchc02)
 */
public class LoggingInitialisationException extends RuntimeException
{
    /**
     * Create a new Exception 
     *
     * @param message The message
     */
    public LoggingInitialisationException(final String message)
    {
        super(message);
    }
}
