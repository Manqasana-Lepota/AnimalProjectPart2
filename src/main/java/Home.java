import java.util.ArrayList;

public class Home {

    //creating object of array list
    ArrayList<Animal> list = new ArrayList<Animal>();

    public void adoptPet(Animal animal) {

        list.add(animal);//Adding the animal to the list

    }

    public void makeAllSounds() {

        //Displaying
        for (Animal animal : list) {
            animal.sound();

        }

    }
}
