package com.Guerrero.Mario.AnalizadorDatos;

import java.util.Scanner;

import com.VazquezAlberto.UtilidadesNumeros;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean t = true;
        int opcion, num;
        String frase;
        while (t) {
            System.out.println("""
                    1. ANALISIS NUMÉRICO
                    2. ANALISIS DE TEXTO
                    3. SALIR 
                    
                    ELIGE EL NUMERO ASOCIADO A LA OPCION QUE QUIERE HACER:""");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("introduzca un numero:");
                    num = sc.nextInt();
                    AnalizadorNumerico.analisisNUM(num);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("introduzca una frase:");
                    frase = sc.nextLine();
                    AnalizadorTexto.analisisiTex(frase);
                    break;
                case 3:
                    t = false;
                    break;
                default:
                    System.out.println("No ha ingresado un numero de correspondiente a las opciones");

            }
        }
    }
}
