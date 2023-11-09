package Pessoas;

public class PFisica implements Pessoa {
	public void CPF() {
		System.out.println("CPF: 0738987");
	}
	@Override
	public void NOME() {
		System.out.println("Daniel Arruda");
	}
	@Override
	public void Regiao() {
		System.out.println("Goias");
	}
}
