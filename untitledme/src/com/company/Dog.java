package com.company;

public class Dog extends Shelter {
    public Dog(){
    }
    void setName(String name){
        this.Name=name;
    }
    void setAge(int age){
        this.Age=age;
    }
    int getHumAge(){
        return this.Age*7;
    }
    public String toString(){
     return this.Age+" "+this.Name+" Человеческий возраст - "+getHumAge();
    }
}
