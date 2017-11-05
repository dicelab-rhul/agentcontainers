package uk.ac.rhul.cs.dice.agentcontainers.abstractimpl;

import uk.ac.rhul.cs.dice.agentcontainers.enums.Orientation;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Coordinates;

public class AbstractCoordinates implements Coordinates {
    private Integer x;
    private Integer y;
    
    public AbstractCoordinates(int x, int y) {
	this.x = Integer.valueOf(x);
	this.y = Integer.valueOf(y);
    }
    
    /**
     * 
     * Copy constructor which duplicates the {@link Coordinates} in input.
     * 
     * @param toCopy the {@link Coordinates} to duplicate.
     * 
     */
    public AbstractCoordinates(Coordinates toCopy) {
	this(toCopy.getX(), toCopy.getY());
    }

    @Override
    public int getX() {
	return this.x.intValue();
    }

    @Override
    public int getY() {
	return this.y.intValue();
    }

    @Override
    public Coordinates getNeighborCoordinates(Orientation orientation) {
	switch (orientation) {
	case NORTH:
	    return new AbstractCoordinates(this.x, this.y - 1);
	case SOUTH:
	    return new AbstractCoordinates(this.x, this.y + 1);
	case WEST:
	    return new AbstractCoordinates(this.x - 1, this.y);
	case EAST:
	    return new AbstractCoordinates(this.x + 1, this.y);
	default:
	    throw new IllegalArgumentException();
	}
    }
    
    @Override
    public String toString() {
	return "(" + getX() + ", " + getY() + ")";
    }
}