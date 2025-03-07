package happy_family_04;

public class Family implements HumanCreator {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    Family(Human mother, Human father){
        this.setMother(mother);
        this.setFather(father);
        this.children = new Human[0];
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public Human getMother(){
        return mother;
    }
    public Human getFather(){
        return father;
    }
    public Human[] getChildren(){
        return children;
    }
    public Pet getPet(){
        return pet;
    }
    public void setMother(Human mother){
        this.mother = mother;
    }
    public void setFather(Human father){
        this.father = father;
    }
    public void setChildren(Human[] children){
        this.children = children;
    }
    public void setPet(Pet Pet){
        this.pet = Pet;
    }

    @Override
    public Human bornChild() {
        return null;
    }
}
