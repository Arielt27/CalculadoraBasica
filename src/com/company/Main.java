package com.company;
import java.util.Scanner;

public class Main
{

    public static int Suma(int a, int b, int c, int d, int e, int f)
    {
        int result = 0;

        result = a + b + c + d + e + f;

        return result;
    }

    public static int Resta(int a, int b, int c, int d, int e)
    {
        int result = 0;

        result = a - b - c - d - e;

        return result;
    }

    public static int Multiplicacion(int a, int b, int c, int d)
    {
        int result = 0;

        result = a * b * c * d;

        return result;
    }

    public static int Division(int a, int b)
    {
        int result = 0;

        result = a / b;

        return result;
    }

    public static double Potencia(double a, double b)
    {
        double result = 0;

        result = Math.pow(a,b);

        return result;
    }

    public static double Raiz(double a)
    {
        double result = 0;

        result = Math.sqrt(a);

        return result;
    }


    public static void main(String[] args)
    {
        int opc;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("*****CALCULADORA******");
        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Multiplicacion");
        System.out.println("4- Division");
        System.out.println("5- Potencia");
        System.out.println("6- Raiz Cuadrada");
        System.out.println("7- Salir");
        System.out.print("Su opcion es: ");
        opc = lector.nextInt();

        while(opc != 7)
        {

            switch(opc)
            {
                case 1: // SUMA

                    System.out.println(" ");

                    System.out.println("*********SUMA*********");

                    System.out.print("Ingrese el primer digito: ");
                    a = lector.nextInt();

                    System.out.print("Ingrese el segundo digito: ");
                    b = lector.nextInt();

                    System.out.print("Ingrese el tercer digito: ");
                    c = lector.nextInt();

                    System.out.print("Ingrese el cuarto digito: ");
                    d = lector.nextInt();

                    System.out.print("Ingrese el quinto digito: ");
                    e = lector.nextInt();

                    System.out.print("Ingrese el sexto digito: ");
                    f = lector.nextInt();

                    int Resp = Suma(a,b,c,d,e,f);

                    System.out.println("La Suma es: " + Resp);

                    System.out.println("**********************");

                    System.out.println(" ");

                    System.out.println("*****CALCULADORA******");
                    System.out.println("1- Suma");
                    System.out.println("2- Resta");
                    System.out.println("3- Multiplicacion");
                    System.out.println("4- Division");
                    System.out.println("5- Potencia");
                    System.out.println("6- Raiz Cuadrada");
                    System.out.println("7- Salir");
                    System.out.print("Su opcion es: ");
                    opc = lector.nextInt();

                    break;

                case 2: // RESTA

                    System.out.println(" ");

                    System.out.println("********RESTA*********");

                    System.out.print("Ingrese el primer digito: ");
                    a = lector.nextInt();

                    System.out.print("Ingrese el segundo digito: ");
                    b = lector.nextInt();

                    System.out.print("Ingrese el tercer digito: ");
                    c = lector.nextInt();

                    System.out.print("Ingrese el cuarto digito: ");
                    d = lector.nextInt();

                    System.out.print("Ingrese el quinto digito: ");
                    e = lector.nextInt();

                    Resp = Resta(a,b,c,d,e);

                    System.out.println("La Resta es: " + Resp);

                    System.out.println("**********************");

                    System.out.println(" ");

                    System.out.println("*****CALCULADORA******");
                    System.out.println("1- Suma");
                    System.out.println("2- Resta");
                    System.out.println("3- Multiplicacion");
                    System.out.println("4- Division");
                    System.out.println("5- Potencia");
                    System.out.println("6- Raiz Cuadrada");
                    System.out.println("7- Salir");
                    System.out.print("Su opcion es: ");
                    opc = lector.nextInt();

                    break;

                case 3: // MULTIPLICACION

                    System.out.println(" ");

                    System.out.println("****MULTIPLICACION****");

                    System.out.print("Ingrese el primer digito: ");
                    a = lector.nextInt();

                    System.out.print("Ingrese el segundo digito: ");
                    b = lector.nextInt();

                    System.out.print("Ingrese el tercer digito: ");
                    c = lector.nextInt();

                    System.out.print("Ingrese el cuarto digito: ");
                    d = lector.nextInt();

                    Resp = Multiplicacion(a,b,c,d);

                    System.out.println("La Multiplicacion es: " + Resp);

                    System.out.println("**********************");

                    System.out.println(" ");

                    System.out.println("*****CALCULADORA******");
                    System.out.println("1- Suma");
                    System.out.println("2- Resta");
                    System.out.println("3- Multiplicacion");
                    System.out.println("4- Division");
                    System.out.println("5- Potencia");
                    System.out.println("6- Raiz Cuadrada");
                    System.out.println("7- Salir");
                    System.out.print("Su opcion es: ");
                    opc = lector.nextInt();

                    break;

                case 4: // DIVISION

                    System.out.println(" ");

                    System.out.println("*******DIVISION*******");

                    System.out.print("Ingrese el primer digito: ");
                    a = lector.nextInt();

                    System.out.print("Ingrese el segundo digito: ");
                    b = lector.nextInt();

                    if(b == 0)
                    {
                        System.out.println(" ");
                        System.out.println("No se puede dividir entre 0, ingrese otro numero.");
                    }
                    else
                    {
                        Resp = Division(a,b);

                        System.out.println("La Division es: " + Resp);

                        System.out.println("**********************");

                        System.out.println(" ");

                        System.out.println("*****CALCULADORA******");
                        System.out.println("1- Suma");
                        System.out.println("2- Resta");
                        System.out.println("3- Multiplicacion");
                        System.out.println("4- Division");
                        System.out.println("5- Potencia");
                        System.out.println("6- Raiz Cuadrada");
                        System.out.println("7- Salir");
                        System.out.print("Su opcion es: ");
                        opc = lector.nextInt();
                    }

                    break;

                case 5: // POTENCIA

                    System.out.println(" ");

                    System.out.println("*******POTENCIA*******");

                    System.out.print("Ingrese el numero a elevar: ");
                    a = lector.nextInt();

                    System.out.print("Ingrese la potencia a la que desea elevar: ");
                    b = lector.nextInt();

                    double Resp1 = Potencia(a,b);

                    System.out.println("La Potencia es: " + Resp1);

                    System.out.println("**********************");

                    System.out.println(" ");

                    System.out.println("*****CALCULADORA******");
                    System.out.println("1- Suma");
                    System.out.println("2- Resta");
                    System.out.println("3- Multiplicacion");
                    System.out.println("4- Division");
                    System.out.println("5- Potencia");
                    System.out.println("6- Raiz Cuadrada");
                    System.out.println("7- Salir");
                    System.out.print("Su opcion es: ");
                    opc = lector.nextInt();

                    break;

                case 6: // RAIZ CUADRADA

                    System.out.println(" ");

                    System.out.println("********RAIZ*********");

                    System.out.print("Ingrese el numero de la raiz: ");
                    a = lector.nextInt();

                    Resp1 = Raiz(a);

                    System.out.println("La Raiz Cuadrada es: " + Resp1);

                    System.out.println("**********************");

                    System.out.println(" ");

                    System.out.println("*****CALCULADORA******");
                    System.out.println("1- Suma");
                    System.out.println("2- Resta");
                    System.out.println("3- Multiplicacion");
                    System.out.println("4- Division");
                    System.out.println("5- Potencia");
                    System.out.println("6- Raiz Cuadrada");
                    System.out.println("7- Salir");
                    System.out.print("Su opcion es: ");
                    opc = lector.nextInt();

                    break;
            }
        }
    }
}