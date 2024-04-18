package Figuras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Platform {
	
		private int width;
	    private int height;
	    private int x;
	    private int y;
	    private Color color;
	    final Color BLACK_SHADOW = new Color(33,33,33);

	    public Platform(int x, int y, int width, int height, Color color) {
	        super();
	        this.width = width;
	        this.height = height;
	        this.x = x;
	        this.y = y;
	        this.color = color;
	        
	    }

	    void draw(Graphics2D g) {
	    	g.setColor(BLACK_SHADOW);
		    g.fillRoundRect(x+15, y+10, width, height-9,5,5);
	        g.setColor(color);
	        g.fillRoundRect(x, y, width, height,5,5);
	        g.setColor(color.brighter());
	        g.fillRoundRect(x, y, width-4, height-4,5,5);
	    	g.setColor(BLACK_SHADOW);
	    	g.setStroke(new BasicStroke(2));
	    	g.drawRoundRect(x, y, width, height, 5, 5);
	    	
	    	Bolt boltUpperLeft = new Bolt(x+5,y+5);
	    	Bolt boltUpperRight = new Bolt(x+width-20,y+5);
	    	Bolt boltBottomLeft = new Bolt(x+5,y+height-16);
	    	Bolt boltBottomRight = new Bolt(x+width-20,y+height-16);

	    	boltUpperLeft.draw(g);
	    	boltUpperRight.draw(g);
	    	boltBottomLeft.draw(g);
	    	boltBottomRight.draw(g);
	    	
	    	
	    }
	   
	
	    
	    
}
