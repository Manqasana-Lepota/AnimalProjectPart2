public class AnimalMain {

    public static void main(String[] args) {

        /*
           Creating the Object
           displaying and calling the method eats() and sound()

         */
        Dog dog = new Dog();
        System.out.println(dog.eats());
        System.out.println(dog.sound());

        Cat cat = new Cat();
        System.out.println(cat.eats());
        System.out.println(cat.sound());
    }
}
