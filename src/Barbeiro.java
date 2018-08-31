
public class Barbeiro implements Runnable {
	public FilaClientes clientes;
	public String nome;

	public Barbeiro(FilaClientes clientes) {
		this.clientes = clientes;
	}

	public  void atenderCliente() {
		synchronized(this.clientes) {
			// Caso existam clientes
			if (this.clientes.tamanho() > 0) {
				this.clientes.delCliente(this);
			}
			if(!this.clientes.status) {
				try {
					System.out.println("Barbeiro " + this.nome + " está dormindo.");
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (!this.clientes.verificarLimite()) {
			this.atenderCliente();
		}
	}
}
