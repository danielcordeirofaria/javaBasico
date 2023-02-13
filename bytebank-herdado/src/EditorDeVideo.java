
public class EditorDeVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("chamando bonificação Editor de video");
		return super.getBonificacao() + 100;
	}
	
}