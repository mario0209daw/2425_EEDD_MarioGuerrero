import java.util.ArrayList;
import java.util.List;

public class UtilidadesNumeros {

    // version 1.1 de la libreria

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean esImpar(int numero) {
        if (numero % 2 == 1) {
            return true;
        }
        return false;
    }

    // version 1.2 de la libreria

    public static boolean esPrimo(int numero) {
        for (int i = 2; i <= numero - 1; i++) {
            if (numero % i == 0) {
                return false; // Si se divide sin residuo, no es primo
            }
        }
        return true;
    }

    public static int factorial(int numero) {
        int fac = 1;
        for (int i = 0; i <= numero; i++) {
            fac = fac * i;
        }
        return fac;
    }

    // version 1.3 de la libreria


    public static List<Integer> devolverDivisores(int numero) {
        List<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }

    public static boolean esPerfecto(int numero) {
        int cont = 0;
        for (int i = 1; i <= numero - 1; i++) {
            if (numero % i == 0) {
                cont = cont + i;
            }
        }
        if (cont == numero) {
            return true;
        }
        return false;
    }
}
