import java.util.Scanner;

public class Main {

    // Arreglos que almacenan los datos de los empleados.
    // Cada posición representa a un mismo empleado.
    public static String[] nombre = new String[100];
    public static float[] sueldo = new float[100];
    public static String[] cargo = new String[100];

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de gestión de empleados");

        // Carga los empleados iniciales y obtiene la cantidad registrada.
        int nroEmpleados = leerDatos();

        Scanner teclado = new Scanner(System.in);
        int opcion;

        // El menú se repite hasta que el usuario seleccione la opción 5.
        do {
            System.out.println("\n------    Menú  ------");
            System.out.println("|1.    Crear empleado  |");
            System.out.println("|2. Ver empleados      |");
            System.out.println("|3. Actualizar empleado|");
            System.out.println("|4. Eliminar empleado  |");
            System.out.println("|5.      Salir         |");
            System.out.print(" |Seleccione una opción:|");

            opcion = Integer.parseInt(teclado.nextLine());

            // Dependiendo de la opción, se ejecuta una operación CRUD.
            switch (opcion) {

                case 1:
                    // Permite registrar un nuevo empleado.
                    nroEmpleados = crearEmpleado(teclado, nroEmpleados);
                    break;

                case 2:
                    // Muestra todos los empleados registrados.
                    verDatos(nroEmpleados);
                    break;

                case 3:
                    // Permite modificar los datos de un empleado.
                    actualizarEmpleado(teclado, nroEmpleados);
                    break;

                case 4:
                    // Elimina un empleado y actualiza la cantidad total.
                    nroEmpleados = eliminarEmpleado(teclado, nroEmpleados);
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);
    }


    // crea el usuariio
    public static int crearEmpleado(Scanner teclado, int nroEmpleados) {

        // Comprueba que todavía haya espacio en los arreglos.
        if (nroEmpleados >= nombre.length) {
            System.out.println("No hay espacio para más empleados.");
            return nroEmpleados;
        }

        // Guarda los datos del nuevo empleado en la siguiente posición.
        System.out.print("Ingrese el nombre del empleado: ");
        nombre[nroEmpleados] = teclado.nextLine();

        System.out.print("Ingrese el sueldo del empleado: ");
        sueldo[nroEmpleados] = Float.parseFloat(teclado.nextLine());

        System.out.print("Ingrese el cargo del empleado: ");
        cargo[nroEmpleados] = teclado.nextLine();

        // Aumenta en uno la cantidad de empleados registrados.
        return nroEmpleados + 1;
    }


    // ver los datos de los empleados
    public static void verDatos(int nroEmpleados) {

        // Comprueba si existen empleados registrados.
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        // Recorre los arreglos y muestra los datos de cada empleado.
        for (int i = 0; i < nroEmpleados; i++) {
            System.out.println("Datos del empleado " + (i + 1) + ":");
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Sueldo: " + sueldo[i]);
            System.out.println("Cargo: " + cargo[i]);
        }
    }

    // ============================
    // Actualiza los datos del empleado
    public static void actualizarEmpleado(Scanner teclado, int nroEmpleados) {

        System.out.print("Ingrese el número del empleado: ");

        // Se resta 1 porque los arreglos comienzan en la posición 0.
        int indice = Integer.parseInt(teclado.nextLine()) - 1;

        // Verifica que el número del empleado sea válido.
        if (indice < 0 || indice >= nroEmpleados) {
            System.out.println("Empleado no encontrado.");
            return;
        }

        // Reemplaza los datos anteriores por los nuevos.
        System.out.print("Ingrese el nuevo nombre: ");
        nombre[indice] = teclado.nextLine();

        System.out.print("Ingrese el nuevo sueldo: ");
        sueldo[indice] = Float.parseFloat(teclado.nextLine());

        System.out.print("Ingrese el nuevo cargo: ");
        cargo[indice] = teclado.nextLine();

        System.out.println("Empleado actualizado.");
    }

    // Elimina empleado
    public static int eliminarEmpleado(Scanner teclado, int nroEmpleados) {

        System.out.print("Ingrese el número del empleado: ");

        // Convierte el número mostrado al usuario en índice del arreglo.
        int indice = Integer.parseInt(teclado.nextLine()) - 1;

        // Verifica que el empleado exista.
        if (indice < 0 || indice >= nroEmpleados) {
            System.out.println("Empleado no encontrado.");
            return nroEmpleados;
        }

        // Desplaza los empleados siguientes una posición hacia atrás
        // para ocupar el lugar del empleado eliminado.
        for (int i = indice; i < nroEmpleados - 1; i++) {
            nombre[i] = nombre[i + 1];
            sueldo[i] = sueldo[i + 1];
            cargo[i] = cargo[i + 1];
        }

        // Limpia la última posición después del desplazamiento.
        nombre[nroEmpleados - 1] = null;
        cargo[nroEmpleados - 1] = null;
        sueldo[nroEmpleados - 1] = 0;

        System.out.println("Empleado eliminado.");

        // Disminuye la cantidad total de empleados.
        return nroEmpleados - 1;
    }
//lee los datos 
    public static int leerDatos() {

        Scanner teclado = new Scanner(System.in);

        // Solicita cuántos empleados se desean registrar inicialmente.
        System.out.print("Ingrese el número inicial de empleados: ");
        int nroEmpleados = Integer.parseInt(teclado.nextLine());

        // Verifica que la cantidad esté dentro del límite permitido.
        if (nroEmpleados < 0 || nroEmpleados > nombre.length) {
            nroEmpleados = 0;
        }

        // Permite ingresar los datos de cada empleado inicial.
        for (int i = 0; i < nroEmpleados; i++) {

            System.out.println("\nEmpleado " + (i + 1));

            System.out.print("Ingrese el nombre del empleado: ");
            nombre[i] = teclado.nextLine();

            System.out.print("Ingrese el sueldo del empleado: ");
            sueldo[i] = Float.parseFloat(teclado.nextLine());

            System.out.print("Ingrese el cargo del empleado: ");
            cargo[i] = teclado.nextLine();
        }

        // Devuelve la cantidad de empleados registrados.
        return nroEmpleados;
    }
}
