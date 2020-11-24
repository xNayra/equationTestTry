package org.nayra;

import org.nayra.equations.linealEquationType;
import org.nayra.equations.quadraticEquationType;
import org.nayra.equations.relatedEquationType;

import javax.swing.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué necesitas calcular?");
        System.out.println("1: Funciones líneales");
        System.out.println("2: Funciones Afines");
        System.out.println("3: Funciones cuadráticas");


        int rest = sc.nextInt();
        switch(rest){
            case 1:
                System.out.println("Funciones lineales, datos necesarios:");
                linealEquationType el = new linealEquationType();
                System.out.println("Introduce cualquier punto de la recta");
                double pointA = sc.nextDouble();
                //el.linealEquation(1, 2, pointA);
                return;
            case 2:
                System.out.println("Funciones afines, datos necesarios:");
                relatedEquationType er = new relatedEquationType();
                System.out.println("Introduce m");
                int mConst = sc.nextInt();
                System.out.println("Introduce n");
                int nConst = sc.nextInt();
                if(mConst < 0 ){
                    System.out.println("La función es decreciente.");
                }else{
                    System.out.println("La función es creciente");
                    }
                System.out.println("(Primer punto: 0,"+nConst+")");
                System.out.println("Introduce el valor por el que quieres obtener el segundo punto.");
                int mValue = sc.nextInt();
                System.out.println("El segundo punto es: ");
                System.out.println("("+mValue+","+er.relatedEquation(mConst, nConst, mValue)+")");
                return;
            case 3:
                System.out.println("Primer paso, calcular el vértice");
                // Vértice: x,y
                quadraticEquationType qe = new quadraticEquationType();
                System.out.println("Introduce los números, 'a', 'b' y 'c' de forma consecutiva");
                int aNumber = sc.nextInt() ; int bNumber = sc.nextInt() ; int cNumber = sc.nextInt();

                System.out.println("Vértice:"+qe.vertexEquation(bNumber, aNumber, cNumber));
                System.out.println("Segundo paso, calcular el eje de simetría");
                System.out.println(qe.vertexEquationSymmetry(bNumber, aNumber));
                System.out.println("Calcular los puntos de corte con los ejes..");
                System.out.println(qe.shortPoints(aNumber, bNumber, cNumber));
                return;

        }
    }
}
