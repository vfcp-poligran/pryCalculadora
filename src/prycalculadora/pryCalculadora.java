import java.util.Scanner;

public class pryCalculadora {
    // Métodos definidos a nivel de clase (fuera del main)
    
    // Método para suma
    static double metSuma(double a, double b) {
        return a + b;
    }
    
    // Método para resta
    static double metResta(double a, double b) {
        return a - b;
    }
    
    // Método para multiplicación
    static double metMult(double a, double b) {
        return a * b;
    }
    
    // Método para división
    static double metDivision(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero");
            return Double.NaN; // Retorna "Not a Number"
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1 = 0, numero2 = 0;
        int opcion;
        
        do {
            // Menú principal
            System.out.println("\n--- MENÚ CALCULADORA ---");
            System.out.println("1. Digitar los números (Numero1 y Numero2)");
            System.out.println("2. Calcular la suma");
            System.out.println("3. Calcular la resta");
            System.out.println("4. Calcular la multiplicación");
            System.out.println("5. Calcular la división");
            System.out.println("6. Salir del programa");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    numero2 = scanner.nextDouble();
                    break;
                    
                case 2:
                    if (numero1 == 0 && numero2 == 0) {
                        System.out.println("Primero ingrese los números (Opción 1)");
                    } else {
                        System.out.println("Resultado de la suma: " + metSuma(numero1, numero2));
                    }
                    break;
                    
                case 3:
                    if (numero1 == 0 && numero2 == 0) {
                        System.out.println("Primero ingrese los números (Opción 1)");
                    } else {
                        System.out.println("Resultado de la resta: " + metResta(numero1, numero2));
                    }
                    break;
                    
                case 4:
                    if (numero1 == 0 && numero2 == 0) {
                        System.out.println("Primero ingrese los números (Opción 1)");
                    } else {
                        System.out.println("Resultado de la multiplicación: " + metMult(numero1, numero2));
                    }
                    break;
                    
                case 5:
                    if (numero1 == 0 && numero2 == 0) {
                        System.out.println("Primero ingrese los números (Opción 1)");
                    } else {
                        double resultado = metDivision(numero1, numero2);
                        if (!Double.isNaN(resultado)) {
                            System.out.println("Resultado de la división: " + resultado);
                        }
                    }
                    break;
                    
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
        } while (opcion != 6);
        
        scanner.close();
    }
}