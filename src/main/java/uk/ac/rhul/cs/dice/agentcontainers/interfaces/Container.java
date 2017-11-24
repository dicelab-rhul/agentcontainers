package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

import java.util.Collection;
import java.util.Collections;

/**
 * 
 * This interface is for generic containers.<br /><br />
 * 
 * Known sub-interfaces: {@link Ambient}.
 * 
 * @author cloudstrife9999
 *
 */
@FunctionalInterface
public interface Container {
    
    /**
     * 
     * Returns whether this {@link Container} is simple. The definition of simple is left for the implementations of this interface.
     * 
     * @return whether or not this {@link Container} is simple.
     * 
     */
    public abstract boolean isSimple();
    
    /**
     * 
     * Returns a {@link Collection} containing all the sub-containers of this {@link Container}.
     * 
     * @return a {@link Collection} containing all the sub-containers of this {@link Container}.
     * 
     */
    public default <T extends Container> Collection<T> getSubContainers() {
	return Collections.emptySet();
    }
    
    /**
     * 
     * Returns the number of sub-containers of this {@link Container}.
     * 
     * @return the number of sub-containers of this {@link Container}.
     * 
     */
    public default int countSubContainers() {
	return getSubContainers().size();
    }
}