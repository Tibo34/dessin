package dessin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends ObjectGraphique {
	
	private Rectangle rectangle;
	
	public Rectangle() {
		setRectangle(new Rectangle(0,0,100,50));
	}
	
	

    public Rectangle(int x, int y, int largeur, int hauteur) {
    	setRectangle(new Rectangle(x,y,largeur,hauteur));    	
    }
    
    public Rectangle(Point p, int largeur, int hauteur) {
    	setRectangle(new Rectangle(p,largeur,hauteur));
    }
    public Rectangle(Point p, int largeur,int hauteur,Color c) {
    	setRectangle(new Rectangle(p,largeur,hauteur));
    	this.setColor(c);
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



	public Rectangle getRectangle() {
		return rectangle;
	}



	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

}
