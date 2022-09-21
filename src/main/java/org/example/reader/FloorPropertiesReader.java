package org.example.reader;

public class FloorPropertiesReader extends PropertiesReader {
    private final int minQueue;
    private final int maxQueue;

    public FloorPropertiesReader() {
        minQueue = Integer.parseInt(properties.getProperty("building.floor.min_queue"));
        maxQueue = Integer.parseInt(properties.getProperty("building.floor.max_queue"));
    }

    public int getMinQueue() {
        return minQueue;
    }

    public int getMaxQueue() {
        return maxQueue;
    }
}
