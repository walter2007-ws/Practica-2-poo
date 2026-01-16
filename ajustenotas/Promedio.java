/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ajustenotas;

/**
 *
 * @author Admin
 */
public class Promedio implements IPromedio {

    @Override
    public double promedio(double[] notas) {
        double suma=0;
        for (int i = 0; i < notas.length; i++) {
            suma=suma+notas[i];
        }
        return suma/notas.length;
    }
    
}
