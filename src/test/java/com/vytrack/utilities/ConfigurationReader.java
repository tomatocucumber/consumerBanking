package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFiles;

    static {
        String path = "configuration.properties";

        try {

            FileInputStream fileInputStream = new FileInputStream(path);

            configFiles = new Properties();
            configFiles.load(fileInputStream);

            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return configFiles.getProperty(key);
    }
}
