/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Scanner;

/**
 *
 * @author Gerardo L
 */
public class sign_in {
    public void registration(){
       
        Scanner teclado = new Scanner(System.in);
	int login = 0;
	int pass = 0;
	int intentos = 1;
	int maximo = 3;
 
	while((login!=1809)||(pass!=1234)&& (intentos<maximo)){
            System.out.println("Introduzca su login");
            System.out.print("--> ");
            login = teclado.nextInt();
            System.out.println("Introduzca su pass");
            System.out.print("--> ");
            pass = teclado.nextInt();
 
            if(intentos == 3){
		System.out.println("Acceso denegado..");
		System.out.println("Vuelva a intentarlo dentro de 2 minutos..");
		intentos = intentos - maximo;
                try{
                    Thread.sleep(2*60*1000);
                }catch(InterruptedException ex){}
            }
            intentos ++;
            System.out.println();
 
        }
        
            System.out.println("Login & Password are corrects...");
            System.out.println("Welcome");
    }
    
}
