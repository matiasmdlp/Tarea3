package tarea_3;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    Panel panel;
    private BotonesBebidas botones1;
    
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Tarea_3");
        
        panel=new Panel();
        this.getContentPane().add(panel);
        
        botones1 = new BotonesBebidas(panel);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1040,720);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);  
    } 
}

