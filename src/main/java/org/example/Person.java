package org.example;

import org.example.reader.BuildingPropertiesReader;
import org.example.reader.FloorPropertiesReader;

public class Person { //у человека есть номер целевого этажа на который ему нужно
   BuildingPropertiesReader buildProps1 = new BuildingPropertiesReader();
   int personQue1 = (int) (buildProps1.getMin_floor() + (Math.random() * buildProps1.getMax_floor() - buildProps1.getMin_floor()));


}
