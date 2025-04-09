package com.Guerrero.Mario.AnalizadorDatos;

public class AnalizadorNumerico {
    public static void analisisNUM(int num) {
        String par = "NO", impar = "No", primo = "NO", perfecto = "NO;";
        if (com.VazquezAlberto.UtilidadesNumeros.esPar(num)) {
            par = "SI";
        } else {
            impar = "SI";
        }
        if (com.VazquezAlberto.UtilidadesNumeros.esPrimo(num)) {
            primo = "SI";
        }
        if (com.VazquezAlberto.UtilidadesNumeros.esPerfecto(num)) {
            perfecto = "SI";
        }

        System.out.println("Analisis del numero " + num);
        System.out.println("¿Es par? " + par);
        System.out.println("¿Es impar? " + impar);
        System.out.println("¿Es primo? " + primo);
        System.out.println("Factorial : " + com.VazquezAlberto.UtilidadesNumeros.factorial(num));
        System.out.println("Divisores : " + com.VazquezAlberto.UtilidadesNumeros.devolverDivisores(num));
        System.out.println("¿Es perfecto? " + perfecto);
    }
}
