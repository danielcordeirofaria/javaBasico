import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {
		double salarioMinimo, valorDeCadaKw, valorASerPago, gastoDeKw, valorComDesconto;
        Scanner teclado = new Scanner(System.in);

		System.out.println("Qual o valor do salário mínimo?");
		salarioMinimo = teclado.nextDouble();
		valorDeCadaKw = salarioMinimo / 100 / 7;
		System.out.println("Qual a quandidade de kw gasto? ");
		gastoDeKw = teclado.nextDouble();
		valorASerPago = valorDeCadaKw * gastoDeKw;
		
		valorComDesconto = valorASerPago - (valorASerPago * 10/100);
		System.out.println("O valor a ser pago será de " + valorASerPago);
		System.out.println("O valor com desconto será de " + valorComDesconto);
		
		
		
	}
}
