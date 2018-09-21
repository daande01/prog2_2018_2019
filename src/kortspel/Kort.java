/**
 * 
 */
package kortspel;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Kort {

	private int f�rg;
	private int val�r;
	private BufferedImage sprite;

	private final String f[] = { "hj�rter", "kl�ver", "spader", "ruter" };

	private final String v[] = { "ess", "tv�", "tre", "fyra", "fem", "sex", "sju", "�tta", "nio", "tio", "kneckt",
			"dam", "kung", "ess" };

	public Kort(int f, int v, BufferedImage s) {

		f�rg = f;
		val�r = v;
		sprite = s;

	}

	public JPanel getPanel() {

		JPanel p = new JPanel();

		JLabel l1 = new JLabel(new ImageIcon(sprite));

		p.add(l1);
		
		

		return p;
	}

	public String toString() {

		return f[f�rg] + "" + v[val�r];

	}

}
