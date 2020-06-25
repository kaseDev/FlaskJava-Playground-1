import os
from flask import Flask, render_template, request, redirect

import javalink

template_dir = os.path.abspath('../templates')
static_dir = os.path.abspath('../static')
app = Flask(__name__, template_folder=template_dir, static_folder=static_dir)


@app.route("/")
def index():
    return render_template('index.html')


@app.route("/java")
def java():
    return javalink.ask_java()


if __name__ == "__main__":
    app.run(debug=True, port=80)
