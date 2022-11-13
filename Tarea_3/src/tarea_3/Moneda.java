package tarea_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

abstract class Moneda extends JPanel{
    protected int valor;
    private String serie;
    public Moneda(int v){
        this.valor = v;
    }
    public String getSerie(){
        return "S"+serie;
    }
    public void setSerie(String aux){
        serie = aux;
    }
    public int getValor(){
        return valor;
    }  
    @Override
    public void paintComponent(Graphics g){};
}
