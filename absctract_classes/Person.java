package absctract_classes;

public abstract class Person {
    private final String name; //name of the person
    private boolean isAvailable; // availability of the person

    protected Person(String name, boolean isAvailable) {
        this.name = name;
        this.isAvailable = isAvailable;
    }

    public String getName(){
        return this.name;
    }
    public boolean getAvailability(){
        return this.isAvailable;
    }
    public void setHP(boolean newAvailability){
        this.isAvailable = newAvailability;
    }
}
