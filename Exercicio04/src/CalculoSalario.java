import java.util.Scanner;

public class CalculoSalario {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double valorPorHora, porcentagemInss, salarioLiquido, salario;
		int quantidadeDeHoras;
		
		System.out.println("Qual a quantidade de horas trabalhadas? ");
		quantidadeDeHoras = teclado.nextInt();
		System.out.println("Qual o valor da hora trabalhada? ");
		valorPorHora = teclado.nextDouble();
		System.out.println("Qual a porcentagem de desconto INSS?");
		porcentagemInss = teclado.nextDouble();
		
		salario = valorPorHora * quantidadeDeHoras;

		salarioLiquido = salario - (salario * porcentagemInss/100);
		
		System.out.println("O valor líquido será de " + salarioLiquido);
	}
}
