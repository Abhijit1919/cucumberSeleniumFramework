package za.co.discovery.cucumber.framework.managers;

import za.co.discovery.cucumber.framework.configreader.PropertyFileReader;

public class FileReaderManager {


    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static PropertyFileReader propertyFileReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public PropertyFileReader getConfigReader() {
        return (propertyFileReader == null) ? new PropertyFileReader() : propertyFileReader ;
        //return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
}
