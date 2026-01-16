/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedio_bonoacademico;

/**
 *
 * @author Admin
 */
public class ManejoNotas implements CalculoPromedio, Aprobacion, BonoAcademico{

    @Override
    public double promedio(double[] notas) {
        double suma=0;
        for (int i = 0; i < notas.length; i++) {
            suma=suma+notas[i];
        }
        return suma/notas.length;
    }

    @Override
    public boolean aprobar(double promedio) {
        return promedio >= 14;
    }

    @Override
    public double bono(double promedio) {
        return promedio+1;
    }
    
}
