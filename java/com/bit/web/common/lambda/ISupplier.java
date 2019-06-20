package com.bit.web.common.lambda;

/**
 * ISupplier
 * 
 */
@FunctionalInterface
public interface ISupplier<T> {
    public Object  get (Object o);
    
}