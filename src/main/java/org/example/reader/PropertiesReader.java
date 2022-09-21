package org.example.reader;

import java.io.InputStream;
import java.util.Properties;

public abstract class PropertiesReader {
protected static final String CONFIG_PATH = "src/main/resources/config.properties";
protected final Properties properties;
protected PropertiesReader(){
    properties = new Properties();
    try {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CONFIG_PATH);
        properties.load(inputStream);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
}
