package happy_family_04;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Walter", "White", 1974);
        System.out.println(man);
        man.repairCar();
        Woman woman = new Woman("Skyler", "White", 1984);
        System.out.println(woman);
        woman.applyMakeup();
        Fish fish = new Fish(Species.FISH, "Bilbo");
        System.out.println(fish);

        fish.eat();
        Dog dog = new Dog(Species.DOG, "Frodo");
        System.out.println(dog);
        dog.foul();
    }
}
