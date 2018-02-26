package ch.fhnw.richards.lecture01.kissExamples;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

/**
 * Part of a GUI with six JButtons performing related tasks
 * 
 * Note all of the repetition – this is very WET code!
 */
public class KissExample1a extends JFrame implements ActionListener {
	
	private final static int BC = 6;
	
	static JButton[] jb = new JButton[BC];
	static JLabel[] indi = new JLabel[BC];
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new KissExample1a();
			}
		});
	}
	
	public KissExample1a() {
		super();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new GridLayout(6,2));
		
		
		//indicates JButtons and JLabels with settings
		for (int i=0; i<=BC; i++) {
			JButton newJB = new JButton();
			jb[i].add(newJB);
			jb[i].setBorder(new BevelBorder(BevelBorder.RAISED));
			jb[i].setBackground(Color.blue);
			jb[i].setForeground(Color.white);
			jb[i].setText("button"+i);
			jb[i].setPreferredSize(new Dimension(100,30));
			jb[i].setVisible(true);
			jb[i].addActionListener(this);
		}
		
		for (int i=0; i<=BC; i++) {
			JLabel jl = new JLabel();
			indi[i].add(jl);
			indi[i].setVisible(false);
			indi[i].setForeground(Color.blue);
			indi[i].setPreferredSize(new Dimension(60,30));
			indi[i].setHorizontalAlignment(SwingConstants.CENTER);
			indi[i].setText("icon"+i);
		}
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		for (int i=0; i<=BC; i++) {
			while(btn != jb[i]) {
				indi[i].setVisible(false);
				i++;
			}
			jb[i].setVisible(true);
		}
	}
}