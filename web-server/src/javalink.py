from py4j.java_gateway import JavaGateway

# create the Java Gateway
gateway = JavaGateway()


def add_node(name, value):
    return gateway.entry_point.addNode(name, value)


def remove_node(name):
    return gateway.entry_point.removeNode(name)


def set_node_value(name, value):
    return gateway.entry_point.setNodeValue(name, value)


def print_node_value(name):
    return gateway.entry_point.printNode(name)


def print_nodes():
    gateway.entry_point.printNodes()

