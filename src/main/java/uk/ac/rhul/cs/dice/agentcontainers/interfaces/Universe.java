package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

import java.util.Collection;

import uk.ac.rhul.cs.dice.agentcontainers.abstractimpl.AbstractUniverse;

/**
 * 
 * This is an interface for universes.<br /><br />
 * 
 * Known implementations: {@link AbstractUniverse}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Universe {
    
    /**
     * 
     * Returns this {@link Universe} {@link UniverseAppearance}.
     * 
     * @return this {@link Universe} {@link UniverseAppearance}.
     * 
     */
    public abstract UniverseAppearance getAppearance();
    
    /**
     * 
     * Returns all the {@link Ambient}s (as a {@link Collection}) of this {@link Universe}.
     * 
     * @return a {@link Collection} containing all the {@link Ambient}s of this {@link Universe}.
     * 
     */
    public abstract Collection<Ambient> getAmbients();
    
    /**
     * 
     * Returns the main {@link Ambient} of this {@link Universe}.
     * 
     * @return the main {@link Ambient} of this {@link Universe}.
     * 
     */
    public abstract Ambient getMainAmbient();
    
    /**
     * 
     * Returns the number of {@link Ambient}s in this {@link Universe}.
     * 
     * @return the number of {@link Ambient}s in this {@link Universe}.
     * 
     */
    public default int countSubContainers() {
	return getAmbients().size();
    }
    
    /**
     * 
     * Adds a new {@link Ambient} to the ones already existing in this {@link Universe}.<br/>
     * If this {@link Universe} has no other {@link Ambient}s, the new ambient automatically becomes the main ambient (see {@link #getMainAmbient()}).
     * 
     * @param ambient a new {@link Ambient} to be added.
     *  
     */
    public abstract void addAmbient(Ambient ambient);
    
    /**
     * 
     * Adds a new {@link Ambient} to the ones already existing in this {@link Universe}.<br/>
     * The new {@link Ambient} becomes the new main ambient (see {@link #getMainAmbient()}).
     * 
     * @param ambient a new {@link Ambient} to be added.
     *  
     */
    public abstract void addMainAmbient(Ambient ambient);
}