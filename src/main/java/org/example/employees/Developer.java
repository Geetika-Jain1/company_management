package org.example.employees;

public class Developer extends Employee implements ICanProgram {
    private String programmingLanguage;

    public Developer(String name, String programmingLanguage){
        super(name);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public String getSound(){
        return "Woop woop!";
    }
    public String getProgrammingLanguage(){

        return programmingLanguage;
    }

    @Override
    public String program() {
        return name + " write some " + programmingLanguage;

    }
}
