package dessin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends ObjectGraphique {
	
	private java.awt.Rectangle rectangle;
	
	/**
	 * Constructeur  vide
	 */
	public Rectangle() {
		rectangle=new java.awt.Rectangle(0,0,100,50);
	}
	
	
	/**
	  * 
	  * Constructeur
	  * @param x int valeur x du premier point du rectangle
	  * @param y int valeur y du premier point du rectangle
	  * @param w int largeur
	  * @param h int hauteur
	  */
	public Rectangle(int x, int y, int w, int h) {
		rectangle=new java.awt.Rectangle(x,y,w,h);     	
	}


	/**
	 * Constructeur
	 * @param p Point coordonnée du premier point du rectangle
	 * @param w int largueur
	 * @param h int hauteur
	 */
	 public Rectangle(Point p, int w, int h) {
	    	this(p.x,p.y,w,h);
	 }

	 /**
	  * Constructeur
	  * @param x int valeur x du premier point du rectangle
	  * @param y int valeur y du premier point du rectangle
	  * @param w int largeur
	  * @param h int hauteur
	  * @param c Color couleur du rectangle
	  */
	 public Rectangle(int x, int y, int l, int h,Color c) {
    	this(x,y,l,h);
    	this.setColor(c);
    }   
    
   /**
    * @param p Point coordonnée du premier point du rectangle
	* @param w int largueur
	* @param h int hauteur
    * @param c Color couleur du rectangle
    */
    public Rectangle(Point p, int largeur,int hauteur,Color c) {
    	this(p,largeur,hauteur);
    	this.setColor(c);
    }
    
    /**
     * dessine le rectangle
     */
	@Override
	public void dessineToi(Graphics g) {
		g.setColor(this.getColor());		
		g.drawRect(rectangle.x,rectangle.y,rectangle.width,rectangle.height);		
	}
	
	/**
	 * Détermine si un point de coordonnée x et y est dans le rectangle
	 */
	@Override
	public boolean contient(int x, int y) {
		return rectangle.contains(x, y);
	}

	public java.awt.Rectangle getRectangle() {
		return rectangle;
	}
	
	@Override
	public String toString() {
		return "Rectangle [rectangle=" + rectangle + "]";
	}

	public void setRectangle(java.awt.Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
	

}
