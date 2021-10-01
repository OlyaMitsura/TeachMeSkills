package by.OlyaMitsura.LessonSeven.Animals;

public class Run {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Кости и мяско", "Двор частного дома");
        animals[1] = new Cat("Молоко и рыба", "Квартира");
        animals[2] = new Horse("Сено", "Конеферма");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
            System.out.println(animal.makeNoise());
        }
    }
}
