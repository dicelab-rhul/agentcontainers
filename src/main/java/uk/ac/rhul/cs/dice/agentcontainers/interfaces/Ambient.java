package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Appearance;

/**
 * 
 * This interface is for ambients. It extends {@link Container}.<br /><br />
 * 
 * Known sub-interfaces: {@link Environment}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Ambient extends Container {
    
    /**
     * 
     * Returns the {@link Appearance} of this {@link Ambient}.
     * 
     * @return the {@link Appearance} of this {@link Ambient}.
     * 
     */
    public abstract Appearance getAppearance();
}