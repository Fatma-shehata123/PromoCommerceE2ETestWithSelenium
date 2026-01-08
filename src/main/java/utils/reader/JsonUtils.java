package utils.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

public class JsonUtils {

    private static final Logger log = LoggerFactory.getLogger(JsonUtils.class);
    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T getTestData(String path, Class<T> type) {
        try (InputStream stream = ResourceLoader.getResource(path)) {

            if (stream == null) {
                throw new RuntimeException("Test data file not found on classpath: " + path);
            }

            return mapper.readValue(stream, type);

        } catch (Exception e) {
            log.error("Unable to read test data: {}", path, e);
            throw new RuntimeException(e); 
        }
    }
}
