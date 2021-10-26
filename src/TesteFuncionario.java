
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("nico");
		funcionario.setCpf("480858238-45");
		funcionario.setSalario(2600.00);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacao());
		

	}

}
