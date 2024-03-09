INTRODUCCIÓN A PROYECTOS WEB
PARTE I. - JUGANDO A SER UN CLIENTE HTTP

Responde las siguientes preguntas:

¿Qué pasa si no envío el método correcto?

El servidor responderá con un código de estado HTTP (Método no permitido). Esto indica que el método utilizado no está permitido para el recurso solicitado.

¿Qué pasa si al body response HTML lo fuerzo a leerse como JSON?

Se obtendra un error de parseo o un JSON inválido, ya que los formatos de HTML y JSON son diferentes y no pueden ser interpretados de la misma manera.

¿Por qué el preview de HTML no se ve igual a cuando accedo a la URL en un navegador web?

Debido a las diferencias en la interpretación y renderizado de HTML entre las diferentes aplicaciones y motores de navegadores

¿Qué pasa si le envías un body a una solicitud GET?

Teniendo en cuenta que el body se utiliza típicamente para enviar parámetros de consulta y no se espera recibir datos en el body de respuesta, pero al enviar un body en una solicitud GET, es posible que algunos servidores lo ignoren, mientras que otros pueden responder con un código de estado HTTP

PARTE II. - CLIENT SIDE RENDERING CON REACT

La siguiente misión es ejecutar una aplicación react localmente:

Abre la aplicación https://codesandbox.io/s/react-js-simple-calculator-pefmr, loguéate con GitHub y juega cambiando los parámetros como colores y duplicando las líneas del archivo App.js con tags como <ResultComponent ...> en la función render.

¿Qué hace cada uno de los archivos en la aplicación?

.
├── package.json
├── public
│   └── index.html
└── src
    ├── App.js
    ├── components
    │   ├── KeyPadComponent.js
    │   └── ResultComponent.js
    ├── index.js
    └── styles.css

package.json: Este archivo es el descriptor de paquete de Node.js. al abrirlo evidenciamos que contiene metadatos sobre el proyecto y las dependencias del proyecto, como nombre, versión, scripts de inicio y dependencias 
public/index.html: Este archivo es el punto de entrada HTML de la aplicación React
src/App.js: Este archivo es el componente principal de la aplicación React, ya que contiene la lógica principal de la aplicación, incluidos los componentes de interfaz de usuario y la lógica de estado
src/components/KeyPadComponent.js: Este archivo es un componente React que define la parte de la calculadora que muestra los botones de la calculadora (dígitos, operadores, etc.)
src/components/ResultComponent.js: Este archivo es otro componente React que define la parte de la calculadora que muestra el resultado de las operaciones realizadas
src/index.js: Este archivo es el punto de entrada de la aplicación React. Es donde se importa el componente principal (App.js) y se lo renderiza en el elemento <div> con el ID "root" del archivo public/index.html.
src/styles.css: Este archivo contiene los estilos CSS para la aplicación. Define el aspecto visual de la calculadora, incluidos los estilos para los botones, el resultado y cualquier otro elemento de la interfaz de usuario.

Después de haber visto los cambios, vuelve a abrir la URL original https://codesandbox.io/s/react-js-simple-calculator-pefmr y sigue los siguientes pasos:
Descargar código en un Zip
Descomprimir el Zip en la carpeta de proyectos de software, (en ciertos PC solo funciona 7-Zip)
Abrir una terminal de Git Bash en la carpeta descomprimida
Instalar las dependencias con npm install
Iniciar la aplicación con npm start, en algunos computadores con versiones antiguas de nodejs hay que agregar NODE_OPTIONS=--openssl-legacy-provider npm run start
Si te sale el Firewall dale click en cancelar
Abrir la ruta http://localhost:3000/ en un navegador web como Firefox o Google Chrome


Ahora, has el request GET http://localhost:3000/ usando Postman, y revisa si el body de la respuesta es igual a alguno de los archivos del proyecto. Significa eso que es un recurso web dinámico o estático?

Si el cuerpo de la respuesta obtenida al hacer un request GET a http://localhost:3000/ utilizando Postman es igual a alguno de los archivos del proyecto, significa que el recurso web estático está siendo servido por el servidor local.

PARTE III. - HACIENDO UNA APLICACIÓN WEB DINÁMICA USANDO EL PATRÓN MVC

En este ejercicio, va a implementar una aplicación Web muy básica, haciendo uso de spring MVC.

Para esto usaremos la documentación oficial de Spring con que que aprenderemos las funciones básicas de este framework https://spring.io/guides/gs/serving-web-content/

Después de terminar el aprendizaje analice:

¿Por qué MVC obtiene ese nombre? (puede apoyarse de https://www.javatpoint.com/spring-mvc-tutorial)

MVC significa Modelo-Vista-Controlador. Este patrón de diseño se llama así porque divide una aplicación en tres componentes principales:

Modelo: Representa los datos y la lógica de negocio de la aplicación.
Vista: Se encarga de la presentación de los datos al usuario.
Controlador: Actúa como intermediario entre el modelo y la vista, gestionando las solicitudes del usuario y actualizando el modelo según sea necesario.


¿Cuáles son las ventajas de usar MVC?

Permite separar la lógica de negocio, la presentación y el control de la aplicación, lo que facilita la modularidad y el mantenimiento del código

¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?

La estructura de directorios de un proyecto MVC típicamente sigue un patrón que separa los modelos, las vistas y los controladores. En comparación con proyectos basados solo en Maven y Java EE, la estructura de directorios en un proyecto MVC puede ser más modular y estar organizada de manera que facilite la separación de preocupaciones.

¿Qué anotaciones usaste y cuál es la diferencia entre ellas?

@Controller, @RequestMapping, @GetMapping, @PostMapping

Ahora, haz el request GET http://localhost:8080/greeting usando Postman, y revisa si el body de la respuesta es igual a alguno de los archivos del proyecto. Significa eso que es un recurso web dinámico o estático?

Si el cuerpo de la respuesta es igual a alguno de los archivos del proyecto, esto sugiere que el recurso web es estático


PARTE IV. - APLICACIÓN MVC PARA CONSUMO DE SERVICIO RESTful

Luego de terminada esta parte responda:

¿Qué es RESTful?

RESTful es un estilo de arquitectura de software que define un conjunto de restricciones y principios para el diseño de servicios web. Estos servicios web, denominados Servicios Web RESTful, se basan en el protocolo HTTP y siguen el principio de que todo en el sistema es un recurso y se accede a estos recursos utilizando los métodos estándar de HTTP (GET, POST, PUT, DELETE).

Si utilizo un framework como Boostrap CSS para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?

La capa de vista

PARTE V. - APLICACIÓN MVC JUEGO

Analice las siguientes situaciones:

¿Qué pasa si abro el sitio de juegos en dos navegadores difententes?

![MicrosoftTeams-image (32)](https://github.com/PDSW-ECI/labs/assets/97971883/19f8c906-f511-43b7-8701-1cfc737f77b5)

Funciona pero en los dos navegadores realiza lo mismo


Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?

Se podria  usar sesiones de usuario para almacenar el saldo de cada jugador mientras están en el juego. Cada vez que un jugador inicia sesión en el juego, se crea una nueva sesión para ese jugador, y su saldo se almacena en esa sesión


