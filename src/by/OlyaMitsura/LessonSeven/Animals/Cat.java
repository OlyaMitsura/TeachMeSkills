package by.OlyaMitsura.LessonSeven.Animals;

public class Cat extends Animal {

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест.");
    }

    @Override
    public String makeNoise() {
        return "Мяу!";
    }

    @Override
    public String toString() {
        return "Cat's " +
                "food = " + getFood() + ','+
                " location = " + getLocation();
    }
}