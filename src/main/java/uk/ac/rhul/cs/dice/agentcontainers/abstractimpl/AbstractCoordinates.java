package uk.ac.rhul.cs.dice.agentcontainers.abstractimpl;

import uk.ac.rhul.cs.dice.agentcontainers.enums.Orientation;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Coordinates;

/**
 * 
 * An abstract implementation of {@link Coordinates}. It has two {@link Integer} values (x, y).
 * 
 * @author cloudstrife9999
 *
 */
public class AbstractCoordinates implements Coordinates {
    private static final long serialVersionUID = -4993479545710892560L;
    private Integer x;
    private Integer y;
    
    /**
     * 
     * Constructs an {@link AbstractCoordinates} object from two {@link Integer} values.
     * 
     * @param x an {@link Integer} representing the x coordinate.
     * @param y an {@link Integer} representing the y coordinate.
     * 
     */
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

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((this.x == null) ? 0 : this.x.hashCode());
	result = prime * result + ((this.y == null) ? 0 : this.y.hashCode());
	
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	return obj != null && checkClasses(obj) && fieldsMatch((Coordinates) obj);
    }

    private boolean checkClasses(Object obj) {
	return getClass() == obj.getClass() || this.getClass().isAssignableFrom(obj.getClass()) || obj.getClass().isAssignableFrom(this.getClass());
    }

    private boolean fieldsMatch(Coordinates obj) {
	return obj != null && this.x.equals(obj.getX()) && this.y.equals(obj.getY());
    }
}