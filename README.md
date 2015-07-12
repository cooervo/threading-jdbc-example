# Descripción

El archivo `mysql_db_scripts.sql` son los scripts utilizados para crear la base de datos, la tabla y popular esta con los datos del ejemplo.

Las clases en `src/com/cloudfleet` son los que leen la información en la base da datos y simulan enviar el mensaje JSON a la URL requerida:

* La clase `ConnectionConfiguration.java` en el paquete `src/com/cloudfleet/datasource/` es la que crea la configuración con la base de datos.
* La clase `JSONMessage.java`en el paquete `src/com/cloudfleet/entity/`es la entidad que nos sirve para almacenar los datos de la base de datos a un java bean. 
* La clase `JSONMessageDAO.java` en el paquete `src/com/cloudfleet/DAO/`es el DAO que nos sirve para acceder a los datos en la base de datos, dado que el ejercicio no necesitaba de implementar todas las funcionalidades de una aplicación CRUD tan solo implementamos el método selectAll() para acceder a los datos en la base de datos.
* Finalmente, la clase `SendMessagesApp.java` en el paquete `src/com/cloudfleet/`es la que contiene el main method que ejecuta la aplicación.

El output de este programa en consola es: 
          
          1. Se envia json: {“nombre”:”pedro”, “edad”:23, ….}
          A la url: http://empresa.com/recibir.php
          
          2. Se envia json: {“nombre”:”maria”, “edad”:28, ….}
          A la url: http://server.com/tramas.asp
          
          3. Se envia json: {“nombre”:”juan”, “edad”:33, ….}
          A la url: http://dominio.com/interfaz/online
          
          4. Se envia json: {“nombre”:”monica”, “edad”:35, ….}
          A la url: http://aplicacion.com/recibir.php
          
          5. Se envia json: {“nombre”:”jose”, “edad”:18, ….}
          A la url: http://app.contabilidad.com/recibir.php
          
          6. Se envia json: {“nombre”:”julian”, “edad”:12, ….}
          A la url: http://comercial.com/recibir.php
