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
- ## ![image](https://github.com/user-attachments/assets/30250126-ead0-4609-83ec-dc3c416b0f99)
- 2)	Luego seleccionar GENERATE, el archivo se generará en su carpeta de descargas (o la que tenga seleccionada por default.).
- 3)	Extraer el archivo con 7-zip 24.08 o Winrar7.0. 
- 4)	Luego abrir Visual Studio Code 1.93.
- 5)	Luego abrir la carpeta que ha descomprimido desde Visual studio code 1.93.
- 6)	Al abrir la carpeta debe crear cuatro carpetas desde la raiz main , controladores, modelos, repositorios y seguridad.
# Controladores.
7)	Dentro de la carpeta controller debe crear las clases .java, con los siguientes nombres. 
-	Contactocontrolador.java,	-	EmpresaControlador.java
-	PedidoControlador.java		-	ProductoControlador.java
-	UsuarioControlador.java
# Modelos. 
- debe crear las clases .java, con los siguientes nombres.
-	Contacto.java	-	Empresa.java
-	Pedido.java	-	Producto.java
-	Usuario.java
# Repositorios. 
- debe crear clases .java, con los siguientes nombres. 
-	ContactoRepositorio.java		-	EmpresaRepositorio.java
-	PedidoRepositorio.java		-	ProductoRepositorio.java
-	UsuarioRepositorio.java
# Seguridad.
- debe crear las clases.java, con los siguientes nombres.
-	SeguridadConfig.java
-	SistemaVentasApplication.java
- Les debe quedar así como lo muestra la siguiente imagen
- ## ![image](https://github.com/user-attachments/assets/b8544c53-0a36-40fe-a93b-bff6a2aa319b)
# Definición de clases controlador.
- 1)	ContactoControlador: Este representa los contactos relacionados con la empresa es necesario para manejar las operaciones. Crear, leer, actualizar y eliminar (CRUD).
- 2)	EmpresaControlador: Este controlador permite realizar las operaciones CRUD, sobre la entidad empresa para ofrecer los productos.
- 3)	PedidoControlador: Maneja las opereraciones CRUD para la entidad pedido permitiendo a los usuarios, crear, consultar, actualizar y eliminar pedidos.
- 4)	ProductoControlador: se encargará de manejar las operaciones CRUD, para la entidad producto de los artículos que se vendan.
- 5)	UsuarioControlador: manejará las operaciones CRUD, relacionados con los usuarios del sistema tanto clientes como administradores.
# Dependecias Controlador.JAVA
-	getAllContactos(): devuelve la lista de todos los contactos
-	getContactosById(String id): busca el contacto o un contacto específico por su ID. Si el contacto existe lo devuelve.
-	CreateContacto (Contacto contacto): Crea un nuevo contacto basado en la solicitud (@RequesteBody)
-	updateContacto (String id, Contacto contactodetalles): Actualiza un contacto existente identificado por su ID.
-	deleteContacto (string id): Elimina un contacto por su ID
-	## ![image](https://github.com/user-attachments/assets/5715bc15-c84c-4df1-8a02-5764d2e2716d)
# 2)	EmpresaControlador.java:
-	getAllEmpresas(): devuelve la lista de todas las empresas.
-	getEmpresaById(String id): busca una empresa especifica por su ID si la empresa existe, la devuelve.
-	createEmpresa(Empresa empresa): crea una empresa basada en el cuerpo de la solicitud (@RequestBody).
-	updateEmpresa(String id, empresa empresadetalles): actualiza una empresa existente identificada por su ID.
-	DeleteEmpresa(string id): Elimina una empresa por su ID.
- ## ![image](https://github.com/user-attachments/assets/ed4f9e4d-37dc-4e33-a39c-21ef9b4b2acb)
# 3)	PedidoControlador.java:
-	getAllPedido(): Devuelve una lista de todos los pedidos
-	getPedidoById(String id): Busca un pedido específico por su ID, si el pedido existe, lo devuelve.
-	createPedido(Pedido pedido): Crea un nuevo pedido basado en el cuerpo de la solicitud(@RequestBody)
-	updatePedido(String id, Pedido Pedidodetalles): Actualiza un pedido existente identificado por su ID
-	deletePedido(String id): Elimina un pedido por su ID.
- ## ![image](https://github.com/user-attachments/assets/20409fc4-e6c5-4793-900a-a0c7ada23d49)
# 4)	Productocontrolador.java:
-	getAllProductos(): Devuelve una lista de todos los productos
-	getProductoById(String id): busca un producto por ID si el producto existe, lo devuelve.
-	createProduct (Producto producto): Crea un nuevo producto basado en el cuerpo de la solicitud (@RequestBody)
-	updateProduct(String id, Producto productoDetalles): Actualiza un product existente identificado por su ID.
-	deleteProducto(string id): Elimina un producto por su ID.
## ![image](https://github.com/user-attachments/assets/13cd6ba0-cddd-4e2a-81c2-5707c2e0d24b)
# 5)	UsuarioControlador.java:
-	getAllUsuarios(): Devuelve una lista de todos los usuarios regristrados en el sistema
-	getusuarioById(String id): busca un usuario por ID si el usuario existe, lo devuelve.
-	createUsuario (Usuario usuario): Crea un nuevo usuario basado en el cuerpo de la solicitud (@RequestBody)
-	updateUsuario(String id, Usuario usuariodetalles): Actualiza un ususario existente identificado por su ID.
-	deleteUsuario(string id): Elimina un usuario por su ID.
- ## ![image](https://github.com/user-attachments/assets/b219c606-8a78-4343-a314-113bd4c3d399)
# Definición de Clases modelos
1)	Entidad Contacto: @document (collection “contactos”), Esto le dice a mongoDB que clase se mapea con la colección contactos en la base de datos. En caso de JPA seria @Entity
1.1	Atributos: id, email, nombre, teléfono.
1.2 Constructor por defecto: se necesita para que mongoDB pueda instanciar objetos de la clase.
1.3	Constructor por parámetros: se utiliza para facilitar la creación de objetos Contacto con todos los datos necesario.
1.4	Getters y Setters: Estos métodos permiten acceder y modificar los valores de los atributos de la clase Contacto.
- ## ![image](https://github.com/user-attachments/assets/2e005389-4501-42dd-8137-30bcd85dfcd6)
# Entidad Empresa: 
- 2 @document (collection “empresas”): esto indica que la clase Empresa se mapea con la colección empresas en la base de datos de MongoDB.
- 2.1	Atributos: id, nombre, dirección, teléfono.
- 1.5	Constructor por defecto: necesario para que mongoDB pueda instanciar objetos de la clase Empresa.
- 1.6	Constructor por parámetros: crea instancias de Empresa con todos los campos inicializados.
- 1.7	Getters y Setters: Estos métodos permiten acceder y modificar los valores de los atributos de la clase empresa.
- ## ![image](https://github.com/user-attachments/assets/e67164b2-8593-4be3-8a9b-0e2ffe4e6f8c)
# Entidad Pedido: 
- 3 Contiene una lista de objetos Producto, -se menciona como recordatorio- @Document (collection = “pedidos”): La clase pedido se mapea con la colección pedidos en la base de datos de MongoDB.
- 3.1)	Atributos: id, clienteid, productosIds, total.
- 3.2)	Constructor por defecto: necesario para que mongoDB pueda instanaciar objetos de la clase Pedido
- 3.3	Constructor con parámetros: útil para crear instancias de Pedido con todos los campos inicializados.
- 3.4	Getters y Setters: Metodos para obtener y modificar los valores de los atributos del pedido.
-  ## ![image](https://github.com/user-attachments/assets/81e55df4-9fc5-4c09-98aa-a5c3a7ea3029)
- Entidad Producto:
- 4 @Document(collection = “Productos”) indica que la clase de Producto se mapea con la colección productos en la base de datos MongoDB.
- 4.1)	Atributos: id, nombre, categoria, precio, Stock.
- 4.2)	Constructor por defecto: se necesita para que mongoDB pueda instanciar objetos de la clase Producto.
- 4.3) 	Constructor con parametros: si se quiere utilizar para crear instancias de producto con todos los campos inicializados.
- 4.4)	Getters y Setters: Metodos para obtener y modificar los valores de los atributos del producto.
- ## ![image](https://github.com/user-attachments/assets/376a9b25-bbf2-4681-93c0-5c4c314bb2d0)








 












