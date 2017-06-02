/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.GameEngine;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 *
 * @author dam1b
 */
public class Tanque extends Malo implements Runnable {
    
    
    public Tanque(String nombreImagen, int vida, int velocidad, int damage, int x, int y) throws IOException {
        super(nombreImagen, vida, velocidad, damage, x, y);
    x = 100;
    y = 100;
    }

    Isaac isac = new Isaac();
    @Override
    public void recibirImpacto(int dano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void datosProta(int x,int y){
        //
    }
    @Override
    public void run() {
        int xi;
        int yi;
        while(true){
             
        
        
        xi = isac.getxNave();
        yi = isac.getyNave();
                  System.err.println(xi+" "+yi);
            if (x < xi){
                x++;
                //System.err.println(xi+" "+x);
            }else{
                x--;
            }
            if (y < yi){
                y++;
                //System.err.println(xi+" "+x);
            }else{
                y--;
            }
            
            
            datosProta(x,y);
            try {
                sleep(30);
            } catch (InterruptedException ex) {
                //NADA
            }
        }
    }

    
   
}
