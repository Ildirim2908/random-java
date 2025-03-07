package happy_family_04;
public abstract class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet Pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    Human(String name, String surname, int year, int iq, Pet Pet, Human mother, Human father, String[][] schedule){
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
        this.setIq(iq);
        this.setPET(Pet);
        this.setMother(mother);
        this.setFather(father);
        this.setSchedule(schedule);
    }

    Human(String name, String surname, int year){
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
    }
    Human(String name, String surname, int year, String[][] schedule){
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
        this.setSchedule(schedule);
    }
    Human(){

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
    public Human getMother(){
        return mother;
    }
    public Human getFather(){
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
    public void setMother(Human mother){
        this.mother = mother;
    }
    public void setFather(Human father){
        this.father = father;
    }
    public void setSchedule(String[][] schedule){
        this.schedule = schedule;
    }

    void greet_PET() {
        System.out.println("Hello, "+ Pet.getNickname());
    }
    void describePET() {
        if(Pet.getTricklevel()>=50){
            System.out.println("I have an"+Pet.getSpecies()+" is "+Pet.getAge()+" years old, he is very sly");
        }
        else {
            System.out.println("I have an"+Pet.getSpecies()+" is "+Pet.getAge()+" years old, he is almost not sly");
        }
    }
}
