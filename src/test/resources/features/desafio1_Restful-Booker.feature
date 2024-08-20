#language: es

@api_restful1
  Característica: Como usuario de Testing
    Quiero Realizar el mantenimiento de los servicios de la aplicación RESTFUL - BOOKER
    Para poder detectar errores funcionales de la aplicación

    @auth
    Escenario:  Autenticación la solicitud del servicio enviado
    Dado realizo una solicitud de autenticación
    Entonces el estado de la respuesta debe ser 200

    @booking @crear
    Escenario: Crear una reserva mediante el servicio
    Dado creo una nueva reserva
    Entonces el estado de la respuesta debe ser 200
    Y se debe generar un ID de reserva

    @booking @leer
    Escenario: Leer una reserva mediante el servicio
    Dado leo una reserva existente
    Entonces el estado de la respuesta debe ser 200

    @booking @actualizar
    Escenario: Actualizar una reserva mediante el servicio
    Dado actualizo una reserva existente
    Entonces el estado de la respuesta debe ser 200

    @booking @eliminar
    Escenario: Eliminar una reserva mediante el servicio
    Dado elimino una reserva existente
    Entonces el estado de la respuesta debe ser 201

    @ping
    Escenario: Ping del servicio mediante el servicio
    Dado realizo una solicitud de ping
    Entonces el estado de la respuesta debe ser 201


