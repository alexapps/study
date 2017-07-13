package main.java.ua.alexapps.t0001_json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by OIvanchenko on 13.07.2017.
 */
public class ObjectWriterTest {
    public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Mercedes");
        car.setDoors(5);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new FileOutputStream("./files/in/car.json"), car);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
