import org.junit.Assert;
import org.junit.Test;

 public class AnimalTest {

     Dog dog = new Dog();
     Cat cat = new Cat();
     String result;


     @Test
     public void TestDogEats() {

         result = dog.eats();
         Assert.assertEquals(result, "Food");
     }
     @Test
     public void TestDogSound() {

         result = dog.sound();
         Assert.assertEquals(result, "Dog Barks");
     }

     @Test
     public void TestCatEats() {

         result = cat.eats();
         Assert.assertEquals(result, "Food");
     }
     @Test
     public void TestCatSound() {

         result = cat.sound();
         Assert.assertEquals(result, "Cat Meows");
     }


 }