package com.company;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class myHashMap<K, V> implements myMap<Apartments, String> {

    private Map<Apartments, String> map = new HashMap<>();

    public myHashMap() { }
    public myHashMap(int capacity) {
        map = new HashMap<>(capacity);
    }

    public boolean put(Apartments key,String value) {
        if(isNull(key) || isNull(value)) { return false; }

        if(key.getFloor() > 27) {
            return false;
        }
        map.put(key,value);
        return true;
    }

    public boolean remove(Apartments key) {
        if(isNull(key)) { return false; }
        map.remove(key);
        return true;
    }

    public boolean containsKey(Apartments key) {
        if(isNull(key)) { return false; }
        return map.containsKey(key);
    }

    public java.lang.String get(Apartments key) {
        if(isNull(key)) { return null; }
        return map.get(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }

    public int size() {
        return map.size();
    }

    public String[] toArray() {
        return map.values().toArray(new String[0]);
    }

    public String toString() {
        return map.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof myHashMap)) return false;
        myHashMap<?, ?> that = (myHashMap<?, ?>) o;
        return Objects.equals(map, that.map);
    }

    public int hashCode() {
        return Objects.hash(map);
    }

    private boolean isNull(Object o) {
        return o == null;
    }
}
