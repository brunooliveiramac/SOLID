package OpenClosed;

public class Teste {
	
	
	/**
	 * @param args
	 * Aberta para extens�o, fechada para modifica��o. OCP.
	 */
	
	public static void main(String[] args) {
		TabelaDePreco dePreco = new TabelaDePrecoPadrao();
		ServicoDeEntrega deEntrega = new Frete();
				
		CaluculadoraDePrecos caluculadoraDePrecos = new CaluculadoraDePrecos(dePreco, deEntrega);
	}
}
