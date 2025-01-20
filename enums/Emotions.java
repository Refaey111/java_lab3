package enums;

public enum Emotions {
    FEROCIOUS{
        @Override
        public String toString(){
            return "like a hawk on its prey";
        }
    },
    HOPE{
        @Override
        public String toString(){
            return "hope";
        }
    },
    IMPATIENCE{
        @Override
        public String toString(){
            return "impatience";
        }
    },
    GREED{
        @Override
        public String toString(){
            return "greedily";
        }
    }
}
