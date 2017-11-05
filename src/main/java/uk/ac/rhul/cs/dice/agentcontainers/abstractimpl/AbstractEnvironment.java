package uk.ac.rhul.cs.dice.agentcontainers.abstractimpl;

import java.util.Collection;
import java.util.Collections;

import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Container;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Environment;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.EnvironmentAppearance;

public abstract class AbstractEnvironment implements Environment {
    private EnvironmentAppearance appearance;
    private Collection<Container> subEnvironments;
    
    public AbstractEnvironment() {
	this.subEnvironments = Collections.emptySet();
    }
    
    public AbstractEnvironment(EnvironmentAppearance appearance) {
	this.appearance = appearance;
	this.subEnvironments = Collections.emptySet();
    }
    
    public AbstractEnvironment(EnvironmentAppearance appearance, Collection<Container> subEnvironments) {
	this.appearance = appearance;
	this.subEnvironments = subEnvironments == null ? Collections.emptySet() : subEnvironments;
    }
    
    public AbstractEnvironment(EnvironmentAppearance appearance, Container subEnvironment) {
	this(appearance);
	
	if(subEnvironment != null) {
	    this.subEnvironments.add(subEnvironment);
	}
    }
    
    @Override
    public EnvironmentAppearance getAppearance() {
	return this.appearance;
    }

    @Override
    public Collection<Container> getSubContainers() {
	return this.subEnvironments;
    }
    
    public void setAppearance(EnvironmentAppearance appearance) {
	this.appearance = appearance;
    }
    
    @Override
    public boolean isSimple() {
	return this.subEnvironments.isEmpty();
    }
}