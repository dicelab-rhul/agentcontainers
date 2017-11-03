package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

import java.util.Collection;
import java.util.Collections;

public interface Container {
    public abstract boolean isSimple();
    
    public default <T extends Container> Collection<T> getSubContainers() {
	return Collections.emptySet();
    }
    
    public default int countSubContainers() {
	return getSubContainers().size();
    }
}