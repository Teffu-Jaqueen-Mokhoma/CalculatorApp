#Arithmetic Operations Application
This Java Enterprise Edition application performs arithmetic operations (addition, subtraction, multiplication) on three numbers using the MVC design pattern. It is built with Apache Ant and deployed on GlassFish.

#Features
Addition, subtraction, and multiplication of three numbers.
Follows the MVC design pattern.
Simple and user-friendly interface.

#Requirements
JDK 8 or higher
Apache Ant
GlassFish Server

$Setup
Clone the repository:

sh
Copy code
git clone https://github.com/yourusername/arithmetic-operations-app.git
Navigate to the project directory:

sh
Copy code
cd arithmetic-operations-app
Build the project using Apache Ant:

sh
Copy code
ant build
Deploy the WAR file to GlassFish:

Copy the generated arithmetic-operations-app.war file from the dist directory to the autodeploy directory of your GlassFish server.
Alternatively, use the GlassFish Admin Console to deploy the WAR file.

#Usage
Start GlassFish server.

Open your web browser and navigate to:

bash
Copy code
http://localhost:8080/arithmetic-operations-app
Enter three numbers and select the desired operation.

View the result.

#License
This project is licensed under the MIT License.
