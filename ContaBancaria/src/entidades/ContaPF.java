package entidades;

public class ContaPF {
	
	protected String titular;
	protected Integer numConta;
	protected Double depositoInicial;
	protected Double saldo;
	
	public ContaPF() {
		
	}
	
	public ContaPF(String titular, Integer numConta, Double depositoInicial, Double saldo) {
		this.titular = titular;
		this.numConta = numConta;
		this.depositoInicial = depositoInicial;
		this.saldo = saldo;
	}
	
	public ContaPF(String titular, Integer numConta, Double depositoInicial) {
		this.titular = titular;
		this.numConta = numConta;
		this.depositoInicial = depositoInicial;
		this.saldo = depositoInicial;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public Double getSaldoInicial() {
		return depositoInicial;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public Double deposito(double quantidade) {
		return saldo += quantidade;
	}
	
	public Double saque(int quantidade) {
		return saldo -= quantidade;
	}

	public String toString() {
		return "ContaPF [titular=" + titular + ", numConta=" + numConta + ", depositoInicial=" + depositoInicial
				+ ", saldo=" + saldo + "]";
	}
	
	
	
}
