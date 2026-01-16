/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedio_bonoacademico;

/**
 *
 * @author Admin
 */
public class Reporte implements MostrarDatos {

    @Override
    public void mostrar(Estudiante estudiante, double promedio, boolean aprobar) {
        System.out.println("Estudiante: " + estudiante.nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + (aprobar ? "Aprobado" : "Reprobado") );
    }
    
}
