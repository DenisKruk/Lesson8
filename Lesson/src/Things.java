public abstract class Things {
    public abstract void iron();
}

class Jeans extends Things {
    @Override
    public void iron() {
        System.out.println("iron jeans");
    }

    static class Tshort extends Things {
        @Override
        public void iron() {
            System.out.println("iron Tshort");
        }
    }

    public static void main(String[] args) {


        Things[] closet = new Things[2];
        closet[0] = new Jeans();
        closet[1] = new Tshort();
        for (Things t: closet) {
            t.iron();
        }

    }
}

