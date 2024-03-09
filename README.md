# LABORATORIO 5 - SPRING MVC INTRODUCTION

#### INTRODUCCIÓN A PROYECTOS WEB

### PARTE I. - JUGANDO A SER UN CLIENTE HTTP
Usaremos las siguientes aplicaciones como cliente HTTP
- Postman
- Telnet

Abre la aplicación Postman, lo usaremos para hacer una solicitud a un servidor HTTP, al abrirlo indentifica qué controles de Postman corresponde a los elementos de entrada y salida de un servicio HTTP:

<img width="803" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/49acba5d-2f26-4515-96e9-af7aa50f89d4">

Has un request GET a la URL https://www.escuelaing.edu.co/es/ y verifica el body de respuesta en las opciones Pretty, Raw, Preview.

Ahora has otro request GET al recurso https://dummyjson.com/todos, nuevamente verifica el body en varias opciones.

Responde las siguientes preguntas:
- ¿Qué pasa si no envío el método correcto?
- ¿Qué pasa si al body response HTML lo fuerzo a leerse como JSON?
- ¿Por qué el preview de HTML no se ve igual a cuando accedo a la URL en un navegador web?
- ¿Qué pasa si le envías un body a una solicitud GET?

Como parte del laboratorio en casa (ya que en los equipos del laboratorio está bloqueado) has los dos request anteriores pero ahora usando la herramienta Telnet sobre el puerto 80.
Telnet soporta HTTP y no HTTPS, entonces ¿Qué significa la respuesta 301 cuándo usas telnet en el puerto 80?. Si quieres obtener una respuesta exitosa, podrías hacer solicitudes al servicio HTTP http://example.com/ o usando openssl se pueden hacer request HTTPS https://www.bearfruit.org/thoughts/telnet-for-testing-ssl-https-websites/

### PARTE II. - CLIENT SIDE RENDERING CON REACT
Para iniciar verifica que tengas alguna de estas herramientas:
- NPM o YARN

Verificando en terminal sería `$ npm --version`

La siguiente misión es ejecutar una aplicación react localmente:
- Abre la aplicación https://codesandbox.io/s/react-js-simple-calculator-pefmr, loguéate con GitHub y juega cambiando los parámetros como colores y duplicando las líneas del archivo App.js con tags como `<ResultComponent ...>` en la función render.

- ¿Qué hace cada uno de los archivos en la aplicación?
```
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
```

- Después de haber visto los cambios, vuelve a abrir la URL original https://codesandbox.io/s/react-js-simple-calculator-pefmr y sigue los siguientes pasos:
1) Descargar código en un Zip
2) Descomprimir el Zip en la carpeta de proyectos de software, (en ciertos PC solo funciona 7-Zip)
3) Abrir una terminal de Git Bash en la carpeta descomprimida
4) Instalar las dependencias con `npm install`
5) Iniciar la aplicación con `npm start`, en algunos computadores con versiones antiguas de nodejs hay que agregar `NODE_OPTIONS=--openssl-legacy-provider npm run start`
6) Si te sale el Firewall dale click en cancelar
7) Abrir la ruta http://localhost:3000/ en un navegador web como Firefox o Google Chrome

