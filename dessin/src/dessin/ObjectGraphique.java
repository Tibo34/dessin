package dessin;

import java.awt.*;

public abstract class ObjectGraphique {
	
	private Color color;
	
	public ObjectGraphique() {
		color=Color.black;
		
	}
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	

}
