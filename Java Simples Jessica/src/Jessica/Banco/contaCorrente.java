package Jessica.Banco;


public class contaCorrente extends conta {
	
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public boolean isTemCheque() {
		return temCheque;
	}
	public void setTemCheque(boolean temCheque) {
		this.temCheque = temCheque;
	}
	public boolean isTemCartaoCredito() {
		return temCartaoCredito;
	}
	public void setTemCartaoCredito(boolean temCartaoCredito) {
		this.temCartaoCredito = temCartaoCredito;
	}
	private double tarifa;
	private boolean temCheque;
	private boolean temCartaoCredito;
	
	

}
