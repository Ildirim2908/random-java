package happy_family_code;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    pet pet;
    Human mother;
    Human father;
    String[][] schedule;
    Human(String name, String surname, int year, int iq, pet pet, Human mother, Human father, String[][] schedule){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.pet=pet;
        this.mother=mother;
        this.father=father;
        this.schedule=schedule;
    }
    Human(String name, String surname, int year){
        this.name = name;
        this. surname = surname;
        this.year = year;
    }
    Human(){

    }
    void greet_pet() {
        System.out.println("Hello, "+ pet.nickname);
    }
    void describepet() {
        if(pet.tricklevel>=50){
            System.out.println("I have an"+pet.species+" is "+pet.age+" years old, he is very sly");
        }
        else {
            System.out.println("I have an"+pet.species+" is "+pet.age+" years old, he is almost not sly");
        }
    }

}
