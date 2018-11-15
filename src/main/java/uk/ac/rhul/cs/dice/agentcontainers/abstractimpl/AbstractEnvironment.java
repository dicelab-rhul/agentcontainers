package uk.ac.rhul.cs.dice.agentcontainers.abstractimpl;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Container;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Environment;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.EnvironmentAppearance;

/**
 * 
 * An implementation of {@link Environment}. It has an {@link EnvironmentAppearance} and a {@link Collection} of {@link Container}s as sub-environments.
 * 
 * @author cloudstrife9999
 *
 */
public abstract class AbstractEnvironment implements Environment {
    private EnvironmentAppearance appearance;
    private Collection<Container> subEnvironments;
    
    /**
     * 
     * Constructs an {@link AbstractEnvironment} with no {@link EnvironmentAppearance} and a permanently empty {@link Set} of sub-environments.
     * 
     */
    public AbstractEnvironment() {
	this.subEnvironments = Collections.emptySet();
    }
    
    /**
     * 
     * Constructs an {@link AbstractEnvironment} with an {@link EnvironmentAppearance} and a permanently empty {@link Set} of sub-environments.
     * 
     * @param appearance an {@link EnvironmentAppearance}.
     * 
     */
    public AbstractEnvironment(EnvironmentAppearance appearance) {
	this.appearance = appearance;
	this.subEnvironments = Collections.emptySet();
    }
    
    /**
     * 
     * Constructs an {@link AbstractEnvironment} with an {@link EnvironmentAppearance} and a {@link Collection} of {@link Container}s as sub-environments.
     * 
     * @param appearance an {@link EnvironmentAppearance}.
     * @param subEnvironments a {@link Collection} of {@link Container}s.
     * 
     */
    public AbstractEnvironment(EnvironmentAppearance appearance, Collection<Container> subEnvironments) {
	this.appearance = appearance;
	this.subEnvironments = subEnvironments == null ? Collections.emptySet() : subEnvironments;
    }
    
    /**
     * 
     * Constructs an {@link AbstractEnvironment} with an {@link EnvironmentAppearance} and a single {@link Container}s as sub-environment.
     * 
     * @param appearance an {@link EnvironmentAppearance}.
     * @param subEnvironment a {@link Container}.
     * 
     */
    public AbstractEnvironment(EnvironmentAppearance appearance, Container subEnvironment) {
	this(appearance);
	
	if(subEnvironment != null) {
	    this.subEnvironments.add(subEnvironment);
	}
    }
    
    /**
     * 
     * 
     * Returns the {@link EnvironmentAppearance} of this {@link AbstractEnvironment}.
     * 
     */
    @Override
    public EnvironmentAppearance getAppearance() {
	return this.appearance;
    }

    @Override
    public Collection<Container> getSubContainers() {
	return this.subEnvironments;
    }
    
    @Override
    public void setAppearance(EnvironmentAppearance appearance) {
	this.appearance = appearance;
    }
    
    /**
     * 
     * Returns whether this {@link AbstractEnvironment} has no sub-environments.
     * 
     * @return whether or not this {@link AbstractEnvironment} has no sub-environments.
     * 
     */
    @Override
    public boolean isSimple() {
	return this.subEnvironments.isEmpty();
    }
}