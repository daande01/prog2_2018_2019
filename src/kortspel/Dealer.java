/**
 * 
 */
package kortspel;

import java.util.LinkedList;

/**
 * @author danand004
 *
 */
public class Dealer {

	private LinkedList<Kort> hand = new LinkedList<Kort>();
	private int playerSaldo;

	public Dealer() {

	}

	public void setCard(Kort k) {

		hand.add(k);

	}

	public Kort getLastcard() {

		return hand.getLast();
	}

}
