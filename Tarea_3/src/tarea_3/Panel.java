package tarea_3;

import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel{
    private Expendedor exp;
    
    public Panel(){
        exp = new Expendedor(5, 500);
        
        this.setLayout(null);
        this.setBackground(Color.DARK_GRAY);
    }
    
    public Expendedor getExpendedor(){
        return exp;
    }
    
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        exp.paintComponent(g);
    }
}
