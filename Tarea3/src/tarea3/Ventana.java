package tarea3;

import java.awt.*;
import javax.swing.*;
public class Ventana extends JFrame {
     public Ventana(){
         super();
         this.setTitle("esta Ventana");
         this.setLayout(new BorderLayout());
         
         this.add(new MiPanel( ),BorderLayout.WEST);
         this.add(new MiPanel2( ),BorderLayout.EAST); 
         this.add(new MiPanel3( ),BorderLayout.SOUTH); 
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setSize(600,700);
         this.setVisible(true); 
    } 
}