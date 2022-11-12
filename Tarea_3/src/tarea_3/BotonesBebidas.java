package tarea_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class BotonesBebidas {
    private JButton Coca;
    private JButton Sprite;
    private JButton Fanta;
    private Panel panel;
    
    public BotonesBebidas(Panel p){
        panel = p;
        
        Coca = new JButton("CocaCola");
        Sprite = new JButton("Sprite");
        Fanta = new JButton("Fanta");
        
        Coca.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarCoca(evt);
            }
            public void mousePressed(MouseEvent me) {
              System.out.println("CocaCola");  
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
        
        Sprite.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               /*comprarSprite(evt);*/
            }
            public void mousePressed(MouseEvent me) {
              System.out.println("Sprite");  
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
        
        Fanta.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarFanta(evt);
            }
            public void mousePressed(MouseEvent me) {
              System.out.println("Fanta");  
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
        
        Coca.setBounds(530, 200, 100, 50);
        Coca.setBackground(Color.red);
        panel.add(Coca);
        
        Sprite.setBounds(530, 300, 100, 50);
        Sprite.setBackground(Color.green);
        panel.add(Sprite);
        
        Fanta.setBounds(530, 400, 100, 50);
        Fanta.setBackground(Color.orange);
        panel.add(Fanta);
        
        
    }
    
    private void comprarCoca(java.awt.event.MouseEvent evt){
        panel.repaint();
    }
    
    private void comprarSprite(java.awt.event.MouseEvent evt){
        panel.repaint();
    }
    private void comprarFanta(java.awt.event.MouseEvent evt){
        panel.repaint();
    }
}
