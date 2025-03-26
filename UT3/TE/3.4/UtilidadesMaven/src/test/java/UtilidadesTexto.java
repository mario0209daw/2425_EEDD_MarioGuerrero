public class UtilidadesTexto {

    public static boolean esPalidromo(String cadena) {
        cadena = cadena.toLowerCase();
        int inicio = 0;
        int fin = cadena.length() - 1;
        while (inicio < fin) {
            if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            // Obtenemos el carácter actual
            char c = cadena.charAt(i);

            // Comprobamos si el carácter es una vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
