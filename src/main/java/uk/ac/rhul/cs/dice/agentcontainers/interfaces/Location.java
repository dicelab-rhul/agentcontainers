package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

import java.io.Serializable;

@FunctionalInterface
public interface Location extends Serializable {
    public abstract Object serialize();
}