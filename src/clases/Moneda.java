
package clases;

import java.text.DecimalFormat;


public class Moneda {
    
    public double pesos;
    public double dolares;
    public double yenes;
    public double euros;

    public Moneda(double pesos) {
        
        this.pesos = pesos;
        
    }
    
    public double[] getConversion(){
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        double monedas[] = new double [3];
        
        dolares = pesos * 0.050;
        yenes = pesos * 5.52;
        euros = pesos * 0.043;
        
        monedas[0] = Double.valueOf(df.format(dolares));
        monedas[1] = Double.valueOf(df.format(yenes));
        monedas[2] = Double.valueOf(df.format(euros));
                
        
        return monedas;
    } 
    
}
