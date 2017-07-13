package main.java.ua.alexapps.t0001_json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

import java.io.File;
import java.io.IOException;

/**
 * Created by OIvanchenko on 13.07.2017.
 */
public class JsonGeneratorTest {
    public static void main(String[] args) {
        JsonFactory factory = new JsonFactory();

        try {
            JsonGenerator generator = factory.createGenerator(
                    new File("./files/in/output.json"), JsonEncoding.UTF8);

            generator.writeStartObject();
            generator.writeStringField("brand", "Mercedes");
            generator.writeNumberField("doors", 5);
            generator.writeEndObject();

            generator.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
