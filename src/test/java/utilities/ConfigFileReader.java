package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader {

    private Properties prop;
    private final String propertyFilePath = "./src/test/java/utilities/";

    public ConfigFileReader() {
        InputStream reader = null;
        try {
            reader = new FileInputStream(propertyFilePath + "Config.properties") {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            };
            prop = new Properties();
            try {
                prop.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Config.properties not found at " + propertyFilePath);
        }
    }

    public String getSearchPlace() {
        String searchPlace = prop.getProperty("searchPlace");
        if (searchPlace != null) return searchPlace;
        else throw new RuntimeException("searchPlace not specified in the Configuration.properties file.");
    }

    public String getFromDate() {
        String fromDate = prop.getProperty("fromDate");
        if (fromDate != null) return fromDate;
        else throw new RuntimeException("fromDate not specified in the Configuration.properties file.");
    }

    public String getToDate() {
        String toDate = prop.getProperty("toDate");
        if (toDate != null) return toDate;
        else throw new RuntimeException("toDate not specified in the Configuration.properties file.");
    }

    public long getAdultsCount() {
        String adults = prop.getProperty("adults");
        if (adults != null) return Long.parseLong(adults);
        else throw new RuntimeException("adults not specified in the Configuration.properties file.");
    }

    public long getChildrenCount() {
            String children = prop.getProperty("children");
            if (children != null) return Long.parseLong(children);
            else throw new RuntimeException("children not specified in the Configuration.properties file.");
    }

    public long getRoomsCount() {
        String rooms = prop.getProperty("rooms");
        if(rooms != null) return Long.parseLong(rooms);
        else throw new RuntimeException("rooms not specified in the Configuration.properties file.");
    }

}



