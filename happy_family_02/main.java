package happy_family_02;

public class main {
    public static void main(String[] args) {
        HUMAN james  = new HUMAN("James", "Anderson", 1982);
        HUMAN Olivia = new HUMAN("Olivia", "Anderson", 1985);
        Family Andersons = new Family(james, Olivia);
        HUMAN child1 = new HUMAN("Emma", "Anderson", 2010);
        HUMAN child2 = new HUMAN("Noah", "Anderson", 2013);
        Andersons.addChild(child1);
        Andersons.addChild(child2);
        PET pet = new PET("Dog", "Buddy", 4, 70, new String[]{"playing fetch", "barking at strangers"});
        Andersons.setPet(pet);
        System.out.println(Andersons);
    }
}
