/**
 * The Deuteron program implements the use of interfaces, enum types and classes
 * to do some interesting stuff.
 * 
 * @author Andre_Bonner
 * @version 1.0
 * @since	25/06/2014
 */
package com.andreb;

/**
 * This interface defines the important particle methods.
 * @see Proton
 *  
 */
public interface Particle {
	/**
	 * This method is used to move the particle.
	 */
	public void move();
	/**
	 * This method decays the particle.
	 * @param x
	 */
	public void decay(int x);
}
