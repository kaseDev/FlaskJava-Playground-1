import java.util.HashMap;
import java.util.Map;

public class Node {

	private int value;
	private Map<Node, Integer> directedEdges;

	public Node(int value) {
		this.value = value;
		this.directedEdges = new HashMap<>();
	}

	/* interface with value */

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	/* interface with directed edges */

	// - add new edge given value and node
	public void newEdge(Node node, int value) {
		if (node == this || node == null)
			throw new IllegalArgumentException("This is not a valid edge");
		if (directedEdges.containsKey(node))
			throw new IllegalArgumentException("There is already an edge between these two nodes");
		directedEdges.put(node, value);
	}

	// - remove edge given node
	public void removeEdge(Node node) {
		if (node == null)
			throw new IllegalArgumentException("This is not a valid edge");
		if (!directedEdges.containsKey(node))
			throw new IllegalArgumentException("There is not an edge between these nodes");
		directedEdges.remove(node);
	}

	// - get list of all edges as Node:Value
	public Map<Node, Integer> getEdges() {
		// Creates a shallow copy of internal directedEdge map
		return new HashMap<>(directedEdges);
	}

	// - get sorted list of all edges as Node:Value (least to greatest)


	// - get value of specific edge given node
	public int getEdgeValue(Node node) {
		if (node == this)
			throw new IllegalArgumentException("self referential edges are not allowed");
		if (!directedEdges.containsKey(node))
			throw new IllegalArgumentException("There is no edge connecting these nodes");
		return directedEdges.get(node);
	}

	// - change value of specific edge given node and new value
	public void setEdgeValue(Node node, int value) {
		if (node == this)
			throw new IllegalArgumentException("self referential edges are not allowed");
		if (!directedEdges.containsKey(node))
			throw new IllegalArgumentException("There is no edge connecting these nodes");
		directedEdges.put(node, value);
	}

	// - get number of edges connected
	public int getEdgeCount() {
		return directedEdges.size();
	}

}
