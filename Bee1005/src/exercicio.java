import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {
		double a, b, media, nota1, nota2, notaComPeso1, notaComPeso2;
		a = 3.5;
		b = 7.5;
		Scanner teclado = new Scanner (System.in);
		
		nota1 = teclado.nextDouble();
		nota2 = teclado.nextDouble();

		
		notaComPeso1 = nota1 * a;
		notaComPeso2 = nota2*b;
		media = (notaComPeso1 + notaComPeso2)/11;
		
		System.out.printf("MEDIA = %.5f\n", media);
	}
}
