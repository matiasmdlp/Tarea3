package tarea_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

public class BotonesBebidas {
    private JButton Coca;
    private JButton Sprite;
    private JButton Fanta;
    private Panel panel;
       
    private JButton Moneda100;
    private JButton Moneda500;
    private JButton Moneda1000;
    private JButton Moneda1500;
    
    private int serie100;
    private int serie500;
    private int serie1000;
    private int serie1500;
    
    public BotonesBebidas(Panel p){
        panel = p;
        
        Coca = new JButton("CocaCola");
        Sprite = new JButton("Sprite");
        Fanta = new JButton("Fanta");
        
        JLabel Visor = new JLabel();
        Visor.setText("");
        Visor.setFont(new Font("Arial", Font.PLAIN, 10));
        Visor.setForeground(Color.black);
        Visor.setBounds(520, 135, 120, 10);
        panel.add(Visor);
        
        Coca.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarCoca(evt);
            }
            public void mousePressed(MouseEvent me) {
              System.out.println("CocaCola");
                try {
                    panel.getExp().comprarBebida(1);
                } catch (NoHayBebidaException ex) {
                    Logger.getLogger(BotonesBebidas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (PagoInsuficienteException ex) {
                    Logger.getLogger(BotonesBebidas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (PagoIncorrectoException ex) {
                    Logger.getLogger(BotonesBebidas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if((panel.getExp().HayMonedas())==0 && panel.getExp().HayBebidas()==0){
                    int j = panel.getExp().Pago()-500;
                    if(j>=0){
                        Visor.setText("Tu vuelto es:"+" "+j);
                        panel.repaint();
                    }else{
                        Visor.setText("pago insuficiente");
                        panel.repaint();
                    }
                }else{
                    Visor.setText("Retire el vueto o la bebida");
                    panel.repaint();
                }
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
                try {
                    panel.getExp().comprarBebida(3);
                } catch (NoHayBebidaException ex) {
                    Logger.getLogger(BotonesBebidas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (PagoInsuficienteException ex) {
                    Logger.getLogger(BotonesBebidas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (PagoIncorrectoException ex) {
                    Logger.getLogger(BotonesBebidas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if((panel.getExp().HayMonedas())==0 && panel.getExp().HayBebidas()==0){
                    int j = panel.getExp().Pago()-500;
                    if(j>=0){
                        Visor.setText("Tu vuelto es:"+" "+j);
                        panel.repaint();
                    }else{
                        Visor.setText("pago insuficiente");
                        panel.repaint();
                        panel.getExp().vaciarpago();
                    }
                }else{
                    Visor.setText("Retire el vueto o la bebida");
                    panel.repaint();
                    panel.getExp().vaciarpago();
                }
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
                try {
                    panel.getExp().comprarBebida(2);
                } catch (NoHayBebidaException ex) {
                    Logger.getLogger(BotonesBebidas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (PagoInsuficienteException ex) {
                    Logger.getLogger(BotonesBebidas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (PagoIncorrectoException ex) {
                    Logger.getLogger(BotonesBebidas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if((panel.getExp().HayMonedas())==0 && panel.getExp().HayBebidas()==0){
                    int j = panel.getExp().Pago()-500;
                    if(j>=0){
                        Visor.setText("Tu vuelto es:"+" "+j);
                        panel.repaint();                        
                    }else{
                        Visor.setText("pago insuficiente");
                        panel.getExp().vaciarpago();
                        panel.repaint();
                    }
                }else{
                    Visor.setText("Retire el vueto o la bebida");
                    panel.repaint();
                }
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
        
        
        serie100 = 001;
        serie500 = 001;
        serie1000 = 001;
        serie1500 = 001;        
        
        Moneda100 = new JButton("$100");
        Moneda100.setFont(new Font("Arial", Font.PLAIN, 15));
        Moneda100.setForeground(Color.black);
        Moneda100.setBounds(760, 160, 80, 80);
        Moneda100.setOpaque(false);
        Moneda100.setContentAreaFilled(false);
        panel.add(Moneda100);
        
        JLabel Serie100 = new JLabel();
        Serie100.setText("S:"+serie100);
        Serie100.setFont(new Font("Arial", Font.PLAIN, 10));
        Serie100.setForeground(Color.black);
        Serie100.setBounds(790, 180, 80, 80);
        panel.add(Serie100);
                
        Moneda500 = new JButton("$500");
        Moneda500.setFont(new Font("Arial", Font.PLAIN, 15));
        Moneda500.setForeground(Color.black);
        Moneda500.setBounds(880, 160, 80, 80);
        Moneda500.setOpaque(false);
        Moneda500.setContentAreaFilled(false);
        panel.add(Moneda500);
        
        JLabel Serie500 = new JLabel();
        Serie500.setText("S:"+serie500);
        Serie500.setFont(new Font("Arial", Font.PLAIN, 10));
        Serie500.setForeground(Color.black);
        Serie500.setBounds(910, 180, 80, 80);
        panel.add(Serie500);
        
        Moneda1000 = new JButton("$1000");
        Moneda1000.setFont(new Font("Arial", Font.PLAIN, 15));
        Moneda1000.setForeground(Color.black);
        Moneda1000.setBounds(760, 280, 80, 80);
        Moneda1000.setOpaque(false);
        Moneda1000.setContentAreaFilled(false);
        panel.add(Moneda1000);
        
        JLabel Serie1000 = new JLabel();
        Serie1000.setText("S:"+serie1000);
        Serie1000.setFont(new Font("Arial", Font.PLAIN, 10));
        Serie1000.setForeground(Color.black);
        Serie1000.setBounds(790, 300, 80, 80);
        panel.add(Serie1000);
        
        Moneda1500 = new JButton("$1500");
        Moneda1500.setFont(new Font("Arial", Font.PLAIN, 15));
        Moneda1500.setForeground(Color.black);
        Moneda1500.setBounds(880, 280, 80, 80);
        Moneda1500.setOpaque(false);
        Moneda1500.setContentAreaFilled(false);
        panel.add(Moneda1500);
        
        JLabel Serie1500 = new JLabel();
        Serie1500.setText("S:"+serie1000);
        Serie1500.setFont(new Font("Arial", Font.PLAIN, 10));
        Serie1500.setForeground(Color.black);
        Serie1500.setBounds(910, 300, 80, 80);
        panel.add(Serie1500);
        
        
        
        Moneda100.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Press100(evt);
            }
            public void mousePressed(MouseEvent me) {
                if((panel.getExp().HayMonedas())==0 && panel.getExp().HayBebidas()==0){
                    System.out.println("$100");
                    panel.getExp().addPago(new Moneda100(serie100+""));
                    panel.getComp().Recibirvuelto(new Moneda100(serie100+""));
                    serie100++;
                    Serie100.setText("S:"+serie100);
                    Visor.setText(panel.getExp().Pago()+"");
                    panel.repaint();
                }else{
                    Visor.setText("Retire el vueto o la bebida");
                    panel.repaint();
                    panel.getExp().vaciarpago();
                }    
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
                if((panel.getExp().HayMonedas())==0 && panel.getExp().HayBebidas()==0){
                    System.out.println("$500");
                    panel.getExp().addPago(new Moneda500(serie500+""));
                    panel.getComp().Recibirvuelto(new Moneda100(serie500+""));
                    serie500++;
                    Serie500.setText("S:"+serie500);
                    Visor.setText(panel.getExp().Pago()+"");
                    panel.repaint(); 
                }else{
                    Visor.setText("Retire el vueto o la bebida");
                    panel.repaint();
                    panel.getExp().vaciarpago();
                } 
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
                if((panel.getExp().HayMonedas())==0 && panel.getExp().HayBebidas()==0){
                    System.out.println("$1000");
                    panel.getExp().addPago(new Moneda1000(serie1000+""));
                    panel.getComp().Recibirvuelto(new Moneda100(serie1000+""));
                    serie1000++;
                    Serie1000.setText("S:"+serie1000);
                    Visor.setText(panel.getExp().Pago()+"");
                    panel.repaint();
                }else{
                    Visor.setText("Retire el vueto o la bebida");
                    panel.repaint();
                    panel.getExp().vaciarpago();
                }
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
                if((panel.getExp().HayMonedas())==0 && panel.getExp().HayBebidas()==0){
                    System.out.println("$1500");  
                    panel.getExp().addPago(new Moneda1500(serie1500+""));
                    panel.getComp().Recibirvuelto(new Moneda100(serie1500+""));
                    serie1500++;
                    Serie1500.setText("S:"+serie1500);
                    Visor.setText(panel.getExp().Pago()+"");
                    panel.repaint(); 
                }else{
                    Visor.setText("Retire el vueto o la bebida");
                    panel.repaint();
                    panel.getExp().vaciarpago();
                }
            }
            public void mouseReleased(MouseEvent me) {;}
            public void mouseEntered(MouseEvent me) {;}
            public void mouseExited(MouseEvent me) {;}
        });
        
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
