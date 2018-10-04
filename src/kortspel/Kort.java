/**
 * 
 */
package kortspel;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Kort {

	private int färg;
	private int valör;
	private BufferedImage sprite;

	private final String f[] = { "hjärter", "klöver", "spader", "ruter" };

	private final String v[] = { "ess", "två", "tre", "fyra", "fem", "sex", "sju", "åtta", "nio", "tio", "kneckt","dam", "kung", "ess" };

	public Kort(int f, int v, BufferedImage s) {

		färg = f;
		valör = v;
		sprite = s;

	}

	public JPanel getPanel() {

		JPanel p = new JPanel();

		JLabel l1 = new JLabel(new ImageIcon(sprite));

		p.add(l1);

		return p;
	}

	public String toString() {

		return f[färg] + "" + v[valör];

	}
	
	public int getValue(){
		
		
		return valör+1;
		
	}

}
