/**
 * @Log.java
 *
 * Copyright � Axa Canada Tech.
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
 * Log interface. Wrapper for the implemented logging system
 * 
 * @author carbom02
 */
public interface ILog
{

    /**
     * Sends a debug message.
     * 
     * @param o
     *            message to display
     */
    public void debug(final Object o);

    /**
     * Sends a debug message.
     * 
     * @param o
     *            message to display *
     * @param pThrowable
     *            A throwable to display along with message
     */
    public void debug(final Object o, final Throwable pThrowable);
    
    /**
     * Sends an information message.
     * 
     * @param o
     *            message to display
     */
    public void info(final Object o);

    /**
     * Sends a warning message.
     * 
     * @param pMsg
     *            message to display
     */

    public void warn(final Object pMsg);

    /**
     * Sends a warning message.
     * 
     * @param pMsg
     *            message to display
     * @param pThrowable
     *            A throwable to display along with message
     */
    public void warn(final Object pMsg, final Throwable pThrowable);

    /**
     * Sends an error message.
     * 
     * @param o
     *            message to display
     */
    public void error(final Object o);

    /**
     * Sends an error message.
     * 
     * @param o
     *            message to display
     * @param pThrowable
     *            A throwable to display along with message
     */
    public void error(final Object o, final Throwable pThrowable);

    /**
     * Sends a fatal message.
     * 
     * @param o
     *            message to display
     */
    public void fatal(final Object o);

    /**
     * Sends a fatal message.
     * 
     * @param o
     *            message to display *
     * @param pThrowable
     *            A throwable to display along with message
     */
    public void fatal(final Object o, final Throwable pThrowable);

    public boolean isInfoEnabled();
    public boolean isDebugEnabled();
}