/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 *
 * @author dam1b
 */
public abstract class Malo  {

    BufferedImage imagen;
    protected int vida;
    protected int velocidad;
    protected int damage;
    protected int x;
    protected int y;

    public Malo(String nombreImagen, int vida, int velocidad, int damage, int x, int y) throws IOException {
        this.imagen = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/"+nombreImagen));
        this.vida = vida;
        this.velocidad = velocidad;
        this.damage = damage;
        this.x = x;
        this.y = y;
    }

    public abstract void recibirImpacto(int dano);

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void pintar(Graphics2D g2d){
        g2d.drawImage(imagen, x, y, null);
    }

}
