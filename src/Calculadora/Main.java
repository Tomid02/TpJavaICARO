package Calculadora;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        //Ciclo de 5 vueltas
        for (int i=0; i<5; i++){
            System.out.println("---------------------------------------");
            System.out.print("Primer valor: ");
            int numero1 = scanner.nextInt();

            System.out.print("Segundo valor: ");
            int numero2 = scanner.nextInt();

            System.out.print("Operación: ");
            String operacion = scanner.next();

            /*
            opté por guardar el resultado de las operaciones en una variable de tipo float para realizar
            las validaciones finales de manera mas sencilla, los metodos Suma(), Resta() y  Multiplicacion()
            retornan valores de tipo int, mientras que Division() retorna valores de tipo float
            */
            float resultado = 0;

            switch (operacion){
                case "+":
                    resultado = calculadora.Suma(numero1, numero2);
                    System.out.println("\nResultado: " + (int) resultado);
                    evaluarResultado(resultado);
                    break;
                case "-":
                    resultado = calculadora.Resta(numero1, numero2);
                    System.out.println("\nResultado: " + (int) resultado);
                    evaluarResultado(resultado);
                    break;
                case "*":
                    resultado = calculadora.Multiplicacion(numero1, numero2);
                    System.out.println("\nResultado: " + (int) resultado);
                    evaluarResultado(resultado);
                    break;
                case "/":
                    resultado = calculadora.Division(numero1, numero2);
                    System.out.println("\nResultado: " + resultado);
                    evaluarResultado(resultado);
                    break;
                default:
                    System.out.println("\nOperacion no válida");
            }
        }
        scanner.close();
    }

    public static void evaluarResultado(float num){
        if (num < 0 ){//evalua si el numero es negativo
            System.out.println("Tené cuidado, el resultado es negativo!");
        } else if (0 <= num && num < 10000) {//evalua si el numero esta en el intervalo [0, 1000)
            System.out.println("Resultado dentro de los limites");
        }else{
            System.out.println("Eror, resultado muy grande");
        }
    }
}
