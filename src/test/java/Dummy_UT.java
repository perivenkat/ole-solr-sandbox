import org.junit.Test;

import java.lang.Exception;
import java.lang.System;
import java.util.Iterator;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: peris
 * Date: 4/5/13
 * Time: 9:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dummy_UT {

    @Test
    public void printSystemProperties() throws Exception {
        Properties properties = System.getProperties();
        for (Iterator<Object> iterator = properties.keySet().iterator(); iterator.hasNext(); ) {
            Object property = iterator.next();
            System.out.println(property + ": " + properties.get(property));
        }

    }
}
