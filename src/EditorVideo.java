
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("teste editor");
		return super.getBonificacao() + 100;
	}
}
