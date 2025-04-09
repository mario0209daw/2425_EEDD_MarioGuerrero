package com.Guerrero.Mario.AnalizadorDatos;

import java.util.Scanner;

public class AnalizadorTexto {
    public static void analisisiTex(String fr) {
        String palindromo = "NO";
        if (com.VazquezAlberto.UtilidadesTexto.esPalindromo(fr)) {
            palindromo = "SI";
        }

        System.out.println("Análisis del texto: " + fr);
        System.out.println("¿Es palindromo? " + palindromo);
        System.out.println("Numero de vocales: " + com.VazquezAlberto.UtilidadesTexto.contarVocales(fr));
        System.out.println("Numero de consonantes: " + com.VazquezAlberto.UtilidadesTexto.contarConsonantes(fr));
        System.out.println("Numero de palabras: " + com.VazquezAlberto.UtilidadesTexto.contarPalabras(fr));
        System.out.println("Numero de caracteres: " + com.VazquezAlberto.UtilidadesTexto.contarCaracteres(fr));

    }

}
