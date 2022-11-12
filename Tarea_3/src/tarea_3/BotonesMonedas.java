package tarea_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class BotonesMonedas {
    private JButton Moneda100;
    private JButton Moneda500;
    private JButton Moneda1000;
    private JButton Moneda1500;
    private Panel panel;
    
    public BotonesMonedas(Panel p){
        panel = p;
        
        Moneda100 = new JButton("$100");
        Moneda100.setFont(new Font("Arial", Font.PLAIN, 15));
        Moneda100.setForeground(Color.black);
        Moneda100.setBounds(760, 160, 80, 80);
        Moneda100.setOpaque(false);
        Moneda100.setContentAreaFilled(false);
        panel.add(Moneda100);
        
        Moneda500 = new JButton("$500");
        Moneda500.setFont(new Font("Arial", Font.PLAIN, 15));
        Moneda500.setForeground(Color.black);
        Moneda500.setBounds(880, 160, 80, 80);
        Moneda500.setOpaque(false);
        Moneda500.setContentAreaFilled(false);
        panel.add(Moneda500);
        
        Moneda1000 = new JButton("$1000");
        Moneda1000.setFont(new Font("Arial", Font.PLAIN, 15));
        Moneda1000.setForeground(Color.black);
        Moneda1000.setBounds(760, 280, 80, 80);
        Moneda1000.setOpaque(false);
        Moneda1000.setContentAreaFilled(false);
        panel.add(Moneda1000);
        
        Moneda1500 = new JButton("$1500");
        Moneda1500.setFont(new Font("Arial", Font.PLAIN, 15));
        Moneda1500.setForeground(Color.black);
        Moneda1500.setBounds(880, 280, 80, 80);
        Moneda1500.setOpaque(false);
        Moneda1500.setContentAreaFilled(false);
        panel.add(Moneda1500);
        
        Moneda100.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Press100(evt);
            }
            public void mousePressed(MouseEvent me) {
                System.out.println("$100");              
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
        
        Moneda500.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Press500(evt);
            }
            public void mousePressed(MouseEvent me) {
                System.out.println("$500");              
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
        
        Moneda1000.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Press1000(evt);
            }
            public void mousePressed(MouseEvent me) {
                System.out.println("$1000");              
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
        
        Moneda1500.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Press1500(evt);
            }
            public void mousePressed(MouseEvent me) {
                System.out.println("$1500");              
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
                
    }
    
    private void Press100(java.awt.event.MouseEvent evt){
        panel.repaint();
    }
    
    private void Press500(java.awt.event.MouseEvent evt){
        panel.repaint();
    }
    
    private void Press1000(java.awt.event.MouseEvent evt){
        panel.repaint();
    }
    
    private void Press1500(java.awt.event.MouseEvent evt){
        panel.repaint();
    }
}
