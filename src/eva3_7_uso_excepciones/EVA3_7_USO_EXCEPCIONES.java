/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_uso_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_7_USO_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean datoErroneo = true;
        do{
            try{
                System.out.println("Introduzca su edad(En numero entero): ");
                int iedad = sc.nextInt();
                System.out.println("Tu edad: " + iedad);
                datoErroneo = false;
            }catch(InputMismatchException e){
                System.out.println(sc.next() + " Este dato introduzido no es valido, porfavor ingrese un numero entero!!!");
            }
        }while(datoErroneo);
    
    }
}