import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Graph Design:
 *   - All Nodes are referenced by a unique name
 *   - All Nodes contain an integer value
 *   - All Nodes contain their local relationships
 */
public class Graph {
	private Map<String, Node> nodes;

	public Graph() {
		nodes = new TreeMap<>();
	}

	// - create new node given name (value default = 0)
	public void createNode(String name) {
		if (nodes.containsKey(name))
			throw new IllegalArgumentException("This node already exists");
		nodes.put(name, new Node(0));
	}

	// - create new node given name and value
	public void createNode(String name, int value) {
		if (nodes.containsKey(name))
			throw new IllegalArgumentException("This node already exists");
		nodes.put(name, new Node(value));
	}

	// - delete existing node given name
	public void deleteNode(String name) {
		if (!nodes.containsKey(name))
			throw new IllegalArgumentException("This node does not exist");
		nodes.remove(name);
	}

	// - change name of node
	public void renameNode(String oldName, String newName) {
		if (!nodes.containsKey(oldName))
			throw new IllegalArgumentException("No node with that name currently exists");
		if (nodes.containsKey(newName))
			throw new IllegalArgumentException("There is already a node with that name");
		nodes.put(newName, nodes.remove(oldName));
	}


	// - get Node given name
	public Node getNode(String name) {
		if (!nodes.containsKey(name))
			throw new IllegalArgumentException("No node with that name exists");
		return nodes.get(name);
	}


	// - get all nodes in a sorted list by name
	public Set<Map.Entry<String, Node>> getNodes() {
		return nodes.entrySet();
	}

	// - get all nodes in a sorted list by value


	// - get count of nodes
	public int getNodeCount() {
		return nodes.size();
	}
}
