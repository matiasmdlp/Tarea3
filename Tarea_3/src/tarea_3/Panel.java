package tarea_3;

import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel{
    private Expendedor exp;
    private Comprador comprador;
    
    public Panel(){
        exp = new Expendedor(5, 500);
        comprador = new Comprador();
        this.setLayout(null);
        this.setBackground(Color.DARK_GRAY);
    }
    
    public Expendedor getExp(){
        return exp;
    }
    
    public Comprador getComp(){
        return comprador;
    }
    
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        exp.paintComponent(g);
    }
}
