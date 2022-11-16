package tarea_3;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;


public class Expendedor extends JPanel{

    public static final int COCA = 1;
    public static final int FANTA = 2;
    public static final int SPRITE = 3;

    private Deposito coca;
    private Deposito fanta;
    private Deposito sprite;
    private DepositoMon vuelto2;
    private DepositoExp depcompra;
    private DepositoVuel vuelto;
    private Comprador comp;

    private int precio;
    private int ser;
    
    private JLabel emptyDeposit;
    

    public Expendedor(int numBebidas, int precioBebidas, Comprador com) {
        this.coca = new Deposito();
        this.sprite = new Deposito();
        this.fanta = new Deposito();
        this.vuelto = new DepositoVuel();
        this.precio = precioBebidas;
        this.depcompra = new DepositoExp();
        this.vuelto2 = new DepositoMon();
        comp = com;
        ser = 1;

        for (int i = 0; i < numBebidas; i = i + 1) {
            coca.addBebida(new Coca(100 + i) {});
            sprite.addBebida(new Sprite(300 + i) {});
            fanta.addBebida(new Fanta(500 + i) {});
        }
        
        this.setBounds(40, 40, 640, 660);
        this.setOpaque(false);
    }
    
    public void addPago(Moneda m){
        vuelto2.addMoneda(m);
    }
    
    public int Pago(){
        return vuelto2.Pago();
    }
    
    public void Reset(){
        vuelto.Vaciar();
    }
    
    public void vaciarpago(){
        vuelto2.Vaciar();
    }
    

    public Bebida comprarBebida(int cual) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException{ 
        Deposito rev = new Deposito();
        switch(cual){
            case 1: rev=coca;
            case 2: rev=fanta;
            case 3: rev=sprite;
        } 
        
        if(rev.Size() == 0){
            throw new NoHayBebidaException("No hay de esta Bebida");
            }else{
                if (vuelto2.Size() == 0) { 
                    throw new PagoIncorrectoException ("Pago Incorrecto"); 
                } else if (vuelto2.Pago() < precio){
                    for(int i=0; i<4 ; i++){
                        vuelto.addMoneda(vuelto2.Get(i));
                    }
                    throw new PagoInsuficienteException ("Pago Insuficiente");        
                    } else {
                        Bebida b = null;
                        switch (cual) {
                            case 1 -> {
                                b = SacaBebida(coca);
                                if (b == null) {
                                    return null;
                                } else {
                                     Vuelto100(CalcularVuelto(vuelto2));
                                     depcompra.addBebida(b);
                                }
                            }

                        case 2 -> {
                            b = SacaBebida(fanta);
                            if (b == null) {
                                return null;
                                } else {
                                    Vuelto100(CalcularVuelto(vuelto2));
                                    depcompra.addBebida(b);
                                }
                            }

                        case 3 -> {
                            b = SacaBebida(sprite);
                            if (b == null) {
                                return null;
                                } else {
                                    Vuelto100(CalcularVuelto(vuelto2));
                                    depcompra.addBebida(b);
                                }
                            }
                        }
                    return b;
                }
            }
    }
    
    public void Refill(){
        int c = 5-coca.Size();
        int s = 5-sprite.Size();
        int f = 5-fanta.Size();
        
        if((coca.Size()<5)){
            for(int i=0; i<c ;i++){
                coca.addBebida(new Coca(100+coca.getserie()));
            }
        }
        if((sprite.Size()<5)){
            for(int i=0; i<s ;i++){
                sprite.addBebida(new Sprite(100+sprite.getserie()));
            }
        }
        if((fanta.Size()<5)){
            for(int i=0; i<f ;i++){
                fanta.addBebida(new Fanta(100+fanta.getserie()));
            }
        }
        
    }

    public Moneda getVuelto() {
        return vuelto.getMoneda();
    }

    public int CalcularVuelto(DepositoMon m) {
        if (m.Pago() - precio > 0) {
            int v = m.Pago() - precio;
            return v;
        }else{
            return 0;
        }
    }

    public Bebida SacaBebida(Deposito d) {
        return d.getBebida();
    }
        
    public Bebida TomarBebida(){
        return depcompra.getBebida();
    }
    
    public void Vuelto100(int vuelto) {
        int v = vuelto;
        while (v > 0) {
            this.vuelto.addMoneda(new Moneda100(ser+""));
            v = v - 100;
            ser++;
        }
    }
    
    public int HayMonedas(){
        return vuelto.Size();
    }
    
    public int HayBebidas(){
        return depcompra.Size();
    }
    
    @Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.lightGray);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        g.fillRect(720, 120, 280, 280);
        
        g.setColor(Color.BLACK);
        g.fillRect(this.getX()+40, this.getY()+40, 400, 440);
                
        g.setColor(Color.white);
        g.fillRect(this.getX()+65, this.getY()+65, 110, 395);
        g.fillRect(this.getX()+185, this.getY()+65, 110, 395);
        g.fillRect(this.getX()+305, this.getY()+65, 110, 395);
        
        g.setColor(Color.orange);
        g.fillOval(760, 160, 80, 80);
        g.setColor(Color.BLACK);
        g.drawOval(760, 160, 80, 80);
        
        g.setColor(Color.orange);
        g.fillOval(880, 160, 80, 80);
        g.setColor(Color.BLACK);
        g.drawOval(880, 160, 80, 80);
        
        g.setColor(Color.orange);
        g.fillOval(760, 280, 80, 80);
        g.setColor(Color.BLACK);
        g.drawOval(760, 280, 80, 80);
        
        g.setColor(Color.orange);
        g.fillOval(880, 280, 80, 80);
        g.setColor(Color.BLACK);
        g.drawOval(880, 280, 80, 80);
        
        g.setColor(Color.white);
        g.fillRect(500, 120, 160, 40);
        g.setColor(Color.black);
        g.drawRect(500, 120, 160, 40);
               
        coca.paintComponent(g, this);
        sprite.paintComponent(g, this);
        fanta.paintComponent(g, this);
        depcompra.paintComponent(g);        
        vuelto.paintComponent(g);  
        
    }
}

