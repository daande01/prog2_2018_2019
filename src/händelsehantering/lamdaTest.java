package h�ndelsehantering;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class lamdaTest extends JFrame{

	JButton knapp2 = new JButton("tryck h�r");
	JButton knapp1 = new JButton("tryck h�r");
	JLabel etikett1 = new JLabel("h�r st�r de lite text");
	JLabel etikett2 = new JLabel("h�r st�r de lite text");

	public lamdaTest() {

		setLayout(new FlowLayout());

		add(knapp1);
		add(etikett1);
		add(knapp2);
		add(etikett2);

		knapp1.addActionListener(e->{
			
			if (etikett1.getText().equals("h�r st�r de lite text")) {

				etikett1.setText("hej");
			} else {
				etikett1.setText("h�r st�r de lite text");

			}
		});
		knapp2.addActionListener(e->{
			
			etikett2.setText("hej d�");
			
		});

		setVisible(true);

	}

	
	public static void main(String arg[]) {

		lyssnareiklass b1 = new lyssnareiklass();

	}

}
