/**
 * 
 */
package kortspel;

import javax.swing.*;

/**
 * @author danand004
 *
 */
public class GrafikTest extends JFrame {

	public GrafikTest() {

		Kortlek kk = new Kortlek();

		kk.blanda2();

		JPanel p = kk.getDeck().pop().getPanel();

		add(p);

		setVisible(true);
		this.setSize(200, 200);
		

	}

	public static void main(String[] args) {

		new GrafikTest();
	}

}
