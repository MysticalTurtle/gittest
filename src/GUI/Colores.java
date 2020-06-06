package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Colores {
	public static void main(String args[]) {
		MarcoColor ejm01 = new MarcoColor();
	}
}

class MarcoColor extends JFrame {
	public MarcoColor() {
		Lamina milamina = new Lamina();
		setTitle("Probando colores");
		setSize(417, 440);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		add(milamina);
	}
}

class Lamina extends JPanel {
	public void paintComponent(Graphics g) {
		setBackground(SystemColor.window);
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
		//Dibujo de rectángulo
		g2.setPaint(Color.BLACK);
		Rectangle2D recta = new Rectangle2D.Double(100, 100, 200, 200);
		Rectangle2D recta2 = new Rectangle2D.Double(300, 300, 100, 100);
		Rectangle2D recta3 = new Rectangle2D.Double(0, 0, 100, 100);
		Rectangle2D recta4 = new Rectangle2D.Double(0, 300, 100, 100);
		Rectangle2D recta5 = new Rectangle2D.Double(0, 0, 100, 100);


		Ellipse2D eli = new Ellipse2D.Double(0, 0, 200, 200);
		Ellipse2D eli2 = new Ellipse2D.Double(0, 200, 200, 200);
		Ellipse2D eli3 = new Ellipse2D.Double(200, 0, 200, 200);
		Ellipse2D eli4 = new Ellipse2D.Double(200, 200, 200, 200);
		
		g2.fill(recta);
		g2.fill(eli);
		g2.draw(recta);
		g2.draw(eli);
		g2.draw(recta2);
		g2.draw(recta3);
		g2.draw(recta4);
		g2.draw(recta5);
		
		g2.setPaint(Color.RED.darker());
		g2.fill(eli2);
		g2.fill(eli3);
		g2.fill(eli4);
		
	}
}

