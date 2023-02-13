//Gerente é um funcionário, Gerente Herda da class Funcionario, assina o contrato Autenticaval, é um autenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
	
	private int senha;

	public double getBonificacao() {
		System.out.println("Chamando a bonificação do gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
	}
		
	}
}
	
