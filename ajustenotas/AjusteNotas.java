/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ajustenotas;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class AjusteNotas {

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
        RegistroNotas registro=new RegistroNotas();
        Promedio promedio= new Promedio();
        Ajuste ajuste=new Ajuste();
        Reporte reporte= new Reporte();
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre=sc.nextLine();
        System.out.print("Ingrese el numero de notas a ingresar: ");
        int n=sc.nextInt();
        double[] notas= new double[n];
        registro.ingresoNotas(n, notas);
        double promedio1=promedio.promedio(notas);
        ajuste.ajustar(notas);
        double promedio2=promedio.promedio(notas);
        Estudiante estudiante=new Estudiante(nombre,notas);
        reporte.mostrar(estudiante, promedio1, promedio2);
        
        
        
        
    }
    
}

