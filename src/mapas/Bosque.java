/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Bosque extends Mapas{
    
    
        public void moverse(){
         
            bosque1();
            
        
        }
        
        
    public void bosque1(){
        
        System.out.println("Demasiada vegetación, solo ves un camino hacia el sur y otro al este. \n ¿Hacía donde quieres ir?");
        direccion = sc.next();
        if(direccion.equals("SUR") || direccion.equals("sur")){
            nSector=7;
            comprobarDireccion();
        }else if(direccion.equals("este") || direccion.equals("ESTE")){
            nSector=2;
            comprobarDireccion();
        }
        
        
    }
    
    public void bosque2(){
        
        System.out.println("Demasiada vegetación, solo ves un camino hacia el sur y otro al este. \n ¿Hacía donde quieres ir?");
        direccion = sc.next();
        if(direccion.equals("SUR") || direccion.equals("sur")){
            nSector=7;
            comprobarDireccion();
        }else if(direccion.equals("este") || direccion.equals("ESTE")){
            nSector=2;
            comprobarDireccion();
        }
        
    }
    
    
    public void bosque7(){
        
        System.out.println("Se puede ver el cielo entre los altos arboles. Vemos dos pequeños senderos hacia el sur y el este. \n ¿Hacía donde quieres ir?");
        direccion = sc.next();
        if(direccion.equals("SUR") || direccion.equals("sur")){
            nSector=13;
            comprobarDireccion();
        }else if(direccion.equals("este") || direccion.equals("ESTE")){
            nSector=8;
            comprobarDireccion();
        }
        
    }
    
    
    public void comprobarDireccion(){
        switch(nSector){
            
            case 1:
                bosque1();
                break;
            case 2:
                bosque2();
                break;
//            case 3:
//                bosque3();
//                break;
            case 7:
                bosque7();
                break;
                
        }
        
        
    }
    
    
}
