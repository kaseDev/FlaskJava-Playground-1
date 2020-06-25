import py4j.GatewayServer;

public class Main {

	public static void main(String[] args) {
		GatewayServer gatewayServer = new GatewayServer(new EntryPoint());
		gatewayServer.start();
		System.out.println("Python-Java Gateway Server Started");
	}
}