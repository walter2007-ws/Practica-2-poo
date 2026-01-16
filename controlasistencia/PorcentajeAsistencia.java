/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlasistencia;

/**
 *
 * @author Admin
 */
public class PorcentajeAsistencia implements IPorcentajeAsistencia {
    @Override
    public double porcentajeAsistencia(boolean[] asistencia){
        double suma=0;
        for (int i = 0; i < asistencia.length; i++) {
            if(asistencia[i]==true){
                suma++;
            }
        }
        return (suma/asistencia.length)*100;
    }
}
