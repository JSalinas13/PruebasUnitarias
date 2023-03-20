package com.mycompany.pruebasunitarias;

import java.util.Scanner;

/**
 *
 * @author chuye
 */
public class CodingBat {
    //COMMOMTWO

    Scanner sc = new Scanner(System.in);
    String[] a;
    String[] b;

    public void recibirDatos() {
        System.out.println("Para ingresar las cadenas ingreselas de forma secuencial y en orden alfabetico"
                + "\n Ejemplo:"
                + "\n Cadena A: a b c d"
                + "\n Cadena B: b d e g \n\n");
        System.out.print("Ingrese la cadena A: ");
        String cadenaA = sc.nextLine();
        System.out.print("Ingrese la cadena B: ");
        String cadenaB = sc.nextLine();

        a = generarArreglo(cadenaA);
        b = generarArreglo(cadenaB);
        imprimirResultado(commonTwo(a, b));

//        String a[] = {"a", "c", "x"};
//        String b[] = {"b", "c", "d", "x"};
//
//        String a = "a c x";
//        String b = "b c d x";
    }

    public String[] generarArreglo(String datos) {
        return datos.split(" ");
    }

    public void imprimirResultado(int result) {
        System.out.println(result);
    }

    public int commonTwo(String[] a, String[] b) {
        int cont = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    cont++;
                    for (int k = 0; k < b.length; k++) {
                        if (a[i].equals(b[k])) {
                            b[k] = "";
                            System.out.println(b[k]);
                        }
                    }
                }
            }
        }
        return cont;
    }

}
