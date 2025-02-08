package happy_family_01;

public class main {
    public static void main(String[] args) {

        pet pet1 = new pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human mother = new Human("Jane", "Karleone", 1953);
        Human father = new Human("Vito", "Karleone", 1950);
        Human child = new Human("Michael", "Karleone", 1977, 90, pet1, mother, father, new String[][]{
                {"Running", "Monday"},
                {"Reading", "Wednesday"},
                {"Walking", "Friday"}});
        pet pet2 = new pet("cat", "Kuki", 3, 43, new String[]{"sleep", "play"});
        Human mother2 = new Human("Jane", "Hattaway", 1992);
        Human father2 = new Human("John", "Smith", 1987);
        Human child1 = new Human("Alex", "Smith", 2005, 99, pet2, mother2, father2, new String[][]{
                {"Studying", "Monday"},
                {"Swimming", "Thursday"},
                {"Running", "Saturday"}});
        //Tried to get some information --
        System.out.println(child.name);
        System.out.println(child1.surname);
    }
}