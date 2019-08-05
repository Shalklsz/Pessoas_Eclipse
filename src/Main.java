
public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Marcio", 16, 170, 60, 758564);

		pessoa1.setIdade(17);
		
		System.out.println("A pessoa " + pessoa1.getNome() + " foi cadastrada com sucesso");
		
	}

}