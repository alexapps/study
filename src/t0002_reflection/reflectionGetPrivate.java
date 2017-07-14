package t0002_reflection;

import t0002_reflection.PrivateObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by OIvanchenko on 14.07.2017.
 */
public class reflectionGetPrivate {

    public static void main(String[] args) {
        PrivateObject privateObject = new PrivateObject("The Private Value");

        Field privateStringField = null;
        try {
            privateStringField = PrivateObject.class.
                    getDeclaredField("privateString");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        privateStringField.setAccessible(true);

        String fieldValue = null;
        try {
            fieldValue = (String) privateStringField.get(privateObject);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("fieldValue = " + fieldValue);


        //----
        Method privateStringMethod = null;
        try {
            privateStringMethod = PrivateObject.class.
                    getDeclaredMethod("getPrivateString", null);
        } catch (NoSuchMethodException e) {
                    e.printStackTrace();
        }

        privateStringMethod.setAccessible(true);

        String returnValue = null;
        try {
            returnValue = (String)
                    privateStringMethod.invoke(privateObject, null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("returnValue = " + returnValue);
    }
}
