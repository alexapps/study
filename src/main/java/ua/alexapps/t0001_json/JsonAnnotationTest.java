package main.java.ua.alexapps.t0001_json;

import java.lang.reflect.Method;

/**
 * Created by OIvanchenko on 13.07.2017.
 */
public class JsonAnnotationTest {
    public static void main(String[] args) {
        Class aClass = Car.class.getClass();
        Method[] methodsCar = aClass.getMethods();
        try {
            Method aMethod = aClass.getDeclaredMethod("getBrand", null);
            //aMethod.
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
