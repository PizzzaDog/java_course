package org.axample.lesson1;

public class Developer {
    private String name;
    private Integer age;
    private int id;


    public void parentGreeting() {
        System.out.println("I'm an old man");
    }

    public Developer(String name, Integer age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Developer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
