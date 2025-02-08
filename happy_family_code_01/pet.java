package happy_family_code;

import java.util.Arrays;

public class pet {
    String species;
    String nickname;
    int age;
    int tricklevel;
    String[] habits;
    pet(String species, String nickname, int age, int tricklevel, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }
    pet(String species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }
    pet(){

    }
    void eat() {
        System.out.println("I am eating");
    }
    void respond() {
        System.out.println("Hello owner. I am "+ this.nickname + " i miss you!");
    }
    void foul() {
        System.out.println("I need to cover this up");
    }

    @Override
    public String toString() {
        return "pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", tricklevel=" + tricklevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
