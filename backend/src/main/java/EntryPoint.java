import java.sql.SQLOutput;
import java.util.Map;

public class EntryPoint {

	private Graph graph;

	public EntryPoint() {
		this.graph = new Graph();
	}

	/* API to interact with the graph. */

	public void addNode(String name, int value) {
		graph.createNode(name, value);
	}

	public void removeNode(String name) {
		graph.deleteNode(name);
	}

	public void setNodeValue(String name, int value) {
		graph.getNode(name).setValue(value);
	}

	public void printNode(String name) {
		System.out.println(name + ": " + graph.getNode(name).getValue());
	}

	public void printNodes() {
		System.out.println("----- Graph Node List ------");
		for (Map.Entry<String, Node> node : graph.getNodes()) {
			System.out.println(node.getKey() + ": " + node.getValue().getValue());
		}
		System.out.println();
	}

}
