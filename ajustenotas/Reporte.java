/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajustenotas;

/**
 *
 * @author Admin
 */
public class Reporte implements MostrarDatos {

    @Override
    public void mostrar(Estudiante estudiante, double promedio1, double promedio2) {
        System.out.println("Estudiante: " + estudiante.nombre);
        System.out.println("Promedio antes del ajuste: " + promedio1);
        System.out.println("Promedio despues del ajuste: " + promedio2);
    }
    
}
