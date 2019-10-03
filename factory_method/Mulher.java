package factory_method;

public class Mulher extends Pessoa {
	
	public Mulher(String nome) {
		this.nome =  nome;
		System.out.println("Olá Sr(a) "+this.nome);
	}

}
