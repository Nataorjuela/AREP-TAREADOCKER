
## TAREA

Para la tarea usted debe construir una aplicación con la arquitectura propuesta y desplegarla en AWS usando EC2 y Docker.

![image](https://github.com/Nataorjuela/AREP-TAREADOCKER/images/arqTarea.jpg)

El servicio MongoDB es una instancia de MongoDB corriendo en un container de docker en una máquina virtual de EC2
LogService es un servicio REST que recibe una cadena, la almacena en la base de datos y responde en un objeto JSON con las 10 ultimas cadenas almacenadas en la base de datos y la fecha en que fueron almacenadas.
La aplicación web APP-LB-RoundRobin está compuesta por un cliente web y al menos un servicio REST. El cliente web tiene un campo y un botón y cada vez que el usuario envía un mensaje, este se lo envía al servicio REST y actualiza la pantalla con la información que este le regresa en formato JSON. 
El servicio REST recibe la cadena e implementa un algoritmo de balanceo de cargas de Round Robin, delegando el procesamiento del mensaje y el retorno de la respuesta a cada una de las tres instancias del servicio LogService.


**Entregables:**

El código del proyecto en un repositorio de GITHUB.
Un README que explique un resumen del proyecto, l arquitectura, el diseño de clases y que muestre cómo generar las imágenes para desplegarlo.
Además que muestre imágenes de cómo quedó desplegado cuando hicieron las pruebas.

## PRUEBA EN MAQUINA LOCAL

![image](https://github.com/Nataorjuela/AREP-TAREADOCKER/images/localhost.jpg)

## Docker 

![image](https://github.com/Nataorjuela/AREP-TAREADOCKER/images/imagedocker.jpg)

![image](https://github.com/Nataorjuela/AREP-TAREADOCKER/images/docker.jpg)


![image](https://github.com/Nataorjuela/AREP-TAREADOCKER/images/dockerdesk.jpg)

## AWS

![image](https://github.com/Nataorjuela/AREP-TAREADOCKER/images/seguridad.jpg)

![image](https://github.com/Nataorjuela/AREP-TAREADOCKER/images/repodocker.jpg)

** prueba aws: **

![image](https://github.com/Nataorjuela/AREP-TAREADOCKER/images/aws.jpg)