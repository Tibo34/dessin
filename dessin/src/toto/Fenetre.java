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
	
	private int height=800;
	private int width=800;
	
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
		Rectangle r=new Rectangle(350,420,40,100,Color.RED);
		Cercle c1=new Cercle(new Point(400,400),100,Color.BLUE);	
		Cercle c2=new Cercle(new Point(360,350),20,Color.GREEN);	
		Cercle c3=new Cercle(new Point(440,350),20,Color.MAGENTA);
		Cercle c4=new Cercle(new Point(400,400),300,Color.red);
		Cercle c5=new Cercle(new Point(400,400),250,Color.green);
		Cercle c6=new Cercle(new Point(400,400),200,Color.blue);
		Cercle c7=new Cercle(new Point(400,400),150,Color.cyan);
		
		ArrayList<ObjectGraphique> list=new ArrayList<ObjectGraphique>();
		list.add(r);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		list.add(c6);
		list.add(c7);
		
		TotoJPanel p=new TotoJPanel(list);
		
		add(p);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		Fenetre f=new Fenetre("Fenetre");		
		f.initialisation();
		
	}

}
