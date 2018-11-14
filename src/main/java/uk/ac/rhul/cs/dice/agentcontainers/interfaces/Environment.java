package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

import uk.ac.rhul.cs.dice.agentcontainers.abstractimpl.AbstractEnvironment;

/**
 * 
 * This is an interface for environments. It extends {@link Ambient}.<br /><br />
 * 
 * Known sub-interfaces: {@link CycleBasedEnvironment}.<br />
 * Known implementations: {@link AbstractEnvironment}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Environment extends Ambient {
    
    /**
     * 
     * Sets an {@link EnvironmentAppearance} for this {@link Environment}
     * 
     * @param appearance an {@link EnvironmentAppearance}.
     * 
     */
    public abstract void setAppearance(EnvironmentAppearance appearance);
}