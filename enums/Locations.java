package enums;

public enum Locations {
    NONE{
        @Override
        public String toString(){
            return "";
        }
    },
    ROOM{
        @Override
        public String toString(){
            return "the kid's room";
        }
    },
    BAG{
        @Override
        public String toString(){
            return "the bag";
        }
    }
}
