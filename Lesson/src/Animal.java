

public abstract class Animal {
    protected boolean vegetarian;
    private  String food;
    public Animal(boolean vegetarian,String food){
       this.vegetarian=vegetarian;
       this.food=food;
    }


    public void eat(){
        if(food==null){
            System.out.println("есть нечего");
        }else{
            System.out.println("Ем : "+food);
        }
    }
    public class  Cat extends Animal {
        public String colour;

        public Cat(boolean vegeterian, String food, String colour) {
            super(vegeterian, food);
            this.colour = colour;

        }
        public  void cat () {
            Cat cat= new Cat(true, "grass", "gray");
            System.out.println(cat.colour);
            System.out.println(cat.vegetarian);
            cat.eat();
        }
        @Override
        public void eat(){
            System.out.println("кошка ест");
        }
    }
}
