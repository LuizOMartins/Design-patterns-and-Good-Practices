package factory_method;

public class Mulher extends Pessoa {
	
	public Mulher(String nome) {
		this.nome =  nome;
		System.out.println("Ol� Sr(a) "+this.nome);
	}

}
