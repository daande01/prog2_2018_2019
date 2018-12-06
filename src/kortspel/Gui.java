/**
 * 
 */
package kortspel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author danand004
 *
 */
public class Gui extends JComponent {

	Player p1 = new Player();
	Dealer d1 = new Dealer();

	
	JButton startGame = new JButton("start game");
	JButton cardButton = new JButton("card button");
	JButton stopButton = new JButton("stop game");
	JPanel playerPanel = new JPanel();
	JPanel dealerPanel = new JPanel();
	Kortlek kortlek = new Kortlek();
	JLabel player = new JLabel("player");
	JLabel dealer = new JLabel("dealer");

	
	public Gui() {

		kortlek.blanda();
		playerPanel.add(player);
		dealerPanel.add(dealer);

		this.setLayout(new FlowLayout());
		this.add(startGame);
		this.add(cardButton);
		this.add(stopButton);
		this.add(playerPanel);
		this.add(dealerPanel);

		player.setVisible(false);
		dealer.setVisible(false);

		dealerPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		playerPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		startGame.addActionListener(new ActionListener() {

			/* (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			@Override
			public void actionPerformed(ActionEvent e) {

				player.setVisible(true);
				dealer.setVisible(true);
				startGame.setVisible(false);
				p1.setCard(kortlek.getDeck().pop());
				playerPanel.add(p1.getLastcard().getPanel());
				p1.setCard(kortlek.getDeck().pop());
				playerPanel.add(p1.getLastcard().getPanel());

				d1.setCard(kortlek.getDeck().pop());
				dealerPanel.add(d1.getLastcard().getPanel());
				d1.setCard(kortlek.getDeck().pop());
				dealerPanel.add(d1.getLastcard().getPanel());
				player.setText("player " + p1.getSaldo());

			}
		});

		cardButton.addActionListener(e -> {

			p1.setCard(kortlek.getDeck().pop());
			playerPanel.add(p1.getLastcard().getPanel());
			player.setText("player " + p1.getSaldo());
			validate();
			repaint();

		});

	}

}
