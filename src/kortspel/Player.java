/**
 * 
 */
package kortspel;

import java.util.LinkedList;
import java.util.List;

/**
 * @author danand004
 *
 */
public class Player {

	private LinkedList<Kort> hand = new LinkedList<Kort>();
	private int playerSaldo;

	public Player() {

	}

	public void setCard(Kort k) {

		hand.add(k);
		
		playerSaldo+=k.getValue();
	}

	public Kort getLastcard() {

		return hand.getLast();
	}
	
	public int getSaldo(){
		
		return playerSaldo;
		
	}

}
