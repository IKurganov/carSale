package com.example.carSale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CarSaleApplication {

    public static void main(String[] args) {

        //SpringApplication.run(CarSaleApplication.class, args);

//        Car carForFamily = new Car(configuration);
//        System.out.println(carForFamily.readyForSale());
//
//        Car carForYoung = new Car(configuration);
//        System.out.println(carForYoung.readyForSale());


//        Car carForFamily = new Car(new ClassicConfiguration());
//        System.out.println(carForFamily.readyForSale());
//
//        Car carForYoung = new Car(new SportConfiguration());
//        System.out.println(carForYoung.readyForSale());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        Car newCarForFamily = context.getBean("classicCar", Car.class);

        Car newCarForStudent = context.getBean("sportCar", Car.class);

        System.out.println(newCarForFamily.readyForSale());
        System.out.println(newCarForStudent.readyForSale());

        Car newCarForDagestan = context.getBean("kavkazCar", Car.class);

        Car newCarForSnupDog = context.getBean("rapCar", Car.class);

        System.out.println(newCarForDagestan.readyForSale());
        System.out.println(newCarForSnupDog.readyForSale());
    }

}
