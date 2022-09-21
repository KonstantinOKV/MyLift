package org.example.reader;

public class BuildingPropertiesReader extends PropertiesReader {
    private final int min_floor;
    private final int max_floor;

    public BuildingPropertiesReader() {
        min_floor = Integer.parseInt(properties.getProperty("building.min_floor"));
        max_floor = Integer.parseInt(properties.getProperty("building.max_floor"));
    }

    public int getMin_floor() {
        return min_floor;
    }

    public int getMax_floor() {
        return max_floor;
    }
}
