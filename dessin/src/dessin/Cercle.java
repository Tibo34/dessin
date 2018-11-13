package dessin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Cercle extends ObjectGraphique {
	
	private Point center;
	private int rayon;
	
	public Cercle() {
		center=new Point(200,200);
		rayon=50;
	}
	
	public Cercle(int x,int y,int r,Color c) {
		this(new Point(x,y),r);
		this.setColor(c);
	}

    public Cercle(Point c,int r) {
    	center=c;
    	rayon=r;
    }	
    
    public Cercle(Point p, int r, Color c){
    	this(p,r);
    	this.setColor(c);
    	
    }

	@Override
	public void dessineToi(Graphics g) {
		g.setColor(this.getColor());
		g.drawOval(center.x-rayon,center.y-rayon,2*rayon,2*rayon);
	}
	
	

	@Override
	public boolean contient(int a, int b) {
		// TODO Auto-generated method stub
		return false;
	}

}
