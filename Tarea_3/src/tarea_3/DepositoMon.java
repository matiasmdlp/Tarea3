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
    
    public int Size(){
        return ar.size();
    }
}
