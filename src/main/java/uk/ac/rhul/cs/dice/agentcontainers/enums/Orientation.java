package uk.ac.rhul.cs.dice.agentcontainers.enums;

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
    
    public Orientation getRight() {
	return fromstring(this.right);
    }
    
    public Orientation getLeft() {
	return fromstring(this.left);
    }
    
    public Orientation getOpposite() {
	return fromstring(this.opposite);
    }
    
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
    
    private static class Mappings {
	public static final String N = "NORTH";
	public static final String S = "SOUTH";
	public static final String W = "WEST";
	public static final String E = "EAST";
	
	private Mappings() {}
    }
}