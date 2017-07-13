package main.java.ua.alexapps.t0001_json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * Created by OIvanchenko on 13.07.2017.
 */
public class JacksonTest {
    public static void main(String[] args) {
        String carJson =
                "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

        JsonFactory factory = new JsonFactory();
        try {
            JsonParser parser  = factory.createParser(carJson);
            Car car = new Car();
            while(!parser.isClosed()){
                JsonToken jsonToken = parser.nextToken();

                //System.out.println("jsonToken = " + jsonToken);
                if(JsonToken.FIELD_NAME.equals(jsonToken)){
                    String fieldName = parser.getCurrentName();
                    System.out.println(fieldName);

                    jsonToken = parser.nextToken();

                    if("brand".equals(fieldName)){
                        car.setBrand(parser.getValueAsString());
                    } else if ("doors".equals(fieldName)){
                        car.setDoors(parser.getValueAsInt());
                    }
                }
            }

            System.out.println("car.brand = " + car.getBrand());
            System.out.println("car.doors = " + car.getDoors());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
