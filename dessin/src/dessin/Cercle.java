package dessin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Cercle extends ObjectGraphique {
	
	private Point center;
	private int rayon;
	

    public Cercle(Point c,int r) {
    	center=c;
    	rayon=r;
    }	
    
    public Cercle(Point c, int r, Color couleur){
    	this(c,r);
    	this.setColor(couleur);
    	
    }

	@Override
	public void dessineToi(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contient(int a, int b) {
		// TODO Auto-generated method stub
		return false;
	}

}
