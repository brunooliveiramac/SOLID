package Acoplamento;

public class NotaFiscalDao implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nota) {
		System.out.println("Persistindo...");		
	}

}
