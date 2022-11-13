package tarea_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class BotonesExp {
    private JButton Bandeja;
    private JButton Vuelto;
    private JButton Rellenar;
    private Panel panel;
    
    public BotonesExp(Panel p){
        panel = p;
        
        Bandeja = new JButton();
        Vuelto = new JButton();
        Rellenar = new JButton("Refill");
        
        Bandeja.setBounds(200, 560, 160, 80);
        Bandeja.setForeground(Color.white);
        Bandeja.setOpaque(false);
        Bandeja.setContentAreaFilled(false);
        panel.add(Bandeja);
        
        Vuelto.setBounds(500, 500, 160, 160);
        Vuelto.setForeground(Color.white);
        Vuelto.setOpaque(false);
        Vuelto.setContentAreaFilled(false);
        panel.add(Vuelto);
        
        Rellenar.setBounds(800, 40, 120, 40);
        Rellenar.setForeground(Color.black);
        panel.add(Rellenar);
        
        JLabel Visor = new JLabel();
        Visor.setText("");
        Visor.setFont(new Font("Arial", Font.PLAIN, 10));
        Visor.setForeground(Color.black);
        Visor.setBounds(520, 135, 120, 10);
        panel.add(Visor);
        
        Bandeja.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PressBandeja(evt);
            }
            public void mousePressed(MouseEvent me) {
                System.out.println("Tu Bebida");
                panel.getExp().TomarBebida();
                panel.repaint();
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
        
        Vuelto.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PressBandeja(evt);
            }
            public void mousePressed(MouseEvent me) {
                System.out.println("Tu Vuelto");
                panel.getExp().Reset();
                Visor.setText("");
                panel.repaint();
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
        
        Rellenar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PressBandeja(evt);
            }
            public void mousePressed(MouseEvent me) {
                System.out.println("Refill");
                panel.getExp().Refill();
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
    }
    
    private void PressBandeja(java.awt.event.MouseEvent evt){
        panel.repaint();
    }
    
    private void PressVuelto(java.awt.event.MouseEvent evt){
        panel.repaint();
    }
    
    private void PressRellenar(java.awt.event.MouseEvent evt){
        panel.repaint();
    }
}
