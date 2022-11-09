
package tarea3;

abstract class Moneda {
    protected int valor;
    public Moneda(int v){
        this.valor = v;
    }
    public Moneda getSerie(){
        return this;
    }
    public int getValor(){
        return valor;
    }  
}
