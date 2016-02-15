package Acoplamento;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nota) {
			System.out.println("Enviando Email");
	}

}
