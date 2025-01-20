import enums.Emotions;
import enums.Locations;
import enums.Moments;
import enums.Position;
import item.Bag;
import item.Peach;
import persons.Carlson;
import persons.Mum;

public class Main {
    public static void main(String[] args) {
        Carlson carlson = new Carlson("Carlson", true);
        Mum mum = new Mum("Mum", true);
        Bag bag = new Bag();
        Peach peach = new Peach("beautiful peach", Locations.NONE, Position.NONE);
        bag.addPeach(peach);

        if(!carlson.getAvailability() || !mum.getAvailability()){
            System.out.println("Not all participants are available");
            System.exit(99);
        }

        //They both standing in the middle of the room
        carlson.stand(Locations.ROOM, Position.MIDDLE);
        mum.stand(Locations.ROOM, Position.MIDDLE);

        //Carlson's glares with hope and impatience
        Emotions[] emotions = {Emotions.HOPE, Emotions.IMPATIENCE};
        carlson.glare(emotions);

        //Carlson pounced on the peach ferociously
        carlson.pounce(peach, Emotions.FEROCIOUS);

        //Mum gave the bag to Carlson yesterday
        mum.giveToCarlson(carlson, Moments.YESTERDAY);

        //Carlson removed peach and greedily squeezed it
        bag = carlson.removePeachFromBag(bag, peach);
        carlson.squeeze(peach, Emotions.GREED);
    }
}