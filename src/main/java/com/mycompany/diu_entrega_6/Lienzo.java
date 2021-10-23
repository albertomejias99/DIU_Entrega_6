package com.mycompany.diu_entrega_6;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Lienzo extends JPanel{
    private BufferedImage imagen = null;

    public Lienzo() {
    }
    
    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if(imagen != null){
            g.drawImage(imagen, 0, 0, null);
        }
    }
    
    
}
