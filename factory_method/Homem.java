package factory_method;

public class Homem extends Pessoa {
	
	public Homem(String nome) {
		this.nome =  nome;
		System.out.println("Ol� Sr. "+this.nome);
	}

}
