package enums;

public enum Position {
    NONE{
        @Override
        public String toString(){
            return "";
        }
    },
    IN{
        @Override
        public String toString(){
            return "from inside";
        }
    },
    MIDDLE{
        @Override
        public String toString(){
            return "in the middle of";
        }
    }
}
