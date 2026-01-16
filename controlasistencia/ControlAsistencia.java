/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlasistencia;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ControlAsistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        En el presente se utilizaron dos principios SOLID
        S- Single Responsability. Cada clase hace unicamente lo que dice
        L- Liskov Substitution. Las clases pueden reemplazar a sus clases padre, en este caso a las intertfaces.
        I- Interface Segregation. Todas las interfaces creadas son utilizadas por cada clase.
        */
        Scanner sc=new Scanner(System.in);
        Asistencia registro=new Asistencia();
        ValidacionMinAsistencia min =new ValidacionMinAsistencia();
        Reporte reporte=new Reporte();
        PorcentajeAsistencia porciento= new PorcentajeAsistencia();
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre=sc.nextLine();
        System.out.println("Ingrese la cantidad de clases a registrar: ");
        int n=sc.nextInt();
        boolean[] asistencia =new boolean[n];
        registro.registroAsistencia(n, asistencia);
        double porcentaje = porciento.porcentajeAsistencia(asistencia);
        boolean validar = min.validar(porcentaje);
        Estudiante estudiante=new Estudiante(nombre,asistencia);
        reporte.mostrar(estudiante, porcentaje, validar);
        
    }
    
}

