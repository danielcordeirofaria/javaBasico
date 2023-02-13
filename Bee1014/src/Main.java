import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double distancia, totaCombustivel, consumoMedio;
		
		Scanner teclado = new Scanner (System.in);
		
		distancia = teclado.nextDouble();
		totaCombustivel = teclado.nextDouble();
				
		consumoMedio = distancia / totaCombustivel;
		
		System.out.printf("%.3f km/l\n", consumoMedio);

		
		teclado.close();
	}
}
