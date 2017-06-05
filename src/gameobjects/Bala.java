
package gameobjects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.GameEngine;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;


public class Bala implements Runnable{
    
    
    private BufferedImage Bala;//bala
    public static int xBala = 0;//Posición x de la nave
    public static int yBala = 0;//Posición y de la nave
    private int speedNave = 3;//Velocidad de la nave
    Isaac isac = new Isaac();
   
    
    public Bala(String imagen,int x,int y) throws IOException{
     
        Bala = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/BALA.png"));
        xBala = x;
        yBala = y;
    }
    public void pintar(Graphics2D g2d){
        g2d.drawImage(Bala, xBala , yBala, null);
    }
    JPGameScreen jp = new JPGameScreen();
    
    
    
    
    public void run() {
        int xi;
        int yi;
        xi = jp.getX();
        yi = jp.getY();
        while (true){
            
          xi = isac.getxNave();
        yi = isac.getyNave();
                //  System.err.println(xi+" "+yi);
            if (xBala < xi){
                xBala ++;
                //System.err.println(xi+" "+x);
            }else{
                xBala --;
            }
            if (yBala < yi){
                yBala++;
                //System.err.println(xi+" "+x);
            }else{
                yBala--;
            }
            
            
            
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                //NADA
            }  
            
            
            
        }
    } 
}
