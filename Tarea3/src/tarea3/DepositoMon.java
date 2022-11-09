package tarea3;

import java.util.ArrayList;

public class DepositoMon {

    private ArrayList<Moneda> ar;

    public DepositoMon() {
        ar = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda m) {
        ar.add(m);
    }

    public Moneda getMoneda() {
        if (ar.size() == 0) {
            return null;
        }
        Moneda m = ar.get(0);
        ar.remove(0);
        return m;
    }
    
    public int Size(){
        return ar.size();
    }
}
