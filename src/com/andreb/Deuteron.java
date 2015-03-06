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
 * This is the main class of the program.
 * 
 */
public class Deuteron {

	/**
	 * This is the main method which makes use of the Proton class
	 * @param args
	 * @return Nothing
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The atomic nucleus of a deuterium atom,\n"
				+ " consisting of a proton and a neutron");
		Proton m = new Proton();
		m.move();
		m.decay(56);
		
		m.setEnergy(Energy.HEAT);
		System.out.println("Proton energy is " + m.getEnergy().toString() + " its value is " + m.energyType());
	}

}
