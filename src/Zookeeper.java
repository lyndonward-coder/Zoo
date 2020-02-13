public class Zookeeper {
    public String name;
    public Zookeeper(String name){
        this.name = name;
    }
    public void feedAnimals(Animal[] animals, String food , int population){
        System.out.println(name + " is feeding " + food + " to " + animals.length + " of " + population + " animals");
        for( int i = 0; i<animals.length; i++){
            animals[i].eat(food);
        }
    }
}

