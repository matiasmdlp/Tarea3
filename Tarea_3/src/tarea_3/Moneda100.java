package tarea_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

class Moneda100 extends Moneda{
    public Moneda100(String serie){
        super(100);
        super.setSerie(serie);
        this.setBounds(485,565,40,40);
    }
    @Override
    public int getValor(){
        return super.valor;
        
    } 
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.darkGray);
        g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        g.setColor(Color.black);
        g.drawOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        g.setColor(Color.white);
        g.setFont(new Font("SansSerif.", 1, 10));
        g.drawString(super.getSerie(), this.getX() + 5, this.getY()+ 5);
    }
}