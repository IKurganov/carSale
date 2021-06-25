package com.example.carSale;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class CarSaleApplicationTests {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


    @Test
    void contextLoads() {
        Car superCar = context.getBean("sportCar", Car.class);
        String result = superCar.readyForSale();

        Assert.isTrue(result.equals("Car ready in : Sport"), "errorrrrrrr" + result);


        Car snupidogiCar = context.getBean("rapCar", Car.class);
        String resultForRap = snupidogiCar.readyForSale();

        Assert.isTrue(resultForRap.equals("Car ready in : smoke weed everyday"), "error in Rap Car " + resultForRap);


        Car tuningCar = context.getBean("kavkazCar", Car.class);
        String resultForKavkazCar = tuningCar.readyForSale();

        Assert.isTrue(resultForKavkazCar.equals("Car ready in : Заниженааа"), "error in Kavkaz Car " + resultForKavkazCar);
    }

}
