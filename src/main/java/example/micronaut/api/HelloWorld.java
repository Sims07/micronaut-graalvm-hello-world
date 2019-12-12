package example.micronaut.api;

import java.io.Serializable;
import io.micronaut.core.annotation.Introspected;

/**
 * @author djz4712
 */
@Introspected
public class HelloWorld implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
