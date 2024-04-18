package Figuras;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;

public class Ground {
	private int x;
    private int y;
    private int width;
    private int height;
    private static final Color COLOR1 = new Color(255, 195, 184); // Color para la parte superior
    private static final Color COLOR2 = new Color(234, 141, 105);
 
    
    public Ground(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
       
    }

    public void draw(Graphics2D g) {
    	 
    	 g.setColor(COLOR1);
    	 g.fillRect(x, y, width, height / 4); 

         // parte inferior del suelo
         g.setColor(COLOR2);
         g.fillRect(x, y + height / 4, width, height - ( height / 4)); // La parte inferior ocupa el resto de la altura.

         // bordes
         g.setColor(Color.BLACK);
         g.drawRect(x, y, width, height /4);
         g.drawRect(x, y + height / 4, width, height - ( height / 4));
    }
  


}
