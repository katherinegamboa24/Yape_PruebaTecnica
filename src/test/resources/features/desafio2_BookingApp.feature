#language: es

Característica: Pruebas de la aplicación móvil Booking.com

Escenario:  Buscar alojamiento
Dado la aplicación está abierta
Cuando realizo una búsqueda de alojamiento en "New York"
Entonces se deben mostrar resultados de alojamiento

Escenario: Seleccionar resultado de búsqueda
Cuando selecciono el primer resultado de búsqueda
Entonces la información del alojamiento debe ser mostrada

Escenario: Elegir opción de habitación
Cuando elijo la primera opción de habitación disponible
Entonces la opción debe ser seleccionada correctamente

Escenario: Llenar los datos de la reserva
Cuando lleno los datos de la reserva con "John Doe"
Entonces los datos deben ser aceptados

Escenario: Verificar los datos de la reserva
Cuando verifico los datos de la reserva
Entonces los datos de la reserva deben ser correctos

Escenario: Elegir forma de pago
Cuando elijo la forma de pago tarjeta de crédito
Entonces el costo de la reserva debe ser correcto


