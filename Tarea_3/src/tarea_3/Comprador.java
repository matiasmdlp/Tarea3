package tarea_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Comprador extends JPanel{
    private DepositoMon arrvuelto;
    private int vuelto;
    private String queBebida;
    private Expendedor exp;
    private Panel panel; 
    private Bebida bebida;
    
    private JButton Mano;
    
    public Comprador(Panel panel){
        arrvuelto = new DepositoMon();
        Mano = new JButton();
        this.panel=panel;
        
        Mano.setBounds(800, 440, 120, 200);
        Mano.setForeground(Color.white);
        Mano.setOpaque(false);
        Mano.setContentAreaFilled(false);
        panel.add(Mano);
                
        Mano.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PressBandeja(evt);
            }
            public void mousePressed(MouseEvent me) {
                System.out.println(bebida.getSabor()+" "+bebida.getSerie());
                getBebida();
                bebida.repaint();
                panel.repaint();
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
    }

    public String getVuelto(){
        Moneda m;
        
        if(this.exp.HayMonedas()>1){
            m = this.exp.getVuelto();
            vuelto = vuelto + m.getValor();
            return String.valueOf(m.getValor());
        }else if(this.exp.HayMonedas() == 1){
            m = this.exp.getVuelto();
            vuelto = vuelto + m.getValor();
            return String.valueOf(m.getValor())+ "\n" + "El vuelto es: " +String.valueOf(vuelto);
        }else{
            return "null";
        }
    }
    
    public void Recibirvuelto(Moneda mon){
        arrvuelto.addMoneda(mon);
    }
    
    public DepositoMon getArrMon(){
        return arrvuelto;
    }
    public String getqueBebida() {
        return queBebida;
    }
    
    public void getBebida(){
        bebida = null;
    }
    
    public void addBebida(Bebida b){
        bebida = b;
    }
    
    public String Sabor(){
        return bebida.getSabor();
    }
    
    public boolean HayBebida(){
        return bebida!=null;
    }
    
    
   @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        if(bebida!=null){
            if(bebida.getSabor()=="CocaCola"){
                g.setColor(Color.white);
                g.fillRect(800, 440, 80, 80);
                panel.repaint();
            }
            if(bebida.getSabor()=="Fanta"){
                g.setColor(Color.orange);
                g.fillRect(800, 440, 80, 80);
                panel.repaint();
            }
            if(bebida.getSabor()=="green"){
                bebida.setBounds(800, 440, 80, 80);
                bebida.paintComponent(g);
                panel.repaint();
            }
        }
        
    }
            
    private void PressBandeja(java.awt.event.MouseEvent evt){
        panel.repaint();
    }
    
}