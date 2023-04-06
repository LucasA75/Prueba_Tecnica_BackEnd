CREATE DATABASE IF NOT EXISTS prueba_tecnica;

-- Datos de supervisores
INSERT INTO prueba_tecnica.supervisor(id, birth_date, email, last_name, name, phone) values
(1,"1999-1-3","Camilo@gmail.com","Montoya","Camilo",958331142),
(2,"1985-12-30","Manuel@gmail.com","Castro","Manuel",952454342),
(3,"1993-5-8","Pedro@gmail.com","Urrutia","Pedro",958249642);

-- Datos de empleados  
INSERT INTO prueba_tecnica.empleado(id, birth_date, email, last_name, name, phone, id_supervisor) values
(1,"1999-1-3","Camilo@gmail.com","Montoya","Camilo",958331142,null),
(2,"1985-12-30","Manuel@gmail.com","Castro","Manuel",952454342,null),
(3,"1993-5-8","Pedro@gmail.com","Urrutia","Pedro",958249642,null);

-- Los demas empleados los agregare por la API


SELECT * FROM prueba_tecnica.supervisor;
SELECT * FROM prueba_tecnica.empleado;