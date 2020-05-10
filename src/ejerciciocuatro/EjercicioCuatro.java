
package ejerciciocuatro;
import java.util.Scanner;
public class EjercicioCuatro {

   
    public static void main(String[] args) {
   
       Scanner read = new Scanner (System.in);
       int Opcion;
       do{
       System.out.println("****************MENU DE OPCIONES***************");
       System.out.println("1-MENSAJES");
       System.out.println("2-RECARGA DE TARJETAS");
       System.out.println("3-SOPORTE TECNICO");
       System.out.println("4- SALIR");
       
       Opcion=read.nextInt();
       
       int variable1,variable2;  
       switch(Opcion)   
       {
           case 1: 
               System.out.println("SELECCIONO MENSAJES");
               System.out.println("INGRESE CUANTOS MENSAJES DESEA  ");
               variable1=read.nextInt();
               variable2=variable1;
               System.out.println("SU RECARGA ES DE  "+variable2);
              
              break;
               
           case 2:
               System.out.println("SELECCIONO RECARGA DE TARJETAS");
               System.out.println("INGRESE EL VALOR DE SU RECARGA  ");
               variable1=read.nextInt();
               variable2=variable1;
               System.out.println("SU RECARGA ES DE  "+variable2);
               
           break;
           case 3:
               System.out.println("SELECCIONO SOPORTE TECNICO");
               System.out.println("INGRESE SU NUMERO DE TELEFONO PARA COMUNICARNOS CON USTED  ");
               variable1=read.nextInt();
               variable2=variable1;
               System.out.println("SU NUMERO ES   "+variable2);
               System.out.println("GRACIAS POR UTILIZAR NUESTROS SERVICIOS, NOS COMUNICAREMOS CON USTED  ");
               
           break;
           case 4:
               System.out.println("SELECCIONE UNA OPCION VALIDA");
               break;
               
           default:
               System.out.println("SELECCIONE UNA OPCION VALIDA");
               break;
           
       }
       }while(Opcion !=4);
       
    }
    }

