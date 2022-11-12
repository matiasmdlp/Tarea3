package tarea_3;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Comprador extends JPanel{

    private int vuelto;
    private String queBebida;
    private Expendedor exp;
    
    public Comprador(){
    /*    this.exp=exp;
        try {
        Bebida b = exp.comprarBebida(m, cualBebida);
        if (b != null) {
            this.queBebida = b.beber();
        }    
        } catch(NoHayBebidaException e){
            System.out.println("No hay bebida");
        } catch(PagoInsuficienteException e){
            System.out.println("Pago Insuficiente");
        } catch (PagoIncorrectoException e){
            System.out.println("Pago Incorrecto");
        }*/
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
        
    public String getqueBebida() {
        return queBebida;
    }
}
