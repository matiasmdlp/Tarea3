package tarea_3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DepositoVuel extends JPanel{
    
    private DepositoMon ar;
    
    public DepositoVuel(){
        ar = new DepositoMon();
    }
    
    public void addMoneda(Moneda m) {
        ar.addMoneda(m);
    }
     
    public void addarray(DepositoMon m){
        for(int i=0; i<m.Size(); i++){
            ar.addMoneda(m.getMoneda());
        }
    }
    
    public Moneda getMoneda() {
        if (ar.Size()==0) {
            return null;
        }
        Moneda m = ar.getMoneda();
        return m;
    }
    
    public int Size(){
        return ar.Size();
    }
    
    public void Vaciar(){
        for(int i=0; i<=ar.Size(); i++ ){
            ar.getMoneda();
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        this.setBounds(500, 500, 160, 160);
        this.setOpaque(false);
        g.setColor(Color.black);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
                        
        if(ar.Size()!=0){
            int n=0;
            int m=0;
            for(int j=1;n<ar.Size(); j++){    
                for(int i=0; n<ar.Size() && i < 7; i++){
                    ar.Get(i+m).setBounds((this.getX()+(20*i)), 
                            (this.getY()+(20*j))-20, 40, 40);
                    ar.Get(i+m).paintComponent(g);
                    n++;
                }
                m = m+7;
            }
        }
    }
}
