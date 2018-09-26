package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

import java.io.Serializable;

/**
 * 
 * This is an interface for locations. It extends {@link Serializable}.
 * 
 * @author cloudstrife9999
 *
 */
@FunctionalInterface
public interface Location extends Serializable {
    
    /**
     * 
     * Returns a serialized representation of this {@link Location}.
     * 
     * @return a serialized representation of this {@link Location}.
     * 
     */
    public abstract Object serialize();
}