/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author snow
 */

public abstract class Warrior implements Cloneable {
	
    public Warrior clone() {
	Object clone = null;
	try {
            clone = super.clone();
	} catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
	}
            return (Warrior) clone;
	}
	
    public abstract void mostraWarrior();
	
}
