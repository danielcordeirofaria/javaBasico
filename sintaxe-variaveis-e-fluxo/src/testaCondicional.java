
public class testaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 17;
		int quantidaePessoas = 1;
		if(idade >= 18) {
			System.out.println("Você tem amis de 18 anos");
			System.out.println("Seja Bem vindo!");
		}
		else { 
			if(quantidaePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar pois está acompanhado");
			}
		else {
			System.out.println("Você tem menos de 18 anos");
			System.out.println("Infelizmente você não pode entrar");
		}
		}
	}
}
