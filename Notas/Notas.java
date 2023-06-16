package Notas;

public class Notas {
    
    public double calcularPromedio(double[] listaNotas){
        double suma = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            suma += listaNotas[i];
        }
        return(suma / listaNotas.length);
    }
    
    public double calcularDesviacion(double[] listaNotas){
        double prom = calcularPromedio(listaNotas);
        double suma = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            suma += Math.pow(listaNotas[i] - prom, 2);
        }
        return Math.sqrt(suma/listaNotas.length);
    }
    
    public double calcularMenor(double[] listaNotas){
        double menor = listaNotas[0];
        for (int i = 1; i < listaNotas.length; i++) {
            if(listaNotas[i]<menor){
                menor = listaNotas[i];
            }
        }
        return menor;
    }
    
    public double calcularMayor(double[] listaNotas){
        double mayor = listaNotas[0];
        for (int i = 1; i < listaNotas.length; i++) {
            if(listaNotas[i]>mayor){
                mayor = listaNotas[i];
            }
        }
        return mayor;
    }
}
