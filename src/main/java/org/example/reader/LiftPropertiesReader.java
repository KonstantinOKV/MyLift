package org.example.reader;

public class LiftPropertiesReader extends PropertiesReader {
    private final int max_capacity;
    private final int start_floor;

    public LiftPropertiesReader() {
        max_capacity = Integer.parseInt(properties.getProperty("lift.max_capacity"));
        start_floor = Integer.parseInt(properties.getProperty("lift.start_floor"));
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public int getStart_floor() {
        return start_floor;
    }
}
