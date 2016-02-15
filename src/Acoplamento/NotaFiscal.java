package Acoplamento;

public class NotaFiscal {

	private double valor;
	private Object impostoSimplesSobre0;

	public NotaFiscal(double valor, Object impostoSimplesSobre0) {
		this.valor = valor;
		this.impostoSimplesSobre0 = impostoSimplesSobre0;

	}
	
	public Object getImpostoSimplesSobre0() {
		return impostoSimplesSobre0;
	}
	public double getValor() {
		return valor;
	}
	public void setImpostoSimplesSobre0(Object impostoSimplesSobre0) {
		this.impostoSimplesSobre0 = impostoSimplesSobre0;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	

}
