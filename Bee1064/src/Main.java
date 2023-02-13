
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double notas, notaTotal = 0,  media = 0;
		int quantidadeNotasPositivas = 0;
		Scanner teclado = new Scanner(System.in);
		
		for(int contator = 1; contator < 7 ; contator ++) {
			
			notas = teclado.nextDouble();
			
			if(notas >= 0) {
				notaTotal += notas; 
				quantidadeNotasPositivas += 1;
			}
		media = notaTotal / quantidadeNotasPositivas;
		};
		
		
		System.out.println(quantidadeNotasPositivas + " valores positivos");
		System.out.printf("%.1f\n", media);
	}
	
}
