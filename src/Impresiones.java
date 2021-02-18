import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Impresiones {
    public static void menu()
    {
        System.out.println("----------Menu----------");
        System.out.println("1. Captura de nombre y calificaciones");
        System.out.println("2. Imprimir calificaciones y promedio de calificaciones");
        System.out.println("3. Imprimir calificaciones y calificación más baja");
        System.out.println("4. Imprimir calificaciones y calificación más alta");
        System.out.println("5. Salir");
    }
    public static void calificaciones(Calificaciones lista[])
    {
        for (int i = 0; i < lista.length; i++)
        {
            System.out.println(lista[i].materia + ": " + lista[i].calificacion);
        }
    }
    public static void limpiezaPantalla()
    {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        for(int i = 0; i < 15; i++)
        {
            System.out.println("");
        }

    }
    public static void error()
    {
        System.out.println("La opcion ingresada no es valida");
    }
}
