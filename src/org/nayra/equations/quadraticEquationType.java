package org.nayra.equations;

public class quadraticEquationType {


    public String vertexEquation(int part1b, int part2a, int part4c){
    int resultNumberX = -part1b / 2 * part2a;
    //f(resultNumber) =  a * x2 + b * x + c
    int resultNumberY = part2a * resultNumberX^2 + part1b * resultNumberX + part4c;
    String result = "("+resultNumberX+resultNumberY+")";
    return result;
    }
    public String vertexEquationSymmetry(int part1b,int part2a){
        int resultNumberX = -part1b / 2 * part2a;
        String resultSymmetry = "Eje de simetría: "+resultNumberX;
        return resultSymmetry;
    }
    public String shortPoints(int part1a, int part2b, int part3c){
        int Result1 = part2b^2 - 4 * part1a * part3c;
        double baseNumber = Math.sqrt(Result1);
        double resultPositive = -part2b + baseNumber / 2 * part3c;
        double resultNegative = -part2b - baseNumber / 2 * part3c;
        String twoResults = "Resultados: "+resultPositive+" | "+resultNegative;
        return twoResults;
    }
}
