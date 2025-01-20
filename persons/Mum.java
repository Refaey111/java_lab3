package persons;

import absctract_classes.Person;
import enums.Locations;
import enums.Moments;
import enums.Position;
import exceptions.PersonNotAvailableException;
import interfaces.*;

public class Mum
        extends Person
        implements Stand, Give
{
    private Locations location;
    private Position position;

    public Mum(String name, boolean isAvailable){
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
    public void giveToCarlson(Carlson carlson, Moments moment) {
        try{
            if(carlson.getAvailability()){
                System.out.println(this.getName() + " gave the bag to Carlson " + moment);
            } else {
                throw new PersonNotAvailableException(carlson.getName() + " is not available");
            }
        } catch (PersonNotAvailableException e){
            System.out.println(e.getMessage());
        }

    }
}
