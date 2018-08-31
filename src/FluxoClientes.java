
public class FluxoClientes implements Runnable {
	public FilaClientes cadeiras;
	private int contador;

	public FluxoClientes(FilaClientes cadeiras) {
		this.cadeiras = cadeiras;
	}

	public  void adicionarClientes() {
		contador++;
		String nome_cliente = "Cliente de número:  " + contador;
		int tempo = (int) (Math.random() * 1000);
		this.cadeiras.adicionaCliente(new Cliente(nome_cliente,   tempo));
	}

	public void run() {
		while (true) {
			if(!this.cadeiras.verificarLimite()) {
				this.adicionarClientes();
			}
			else {
				System.out.println("\n \n \n O cliente foi embora! \n \n \n ");
			}
		}
		
		
	}
}
