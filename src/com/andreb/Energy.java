/**
 * The Deuteron program implements the use of interfaces, enum types and classes
 * to do some interesting stuff.
 * 
 * @author Andre_Bonner
 * @version 1.0
 * @since	25/06/2014
 * 
 */
package com.andreb;

/**
 * The enum of different types of energy the particle can possess.
 * {@code MECHANICAL, ELECTRIC, HEAT}
 *  
 */
public enum Energy {
	
	MECHANICAL(1), ELECTRIC(5), HEAT(10);
	
 private int value;
 /**
  * This method is used to construct the Energy value.
  * @param val
  * @return Nothing
  */
 private Energy(int val){
	 this.value = val;
 }
 /**
  * This method gets the value of the energy.
  * @return value
  */
 public int getValue(){
	 return value;
 }
 
}
