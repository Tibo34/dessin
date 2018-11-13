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
	
	public Fenetre(String title) {
		super(title);
	}
	
	/*Un cercle avec x=200,y=200,r=100
		*
		*	un deuxième cercle avec x=160,y=150,r=20
		*	un troisième avec Cercle3 x=240,y=150,r=20
		*	et un Rectangle x=150,y=220,l=100, h=40
	*/
	public void initialisation() {	
		setSize(width, height);
		setLocationRelativeTo(null);
		Rectangle r=new Rectangle(150,220,40,100,Color.RED);
		Cercle c1=new Cercle(new Point(200,200),100,Color.BLUE);	
		Cercle c2=new Cercle(new Point(160,150),20,Color.GREEN);	
		Cercle c3=new Cercle(new Point(240,150),20,Color.MAGENTA);	
		ArrayList<ObjectGraphique> list=new ArrayList<ObjectGraphique>();
		list.add(r);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		TotoJPanel p=new TotoJPanel(list);
		p.setBackground(Color.WHITE);
		add(p);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		Fenetre f=new Fenetre("Fenetre");		
		f.initialisation();
		
	}

}
