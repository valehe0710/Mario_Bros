package Figuras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Figuras extends JFrame{
	private JPanel contentPane;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Figuras frame=new Figuras();
					frame.setVisible(true);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

public Figuras() {
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100,100,450,300);
	contentPane =new JPanel();
	contentPane.setBorder(new EmptyBorder(5,5,5,5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	setBounds(0,0,800,600);
	setResizable(false);
	
	//contentPane.setBackground(Color.GRAY);

	
}
	

public void paint(Graphics g) {
	
	super.paint(g);
	Graphics2D g2d = (Graphics2D) g;
	g2d.setStroke(new BasicStroke(3));
	
	final Color BACKGROUD_COLOR = new Color(179, 238,254);
	final Color GROUND_COLOR = new Color(255,195,184);
	final Color GREEN_COLOR = new Color(81,217,107);
	final Color ORANGE_COLOR = new Color(254,144,99);
	final Color PIPE_COLOR = new Color(25, 136, 16);
	final Color OTHERGREEN_COLOR = new Color(79,216,108);
	
	//codigo de fondo
	g.setColor(BACKGROUD_COLOR);
	g.fillRect(0,0,1000,600);
	
	//codigo de suelo
	g.setColor(GROUND_COLOR);
	g.fillRect(50, 520, 800, 80); 
	g.setColor(Color.black);
	g.drawRect(50, 520, 800, 80);
	g.drawRect(50, 540, 800, 80);
	g.setColor(new Color(234, 149, 109));
	g.fillRect(47, 553, 800, 80); 
	
	//obstaculo grande verde
	g.setColor(GREEN_COLOR);
	g.fillRoundRect(680, 400, 120, 120,4,4);
	g.setColor(Color.black);
	g.drawRoundRect(680, 400, 120, 120,4,4);
	g.setColor(new Color(39, 123, 46)); 
	g.fillRect(682, 515, 120, 4);
	
	//OBSTACULO ROSA
	g.setColor(Color.black);
	g.fillRoundRect(287, 420, 100, 100,8,8);
	g.setColor(GROUND_COLOR);
	g.fillRoundRect(240, 400, 120, 120,4,4); 
	g.setColor(Color.black);
	g.drawRoundRect(240, 400, 120, 120,4,4);
	//SOMBRA 
	g.setColor(new Color(234, 149, 109));
	g.fillRect(242, 513, 115,5);
	g.fillRect(353, 403, 5, 115); 
	
	//obtaculo caja de ?
	g.setColor(ORANGE_COLOR);
	g.fillRect(50, 352, 40, 40);
    g.setColor(Color.black);
    g.drawRect(50, 352, 40, 40);
    g.fillOval(55, 356, 4, 4); // Esq sup izq
    g.fillOval(82, 356, 4, 4); // Esq sup der
    g.fillOval(55, 385, 4, 4); // Esq inf izq
    g.fillOval(82, 385, 4, 4);
  
	//TUBO 
	 g.setColor(PIPE_COLOR);
     g.fillRect(550, 400, 80, 40);
     g.fillRect(552, 440, 75, 79);//parte de abajo
     g.setColor(Color.black);
     g.drawRect(550, 400, 80, 40);
     g.drawRect(552, 440, 75, 79);
     // Sombra del tubo
     g.setColor(OTHERGREEN_COLOR);
     //PARTE DE ARRIBA DEL TUBO claro
     g.fillRect(557, 403, 3, 34);
     g.fillRect(563, 403, 5, 34); 
     g.fillRect(574, 403, 2, 34);
     g.fillRect(597, 403, 3, 34);
     //PARTE DE ABAJO DEL TUBO claro
     g.fillRect(560, 443, 9/5, 73); 
     g.fillRect(565, 443, 5, 73);
     g.fillRect(576, 443, 2, 73);
     g.fillRect(593, 443, 4, 73);
     //PARTE ARRIBA TUBO OSCURO
     g.setColor(Color.black);
     g.fillRect(601, 403, 4, 35);
     g.fillRect(607, 403, 3, 35);
     g.fillRect(614, 403, 9, 35); 
     g.fillRect(625, 403, 6, 35);
     //PARTE ABAJO TUBO OSCURO
     g.fillRect(598, 443, 3, 74);
     g.fillRect(604, 443, 3, 74);
     g.fillRect(610, 443, 11, 74);
     g.fillRect(623, 443, 5, 74);
     g.setColor(OTHERGREEN_COLOR);
     g.fillRect(552, 402, 77, 1);
     
	
	/*//circulo ctr + s para guardar
	g.setColor(Color.cyan);
	g.fillOval(100,70,50,70);
	g.setColor(Color.red);
	g.drawOval(100,70,50,70);
	
	//rectangulo redondiado
	
	g.setColor(Color.red);
	g.drawRoundRect(300,70,50,70,30,30);
	g.setColor(Color.yellow);
	g.fillRoundRect(300,70,50,70,30,30);
	
	//Triangulo
	g.setColor(Color.blue);
	int[] vx1= {600,650,550};
	int[] vy1= {50,120,120};
	g.drawPolygon(vx1,vy1,3);
	
	g.setColor(Color.magenta);
	int[] vx2= {600,650,550};
	int[] vy2= {50,120,120};
	g.fillPolygon(vx2,vy2,3);
	
	//carita sonriendo
	g.setColor(Color.yellow);
	g.fillOval(200,300,110,100);
	g.setColor(Color.black);
	g.drawOval(200,300,110,100);
	//ojos
	g.setColor(Color.white);
	g.fillArc(220, 318, 17 * 2, 17 * 2, 0, 180);
	g.fillArc(260, 318, 17 * 2, 17 * 2, 0, 180);
	//pupila
	g.setColor(Color.black);
	g.fillOval(240,320,10,10);
	g.fillOval(280,320,10,10);
	//contorno
	g.setColor(Color.black);
	g.drawArc(220, 318, 17 * 2, 17 * 2, 0, 180);
	g.drawArc(260, 318, 17 * 2, 17 * 2, 0, 180);
	g.drawLine(220, 352, 296, 352);
	
	// Boca
    g.setColor(Color.RED);
    g.fillArc(215, 310, 40 * 2, 40 * 2, 180, 180);
    
    // Parte inferior de la boca 
    g.setColor(Color.PINK);
    int radio = 25; 
    g.fillArc(255 - 15, 364, radio * 2, radio * 2, 0, 180);
    
    g.setColor(Color.yellow);
    g.fillOval(280,376,11,13);
    g.fillOval(273,382,12,11);
    //contorno
    g.setColor(Color.black);
    g.drawArc(215, 310, 40 * 2, 40 * 2, 180, 180);
   
    //RATON cabeza
	g.setColor(Color.white);
	int[] vxr= {465, 500, 535};
	int[] vyr= {285, 240, 285};
	g.fillPolygon(vxr,vyr,3);
	g.setColor(Color.black);
	int[] vx= {465, 500, 535};
	int[] vy= {285, 240, 285};
	g.drawPolygon(vx,vy,3);
	//pansita
	g.setColor(Color.white);
	g.fillOval(456,270,90,120);
	g.setColor(Color.black);
	g.drawOval(456,270,90,120);
	//cara
	g.setColor(Color.black);
	g.fillOval(480,257,10,10);
	g.fillOval(510,257,10,10);
	
	g.fillOval(495,240,10,7);
	//orejas*/
	
	}
}