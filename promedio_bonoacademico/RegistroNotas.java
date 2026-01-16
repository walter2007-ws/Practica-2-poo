/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedio_bonoacademico;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class RegistroNotas {
    Scanner sc=new Scanner(System.in);
    public void ingresoNotas(int n, double[] notas){
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i+1) +": ");
            notas[i]=sc.nextDouble();
        }
    }
}
