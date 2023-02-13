import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, qNotas100,qNotas50, qNotas20, qNotas10, qNotas5, qNotas2, qNotas1, resto;
		Scanner teclado = new Scanner(System.in);
		
		n = teclado.nextInt();
		
		qNotas100 = n / 100;
		resto = n % 100;
		qNotas50 = resto / 50;
		resto = resto % 50;
		qNotas20 = resto / 20;
		resto = resto % 20;
		qNotas10 = resto / 10;
		resto = resto % 10;
		qNotas5 = resto / 5;
		resto = resto % 5;
		qNotas2 = resto / 2;
		resto = resto % 2;
		qNotas1 = resto;
		
		System.out.printf(n+ "\n" + qNotas100 + " nota(s) de R$ 100,00\n" + qNotas50 + " nota(s) de R$ 50,00\n"
				+ qNotas20 + " nota(s) de R$ 20,00\n" + qNotas10 + " nota(s) de R$ 10,00\n" + qNotas5 + " nota(s) de R$ 5,00\n"
				+ qNotas2 + " nota(s) de R$ 2,00\n" + qNotas1 + " nota(s) de R$ 1,00\n");
		
		
	}
}
