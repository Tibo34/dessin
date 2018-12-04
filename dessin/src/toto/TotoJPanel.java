package toto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import dessin.Cercle;
import dessin.ObjectGraphique;
import dessin.Rectangle;

@SuppressWarnings("serial")
public class TotoJPanel extends JPanel {
	
	private ArrayList<ObjectGraphique> listObjectDisplay;
	private ArrayList<Color> colors;
	
	
	/**
	 * Constructeur du panel avec par défaut 3 cercle et un rectangle
	 * 
	 */
	public TotoJPanel() {
		fillColors();		
		listObjectDisplay=new ArrayList<ObjectGraphique>();
		Rectangle r1=new Rectangle(150,220,100,40,colors.get(0));
		Cercle c1=new Cercle(new Point(200,200),100,colors.get(0));
		Cercle c2=new Cercle(new Point(160,150),20,colors.get(0));
		Cercle c3=new Cercle(new Point(240,150),20,colors.get(0));		
		listObjectDisplay.add(r1);
		listObjectDisplay.add(c3);
		listObjectDisplay.add(c2);
		listObjectDisplay.add(c1);		
		JButton boutonRectangle=new JButton("Rectangle");
		JButton cercle1Button=new JButton("Cercle1");
		JButton cercle2Button=new JButton("Cercle2");
		JButton cercle3Button=new JButton("Cercle3");
		boutonRectangle.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Display(r1);
			}
		});	
		cercle1Button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Display(c1);
			
			}
		});
		cercle2Button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Display(c2);
			}
		});
		cercle3Button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Display(c3);				
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				ChangeColorElement(new Point(e.getX(),e.getY()));
			}
			
		});
		add(boutonRectangle);
		add(cercle1Button);
		add(cercle2Button);
		add(cercle3Button);
	}
	
	/**
	 * Initialise les couleurs
	 */
	private void fillColors() {
		colors=new ArrayList<Color>();		
		colors.add(Color.BLACK);// 0 noir
		colors.add(Color.BLUE);// 1 bleu
		colors.add(Color.GREEN);// 2 vert
		colors.add(Color.RED);// 3 rouge
		colors.add(Color.ORANGE);// 4 orange
		colors.add(Color.WHITE);// 5 blanc
	}
	
	/**
	 * getNextColor retourne la couleur suivante dans la liste
	 * @param c Color
	 * @return la couleur suivante
	 */
	private Color getNextColor(Color c) {
		int next=colors.indexOf(c)+1;
		if(next==colors.size()) {
			next=0;
		}
		return colors.get(next);
	}

	/**
	 * affiche ou supprime un élément
	 * @param o objet à affiché ou suprimé
	 */
	private void Display(ObjectGraphique o) {
		if(listObjectDisplay.contains(o)) {
			listObjectDisplay.remove(o);// enlève l'object des objet à affiché
		}
		else {
			listObjectDisplay.add(o);// rajoute l'objet
		}
		repaint();
	}
	
	/**
	 * ChangeColorElement vérifie si le clic est dans un élément et modifie sa couleur
	 * @param clic Point
	 */
	private void ChangeColorElement(Point clic) {
		for(ObjectGraphique o : listObjectDisplay) {			
			if(o.contient(clic.x,clic.y)) {				
				ChangeColor(o);
				return;
			}
		}		
	}
	
	
	/**
	 * Change la couleur d'un objet
	 * @param o Objet à modifié
	 */
	private void ChangeColor(ObjectGraphique o) {
		Color old=o.getColor();
		o.setColor(getNextColor(old));		
		repaint();
	}

	/**
	 * dessine les objets graphique
	 */
	 @Override
	public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 for(ObjectGraphique o : listObjectDisplay) {
			  o.dessineToi(g);
			}	 			 
	 }
	

}
