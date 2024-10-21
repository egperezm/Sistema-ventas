# Sistema-ventas
Se sube el proyecto
El objetivo de este proyecto es desarrollar un sistema de ventas en línea que permita a los usuarios realizar compras, gestionar inventarios y procesar pedidos. Cuenta con dos (2), tipos de perfiles cliente y administrador, un (1), carrito de compras, opciones de pago, y un sistema de gestión de artículos.
# Pasos iniciales para el desarrollo
- 1)	Como primer paso es ir a la página de https://start.spring.io
- 1.1)	Establecer en Projet: Maven
- 1.2)	En lenguaje: Java
- 1.3)	En spring boot: 3.3.4
- 1.4)	En Project Metadata: tuempresa (en mi caso, ustedes coloquen el nombre que quieran)
- 1.5)	En Packagin seleccione: Jar
- 1.6)	En Java: seleccionan: 17
# Dependencias spring initializr
- 1.7	Spring Web
- 1.8	Spring Data MongoDB
- 1.9	Spring Security
- 1.10	Spring Boot DevTools
- 1.11	Lomok
- 1.12	Validatión
- 1.13	Spring Boot Actuator
- Como lo lo muestra la siguiente imagen
## ![image](https://github.com/user-attachments/assets/30250126-ead0-4609-83ec-dc3c416b0f99)
- 2)	Luego seleccionar GENERATE, el archivo se generará en su carpeta de descargas (o la que tenga seleccionada por default.).
- 3)	Extraer el archivo con 7-zip 24.08 o Winrar7.0. 
- 4)	Luego abrir Visual Studio Code 1.93.
- 5)	Luego abrir la carpeta que ha descomprimido desde Visual studio code 1.93.
- 6)	Al abrir la carpeta debe crear cuatro carpetas desde la raiz main , controladores, modelos, repositorios y seguridad.
# Controladores, Modelos, Repositorios, Seguridad
7)	Dentro de la carpeta controller debe crear las clases .java, con los siguientes nombres. 
-	Contactocontrolador.java,	-	EmpresaControlador.java
-	PedidoControlador.java		-	ProductoControlador.java
-	UsuarioControlador.java
# 8) modelos 
- debe crear las clases .java, con los siguientes nombres.
-	Contacto.java	-	Empresa.java
-	Pedido.java	-	Producto.java
-	Usuario.java


