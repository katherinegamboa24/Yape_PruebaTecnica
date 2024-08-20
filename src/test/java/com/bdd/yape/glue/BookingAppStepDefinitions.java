package com.bdd.yape.glue;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class BookingAppStepDefinitions {
    private AndroidDriver<MobileElement> driver;

    @Dado("la aplicación está abierta")
    public void la_aplicación_está_abierta() throws MalformedURLException {
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Cuando("realizo una búsqueda de alojamiento en {string}")
    public void realizo_una_búsqueda_de_alojamiento_en(String destino) {
        MobileElement searchBox = driver.findElement(By.id("com.booking:id/search_box"));
        searchBox.sendKeys(destino);
        MobileElement searchButton = driver.findElement(By.id("com.booking:id/search_button"));
        searchButton.click();
    }

    @Entonces("se deben mostrar resultados de alojamiento")
    public void se_deben_mostrar_resultados_de_alojamiento() {
        MobileElement results = driver.findElement(By.id("com.booking:id/results"));
        assertTrue(results.isDisplayed());
    }

    @Cuando("selecciono el primer resultado de búsqueda")
    public void selecciono_el_primer_resultado_de_búsqueda() {
        MobileElement firstResult = driver.findElement(By.id("com.booking:id/first_result"));
        firstResult.click();
    }

    @Entonces("la información del alojamiento debe ser mostrada")
    public void la_información_del_alojamiento_debe_ser_mostrada() {
        MobileElement hotelInfo = driver.findElement(By.id("com.booking:id/hotel_info"));
        assertTrue(hotelInfo.isDisplayed());
    }

    @Cuando("elijo la primera opción de habitación disponible")
    public void elijo_la_primera_opción_de_habitación_disponible() {
        MobileElement firstRoomOption = driver.findElement(By.id("com.booking:id/first_room_option"));
        firstRoomOption.click();
    }

    @Entonces("la opción debe ser seleccionada correctamente")
    public void la_opción_debe_ser_seleccionada_correctamente(){

    }
}
