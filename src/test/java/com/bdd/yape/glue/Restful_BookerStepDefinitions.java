package com.bdd.yape.glue;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.notNullValue;

public class Restful_BookerStepDefinitions {
    private Response response;

    @Dado("realizo una solicitud de autenticación")
    public void realizo_una_solicitud_de_autenticación() {
        response = RestAssured.given()
                .contentType("application/json")
                .body("{\"username\":\"admin\",\"password\":\"password123\"}")
                .post("https://restful-booker.herokuapp.com/auth");
    }

    @Entonces("el estado de la respuesta debe ser {int}")
    public void el_estado_de_la_respuesta_debe_ser(Integer statusCode) {
        response.then().statusCode(statusCode);
    }

    @Dado("creo una nueva reserva")
    public void creo_una_nueva_reserva() {
        String requestBody = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2022-03-25\",\n" +
                "        \"checkout\" : \"2022-03-27\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        response = RestAssured.given()
                .contentType("application/json")
                .body(requestBody)
                .post("https://restful-booker.herokuapp.com/booking");
    }

    @Entonces("se debe generar un ID de reserva")
    public void se_debe_generar_un_ID_de_reserva() {
        response.then().body("bookingid", notNullValue());
    }

    @Dado("leo una reserva existente")
    public void leo_una_reserva_existente() {
        response = RestAssured.get("https://restful-booker.herokuapp.com/booking/1");
    }

    @Dado("actualizo una reserva existente")
    public void actualizo_una_reserva_existente() {
        String requestBody = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2022-03-25\",\n" +
                "        \"checkout\" : \"2022-03-27\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";

        response = RestAssured.given()
                .contentType("application/json")
                .body(requestBody)
                .put("https://restful-booker.herokuapp.com/booking/1");
    }

    @Dado("elimino una reserva existente")
    public void elimino_una_reserva_existente() {
        response = RestAssured.delete("https://restful-booker.herokuapp.com/booking/1");
    }

    @Dado("realizo una solicitud de ping")
    public void realizo_una_solicitud_de_ping() {
        response = RestAssured.get("https://restful-booker.herokuapp.com/ping");
    }


}