/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 *
 * @author dam1b
 */
public class Tanque extends Malo {

    public Tanque(String nombreImagen, int vida, int velocidad, int damage, int x, int y) throws IOException {
        super(nombreImagen, vida, velocidad, damage, x, y);
    }
      

    @Override
    public void recibirImpacto(int dano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
