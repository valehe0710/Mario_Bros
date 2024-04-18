package Figuras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Pipe {
	private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    final Color OTHERGREEN_COLOR = new Color(79, 216, 108);
    final Color PIPE_COLOR = new Color(25, 136, 16);
    final Color BLACK = Color.BLACK;

    public Pipe(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics2D g) {
        g.setColor(PIPE_COLOR);
        g.fillRect(x, y, width, 40);
        g.fillRect(x + 2, y + 40, width - 4, height - 40);
        g.setColor(BLACK);
        g.drawRect(x, y, width, 40);
        g.drawRect(x + 2, y + 40, width - 4, height - 40);

        g.setColor(OTHERGREEN_COLOR);
        // arriba claro
        g.fillRect(x + 5, y + 3, 3, 34);
        g.fillRect(x + 11, y + 3, 5, 34);
        g.fillRect(x + 22, y + 3, 2, 34);
        g.fillRect(x + 45, y + 3, 3, 34);
        // abajo claro
        g.fillRect(x + 8, y + 43, 9, 73);
        g.fillRect(x + 13, y + 43, 5, 73);
        g.fillRect(x + 24, y + 43, 2, 73);
        g.fillRect(x + 41, y + 43, 4, 73);

        g.setColor(BLACK);
        // arriba oscuro
        g.fillRect(x + 49, y + 3, 4, 35);
        g.fillRect(x + 55, y + 3, 3, 35);
        g.fillRect(x + 62, y + 3, 9, 35);
        g.fillRect(x + 73, y + 3, 6, 35);
        // abajo oscuro
        g.fillRect(x + 46, y + 43, 3, 74);
        g.fillRect(x + 52, y + 43, 3, 74);
        g.fillRect(x + 58, y + 43, 11, 74);
        g.fillRect(x + 71, y + 43, 5, 74);

        g.setColor(OTHERGREEN_COLOR);
        g.fillRect(x + 2, y + 2, width - 5, 1);
	    }
    public int getX() {
        return x;
    }

    public int getWidth() {
        return width;
    }
    
	
}
