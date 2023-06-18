package Figuras;
public class Piramide extends FiguraGeometrica {
    private double base;
    private double altura;
    private double apotema;
    public double calcularVolumen(){
        double volumen = (Math.pow(base, 2)*altura)/3;
        return volumen;
    }
    public double calcularSuperficie(){
        double ladoA = Math.pow(base, 2);
        double ladoB = 2*base*apotema;
        return ladoA+ladoB;
    }
    public Piramide(double base, double altura, double apotema){
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
}
