package org.example.employees;

import org.example.employees.Person;

public class Employee extends Person {
    public Employee(String name){
        setName(name);
    }
    public String getSound(){
        return "Aaow";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String firstCharacter = name.substring(0,1).toUpperCase();
        String rest = name.substring(1);
        this.name = firstCharacter + rest;
    }

    @Override
    public String eatFood() {
        return "Nom nom nom!";
    }
    protected String capitalizeFirstLetter(String input){
        String firstCharacter = input.substring(0, 1).toUpperCase();
        String rest =input.substring(1);
        return firstCharacter + rest;
    }
}
