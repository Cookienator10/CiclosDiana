package CiclosTarea;
import java.util.Scanner;

public class numeros {
public static void main(String[] args) {
    Scanner N1 = new Scanner(System.in);
    int contador, i, numero;
    System.out.println("Ingrese un numero: ");
    numero = N1.nextInt();

    contador = 0;
    for (i = 1; i <= numero; i++) {
        if ((numero % i) == 0) {
            contador++;
        }
    }
    if (contador <= 2) {
        System.out.println("El numero es primo");

    } else {
        System.out.println("El numero  es entero");
    }
//tabla de multplicar ciclo do while
    System.out.println("tabla de multiplicar obtenida con el ciclo do while:");
    i = 1;
    do {
        int res = numero * i;
        System.out.println(numero + "x" + i + "=" + res);
        i++;
    } while (i <= 10);
//tabla de multiplicar ciclo while
System.out.println("Tabla de multiplicar ciclo while: ");

int j= 1;
    //ciclo

    while(j <= 10) {
        int res = numero * j;
        System.out.println(numero + "x" + j + "=" + res);
        //incremento de la variable 1
        j++;
    }
    //tabla de multriplicar ciclo for
    System.out.println("Tabla de multiplicar ciclo for: ");

    int k=1;

    for( k=1; k<=10; k++){
        int res = numero * k;
        System.out.println(numero + "x" + k + "=" + numero * res);

    }


    }


}



