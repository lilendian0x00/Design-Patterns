# Model–view–controller (MVC)
![Program-Build-Flow](https://github.com/lilendian0x00/Design-Patterns/blob/main/resources/MVC-Process.png)

Model–view–controller (MVC) commonly used for developing **user interfaces** that divide the related program logic into **three interconnected elements**. This is done to separate internal representations of information from the ways information is presented to and accepted from the user.

Traditionally used for desktop **graphical user interfaces (GUIs)**, this pattern became popular for designing **web applications**. Popular programming languages have MVC frameworks that facilitate the implementation of the pattern.

# Components
## Model
The **central component** of the pattern. It is the application's **dynamic data structure**, independent of the user interface.

## View
Any representation of information such as a chart, diagram or table. Multiple views of the same information are possible, such as a bar chart for management and a tabular view for accountants.

With Rails (Ruby) and Django (Python), the role of the view is played by HTML templates, so in their scheme a view specifies an in-browser user interface rather than representing a user interface widget directly.

## Controller
* Accepts input and converts it to commands for the **model** or **view**.

* At any given time, each controller has one associated view and model.

* Only one controller, the "active" controller, receives user input at any given time

* a global window manager object is responsible for setting the current active controller.

* If user input prompts a change in a model, the controller will signal the model to change, but the model is then responsible for telling its views to update.

* In WebObjects, the views handle user input, and the controller mediates between the views and the models. There may be only one controller per application, or one controller per window. Much of the application-specific logic is found in the controller.

# Interactions

In addition to dividing the application into these components, the model–view–controller design defines the interactions between them.

* The **model** is responsible for **managing the data* of the application. It **receives user input from the controller**.

* The **view** renders presentation of the model in a particular format.

* The **controller** responds to the user input and performs interactions on the data model objects. The controller receives the input, optionally validates it and then passes the input to the model.