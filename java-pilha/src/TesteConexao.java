
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException e) {
			System.out.println("Deu pau na conexao");
		}
		
		
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//		} catch(IllegalStateException e) {
//			System.out.println("Deu pau na conexao!");
//		} finally {
//			conexao.fecha();
//		}

	}

}
