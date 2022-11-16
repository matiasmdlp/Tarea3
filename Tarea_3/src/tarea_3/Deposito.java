package tarea_3;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class Deposito extends JPanel{

    private ArrayList<Bebida> ar;
    private int n=0;

    public Deposito() {
        ar = new ArrayList<>();
    }

    public void addBebida(Bebida a) {
        ar.add(a);
        n++;
    }

    public Bebida getBebida() {
        if (ar.isEmpty()) {
            return null;
        }
        Bebida b = ar.get(0);
        ar.remove(0);
        return b;
    }
    
    public int Size(){
        return ar.size();
    }
    
    public int getserie(){
        return n;
    }
    
    
    public void paintComponent(Graphics g, Expendedor exp) {
        super.paintComponent(g);
        if (ar.isEmpty()) {
        } else {
            Bebida beb = ar.get(0);
            String sabor = beb.getSabor();
            if ("CocaCola".equals(sabor)) {
                for (int i = 0; i < ar.size() && i < 6; i++) {
                    beb = ar.get(i);
                    beb.setBounds(exp.getX() + 55, exp.getY() + 480 - (74 * (i + 1)), 30, 60);
                    beb.paintComponent(g);
                }
            }
            if ("Fanta".equals(sabor)) {
                for (int i = 0; i < ar.size() && i < 6; i++) {
                    beb = ar.get(i);
                    beb.setBounds(exp.getX() + 55, exp.getY() + 480 - (74 * (i + 1)), 30, 60);
                    beb.paintComponent(g);
                }
            }
            if ("Sprite".equals(sabor)) {
                for (int i = 0; i < ar.size() && i < 6; i++) {
                    beb = ar.get(i);
                    beb.setBounds(exp.getX() + 55, exp.getY() + 480 - (74 * (i + 1)), 30, 60);
                    beb.paintComponent(g);
                }
            }
        }
    }
}
