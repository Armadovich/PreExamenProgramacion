package EjercicioInstituto;

import java.util.Scanner;

public class Util {
    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        System.out.println("=============================================================================");
        System.out.println("                                MENU                                         ");
        System.out.println("=============================================================================");
        System.out.println("(1) Dar de alta                 (2) Dar de baja                 (3) Consultas");
        System.out.println("(4) Mostrar edad media   (5) Calcular nota media   (6) Calcular salario medio");
        System.out.println("                              (7) SALIR                                      ");
        System.out.println("=============================================================================");
    }


    public static void inputMenu(){
        try {
            sc.nextInt();

        }catch (Excepcion excepcion)



    }
}
