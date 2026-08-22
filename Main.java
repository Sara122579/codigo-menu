
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     Scanner teclado = new Scanner(System.in);
	     int Opcion = 0;
	     String Usuario = "";
	     String Contraseña = "";
	     String Nombre = "";
	     String Edad = "";
	     String Correo = "";
	     String Teléfono = "";
	     do {
	         System.out.println("Menú principal");
	         System.out.println("1 Crear Usario");
	         System.out.println("2 Ver Usuario");
	         System.out.println("3 Editar Usuario");
	         System.out.println("4 Terminar");
	         
	          Opcion = teclado.nextInt();
	          teclado.nextLine();
	     
	     switch (Opcion) {
	         case 1:
	         System.out.println("Nombre ");
	         Nombre = teclado.nextLine();
	         System.out.println("Edad ");
	         Edad = teclado.nextLine();
	         System.out.println("Correo electronico");
	         Correo = teclado.nextLine();
	         System.out.println("Teléfono");
	         Teléfono = teclado.nextLine();
	         System.out.println("Cree un Usuario ");
	         Usuario = teclado.nextLine();
	         System.out.println("Contraseña");
	         Contraseña = teclado.nextLine();
	         System.out.println("Usuario creado\n");

	        break; 
	        
	        case 2: 
	            System.out.println("Bienvenido " + Usuario);
	            System.out.println("" + Nombre);
	            System.out.println("Edad: " + Edad);
	            System.out.println("Correo: " + Correo);
	            System.out.println("Tel: " + Teléfono);
	            System.out.println("Contraseña: *******\n");

	           break;
	           
	       case 3:
	           System.out.println("Cambiar tu Usuario " + Usuario);
	           Usuario = teclado.nextLine();
	           System.out.println("Usuario correctamente cambiado\n");
	           
	           break;
	       case 4: 
	           System.out.println("Proceso terminado");
	           break;
	       default:
	           System.out.println("Opcion no valida. Intenta de nuevo.");
	           
	     }
	         
	     } while (Opcion != 4);
         teclado.close ();
	  
	         
    	}
	}
	

	      
