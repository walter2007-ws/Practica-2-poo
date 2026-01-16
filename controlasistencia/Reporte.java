/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlasistencia;

/**
 *
 * @author Admin
 */
public class Reporte implements MostrarDatos {
    @Override
    public void mostrar(Estudiante estudiante, double porcentaje, boolean validar){
        System.out.println("Estudiante: "+ estudiante.nombre);
        System.out.println("Porcentaje de asistencia: " + porcentaje);
        System.out.println("Estado: " + (validar ? "Aprobado": "Reprobado"));
    }
}
