package happy_family_04;

import java.util.Arrays;

public class Dog extends Pet implements Foulable{
    @Override
    public void respond() {
        System.out.println("Dog responds");
    }


    @Override
    public void foul() {
        System.out.println(getNickname()+ " is doing naughty things");
    }
    private Species Species;
    private String nickname;
    private int age;
    private int tricklevel;
    private String[] habits;
    Dog(Species Species, String nickname, int age, int tricklevel, String[] habits){
        this.setSpecies(Species);
        this.setNickname(nickname);
        this.setAge(age);
        this.setTricklevel(tricklevel);
        this.setHabits(habits);
    }
    Dog(Species Species, String nickname){
        this.setSpecies(Species);
        this.setNickname(nickname);
    }

    Dog(){
    }
    public Species getSpecies(){
        return Species;
    }
    public String getNickname(){
        return nickname;
    }
    public int getAge(){
        return age;
    }
    public int getTricklevel(){
        return tricklevel;
    }
    public String[] getHabits(){
        return habits;
    }
    public void setSpecies(Species Species){
        this.Species = Species;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setTricklevel(int tricklevel){
        this.tricklevel = tricklevel;
    }
    public void setHabits(String[] habits){
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Species=" + Species +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", tricklevel=" + tricklevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
