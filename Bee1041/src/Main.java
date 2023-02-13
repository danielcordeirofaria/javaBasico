import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double q1, q2, q3, q4, pontoX, pontoY;
		Scanner teclado = new Scanner(System.in);
		
		pontoX = teclado.nextDouble();
		pontoY = teclado.nextDouble();
		
		if(pontoX > 0 && pontoY > 0) {
			System.out.println("Q1");
		}
		
		if(pontoX < 0 && pontoY > 0) {
			System.out.println("Q2");
		}
		
		if(pontoX < 0 && pontoY < 0) {
			System.out.println("Q3");
		}
		
		if(pontoX > 0 && pontoY < 0) {
			System.out.println("Q4");
		}
		if(pontoX == 0.0 && pontoY == 0.0) {
			System.out.println("Origem");
		}
		
		if(pontoX != 0 && pontoY == 0) {
			System.out.println("Eixo X");
		}
		
		if(pontoX == 0 && pontoY != 0) {
			System.out.println("Eixo Y");
		}
	}
}
