import java.util.HashMap;
import java.util.Map;

/**
 * Graph Design:
 *   - All Nodes are referenced by a unique name
 *   - All Nodes contain an integer value
 *   - All Nodes contain their local relationships
 */
public class Graph {
	private Map<String, Node> nodes;

	public Graph() {
		nodes = new HashMap<>();
	}

}
