package methodDemo;
import java.util.Scanner;
public class calculatorBrain {

	public static void main(String[] args) {
		Scanner calculadora = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Ingresa tu primer numero: ");
		a=calculadora.nextInt();
		System.out.println("Ingresa tu segundo numero: ");
		b=calculadora.nextInt();
		
		printSumar(a,b);
		printResta(a,b);
		printMultiplicar(a,b);
		printDivision(a,b);
		
		calculadora.close();
	}
private static void printSumar(int a, int b){
	System.out.print("Suma: ");
	System.out.println(a+b);
}
private static void printResta(int a, int b){
	System.out.print("Resta: ");
	System.out.println(a-b);
}
private static void printMultiplicar(int a, int b){
	System.out.print("Multiplicación: ");
	System.out.println(a*b);
}
private static void printDivision(int a, int b){
	System.out.print("División: ");
	System.out.println(a/b);
}
}