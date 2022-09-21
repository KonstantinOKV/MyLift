package org.example;

import org.example.reader.BuildingPropertiesReader;

public class UserMenu extends BuildingPropertiesReader{
    public static void main(String[] args) {
        System.out.println("  *****STEP"+""+"1"+""+"*****");
        System.out.println("0 "+"|"+"^"+"  3 4 5  "+"^"+"|"+" 1 5 6");
        System.out.println("0 "+"|"+"^"+"  3 4 5  "+"^"+"|"+" 1 5 6");
        System.out.println("0 "+"|"+"^"+"  3 4 5  "+"^"+"|"+" 1 5 6");
        System.out.println("0 "+"|"+"^"+"  3 4 5  "+"^"+"|"+" 1 5 6");
        System.out.println("0 "+"|"+"^"+"  3 4 5  "+"^"+"|"+" 1 5 6");
        BuildingPropertiesReader buildingPropertiesReader = new BuildingPropertiesReader();
        System.out.println(buildingPropertiesReader.getMin_floor());
    }
}
