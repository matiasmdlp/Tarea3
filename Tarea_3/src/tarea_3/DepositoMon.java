package tarea_3;

import java.util.ArrayList;

public class DepositoMon {

    private ArrayList<Moneda> ar;

    public DepositoMon() {
        ar = new ArrayList<>();
    }

    public void addMoneda(Moneda m) {
        ar.add(m);
    }

    public Moneda getMoneda() {
        if (ar.isEmpty()) {
            return null;
        }
        Moneda m = ar.get(0);
        ar.remove(0);
        return m;
    }
    
    public Moneda Get(int x){
        return ar.get(x);
    }
    
    public int Size(){
        return ar.size();
    }
    
    public int Pago(){
        int p=0;
        for(int i=0; i<this.Size(); i++ ){
            p = p + ar.get(i).getValor();
        }
        return p;
    }
    
    public void Vaciar(){
        for(int i=0; i<=ar.size(); i++ ){
            ar.remove(0);
        }
    }
}
