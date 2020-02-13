public class Zoo {

    public static void main(String[] args) {
        //make and run a main method
        Tiger tigger = new Tiger("Tigger", "meat");
        tigger.eat("meat");
        Bear Pooh = new Bear("Pooh", "fish");
        Pooh.eat("fish");
        Pooh.eat("meat");
        Unicorn Rarity = new Unicorn("Rarity","marshmallows");
        Rarity.eat("marshmallows");
        Giraffe Gemma = new Giraffe("Gemma", "leaves");
        Gemma.eat("meat");
        Gemma.eat("leaves");
        Bees Stinger = new Bees("Stinger","pollen");
        Stinger.eat("ice cream");
        Stinger.eat("pollen");
        Zookeeper zoebot=  new Zookeeper("zoebot");
        Animal[] array = { tigger , Pooh , Rarity , Gemma, Stinger};
        zoebot.feedAnimals(array,"cheeseburger" , Animal.population );
    }








}
