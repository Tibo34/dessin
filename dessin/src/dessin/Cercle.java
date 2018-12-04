package dessin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Cercle extends ObjectGraphique {
	
	private Point center;
	private int rayon;
	
	/**
	 * constructeur
	 */
	public Cercle() {
		center=new Point(200,200);
		rayon=50;
	}
	
	/**
	 * constructeur
	 * @param c centre de du cercle
	 * @param r rayon du cercle
	 */
	public Cercle(Point c,int r) {
		center=c;
		rayon=r;
	}

	/**
	 * constructeur
	 * @param x coordonnée x du centre du cercle
	 * @param y coordonnée y du centre du cercle
	 * @param r rayon
	 * @param c couleur
	 */
	public Cercle(int x,int y,int r,Color c) {
		this(new Point(x,y),r);
		this.setColor(c);
	}

	/**
	 * constructeur
	 * @param p centre du cercle
	 * @param r rayon	
	 * @param c couleur
	 */
    public Cercle(Point p, int r, Color c){
    	this(p,r);
    	this.setColor(c);
    	
    }

	@Override
	public void dessineToi(Graphics g) {
		g.setColor(this.getColor());
		g.drawOval(center.x-rayon,center.y-rayon,2*rayon,2*rayon);
	}
	
	
	/**
	 * Détermine si un point est dans le cercle	 
	 */
	@Override
	public boolean contient(int x, int y) {
		return Math.sqrt((Math.pow((x - center.x),2) + (center.y - y))) < rayon;
	}
	
	public String toString() {
		return "Cercle [cerlce rayon="+rayon+" centre= ["+center+"]]";
	}

}
