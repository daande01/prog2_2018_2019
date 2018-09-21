/**
 * 
 */
package kortspel;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JPanel;

public class Kortlek extends JFrame {

	private LinkedList<Kort> deck = new LinkedList<Kort>();
	private BufferedImage[] sprites;

	public Kortlek() {
		getSprite();
		for (int i = 0; i < 4; i++) {

			for (int k = 0; k < 13; k++) {

				deck.add(new Kort(i, k, sprites[(i * 13) + k]));
			}

		}

		
	}

	public LinkedList<Kort> getDeck() {

		return deck;

	}

	public void getSprite() {

		BufferedImage bigImg = null;
		try {
			bigImg = ImageIO.read(new File("Cards.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// The above line throws an checked IOException which must be caught.

		final int width = 73;
		final int height = 98;
		final int rows = 4;
		final int cols = 13;
		sprites = new BufferedImage[rows * cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sprites[(i * cols) + j] = bigImg.getSubimage(j * width, i * height, width, height);
			}
		}

	}

	public void blanda() {

		Kort temp;
		for (int i = 0; i < 52; i++) {

			int pos = (int) (Math.random() * 51);

			temp = deck.get(pos);
			deck.add(pos, deck.get(i));
			deck.remove(pos + 1);
			deck.add(i, temp);
			deck.remove(i + 1);

		}

	}

	public Kort getCard() {

		return deck.pop();

	}

	public void blanda2() {

		Collections.shuffle(deck);

	}

	

}
