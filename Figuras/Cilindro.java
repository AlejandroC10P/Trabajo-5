package Figuras;
public class Cilindro extends FiguraGeometrica {
    private double radio;
    private double altura;
    public double calcularVolumen(){
        double volumen = Math.PI*altura*Math.pow(radio,2);
        return volumen;
    }
    public double calcularSuperficie(){
        double ladoA = 2*Math.PI*radio*altura;
        double ladoB = 2*Math.PI*Math.pow(radio,2);
        return ladoA+ladoB;
    }
    public Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
}
