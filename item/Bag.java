package item;

import java.util.ArrayList;

public class Bag {
    private ArrayList<Peach> peaches = new ArrayList<>();

    public Bag() {}

    public ArrayList<Peach> getPeaches() {
        return peaches;
    }

    public void setPeaches(ArrayList<Peach> peaches) {
        this.peaches = peaches;
    }

    public int countPeaches(){
        return peaches.size();
    }

    public void addPeach(Peach peach){
        peaches.add(peach);
    }

    public void removePeach(Peach peach){
        peaches.remove(peach);
    }
}
