
public class Conta {
	double saldo;
	
	void deposita() {}

	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
}
