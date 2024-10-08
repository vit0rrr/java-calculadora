import java.util.Scanner;

public class Calculadora {
    private double num1;
    private double num2;

    // Métodos getter e setter para o primeiro número
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2(){
        return num2;
    }

    public void setNum2(double num2){
        this.num2 =num2;
    }

    public double somar(){
        return num1 + num2;
    }

    public double subtrair() {
        return num1 - num2;
    }

   
    public double multiplicar() {
        return num1 * num2;
    }

    public double dividir(){
            return num1 /num2;
     }

public static void main(String[] args ){
    Scanner scanner = new Scanner (System.in);
    Calculadora calc = new Calculadora();

System.out.println ("Calculadora");
System.out.println ("Escolha a operação");
System.out.println ("1-Soma");
System.out.println ("2-Subtração");
System.out.println ("3-Multiplicação");
System.out.println ("4-Divisão");


int escolha = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        calc.setNum1(scanner.nextDouble());

        System.out.print("Digite o segundo número: ");
        calc.setNum2(scanner.nextDouble());

        // Realizar a operação
        double resultado = 0;
        switch (escolha) {
            case 1:
                resultado = calc.somar();
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = calc.subtrair();
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = calc.multiplicar();
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                resultado = calc.dividir();
                if (!Double.isNaN(resultado)) {
                    System.out.println("Resultado da divisão: " + resultado);
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}








 