package entidades;

public class ContaPJ extends ContaPF {
	
	private double limiteEmprestimo;

	public ContaPJ() {
		super();
	}
	
	public ContaPJ(String titular, Integer numConta, Double depositoInicial, Double saldo, double limiteEmprestimo) {
		super(titular, numConta, depositoInicial, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public ContaPJ(String titular, Integer numConta, Double depositoInicial, double limiteEmprestimo) {
		super(titular, numConta, depositoInicial);
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	@Override
	public Double deposito(double valor) {
		return valor;
	}
	
	public void emprestimo(double emprestimo) {
		if (emprestimo <= limiteEmprestimo) {
			deposito(emprestimo);
			System.out.print("Valor de limite atualizado com sucesso!");
		}
		else
			System.out.print("Valor sugerido maior que o limite de emprestimo.");
	}
}
