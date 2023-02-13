import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int anos, meses, dias, restoAnos, restoMeses;
		Scanner teclado = new Scanner(System.in);
		
		dias = teclado.nextInt();
		
		anos = dias / 365;
		restoAnos = dias % 365;
		meses = restoAnos / 30;
		restoMeses = restoAnos % 30;
	
		
		System.out.printf(anos + " ano (s)\n" + meses + " mes (es)\n" + restoMeses + " dia (s)\n");
	}
}
