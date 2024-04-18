package Figuras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Movable {
    private int x;
    private int y;
    //private Color color;
    final Color BLACK = Color.BLACK;

    public Movable(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        //this.color = color;
    }

    public void draw(Graphics2D g) {
        // Dibujar el circulo
        g.setColor(Color.black); 
        g.fillOval(x, y, 40, 40); 
        g.setColor(Color.black); // C
        g.drawOval(x, y, 40, 40); 
    
   }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return 40;

    }
    
}

