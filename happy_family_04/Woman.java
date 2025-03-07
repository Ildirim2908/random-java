package happy_family_04;

import java.util.Arrays;

public final class Woman extends Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet Pet;
    private Woman mother;
    private Woman father;
    private String[][] schedule;
    Woman(String name, String surname, int year, int iq, Pet Pet, Woman mother, Woman father, String[][] schedule){
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
        this.setIq(iq);
        this.setPET(Pet);
        this.setMother(mother);
        this.setFather(father);
        this.setSchedule(schedule);
    }

    Woman(String name, String surname, int year){
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
    }
    Woman(String name, String surname, int year, String[][] schedule){
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
        this.setSchedule(schedule);
    }
    Woman(){

    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getYear(){
        return year;
    }
    public int getIq(){
        return iq;
    }
    public Pet getPET(){
        return Pet;
    }
    public Woman getMother(){
        return mother;
    }
    public Woman getFather(){
        return father;
    }
    public String[][] getSchedule(){
        return schedule;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setIq(int iq){
        this.iq = iq;
    }
    public void setPET(Pet Pet){
        this.Pet = Pet;
    }
    public void setMother(Woman mother){
        this.mother = mother;
    }
    public void setFather(Woman father){
        this.father = father;
    }
    public void setSchedule(String[][] schedule){
        this.schedule = schedule;
    }


    public void applyMakeup(){
        System.out.println(getName()+" applies her makeup");
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", Pet=" + Pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
