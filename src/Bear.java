public class Bear extends Animal {

    public Bear(String name, String favoriteFood) {

    super(name, "fish");
    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to properties
        System.out.println(name + " hibernates for 4 months ");
    }

}
