# rabbitMQ-spring-cloud-stream
Producer and Consumer Application using RabbitMQ and spring cloud stream 

## Install RabbitMQ in Windows

Download and install ERlang : http://erlang.org/download/otp_win64_24.1.7.exe (For 64-bit Windows) <br>
Downlaod and install RabbitMQ: https://www.rabbitmq.com/download.html Downloads on GitHub -Windows installer (latest version)

Go to RabbitMQ Server install Directory C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.3\sbin <br>
Run command rabbitmq-plugins enable rabbitmq_management

Open browser and enter http://localhost:15672/ to redirect to RabbitMQ Dashboard <br>
Also we can Open it with IP Address http://127.0.0.1:15672 <br>
Login page default username and password is <b>guest</b> <br>
After successfully login you should see RabbitMQ Home page


## Start the producer application
In the rabbitMQ, we can see the following exchanges are created: 
- employeeRegistrations
- customerRegistrations

POST  http://localhost:8080/register/employee <br>
Headers: Content-Type - application/json <br>
Body: raw <br>
{
	"empName" : "Emp E",
	"empID" : "emp 12"
}

POST  http://localhost:8080/register/customer <br>
Headers: Content-Type - application/json <br>
Body: raw <br>
{
	"custName" : "Cust D",
	"custID" : "cust 4"
}


## Start the consumer application
In the rabbitMQ, we can see the following queues are created: 
- employeeRegistrationQueue
- customerRegistrationQueue

