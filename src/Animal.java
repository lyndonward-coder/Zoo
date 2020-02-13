public class Animal {
    public String name;
    public String favoriteFood;
    public static int population = 0;

    public Animal(String name, String favoriteFood) {
        // put your constructor content here

        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;

    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to properties
        System.out.println(name + " sleeps for 8 hours ");
    }

    public void eat(String food) {
        // complete your eat function here!
        System.out.println(name + " eats " + food);
        if (favoriteFood == food) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            sleep();
        }
    }
}
