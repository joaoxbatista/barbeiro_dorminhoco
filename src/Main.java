
public class Main {

	public static void main(String[] args) {
		FilaClientes clientes = new FilaClientes();
		clientes.limite = 6;
		FluxoClientes fluxo_entrada = new FluxoClientes(clientes);
		Barbeiro barbeiro = new Barbeiro(clientes);
		barbeiro.nome = "José";
		Barbeiro barbeiro2 = new Barbeiro(clientes);
		barbeiro2.nome = "João";
		Barbeiro barbeiro3 = new Barbeiro(clientes);
		barbeiro3.nome = "Marcos";
		Barbeiro barbeiro4 = new Barbeiro(clientes);
		barbeiro4.nome = "Paulo";
	
		
		Thread th_produtor = new Thread(fluxo_entrada);
		Thread th_consumidor = new Thread(barbeiro);
		Thread th_consumidor2 = new Thread(barbeiro2);
		Thread th_consumidor3 = new Thread(barbeiro3);
		Thread th_consumidor4 = new Thread(barbeiro4);
		
		th_produtor.start();
		th_consumidor.start();
		th_consumidor2.start();
		th_consumidor3.start();
		th_consumidor4.start();
		
		
	

	}

}
