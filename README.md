# Sistema-Ventas Online
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
  # Entidad Producto:
- 4 @Document(collection = “Productos”) indica que la clase de Producto se mapea con la colección productos en la base de datos MongoDB.
- 4.1)	Atributos: id, nombre, categoria, precio, Stock.
- 4.2)	Constructor por defecto: se necesita para que mongoDB pueda instanciar objetos de la clase Producto.
- 4.3) 	Constructor con parametros: si se quiere utilizar para crear instancias de producto con todos los campos inicializados.
- 4.4)	Getters y Setters: Metodos para obtener y modificar los valores de los atributos del producto.
- ## ![image](https://github.com/user-attachments/assets/376a9b25-bbf2-4681-93c0-5c4c314bb2d0)
# Entidad Usuario: 
- 5 Contiene los detalles de los usuarios en el sistema @Document (collection = “usuarios”): indica a MongoDB que esta clase se mapea con la colección usuarios en la base de - datos.
- 5.1)	Atributos: id, nombre, email, password, rol. En el caso de rol son los asociados al usuario, como cliente o administrador.
- 5.2	Constructor por defecto: Necesario para que MongoDB, pueda instanciar los objetos de la clase usuario.
- 5.3	Constructor con parámetros: es util para crear instancias de Usuario con todos los campos inicializados.
- 5.4	Getters y Setters: Metodos para acceder y modificar los valores de los atributos de la clase Usuario.
- ## ![image](https://github.com/user-attachments/assets/232cc4e6-05a3-4ee5-9869-89c1a833965c)
# Definición clase Repositorio
- 6)	ContactoRepositorio: Este respositorio se encarga de manejar las operacioes CRUD,	para la entidad Contacto utilizando Spring Data con MongoDB. El primer parámetro es la 	entidad (contacto), y el segundo es el tipo de la clave primaria que en este caso es String. porque es el id en MongoDB.
- ## ![image](https://github.com/user-attachments/assets/83d581ef-d286-411c-8f1e-9dd7394baa7f)
# 6.1)	EmpresaRepositorio:
- Se encarga de manejar las operaciones CRUD para la entidad Empresa, utiliando SpringData con MongoDB. Al igual que ContactoRepositorio el primer parámetro  es la entidad (Empesa) y el segundo es el tipo de la clave primaria , que en este caso es String por el tipo de id en MongoDB.
- ## ![image](https://github.com/user-attachments/assets/cf975a4b-d980-4984-992b-bcd9b7dbb94e)
# 6.2)	PedidoRepositorio:
- Se encarga de manejar las operaciones CRUD, para la entidad Pedido, Utilizando Spring Data con MongoDB. El primer parámetro es la entidad pedido y el segundo es el tipo de la clave primaria, que en este caso es String que es el tipo de id de MongoDB.
- ## ![image](https://github.com/user-attachments/assets/1580e14f-de8d-469a-a208-1fe2272bc655)
# 6.3)	ProductoRepositorio:
- Maneja las operaciones CRUD, para la entidad Producto utilizando Spring Data MongoDB. ProductoRepositorio se extiende de MongoRepository, el primer parámetro es la entidad (Producto), y el segundo es el tipo de la clave primaria, que en este caso es String es el tipo de id en MongoDB.
- ## ![image](https://github.com/user-attachments/assets/c3e92aab-26f6-446d-a9ed-1650a5f7ae9e)
# 6.4) UsuarioRepositorio:
- Este repositorio se encargará de manejar las operaciones CRUD, para la entidad Usuario, utilizando Spring Data con MongoDB. UsuarioRepositorio extiende de MongoRepository, que permite manejar las operaciones de crear, leer, actualizar y eliminar. El primer parámetro es la entidad (Usuario), y el segundo es el tipo de la clave primaria, que en este caso es String el tipo del id en MongoDB.
- ## ![image](https://github.com/user-attachments/assets/8350b617-6e6c-4b8a-adc9-6f7d0dbf8419)
# 7)	SeguridadConfig.java
- Se configura la seguridad en la app utilizando SpringSecurity, como autenticación, autorizaciony filtros de seguridad. Permite el acceso público a ciertos endpoints como /api/products o api/empresas/. Ademas requiere autenticación para cualquier otro endpoint, se establece la autenticación básica http para las solicitudes auntenticadas
- ## ![image](https://github.com/user-attachments/assets/0d838f57-a1f6-4359-b680-7f4ff0aa7d54)
# Ejecutar el Backend 
- presionando las teclas CMD+J, En el caso de MacOS o Control+J en el caso de un ambiente Windows. O presionar el siguiente botón como se muestra en la imagen.
- ## ![image](https://github.com/user-attachments/assets/a49d6792-3967-4e5e-9b85-1641740e1788)
- En el terminal escribir mvn spring-boot:run
Deberá visualizar la ejecución del Backend de la siguiente manera como se muestra en la siguiente imagen utilizando el comando: mvn spring-boot:run
- ## ![image](https://github.com/user-attachments/assets/17da60e5-caac-4d2b-b59d-ce8721891deb)
# Arquitectura
- ## ![image](https://github.com/user-attachments/assets/81319552-e3f9-4623-a802-91801aa4cc7f)
# Conexión a MongoDB Compass
## Contactos 
- Muestra la creación y conexión de contactos para manejar las operaciones CRUD.
- ## ![image](https://github.com/user-attachments/assets/6f161b79-e984-4ffc-9070-d13c38db581c)
# Empresas
- Muestra la creación y conexión de empresas para manejar las operaciones CRUD.
- ## ![image](https://github.com/user-attachments/assets/fac036b1-5ddb-4087-927a-e2b2ce7f032b)
# Pedidos
- Muestra la creación y conexión de pedidos para manejar las operaciones CRUD.
- ## ![image](https://github.com/user-attachments/assets/0338708c-7d75-49b0-a441-2a654a672ebb)
# Productos
- Muestra la creación y conexión de productos para manejar las operaciones CRUD.
- ## ![image](https://github.com/user-attachments/assets/0e82dff3-c46d-4eb2-b4df-9a69a9adfd8a)
# Usuarios 
Muestra la creación y conexión de productos para manejar las operaciones CRUD.
- ## ![image](https://github.com/user-attachments/assets/1fb30678-8091-46a8-be41-4ed28716fc0f)
# Ejecución del Frontend 
- 1)	Es necesario tener instalado node.js y npm para la Creación del Frontend
- 2)	Debe ejecutar el siguiente comando npx create-react (“el nombre que le colocaron”) en mi caso es npx create-react Sistema-Ventas-Front-End
     Seguido deben ingresar a la carpeta con el siguiente comando cd Sistema-Ventas-Front-End, luego en el terminal escribir npm run dev para iniciar y debe mostrar la ejecución como la siguiente imagen.
- 3)	Recuerde instalar Axios para manejar las solicitudes HTTP:
  4)	sino lo tiene instalado ejecutar. Npm install axios
- ## ![image](https://github.com/user-attachments/assets/3470894e-8fe5-4f73-a45c-744470a3b6ab)
# Frontend local
- ## ![image](https://github.com/user-attachments/assets/c08d201d-c05a-40f3-8c42-51fbb4fd94ea)
# Localhost http://localhost:5173
- ## ![image](https://github.com/user-attachments/assets/80165b7a-e020-4a28-bb4d-cf9e4617d1e1)
# Documento de desarrollo.pdf alberga información e imagenes con mejor calidad.
- ## [ProyectoF.pdf](https://github.com/user-attachments/files/17589175/ProyectoF.pdf)


