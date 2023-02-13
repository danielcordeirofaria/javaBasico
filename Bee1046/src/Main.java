import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int fim, inicio, tempoTotal = 0;
		inicio = teclado.nextInt();
		fim = teclado.nextInt();
		
		if (fim < inicio) {
			fim = fim + 24;
			tempoTotal = fim - inicio;
		} else if (fim == inicio) {
			tempoTotal = 24;
		} else if(fim>inicio) {
			tempoTotal = fim - inicio;
		}
		
		System.out.printf("O JOGO DUROU " + tempoTotal + "HORAS(S)");
	}
}
