package com.oracle.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEjemplo {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        // Crear una nueva persona y agregarla a la lista
        //List<Person> personList2 = personList.stream().map().collect(Collectors.toList());
        // Convertir km a millas
        List<Person> personList3 = personList.stream().map(person -> {person.setKmPerYear((int)(person.getKmPerYear()*0.621371)); return person;}).peek(person -> System.out.println(person.getKmPerYear())).collect(Collectors.toList());
    }
}

class Person {
    private String name;
    private int kmPerYear;
    private int age;
    private String genre;
    private String city;

    public int getKmPerYear() {
        return kmPerYear;
    }

    public void setKmPerYear(int kmPerYear) {
        this.kmPerYear = kmPerYear;
    }

    public Person(String name, int kmPerYear, int age, String genre, String city) {
        this.name = name;
        this.kmPerYear = kmPerYear;
        this.age = age;
        this.genre = genre;
        this.city = city;
    }
}
