# Yape_PruebaTecnica

# Proyecto de Automatización QA

## Descripción

Este proyecto tiene como objetivo automatizar las pruebas de dos desafíos:
1. **Desafío 1:** Automatización de pruebas a servicios web RESTful usando la API de Booker.
2. **Desafío 2:** Automatización de pruebas funcionales en la aplicación móvil de Booking.com.

## Tecnologías Utilizadas

- **RestAssured:** Utilizado para la automatización de pruebas de servicios web debido a su facilidad para manejar solicitudes HTTP y sus aserciones integradas.
- **Cucumber:** Implementado para desarrollar pruebas basadas en BDD (Behavior-Driven Development), facilitando la comprensión de los casos de prueba tanto para desarrolladores como para otros stakeholders.
- **Appium:** Utilizado para la automatización de pruebas en la aplicación móvil de Android, debido a su capacidad para interactuar con aplicaciones móviles de manera eficiente.
- **Maven:** Herramienta de gestión de dependencias y construcción de proyectos.

## Estructura del Proyecto

- **src/test/java**
    - **features:** Archivos `.feature` que contienen los escenarios de prueba.
    - **stepDefinitions:** Clases Java que implementan los pasos definidos en los archivos `.feature`.
    - **runners:** Clases que configuran y ejecutan los tests.
    - **utils:** Clases utilitarias para configuración y set-up de tests.
- **src/test/resources:** Archivos de recursos, incluyendo `capabilities.yml` para configuración de Appium.

## Configuración y Ejecución

1. **Instalar Dependencias:** Ejecutar `mvn install` para instalar todas las dependencias necesarias.
2. **Ejecución de Pruebas Web:** Ejecutar `mvn test -Dcucumber.options="--tags @api_restful1"` para ejecutar las pruebas de la API de Booker.
3. **Ejecución de Pruebas Móviles:** Ejecutar `mvn test -Dcucumber.options="--tags @bookingApp"` para ejecutar las pruebas de la aplicación móvil de Booking.com.

## Notas

- Se utilizó RestAssured debido a su potente integración con pruebas RESTful y sus capacidades de aserción.
- Cucumber fue seleccionado para implementar BDD, lo cual facilita la colaboración y comunicación entre equipos técnicos y no técnicos.
- Appium fue elegido para pruebas móviles gracias a su soporte multiplataforma y facilidad de integración con entornos de desarrollo Android e iOS.
