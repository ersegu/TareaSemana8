/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Erson Segura Flores
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arreglos - Ejercicio 3
            
            Ej3 arreglo = new Ej3();
            double arregloVendedor1[],arregloVendedor2[],arregloVendedor3[],arregloVendedor4[],arregloVendedor5[];
            
            //Llenar el arreglo de cada Vendedor con las ventas.
            arregloVendedor1=arreglo.rellenarArreglo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas del vendedor 1")));
            arregloVendedor2=arreglo.rellenarArreglo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas del vendedor 2")));
            arregloVendedor3=arreglo.rellenarArreglo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas del vendedor 3")));
            arregloVendedor4=arreglo.rellenarArreglo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas del vendedor 4")));
            arregloVendedor5=arreglo.rellenarArreglo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas del vendedor 5")));
            
            
            //Elegir un numero de Vendedor y sumar las ventas totales.
            int vendedor=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de vendedor del cual desea sumar las ventas"));
            switch (vendedor) {
            case 1:
                JOptionPane.showMessageDialog(null, arreglo.TotalVentas(vendedor, arregloVendedor1));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, arreglo.TotalVentas(vendedor, arregloVendedor2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, arreglo.TotalVentas(vendedor, arregloVendedor3));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, arreglo.TotalVentas(vendedor, arregloVendedor4));
                break;
            case 5:
                JOptionPane.showMessageDialog(null, arreglo.TotalVentas(vendedor, arregloVendedor5));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Numero de vendedor invalido.");
            }
    }
    
}
