
public class testaEscopoVariavel {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 17;
		int quantidaePessoas = 3;
		
		boolean acompanhado;
		
		if(quantidaePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
	
		if(idade >= 18 || acompanhado == true) {
			System.out.println("Seja Bem vindo!");
		}
		
		else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
	}
}

