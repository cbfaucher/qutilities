/*
 * Copyright (c) 2007 9095-2458 Quebec Inc. All Rights Reserved.
 *
 * Althought this code is consider of good quality and has been tested, it is
 * provided to you WITHOUT guaranty of any kind.
 */
package com.quartz.qutilities.spring.validators;

import org.springframework.validation.Errors;

/**
 * INSERT YOUR COMMENT HERE....
 *
 * @author Christian
 * @since Quartz...
 */
public class ValidationException extends RuntimeException
{
    final public Errors errors;

    public ValidationException(String message)
    {
        this(message, null);
    }

    public ValidationException(Errors pErrors)
    {
        errors = pErrors;
    }

    public ValidationException(String message, Errors pErrors)
    {
        super(message);
        errors = pErrors;
    }
}
