#Crear la base de datos
CREATE DATABASE IF NOT EXISTS cloud_fleet_db;

#Seleccionar la base de datos
USE cloud_fleet_db;

#Crear la tabla
CREATE TABLE json_messages(
	id INT NOT NULL AUTO_INCREMENT,
    message VARCHAR(200) NOT NULL,
    url VARCHAR(100) NOT NULL,
	PRIMARY KEY(id)

);

#Insertar valores en la tabla
INSERT INTO json_messages
	( message, url)
VALUES
	( '{“nombre”:”pedro”, “edad”:23, ….}',  'http://empresa.com/recibir.php'         ),
    ( '{“nombre”:”maria”, “edad”:28, ….}',  'http://server.com/tramas.asp'           ),
    ( '{“nombre”:”juan”, “edad”:33, ….}',   'http://dominio.com/interfaz/online'     ),
    ( '{“nombre”:”monica”, “edad”:35, ….}', 'http://aplicacion.com/recibir.php'      ),
    ( '{“nombre”:”jose”, “edad”:18, ….}',   'http://app.contabilidad.com/recibir.php'),
    ( '{“nombre”:”julian”, “edad”:12, ….}', 'http://comercial.com/recibir.php'       );

