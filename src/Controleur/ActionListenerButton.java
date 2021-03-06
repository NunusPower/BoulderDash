package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ActionListenerButton implements ActionListener
{

	private String estSelectionné;

	private final JButton button_rockford;
	private final JButton button_diamond;
	private final JButton button_dirt;
	private final JButton button_boulder;
	private final JButton button_brickwall;
	private final JButton button_steelwall;

	public ActionListenerButton(JButton button_dirt, JButton button_boulder, JButton button_brickwall, JButton button_steelwall, JButton button_rockford, JButton button_diamond)
	{
		this.estSelectionné = "init";
		this.button_rockford = button_rockford;
		this.button_diamond = button_diamond;
		this.button_dirt = button_dirt;
		this.button_boulder = button_boulder;
		this.button_brickwall = button_brickwall;
		this.button_steelwall = button_steelwall;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

		if ( e.getSource() == button_dirt ) {
			estSelectionné = "dirt";
			System.out.println(estSelectionné);
		} else if ( e.getSource() == button_boulder ) {
			estSelectionné = "boulder";
			System.out.println(estSelectionné);
		} else if ( e.getSource() == button_brickwall ) {
			estSelectionné = "brickwall";
			System.out.println(estSelectionné);

		} else if ( e.getSource() == button_steelwall ) {
			estSelectionné = "steelwall";
			System.out.println(estSelectionné);

		} else if ( e.getSource() == button_diamond ) {
			estSelectionné = "diamond";
			System.out.println(estSelectionné);

		} else if ( e.getSource() == button_rockford ) {
			estSelectionné = "rockford";
			System.out.println(estSelectionné);

		}

	}

	public String getEstSelectionné()
	{
		return estSelectionné;
	}

	public void setEstSelectionné(String estSelectionné)
	{
		this.estSelectionné = estSelectionné;
	}

}