![MicrosoftTeams-image (38)](https://github.com/PDSW-ECI/labs/assets/97971883/8a7438b3-42bc-4dad-aa38-a9c634aedb67)

Ahora, has el request GET http://localhost:3000/ usando Postman, y revisa si el body de la respuesta es igual a alguno de los archivos del proyecto. Significa eso que es un recurso web dinámico o estático?

### PARTE III. - HACIENDO UNA APLICACIÓN WEB DINÁMICA USANDO EL PATRÓN MVC
En este ejercicio, va a implementar una aplicación Web muy básica, haciendo uso de spring MVC.

Para esto usaremos la documentación oficial de Spring con que que aprenderemos las funciones básicas de este framework https://spring.io/guides/gs/serving-web-content/

Después de terminar el aprendizaje analice:
- ¿Por qué MVC obtiene ese nombre? (puede apoyarse de https://www.javatpoint.com/spring-mvc-tutorial) 
- ¿Cuáles son las ventajas de usar MVC?
- ¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?
- ¿Qué anotaciones usaste y cuál es la diferencia entre ellas?
- Ahora, haz el request GET http://localhost:8080/greeting usando Postman, y revisa si el body de la respuesta es igual a alguno de los archivos del proyecto. Significa eso que es un recurso web dinámico o estático?

![MicrosoftTeams-image (33)](https://github.com/PDSW-ECI/labs/assets/97971883/8fc50ab5-d228-4d84-857d-73f115a2a96f)

![MicrosoftTeams-image (34)](https://github.com/PDSW-ECI/labs/assets/97971883/b2de21b2-c96c-49b6-b027-0dd30d1412e6)

![MicrosoftTeams-image (35)](https://github.com/PDSW-ECI/labs/assets/97971883/ac5b1fef-1029-45e5-9e65-706beef33e09)

![MicrosoftTeams-image (36)](https://github.com/PDSW-ECI/labs/assets/97971883/0892daa6-9a4c-4bab-948b-eba303375408)

![MicrosoftTeams-image (37)](https://github.com/PDSW-ECI/labs/assets/97971883/8df17633-2d57-4942-a3d2-5a95a4425bcb)

### PARTE IV. - APLICACIÓN MVC PARA CONSUMO DE SERVICIO RESTful
Usando la arquitectura MVC del punto anterior (el proyecto anterior), realice una aplicación simple qué permita navegar gráficamente sobre esta API
https://jsonplaceholder.typicode.com/todos/1, puede guiarse de tutoriales como https://medium.com/@nutanbhogendrasharma/consume-rest-api-in-spring-boot-web-application-354c404850f0

Luego de terminada esta parte responda:
- ¿Qué es RESTful?
- Si utilizo un framework como [Boostrap CSS](https://getbootstrap.com/) para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?

![MicrosoftTeams-image (39)](https://github.com/PDSW-ECI/labs/assets/97971883/677265ff-c6a3-4cff-ac7d-83cf38390cf2)

![MicrosoftTeams-image (40)](https://github.com/PDSW-ECI/labs/assets/97971883/0b59edb3-cbbf-4a2e-86d4-b10a6264310a)

![MicrosoftTeams-image (41)](https://github.com/PDSW-ECI/labs/assets/97971883/9564490d-a995-4d91-a13a-aa243cd5f5f8)

![MicrosoftTeams-image (42)](https://github.com/PDSW-ECI/labs/assets/97971883/746171e1-197c-47a6-b123-9a5b3ac93454)

![MicrosoftTeams-image (43)](https://github.com/PDSW-ECI/labs/assets/97971883/442363c4-1ea0-4059-b519-bc1df1d6b17f)

![MicrosoftTeams-image (44)](https://github.com/PDSW-ECI/labs/assets/97971883/acebb963-b214-4f73-8883-dd2b22c690f6)

![MicrosoftTeams-image (45)](https://github.com/PDSW-ECI/labs/assets/97971883/d6606806-25a8-4338-bfb4-95bb51e0f3da)

![MicrosoftTeams-image (46)](https://github.com/PDSW-ECI/labs/assets/97971883/880d50f0-ace0-4537-aaa5-932b0fc32e67)

![MicrosoftTeams-image (47)](https://github.com/PDSW-ECI/labs/assets/97971883/16ef574e-c473-4c6a-a33f-bb64fe0337c0)

![MicrosoftTeams-image (48)](https://github.com/PDSW-ECI/labs/assets/97971883/a35ad59f-527c-494e-af75-2dde53ea3ca2)

### PARTE V. - APLICACIÓN MVC JUEGO
¡Llego la hora del reto! Teniendo las bases del uso del framework, cree una nueva ruta, por ejemplo `/guess`, y agrege formulario básico con un campo llamado "número" (guía de como crear formularios HTML https://www.w3schools.com/html/)

Y vamos a implementar la lógica de nuestro juego:
1. Se trata de un juego en línea para adivinar un número, en el que el ganador, si acierta en la primera oportunidad, recibe $100.000. Luego, por cada intento fallido, el premio
se reduce en $10.000, como en los juegos de apuesta, es natural qué quede en saldos negativos.
2. El número a adivinar debe ser generado en cada intento y comparado con el número qué el usuario está insertando, es un número de 1 a 10.
3. Debe existir un botón de reset, qué permita al jugador iniciar de nuevo.
4. La capa de controlador debe procer el número del usuario mediante método `POST`.

Analice las siguientes situaciones:
- ¿Qué pasa si abro el sitio de juegos en dos navegadores difententes?
- Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?


![MicrosoftTeams-image (32)](https://github.com/PDSW-ECI/labs/assets/97971883/98a6fa8c-74e3-4973-a470-51a214ce9a38)

## ENTREGA
- En un README.md colocar lo siguiente:
- Una sección llamada “INTEGRANTES” y allícolocar el listado de los integrantes del taller (máximo 2).
- Una sección llamada “RESPUESTAS” colocar las respuestas a las preguntas.
- Configurar el archivo .gitignore para excluir del repositorio los archivos no relevantes.
- En una carpeta en la raiz del repositorio llamada diagrams y allí realizar un diagrama de clases del proyecto.

