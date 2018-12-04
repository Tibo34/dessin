package toto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dessin.Cercle;
import dessin.ObjectGraphique;
import dessin.Rectangle;

public class Fenetre extends JFrame{
	
	private int height=400;
	private int width=400;
	
	/**
	 * Constructeur de la fenetre
	 * @param title string titre de la fenetre
	 */
	public Fenetre(String title) {
		super(title);
	}
	
	/**
	 * Initialise la fenetre
	 */
	public void initialisation() {	
		setSize(width, height);
		setLocationRelativeTo(null);			
		TotoJPanel p=new TotoJPanel();
		add(p);
		setVisible(true);
	}	
	

}
