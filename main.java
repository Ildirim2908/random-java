package happy_family_code;

public class main {
    public static void main(String[] args) {
        pet pet1 = new pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human mother = new Human("Jane", "Karleone", 1953);
        Human father = new Human("Vito", "Karleone", 1950);
        Human child = new Human("Michael", "Karleone", 1977, 90, pet1, mother, father, new String[][]{
                {"Running", "Monday"},
                {"Reading", "Wednesday"},
                {"Walking", "Friday"}});
        
    }
}
