package uk.ac.rhul.cs.dice.agentcontainers.enums;

/**
 * 
 * This enumeration contains the 4 cardinal points (NORTH, SOUTH, WEST, and EAST).
 * 
 * @author cloudstrife9999
 *
 */
public enum Orientation {
    NORTH(Mappings.E, Mappings.W, Mappings.S),
    SOUTH(Mappings.W, Mappings.E, Mappings.N),
    WEST(Mappings.N, Mappings.S, Mappings.E),
    EAST(Mappings.S, Mappings.N, Mappings.W);
    
    private String right;
    private String left;
    private String opposite;
    
    private Orientation(String right, String left, String opposite) {
	this.right = right;
	this.left = left;
	this.opposite = opposite;
    }
    
    /*
     *
     * The following methods have a call-by-need approach: the Orientation is created from the String only when it's needed.
     * 
     */
    
    /**
     * 
     * Returns the {@link Orientation} on the right w.r.t. this {@link Orientation}.
     * 
     * @return the {@link Orientation} on the right w.r.t. this {@link Orientation}.
     * 
     */
    public Orientation getRight() {
	return fromstring(this.right);
    }
    
    /**
     * 
     * Returns the {@link Orientation} on the left w.r.t. this {@link Orientation}.
     * 
     * @return the {@link Orientation} on the left w.r.t. this {@link Orientation}.
     * 
     */
    public Orientation getLeft() {
	return fromstring(this.left);
    }
    
    /**
     * 
     * Returns the {@link Orientation} opposite w.r.t. this {@link Orientation}.
     * 
     * @return the {@link Orientation} opposite w.r.t. this {@link Orientation}.
     * 
     */
    public Orientation getOpposite() {
	return fromstring(this.opposite);
    }
    
    /**
     * 
     * It creates an {@link Orientation} from a {@link String} representation, similar to (but not equals) the {@link #valueOf(String)} method.
     * 
     * @param code the {@link String} containing the representation of an {@link Orientation}.
     * 
     * @return the created {@link Orientation}.
     * 
     */
    public static Orientation fromstring(String code) {
	switch (code.toUpperCase()) {
	case Mappings.N:
	    return Orientation.NORTH;
	case Mappings.S:
	    return Orientation.SOUTH;
	case Mappings.W:
	    return Orientation.WEST;
	case Mappings.E:
	    return Orientation.EAST;
	default:
	    throw new IllegalArgumentException();
	}
    }
    
    /**
     * 
     * Returns the number of clockwise 90 degrees left-turns needed to reach <code>other</code>. The result is always modulo 4. In particular -1 is returned in place of 3.
     * 
     * @param other the target {@link Orientation}.
     * 
     * @return the number of clockwise 90 degrees left-turns needed to reach <code>other</code> modulo 4 (with -1 in place of 3).
     * 
     */
    public int getDifferenceIn90DegreesCCWFrom(Orientation other) {
	if(this.getLeft().equals(other)) {
	    return 1;
	}
	else if(this.getRight().equals(other)) {
	    return -1;
	}
	else if(this.getOpposite().equals(other)) {
	    return 2;
	}
	else {
	    return 0;
	}
    }
    
    private static class Mappings {
	public static final String N = "NORTH";
	public static final String S = "SOUTH";
	public static final String W = "WEST";
	public static final String E = "EAST";
	
	private Mappings() {}
    }
}