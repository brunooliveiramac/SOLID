package Encapsulamento;

public class Pagamento {

	private Double valor;
	private MeioDePagamento boleto;

	public Pagamento(Double valor, MeioDePagamento boleto) {
		this.valor = valor;
		this.boleto = boleto;
	}

	
	public Double getValor() {
		return valor;
	}
	
	public MeioDePagamento getBoleto() {
		return boleto;
	}
	
}
