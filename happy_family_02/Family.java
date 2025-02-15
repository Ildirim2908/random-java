package happy_family_02;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Family {
    private HUMAN mother;
    private HUMAN father;
    private HUMAN[] children;
    private PET pet;

    Family(HUMAN mother, HUMAN father){
        this.setMother(mother);
        this.setFather(father);
        this.children = new HUMAN[0];
        this.pet = new PET();
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public HUMAN getMother(){
        return mother;
    }
    public HUMAN getFather(){
        return father;
    }
    public HUMAN[] getChildren(){
        return children;
    }
    public PET getPet(){
        return pet;
    }
    public void setMother(HUMAN mother){
        this.mother = mother;
    }
    public void setFather(HUMAN father){
        this.father = father;
    }
    public void setChildren(HUMAN[] children){
        this.children = children;
    }
    public void setPet(PET pet){
        this.pet = pet;
    }
    public void addChild(HUMAN child){
        HUMAN[] newChildren = new HUMAN[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }
        newChildren[children.length] = child;
        children = newChildren;
        child.setFamily(this);
    }
    public boolean delChild(HUMAN given){
        boolean found = false;

        for(HUMAN child : children) {
            if(child.equals(given)) {
                found = true;
                break;
            }
        }
        if(!found) {
            return false;
        }
        HUMAN[] newChildren = new HUMAN[children.length - 1];
        int index=0;
        for (HUMAN child : children) {
            if (!child.equals(given)) {
                newChildren[index] = child;
                index++;
            }
        }
        children = newChildren;
        return true;


    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(getMother(), family.getMother()) && Objects.equals(getFather(), family.getFather()) && Objects.deepEquals(getChildren(), family.getChildren()) && Objects.equals(getPet(), family.getPet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMother(), getFather(), Arrays.hashCode(getChildren()), getPet());
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
