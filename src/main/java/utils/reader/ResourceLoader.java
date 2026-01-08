package utils.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

public class ResourceLoader {

    private static final Logger log = LoggerFactory.getLogger(ResourceLoader.class);

    public static InputStream getResource(String path) {
        log.info("Reading resource from classpath: {}", path);

        InputStream stream =
                ResourceLoader.class
                        .getClassLoader()
                        .getResourceAsStream(path);

        if (stream == null) {
            throw new RuntimeException("Resource not found on classpath: " + path);
        }

        return stream;
    }
}
