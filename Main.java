import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     Scanner teclado = new Scanner(System.in);
	     int Opcion = 0;
	     String Usuario = "";
	     String Contraseña = "";
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
	         System.out.println("Ingrese un Usuario");
	         Usuario = teclado.nextLine();
	         System.out.println("Contraseña");
	         Contraseña = teclado.nextLine();
	         System.out.println("Usuario creado\n");

	        break; 
	        
	        case 2: 
	            System.out.println("Bienvenido " + Usuario);
	            
	           break;
	           
	       case 3:
	           System.out.println("Edita tu Usuario " + Usuario);
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
