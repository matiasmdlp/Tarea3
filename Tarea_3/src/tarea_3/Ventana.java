package tarea_3;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    Panel panel;
    
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Tarea_3");
        
        panel=new Panel();
        this.getContentPane().add(panel);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1040,720);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);  
    } 
}

