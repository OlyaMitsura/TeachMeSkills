package by.OlyaMitsura.LessonSeven.Animals;

public class Dog extends Animal {

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }

    @Override
    public String makeNoise() {
        return "Гав-гав!";
    }

    @Override
    public String toString() {
        return "Dog's " +
                "food = " + getFood()  +','+
                " location = " + getLocation();
    }
}