# Proyecto BackEnd Java ApiRest

Este proyecto muestra por medio de las Api's la cantidad de empleados y supervisores , y cual es la relacion entre ellos

## Tecnologias ocupadas
Java | Springboot | MySQL | Postman

# Tutorial de uso

## Requisitios Previos

- Tener instalado Java 20
- Tener instalado MySQL server
- Tener instalado MySQLWorkbench 
- Tener instalado Postman

En mi caso yo ocupe como IDE:
- Visual studio code 
Con las siguientes extenciones:

- Extencion Pack for java -> con tdas sus sub extenciones
- Spring Boot Extencion Pack -> con todas sus sub extenciones

Ahora estamos listos para arrancar 😊

## Primeros pasos

- Si instalas mySQL server , quizas te pida ingresar una contraseña para el usuario **root** , coloca 

        `1234` 

- Abrir MySQLWorkbench y crear una conexion con el siguiente nombre :

  `prueba_tecnica`

Despues ejecutar en MySQLWorkbench el sigiente archivo que esta en la carpeta principal

`Query Creacion e inyeccion de datos Prueba.sql`

Alli solo ejecuta la primera linea que creara el schema (No recuerdo como se hacia esto desde spring 🥲)


- Abrir la carpeta donde esta el proyecto_BackEnd con el IDE 

- Ubicar en el menu izquierdo (donde estan las extenciones, git , etc) la extencion spring (Es como un hexagono) y ejecutar en el menu desplegable el primer simbolo de play de arriba hacia abajo

Esto creara las tablas con sus respectivas relaciones

- (En MySQLWorkbench)Ejecuta las dos lineas de comando que estan debajo de "create if not exist prueba_tecnica"

Que crearan a los supervisores y algunos empleados 

- Ahora esta todo listo para empezar a probar las apis por Postman 😁

Deje algunos json para probar , añadiendo empleados , viendo todos los empleados, editando, viendo que supervisores tienen a cargo quien ,etc.

Lamento que no sea tan **pro** aun 😥





