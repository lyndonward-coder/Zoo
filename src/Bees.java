public class Bees extends Animal {

    public Bees(String name, String favoriteFood){

        super(name, "pollen");
    }

    @Override
    public void sleep() {
        System.out.println(name + " never sleeps ");
    }

    public void eat(String food){
        if(food != favoriteFood){
            System.out.println("YUCK!!!" + name + " will not eat " + food);
        }else{
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!!" + name + " wants more " + food);
            sleep();
        }
    }
}
