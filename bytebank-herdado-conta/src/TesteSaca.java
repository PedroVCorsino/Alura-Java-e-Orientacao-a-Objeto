
public class TesteSaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new ContaCorrente(123, 123);
		
		conta.deposita(200.0);
		try {
			conta.saca(200.0);
		} catch (SaldoInsuficienteExcepition e) {
			System.out.println("e: " + e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
