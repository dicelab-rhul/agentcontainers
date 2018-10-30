package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

import java.io.Serializable;

import uk.ac.rhul.cs.dice.agentcontainers.abstractimpl.AbstractCoordinates;
import uk.ac.rhul.cs.dice.agentcontainers.enums.Orientation;

/**
 * 
 * This interface is for coordinates. It extends {@link Serializable}.<br /><br />
 * 
 * Known implementations: {@link AbstractCoordinates}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Coordinates extends Serializable {
    
    /**
     * 
     * Returns the x coordinate.
     * 
     * @return an {@link Integer} representation of the x coordinate.
     * 
     */
    public abstract int getX();
    
    /**
     * 
     * Returns the y coordinate.
     * 
     * @return an {@link Integer} representation of the y coordinate.
     * 
     */
    public abstract int getY();
    
    /**
     * 
     * Checks whether the x coordinate is equals to <code>candidate</code>.
     * 
     * @param candidate the {@link Integer} to check against the x coordinate.
     * 
     * @return whether or not the x coordinate is equals to <code>candidate</code>.
     * 
     */
    public default boolean isXSuch(int candidate) {
	return getX() == candidate;
    }
    
    /**
     * 
     * Checks whether the y coordinate is equals to <code>candidate</code>.
     * 
     * @param candidate the {@link Integer} to check against the y coordinate.
     * 
     * @return whether or not the y coordinate is equals to <code>candidate</code>.
     * 
     */
    public default boolean isYSuch(int candidate) {
	return getY() == candidate;
    }
    
    /**
     * 
     * Returns the neighbor {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     * @param orientation the {@link Orientation} to use to retrieve the neighbor {@link Coordinates}.
     * 
     * @return the neighbor {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     */
    public abstract Coordinates getNeighborCoordinates(Orientation orientation);
    
    /**
     * 
     * Returns the northern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     * @return the northern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     */
    public default Coordinates getNorthernCoordinates() {
	return getNeighborCoordinates(Orientation.NORTH);
    }
    
    /**
     * 
     * Returns the southern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     * @return the southern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     */
    public default Coordinates getSouthernCoordinates() {
	return getNeighborCoordinates(Orientation.SOUTH);
    }
    
    /**
     * 
     * Returns the western {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     * @return the western {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     */
    public default Coordinates getWesternCoordinates() {
	return getNeighborCoordinates(Orientation.WEST);
    }
    
    /**
     * 
     * Returns the eastern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     * @return the eastern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     */
    public default Coordinates getEasternCoordinates() {
	return getNeighborCoordinates(Orientation.EAST);
    }
    
    /**
     * 
     * Returns the northwestern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     * @return the northwestern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     */
    public default Coordinates getNorthWesternCoordinates() {
	return getNorthernCoordinates().getWesternCoordinates();
    }
    
    /**
     * 
     * Returns the northeastern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     * @return the northeastern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     */
    public default Coordinates getNorthEasternCoordinates() {
	return getNorthernCoordinates().getEasternCoordinates();
    }
    
    /**
     * 
     * Returns the southwestern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     * @return the southwestern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     */
    public default Coordinates getSouthWesternCoordinates() {
	return getSouthernCoordinates().getWesternCoordinates();
    }
    
    /**
     * 
     * Returns the southeastern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     * @return the southeastern {@link Coordinates} w.r.t. this {@link Coordinates}.
     * 
     */
    public default Coordinates getSouthEasternCoordinates() {
	return getSouthernCoordinates().getEasternCoordinates();
    }
    
    /**
     * 
     * Returns the "forward" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     * @param orientation the {@link Orientation} to use to retrieve the "forward" {@link Coordinates}.
     * 
     * @return the "forward" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     */
    public default Coordinates getForwardCoordinates(Orientation orientation) {
	return getNeighborCoordinates(orientation);
    }
    
    /**
     * 
     * Returns the "left" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     * @param orientation the {@link Orientation} to use to retrieve the "left" {@link Coordinates}.
     * 
     * @return the "left" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     */
    public default Coordinates getLeftCoordinates(Orientation orientation) {
	return getNeighborCoordinates(orientation.getLeft());
    }
    
    /**
     * 
     * Returns the "right" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     * @param orientation the {@link Orientation} to use to retrieve the "right" {@link Coordinates}.
     * 
     * @return the "right" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     */
    public default Coordinates getRightCoordinates(Orientation orientation) {
	return getNeighborCoordinates(orientation.getRight());
    }
    
    /**
     * 
     * Returns the "backward" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     * @param orientation the {@link Orientation} to use to retrieve the "backward" {@link Coordinates}.
     * 
     * @return the "backward" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     */
    public default Coordinates getBackCoordinates(Orientation orientation) {
	return getNeighborCoordinates(orientation.getOpposite());
    }
    
    /**
     * 
     * Returns the "forward-left" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     * @param orientation the {@link Orientation} to use to retrieve the "forward-left" {@link Coordinates}.
     * 
     * @return the "forward-left" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     */
    public default Coordinates getForwardLeftCoordinates(Orientation orientation) {
	return getForwardCoordinates(orientation).getLeftCoordinates(orientation);
    }
    
    /**
     * 
     * Returns the "forward-right" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     * @param orientation the {@link Orientation} to use to retrieve the "forward-right" {@link Coordinates}.
     * 
     * @return the "forward-right" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     */
    public default Coordinates getForwardRightCoordinates(Orientation orientation) {
	return getForwardCoordinates(orientation).getRightCoordinates(orientation);
    }
    
    /**
     * 
     * Returns the "backward-left" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     * @param orientation the {@link Orientation} to use to retrieve the "backward-left" {@link Coordinates}.
     * 
     * @return the "backward-left" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     */
    public default Coordinates getBackLeftCoordinates(Orientation orientation) {
	return getBackCoordinates(orientation).getLeftCoordinates(orientation);
    }
    
    /**
     * 
     * Returns the "backward-right" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     * @param orientation the {@link Orientation} to use to retrieve the "backward-right" {@link Coordinates}.
     * 
     * @return the "backward-right" {@link Coordinates}, depending on the specified {@link Orientation}.
     * 
     */
    public default Coordinates getBackRightCoordinates(Orientation orientation) {
	return getBackCoordinates(orientation).getRightCoordinates(orientation);
    }
    
    /**
     * 
     * Returns the horizontal difference between <code>this</code> and <code>other</code>.
     * 
     * @param other a {@link Coordinates} object.
     * 
     * @return <code>this</code>.{@link #getX()} - <code>other</code>.{@link #getX()}
     * 
     */
    public default int getHorizontalDifference(Coordinates other) {
	return getX() - other.getX();
    }
    
    /**
     * 
     * Returns the vertical difference between <code>this</code> and <code>other</code>.
     * 
     * @param other a {@link Coordinates} object.
     * 
     * @return <code>this</code>.{@link #getY()} - <code>other</code>.{@link #getY()}
     * 
     */
    public default int getVerticalDifference(Coordinates other) {
	return getY() - other.getY();
    }
    
    /**
     * 
     * Returns whether both <code>x</code> and <code>y</code> match the X and Y values of this {@link Coordinates} object.
     * 
     * @param x an integer.
     * @param y an integer.
     * 
     * @return whether or not both <code>x</code> and <code>y</code> match the X and Y values of this {@link Coordinates} object.
     * 
     */
    public default boolean match(int x, int y) {
	return getX() == x && getY() == y;
    }
    
    /**
     * 
     * Returns whether <code>x</code> matches the X value of this {@link Coordinates} object.
     * 
     * @param x an integer.
     * 
     * @return whether or not <code>x</code> matches the X value of this {@link Coordinates} object.
     * 
     */
    public default boolean matchForX(int x) {
	return match(x, getY());
    }
    
    /**
     * 
     * Returns whether the X value of the {@link Coordinates} object passed as parameter matches the X value of this {@link Coordinates} object. If <code>coordinates</code> is <code>null</code>, <code>false</code> is returned.
     * 
     * @param <T> an implementation of {@link Coordinates}.
     * @param coordinates an object of type <code>T</code>.
     * 
     * @return whether or not the X value of the {@link Coordinates} object passed as parameter matches the X value of this {@link Coordinates} object.
     * 
     */
    public default <T extends Coordinates> boolean matchForX(T coordinates) {
	return coordinates != null && matchForX(coordinates.getX());
    }
    
    /**
     * 
     * Returns whether <code>y</code> matches the Y value of this {@link Coordinates} object.
     * 
     * @param y an integer.
     * 
     * @return whether or not <code>y</code> matches the Y value of this {@link Coordinates} object.
     * 
     */
    public default boolean matchForY(int y) {
	return match(getX(), y);
    }
    
    /**
     * 
     * Returns whether the Y value of the {@link Coordinates} object passed as parameter matches the Y value of this {@link Coordinates} object. If <code>coordinates</code> is <code>null</code>, <code>false</code> is returned.
     * 
     * @param <T> an implementation of {@link Coordinates}.
     * @param coordinates an object of type <code>T</code>.
     * 
     * @return whether or not the Y value of the {@link Coordinates} object passed as parameter matches the Y value of this {@link Coordinates} object.
     * 
     */
    public default <T extends Coordinates> boolean matchForY(T coordinates) {
	return coordinates != null && matchForY(coordinates.getY());
    }
    
    /**
     * 
     * Returns whether both the X and Y values of the {@link Coordinates} object passed as parameter do not match respectively the X and Y values of this {@link Coordinates} object. If <code>coordinates</code> is <code>null</code>, <code>false</code> is returned.
     * 
     * @param <T> an implementation of {@link Coordinates}.
     * @param coordinates an object of type <code>T</code>.
     * 
     * @return whether or not both the X and Y values of the {@link Coordinates} object passed as parameter do not match respectively the X and Y values of this {@link Coordinates} object.
     * 
     */
    public default <T extends Coordinates> boolean noMatchForXAndY(T coordinates) {
	return coordinates != null && noMatchForXAndY(coordinates.getX(), coordinates.getY());
    }
    
    /**
     * 
     * Returns whether both <code>x</code> and <code>y</code> do not match respectively the X and Y values of this {@link Coordinates} object.
     * 
     * @param x an integer.
     * @param y an integer.
     * 
     * @return whether or not both <code>x</code> and <code>y</code> do not match respectively the X and Y values of this {@link Coordinates} object.
     * 
     */
    public default boolean noMatchForXAndY(int x, int y) {
	return x != getX() && y != getY();
    }

    /**
     * 
     * Returns whether the X and Y values of this this {@link Coordinates} object are equals.
     * 
     * @return whether or not the X and Y values of this this {@link Coordinates} object are equals.
     * 
     */
    public default boolean areXandYEquals() {
	return getX() == getY();
    }
}