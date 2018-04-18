abstract class Property {
    public String type;

    public abstract void printInfo();
}

class Table extends Property {
    public String colour;

    public Table(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }

    public void printInfo() {
        System.out.println("It's a table, type = " + type);
    }

    public void holdFood() {
        System.out.println("holding food");
    }

    abstract class Closet extends Property {
        public int numberOfDoors;

        public Closet(String type, String colour, int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
        }

        @Override
        public void printInfo() {
            System.out.println("it's a closet, type = " + type);
        }
    }

    public static void main(String[] args) {

        Property p = new Table("table", "black");

        if (p instanceof Table) {
            Table t = (Table) p;
            t.holdFood();

        }
    }
}