/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlasistencia;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Asistencia implements IAsistencia {
    @Override
    public void registroAsistencia(int n, boolean[] asistencia){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la asistencia de la clase " + (i+1)+"  (1. asistio / 2.no asistio) : ");
            int op=sc.nextInt();
            if(op==1){
                asistencia[i] = true;
            }else{
                asistencia[i] = false;
            }
            
        }
    }
}

