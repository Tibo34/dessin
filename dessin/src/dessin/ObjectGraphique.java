package dessin;

import java.awt.Color;
import java.awt.Graphics;

public abstract class ObjectGraphique {
	
	private Color color;
	
	public ObjectGraphique() {
		color=Color.black;		
	}
	
	public ObjectGraphique(Color c) {
		color=c;
	}
	
	public abstract void dessineToi (Graphics g) ;
	public abstract boolean contient (int a,int b);
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	

}
