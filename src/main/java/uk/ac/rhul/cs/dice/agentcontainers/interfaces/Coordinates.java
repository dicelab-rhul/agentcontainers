package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

import java.io.Serializable;

import uk.ac.rhul.cs.dice.agentcontainers.enums.Orientation;

public interface Coordinates extends Serializable {
    
    public abstract int getX();
    
    public abstract int getY();
    
    public default boolean isXSuch(int candidate) {
	return getX() == candidate;
    }
    
    public default boolean isYSuch(int candidate) {
	return getY() == candidate;
    }
    
    public abstract Coordinates getNeighborCoordinates(Orientation orientation);
    
    public default Coordinates getNorthernCoordinates() {
	return getNeighborCoordinates(Orientation.NORTH);
    }
    
    public default Coordinates getSouthernCoordinates() {
	return getNeighborCoordinates(Orientation.SOUTH);
    }
    
    public default Coordinates getWesternCoordinates() {
	return getNeighborCoordinates(Orientation.WEST);
    }
    
    public default Coordinates getEasternCoordinates() {
	return getNeighborCoordinates(Orientation.EAST);
    }
    
    public default Coordinates getNorthWesternCoordinates() {
	return getNorthernCoordinates().getWesternCoordinates();
    }
    
    public default Coordinates getNorthEasternCoordinates() {
	return getNorthernCoordinates().getEasternCoordinates();
    }
    
    public default Coordinates getSouthWesternCoordinates() {
	return getSouthernCoordinates().getWesternCoordinates();
    }
    
    public default Coordinates getSouthEasternCoordinates() {
	return getSouthernCoordinates().getEasternCoordinates();
    }
    
    public default Coordinates getForwardCoordinates(Orientation orientation) {
	return getNeighborCoordinates(orientation);
    }
    
    public default Coordinates getLeftCoordinates(Orientation orientation) {
	return getNeighborCoordinates(orientation.getLeft());
    }
    
    public default Coordinates getRightCoordinates(Orientation orientation) {
	return getNeighborCoordinates(orientation.getRight());
    }
    
    public default Coordinates getBackCoordinates(Orientation orientation) {
	return getNeighborCoordinates(orientation.getOpposite());
    }
    
    public default Coordinates getForwardLeftCoordinates(Orientation orientation) {
	return getForwardCoordinates(orientation).getLeftCoordinates(orientation);
    }
    
    public default Coordinates getForwardRightCoordinates(Orientation orientation) {
	return getForwardCoordinates(orientation).getRightCoordinates(orientation);
    }
    
    public default Coordinates getBackLeftCoordinates(Orientation orientation) {
	return getBackCoordinates(orientation).getLeftCoordinates(orientation);
    }
    
    public default Coordinates getBackRightCoordinates(Orientation orientation) {
	return getBackCoordinates(orientation).getRightCoordinates(orientation);
    }
}