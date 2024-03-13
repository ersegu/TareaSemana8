/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author tloz
 */
public class Ej3 {
    
    
    public double [] rellenarArreglo (int pTamanho){
        double arreglo[]=new double [pTamanho];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la venta numero "+(i+1)));
        }
        
        return arreglo;
    }
    
    public String TotalVentas(int pVendedor, double pArreglo[]){        
        String r="";
        double suma=0;
        
        for (int i = 0; i < pArreglo.length; i++) {
            r+="La venta # "+(i+1)+" fue de: "+pArreglo[i]+"\n";
            suma+=pArreglo[i];
        }
        
        return "Las ventas para el vendedor " +pVendedor+ " fueron las siguientes:\n\n"+r+"\n\n"+
                "El total vendido por el vendedor fue de: "+suma;
        
    }
    
}
