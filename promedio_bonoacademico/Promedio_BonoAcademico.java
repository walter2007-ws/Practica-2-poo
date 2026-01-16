/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio_bonoacademico;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Promedio_BonoAcademico {

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
        RegistroNotas registro= new RegistroNotas();
        ManejoNotas manejoNotas =new ManejoNotas();
        Reporte reporte=new Reporte();
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre=sc.nextLine();
        System.out.print("Ingrese la cantidad de notas a ingresar: ");
        int n= sc.nextInt();
        double[] notas= new double[n];
        registro.ingresoNotas(n, notas);
        Estudiante estudiante=new Estudiante(nombre,notas);
        double promedio=manejoNotas.promedio(notas);
        
        System.out.println("Desea aplicar el bono academico? 1:si / cualquier valor: no");
        int op=sc.nextInt();
        if(op==1){
            promedio =manejoNotas.bono(promedio);
        }
        boolean aprobar= manejoNotas.aprobar(promedio);
        reporte.mostrar(estudiante, promedio, aprobar);

    }
    
}

