/**
 * 
 */
package kortspel;

import java.awt.FlowLayout;

import javax.swing.*;

/**
 * @author danand004
 *
 */
public class BlackJack extends JFrame {

	Gui g = new Gui();

	public BlackJack() {

		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.add(g);
		frame.setVisible(true);

		// Kortlek kk = new Kortlek();
		// this.setLayout(new FlowLayout());
		// kk.blanda();
		//
		// for (int i = 0; i < 52; i++) {
		//
		// add(kk.getDeck().get(i).getPanel());
		//
		//
		// }
		// for (Kort kort1 : kk.getDeck()) {
		//
		//
		// add(kort1.getPanel());
		// }
		//
		// //JPanel p = kk.getDeck().pop().getPanel();
		//
		// //add(p);
		//
		// setVisible(true);
		// this.setSize(200, 200);

	}

	public static void main(String[] args) {

		new BlackJack();
	}

}
