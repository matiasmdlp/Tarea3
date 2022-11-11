package tarea_3;

import java.awt.*;
import javax.swing.*;

abstract class Bebida extends JPanel {
    private String serie;
        
    public void setSerie(String nom){
        serie = nom;
    }
    
    public String getSerie(){
        return serie;
    }
    
    public String beber(){
        return null;
    }
    
    public abstract String getSabor();
    
    @Override
    public void paintComponent(Graphics g){};
}

