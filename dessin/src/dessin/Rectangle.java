package dessin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends ObjectGraphique {
	
	private java.awt.Rectangle rectangle;
	
	public Rectangle() {
		setRectangle(new java.awt.Rectangle(0,0,100,50));
	}
	
	 public Rectangle(Point p, int largeur, int hauteur) {
	    	this(p.x,p.y,largeur,hauteur);
	 }

    public Rectangle(int x, int y, int l, int h) {
    	rectangle=new java.awt.Rectangle(x,y,l,h);     	
    }
    
    public Rectangle(int x, int y, int l, int h,Color c) {
    	this(x,y,l,h);
    	this.setColor(c);
    }   
    
   
    public Rectangle(Point p, int largeur,int hauteur,Color c) {
    	this(p,largeur,hauteur);
    	this.setColor(c);
    }
    
	@Override
	public void dessineToi(Graphics g) {
		g.setColor(this.getColor());
		g.drawRect(rectangle.x,rectangle.y,rectangle.height,rectangle.width);		
	}
	
	@Override
	public boolean contient(int a, int b) {
		// TODO Auto-generated method stub
		return false;
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
	
	public static void main(String[] args) {
		Point p=new Point(200,200);		
		Color c=Color.black;
		Rectangle r=new Rectangle(p,100,50,c);
		System.out.println(r);
	}

}
