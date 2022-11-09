
package tarea3;

public class Bebida {
    private int serie;

    public Bebida(int s) {
        this.serie = s;
    }

    public int getSerie() {
        return serie;
    }

    public String beber(){
        return "sabor: ";
    }
}

class Sprite extends Bebida {

    public Sprite(int s) {
        super(s);
    }

    public String beber() {
        return super.beber() + "sprite";
    }
}

class Fanta extends Bebida {

    public Fanta(int s) {
        super(s);
    }

    public String beber() {
        return super.beber() + "fanta";
    }
}

class CocaCola extends Bebida {

    public CocaCola(int s) {
        super(s);
    }

    public String beber() {
        return super.beber() + "cocacola";
    }
}
