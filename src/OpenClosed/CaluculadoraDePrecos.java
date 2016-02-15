package OpenClosed;

public class CaluculadoraDePrecos {
	
	
	private TabelaDePreco dePreco;
	private ServicoDeEntrega deEntrega;

	public CaluculadoraDePrecos(TabelaDePreco dePreco, ServicoDeEntrega deEntrega) {
		this.dePreco = dePreco;
		this.deEntrega = deEntrega;
	}
	
	public double calcula(Compra produto) {
       
		
        double desconto = dePreco.descontoPara(produto.getValor());
        double frete = deEntrega.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }

}
 