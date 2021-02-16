/*
    26/01/2021  
    Autor: Marc Clapés
 */
package pzeller01;

import java.util.Scanner;

public class Pzeller01 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Marc Clapés");

        int dia = 13, mes = 9, any;
        System.out.println("dime el año");
        any = keyboard.nextInt();
        String strDia = InicioDiaMesZeller(dia, mes, any);
        System.out.println("Autor: Marc Clapes");
        System.out.println("Dia internacional del programador: " + strDia);
    }

    private static int functionB(int yyyy) {
        int bisiesto = 0;

        if (yyyy % 4 == 0 && (yyyy % 100 != 0 | yyyy % 400 == 0)) {
            return bisiesto = 1;
        }
        return bisiesto = 0;
    }

    private static String InicioDiaMesZeller(int dia, int mes, int any) {
        String diaString = "";
        String[] semana = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        int a, y, m, d;
        a = (14 - mes) / 12;
        y = any - a;
        m = mes + 12 * a - 2;
        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        diaString = semana[d];
        return diaString;
    }
}
