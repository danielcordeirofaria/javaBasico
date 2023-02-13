
public class Referencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Daniel");
		g1.setSalario(5000.00);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.00);
		
		EditorDeVideo ev = new EditorDeVideo();
		f.setSalario(2500.00);
		
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
		System.out.println(g1.getNome());
		System.out.println(controle.getSoma());
		
		
		
	}

}
