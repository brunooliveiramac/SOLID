package OpenClosed;

public class Teste {
	
	
	/**
	 * @param args
	 * Aberta para extensão, fechada para modificação. OCP.
	 */
	
	public static void main(String[] args) {
		TabelaDePreco dePreco = new TabelaDePrecoPadrao();
		ServicoDeEntrega deEntrega = new Frete();
				
		CaluculadoraDePrecos caluculadoraDePrecos = new CaluculadoraDePrecos(dePreco, deEntrega);
	}
}
