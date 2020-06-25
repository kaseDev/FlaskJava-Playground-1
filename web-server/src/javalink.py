from py4j.java_gateway import JavaGateway

# create the Java Gateway
gateway = JavaGateway()


def ask_java():
    print("I still said something")
    return gateway.entry_point.callMe()
