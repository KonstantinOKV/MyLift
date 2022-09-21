package org.example;

import org.example.reader.BuildingPropertiesReader;

public class Building { //генерация случайного количества этажей
    BuildingPropertiesReader buildProps = new BuildingPropertiesReader();
    int buildQue = (int) (buildProps.getMin_floor() + (Math.random() * buildProps.getMax_floor() - buildProps.getMin_floor()));

}
