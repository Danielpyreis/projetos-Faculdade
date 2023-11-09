package Pessoas;

public class Principal {

	public static void main(String[] args) {
		PFisica pf = new PFisica();
		PJuridica pj = new PJuridica();
		
		System.out.println("Pessoa Fisica:");
		pf.NOME();
		pf.Regiao();
		pf.CPF();
		
		System.out.println("\n");
		System.out.println("Pessoa Juridica");
		pj.NOME();
		pj.Regiao();
		pj.CNPJ();
		
	}

}
