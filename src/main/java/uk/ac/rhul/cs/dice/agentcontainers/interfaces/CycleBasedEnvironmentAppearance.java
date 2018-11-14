package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

/**
 * 
 * This interface is for appearances of {@link CycleBasedEnvironment}s. It extends {@link EnvironmentAppearance}.
 * 
 * @author cloudstrife9999
 *
 */
public interface CycleBasedEnvironmentAppearance extends EnvironmentAppearance {
    
    /**
     * 
     * Returns the cycle number.
     * 
     * @return the cycle number.
     * 
     */
    public abstract long getCurrentCycleNumber();
}