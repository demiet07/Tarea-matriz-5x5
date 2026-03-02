import java.util.Scanner;
// Damian Ortega #  

public class Matriz5x5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        // Llenado de la matriz con validación
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int valor;
                // Bucle do-while para repetir la pregunta hasta que el dato sea correcto
                do {
                    System.out.print("Ingrese el valor para [" + i + "][" + j + "] (debe ser de 0 a 4): ");
                    valor = sc.nextInt();
                    
                    if (valor < 0 || valor > 4) {
                        System.out.println("¡Error! Solo se permiten números entre 0 y 4.");
                    }
                } while (valor < 0 || valor > 4);
                
                matriz[i][j] = valor;
            }
        }

        // Impresión de la matriz en formato de tabla
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}