/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlasistencia;

/**
 *
 * @author Admin
 */
public class ValidacionMinAsistencia implements IValidacionAsistencia {
    @Override
    public boolean validar(double porcentaje){
        if(porcentaje>=70){
            return true;
        }
        else{
            return false;
        }
    }
}
