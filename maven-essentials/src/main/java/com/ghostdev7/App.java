package com.ghostdev7;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main( String[] args )
    {
        Person p = new Person("John", 30);
        System.out.println("Name: " + p.name + ", Age: " + p.age);
        Gson gson = new Gson();
        String json = gson.toJson(p);
        System.out.println("JSON: " + json);
    }
}
