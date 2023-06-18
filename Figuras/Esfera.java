package Figuras;
public class Esfera extends FiguraGeometrica {
    private double radio;
    public double calcularVolumen(){
        double volumen = 1.333*Math.PI*Math.pow(radio, 3);
        return volumen;
    }
    public double calcularSuperficie(){
        double superficie = 4*Math.PI*Math.pow(radio, 2);
        return superficie;
    }
    public Esfera(double radio){
        this.radio = radio;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
}