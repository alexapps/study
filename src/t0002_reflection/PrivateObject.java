package t0002_reflection;

/**
 * Created by OIvanchenko on 14.07.2017.
 */
public class PrivateObject {
    private String privateString = null;

    public PrivateObject(String privateString) {
        this.privateString = privateString;
    }

    private String getPrivateString(){
        return this.privateString;
    }
}
