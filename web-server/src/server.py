import os
from flask import Flask
import javalink

template_dir = os.path.abspath('../templates')
static_dir = os.path.abspath('../static')
app = Flask(__name__, template_folder=template_dir, static_folder=static_dir)


@app.route("/")
def index():
    javalink.print_nodes()
    return "Printed on the server"


@app.route("/add/<string:name>/<int:value>")
def add_node(name: str, value: int):
    javalink.add_node(name, value)
    return "just added a node called " + name + " with the value " + str(value) + "."


if __name__ == "__main__":
    app.run(debug=True, port=80)
