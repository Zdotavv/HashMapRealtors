package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Apartments appartment0 = new  Apartments(2, "Таирово", 5, 65,50000.0);
        Apartments appartment1 = new  Apartments(1, "Приморский", 14, 40,60000.0);
        Apartments appartment2 = new  Apartments(4, "Фонтан", 9, 120,100000.0);
        Apartments appartment3 = new  Apartments(3, "Черёмушки",2, 76,42000.0);

        myMap< Apartments, String > map = new myHashMap<>();

        System.out.println("put key null: " + map.put(null, "Vova"));
        System.out.println("put value null: " + map.put(appartment0, null));
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("put key floor >27: " + map.put(new  Apartments( 2, "Черёмушки", 29,0, 0.0),"Sasha"));
        System.out.println("put key floor = 17: " + map.put(new  Apartments(3, "Черёмушки",2, 76,42000.0),"Sasha"));
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("put appartment0: " + map.put(appartment0, "Oleg"));
        System.out.println("put appartment1: " + map.put(appartment1, "Sasha"));
        System.out.println("put appartment2: " + map.put(appartment2, "Vova"));
        System.out.println("put appartment3: " + map.put(appartment3,"Jenya"));
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println(map);
        System.out.println("map size : " + map.size());
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("contains key - 17 floors: " + map.containsKey(new  Apartments('-', "-", 17,'-','-')));
        System.out.println("get realtor of appartment - 2 floor: " + map.get(new  Apartments(3, "Черёмушки",2,76, 42000.0)));
        System.out.println("contains key appartment3: " + map.containsKey(appartment3));
        System.out.println("get realtor appartment2: " + map.get(appartment2));
        System.out.println("remove appartment2: " + map.remove(appartment2));
        System.out.println("map size : " + map.size());
        System.out.println(map);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("map to array: " + Arrays.toString(map.toArray()));
        System.out.println("Map is empty: " + map.isEmpty());
        System.out.println("Map Clear");
        map.clear();
        System.out.println(map);
        System.out.println("Map is empty: " + map.isEmpty());
    }
}

