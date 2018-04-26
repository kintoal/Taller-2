
package Taller2;
import becker.robots.*;
import java.util.Random;


public class Uber {
       
    public static City ciudad;
    public static Robot uber;
    public static Thing persona;
    


    public static void main(String[] args) {
        Random numero = new Random(System.currentTimeMillis());
        ciudad = new City("Uber.txt");
        Robot[] carros = new Robot[10];
        Persona[] persona = new Persona[14];
        for (int i = 0; i < 10; i++) {
            carros[i]= new Robot (ciudad,numero.nextInt(15),numero.nextInt(15),Direction.EAST);
        }
        for (int i = 0; i < 14; i++) {
            persona[i]= new Persona(numero.nextInt(15), numero.nextInt(15), new Thing(ciudad, numero.nextInt(15),numero.nextInt(15),Direction.EAST));
        }
        
        
        
        
        

    }
    
}
