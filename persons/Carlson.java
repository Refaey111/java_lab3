package persons;

import absctract_classes.Person;
import enums.Emotions;
import enums.Locations;
import enums.Position;
import exceptions.NoMorePeachesException;
import interfaces.*;
import item.Bag;
import item.Peach;

public class Carlson
        extends Person
        implements Stand, Glare, Pounce, Squeeze, Remove
{
    private Locations location;
    private Position position;

    public Carlson(String name, boolean isAvailable){
        super(name, isAvailable);
        this.location = Locations.NONE;
        this.position = Position.NONE;
    }

    public Locations getLocation() {
        return location;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public void stand(Locations location, Position position) {
        this.location = location;
        this.position = position;
        System.out.println(this.getName() + " is standing " + this.getPosition() + " " + this.getLocation());
    }

    @Override
    public void glare(Emotions[] emotions){
        System.out.print(this.getName() + " is glaring with ");
        for (int i = 0; i < emotions.length; i++) {
            if(i == emotions.length -1) System.out.print("and ");
            System.out.print(emotions[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void pounce(Peach peach, Emotions emotion){
        System.out.println(this.getName() + " pounced on the " + peach.name() + " " + emotion);
    }

    @Override
    public void squeeze(Peach peach, Emotions emotions) {
        System.out.println(this.getName() + " " + emotions + " squeezed the " + peach.name());
    }

    @Override
    public Bag removePeachFromBag(Bag bag, Peach peach) throws NoMorePeachesException {
        try{
            if(bag.getPeaches().contains(peach)){
                bag.removePeach(peach);
                System.out.println("Carlson removed Peach from Bag");
            } else{
                throw new NoMorePeachesException(peach.name() + " is not in the bag");
            }
        } catch (NoMorePeachesException e){
            System.out.println(e.getMessage());
        }

        return bag;

    }
}
