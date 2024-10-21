
package com.mycompany.figurageometrica;

import java.util.Scanner;


public class Principal {
    public static void principal (String []args) {
        Scanner scanner = new Scanner (System.in);
       System.out.println("Ingrese el nombre de la figura:");
        String nombre = scanner.nextLine();
      
        System.out.println("Ingrese el color de la figura:");
        String color = scanner.nextLine();
        
        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo):");
        int tipoFigura = scanner.nextInt();
        FiguraGeometrica figura = null;
        
        switch (tipoFigura) {
            case 1: 
                System.out.println("Ingrese el radio del círculo:");
                double radio = scanner.nextDouble();
                figura = new Circulo(color, radio);
                break;
                
            case 2: 
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                double lado1 = scanner.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                double lado2 = scanner.nextDouble();
                figura = new Rectángulo(color, lado1, lado2);
                break;
                
            case 3: 
                System.out.println("Ingrese el valor de la base del triángulo:");
                double base = scanner.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                double altura = scanner.nextDouble();
                figura = new Triangulo(color, base, altura);
                break;
                
            default:
                System.out.println("Tipo de figura no válido.");
                break;
        }
    
        if (figura = nombre ) {
            System.out.println("Área de la figura: " + figura.obtenerArea());
            System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());
        }
        
        scanner.close();
    }

    
}
