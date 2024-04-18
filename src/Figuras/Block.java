package Figuras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Block {
	 private int x;
	    private int y;
	    private int width;
	    private int height;
	    private Color color;
	    final Color ORANGE_COLOR = new Color(254, 144, 99);
	    final Color BLACK = Color.BLACK;

	    public Block(int x, int y, int width, int height, Color color) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	        this.color = color;
	    }

	    public void draw(Graphics2D g) {
	    	g.setColor(ORANGE_COLOR);

	        // grosor de línea mas grueso
	        g.setStroke(new BasicStroke(2));

	        g.fillRect(x, y, width, height);
	        g.setColor(BLACK);
	        g.drawRect(x, y, width, height);
	        g.setStroke(new BasicStroke(1));

	        // circulos
	        g.fillOval(x + 5, y + 4, 4, 4); // Esquina superior izquierda
	        g.fillOval(x + width - 10, y + 4, 4, 4); // Esquina superior derecha
	        g.fillOval(x + 5, y + height - 9, 4, 4); // Esquina inferior izquierda
	        g.fillOval(x + width - 10, y + height - 9, 4, 4); 
    }
	    
}
