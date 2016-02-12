package CoesaoSingleResponsibility;

public class Funcionario {

	
	private Cargo cargo;
	
	public double getSalarioBase() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	public double calculaSalario() {
		
		 return  cargo.getRegra().calcula(this);
	}

}
