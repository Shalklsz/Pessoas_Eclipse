
public class Pessoa {

	private String nome;
	private Integer idade;
	private Integer altura;
	private Integer peso;
	private Integer cep;
	
	public Pessoa(String nome, Integer idade, Integer altura, Integer peso, Integer cep) { //méodo construtor com casos
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.cep = cep;
	}

	public Pessoa() { //método construtor vazio
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}
	
	
	
}
