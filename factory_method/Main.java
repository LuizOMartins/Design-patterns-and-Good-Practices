package factory_method;

public class Main {
	public static void main(String[] args) {
		
	    FactoryPessoa factory = new FactoryPessoa();
        String nome = "Luiz";
        String sexo = "M";
        factory.getPessoa(nome, sexo);		
		
	}

}
