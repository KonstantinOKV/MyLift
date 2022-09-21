package org.example;

import org.example.reader.FloorPropertiesReader;

import java.util.ArrayList;
import java.util.List;

public class Floor { //создание листа с людьми и генерация случайного количества персон на этаже
    List<Person> people = new ArrayList<>();

    FloorPropertiesReader propsReader = new FloorPropertiesReader();
    int floorQue = (int) (propsReader.getMinQueue() + (Math.random() * propsReader.getMaxQueue() - propsReader.getMinQueue()));
}
