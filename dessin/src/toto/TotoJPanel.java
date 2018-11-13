package toto;

import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JPanel;

import dessin.Cercle;
import dessin.Rectangle;

public class TotoJPanel extends JPanel {
	
	private ArrayList listObject = new ArrayList();
	
	public TotoJPanel(ArrayList g) {
		listObject=g;
	}
	
	
	public TotoJPanel(Object g) {
		listObject.add(g);		
	}		
	
	
	 @Override
	public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 for(Object o : listObject) {
			 if(o instanceof Cercle) {
				 ((Cercle) o).dessineToi(g);
			}
			 else {
				 ((Rectangle) o).dessineToi(g);
			 }
		 }
		 
	 }
	

}
