package by.OlyaMitsura.LessonSeven.Animals;

public class Horse extends Animal {

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест.");
    }

    @Override
    public String makeNoise() {
        return "Иго-го!";
    }

    @Override
    public String toString() {
        return "Horse's food = "+ getFood() + ','+
                " location = " + getLocation();
    }
}