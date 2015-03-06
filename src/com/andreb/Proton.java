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
 * This is the Proton class which implements the particle interface.
 *
 */
public class Proton implements Particle {

	Energy e;
	/* (non-Javadoc)
	 * @see com.andreb.Particle#move()
	 */
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Proton moving...");
	}

	/* (non-Javadoc)
	 * @see com.andreb.Particle#decay(int)
	 */
	@Override
	public void decay(int x) {
		// TODO Auto-generated method stub
		System.out.println("Proton is decaying by " + x + "%");
	}

	/**
	 * This method sets the energy type of the Proton.
	 * @param energyType
	 */
	public void setEnergy(Energy energyType){
		this.e = energyType;
	}
	/**
	 * This method gets the energy type of the Proton.
	 * @return
	 */
	public Energy getEnergy(){
		return e;
	}
	/**
	 * This method gets the integer value of the Energy.
	 * @return
	 */
	public int energyType(){
		return e.getValue();
	}
}
