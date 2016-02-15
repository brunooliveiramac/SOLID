package Encapsulamento;

import java.util.List;

public class Fatura {
	
	public List<Pagamento> pagamentos;
	public Double valor;
	private boolean pago;
	
	
	
	
	public Fatura(List<Pagamento> pagamentos, Double valor, boolean pago) {
		super();
		this.pagamentos = pagamentos;
		this.valor = valor;
		this.pago = pago;
	}
	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public void adiconaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		if (valorTotalDosPagamentos() > this.valor) {
			this.pago = true;
		}
	}
	private Double valorTotalDosPagamentos() {
		double total = 0;
		
		for(Pagamento pagamento : pagamentos){
			total += pagamento.getValor();
		}
		
		return null;
	}
	
	
	

}
