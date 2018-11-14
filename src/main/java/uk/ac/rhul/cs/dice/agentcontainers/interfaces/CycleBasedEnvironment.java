package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

/**
 * 
 * This is an interface for {@link CycleBasedEnvironment}s. It extends {@link Environment}.<br /><br />
 * 
 * @author cloudstrife9999
 *
 */
public interface CycleBasedEnvironment extends Environment {
    
    /**
     * 
     * Returns the cycle number.
     * 
     * @return the cycle number.
     * 
     */
    public abstract long getCurrentCycleNumber();
}