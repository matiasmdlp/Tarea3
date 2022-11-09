package tarea3;

import java.util.ArrayList;

public class Deposito {

    private ArrayList<Bebida> ar;

    public Deposito() {
        ar = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida a) {
        ar.add(a);
    }

    public Bebida getBebida() {
        if (ar.size() == 0) {
            return null;
        }
        Bebida b = ar.get(0);
        ar.remove(0);
        return b;
    }
    
    public int Size(){
        return ar.size();
    }
}
