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
    private DepositoMon vuelto;
    private DepositoExp depcompra;
    private DepositoVuel depvuelto;

    private int precio;
    
    private JLabel emptyDeposit;

    public Expendedor(int numBebidas, int precioBebidas) {
        this.coca = new Deposito();
        this.sprite = new Deposito();
        this.fanta = new Deposito();
        this.vuelto = new DepositoMon();
        this.precio = precioBebidas;
        this.depcompra = new DepositoExp();
        this.depvuelto = new DepositoVuel();

        for (int i = 0; i < numBebidas; i = i + 1) {
            coca.addBebida(new Coca(100 + i) {});
            sprite.addBebida(new Sprite(200 + i) {});
            fanta.addBebida(new Fanta(300 + i) {});
        }
        
        this.setBounds(40, 40, 640, 660);
        this.setOpaque(false);
    }
    
    

    public Bebida comprarBebida(Moneda m, int cual) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException{ 
        if(this.coca.Size() == 0 || this.sprite.Size() == 0 || this.fanta.Size() == 0){
            throw new NoHayBebidaException("No hay de esta Bebida");
        }else{
            if (m == null) { 
                throw new PagoIncorrectoException ("Pago Incorrecto"); 
            } else if (m.getValor() < precio){
                this.vuelto.addMoneda(m);
                throw new PagoInsuficienteException ("Pago Insuficiente");        
                } else {
                    Bebida b = null;
                    switch (cual) {
                        case 1 -> {
                            b = SacaBebida(coca);
                            if (b == null) {
                                return null;
                            } else {
                                 Vuelto100(CalcularVuelto(m));
                            }
                        }

                    case 2 -> {
                        b = SacaBebida(fanta);
                        if (b == null) {
                            return null;
                        } else {
                            Vuelto100(CalcularVuelto(m));
                        }
                    }

                    case 3 -> {
                        b = SacaBebida(sprite);
                        if (b == null) {
                            return null;
                        } else {
                            Vuelto100(CalcularVuelto(m));
                        }
                    }
                }
                return b;
            }
        }
    }

    public Moneda getVuelto() {
        return vuelto.getMoneda();
    }

    public int CalcularVuelto(Moneda m) {
        if (m.getValor() - precio > 0) {
            int v = m.getValor() - precio;
            return v;
        }else{
            return 0;
        }
    }

    public Bebida SacaBebida(Deposito d) {
        return d.getBebida();
    }

    public void Vuelto100(int vuelto) {
        int v = vuelto;
        while (v > 0) {
            Moneda n = new Moneda100("001");
            this.vuelto.addMoneda(n);
            v = v - 100;
        }
    }
    
    public int HayMonedas(){
        return vuelto.Size();
    }
    
    @Override //Dibujamos La Maquina Expendedora 
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
        
                
        coca.paintComponent(g, this);
        sprite.paintComponent(g, this);
        fanta.paintComponent(g, this);
        depcompra.paintComponent(g);        
        depvuelto.paintComponent(g);
            
    }
}

