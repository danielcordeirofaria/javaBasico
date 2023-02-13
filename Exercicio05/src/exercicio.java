import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {
				
		double velocidadeMedia, distancia, litrosUtilizados, tempo;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Quanto horas durou a viagem? ");
		tempo = teclado.nextDouble();
		System.out.println("Qual foi a velocidade média? ");
		velocidadeMedia = teclado.nextDouble();
		
		distancia = velocidadeMedia * tempo;
		litrosUtilizados = distancia / 12;
		
		System.out.println("A distancia da viagem foi de " + distancia + "Km, e a quantidade de litros utilizado na viagem foi de " + litrosUtilizados + "L" );

		
	}
}
