package com.nokavietnam.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author : noka
 * @since : 25/Apr/2021
 **/
public class LoadConfig {
    public String propFileName = "config.properties";
    public void loadConfig() throws IOException {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);) {
            if (null == inputStream) {
                System.out.println("Unable to file " + propFileName);
            }
            Properties properties = new Properties();
            properties.load(inputStream);
            properties.forEach((key, value)-> System.out.println("Key: " + key + " - Value: " + value));
            properties.keySet().forEach(key -> System.out.println(key));
            System.out.println("test not exist: " + properties.getProperty("hello", ""));
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
