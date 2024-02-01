package exercise_1;

public class Animal {
    protected String name;
    protected int swim;
    protected int run;

    public Animal() {

    }

    public void canSwim() {

    }

    public void canRun() {

    }

    public static void main(String[] args) {
        Dog dog = new Dog("Крепыш", 5, 300);
        dog.canSwim();
        dog.canRun();
        Dog.count++;
        System.out.println();
        Dog dog2 = new Dog("Ракета", 15, 600);
        dog2.canSwim();
        dog2.canRun();
        Dog.count++;
        System.out.println("Собак: " + Dog.count);
        System.out.println();

        Cat cat = new Cat("Батон", 3, 10);
        cat.canSwim();
        cat.canRun();
        Cat.count++;
        cat.inBowl(10);
        cat.catAte(20);
        cat.isSatiety();
        System.out.println();

        Cat cat2 = new Cat("Григорий", 2, 15);
        cat2.canSwim();
        cat2.canRun();
        Cat.count++;
        cat2.inBowl(20);
        cat2.catAte(10);
        cat2.isSatiety();
        System.out.println();

        Cat cat3 = new Cat("Пушок", 5, 8);
        cat3.canSwim();
        cat3.canRun();
        Cat.count++;
        cat3.inBowl(10);
        cat3.catAte(20);
        cat3.isSatiety();
        System.out.println("Котов: " + Cat.count);
        System.out.println();

        Cat.Cats[] cats = new Cat.Cats[3];
        cats[0] = new Cat.Cats("Батон", 10, false);
        cats[1] = new Cat.Cats("Григорий", 5, false);
        cats[2] = new Cat.Cats("Пушок", 3, false);

        Cat.Plate plate = new Cat.Plate(10);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].satiety && cats[i].ate < plate.food) {
                cats[i].ate(plate);
                cats[i].satiety = true;
                System.out.println(cats[i].name + " поел: " + cats[i].ate);
            } else {
                System.out.println(cats[i].name + " не поел");
            }
        }
        plate.info();
        System.out.println("Сколько еды добавить в миску?");
        plate.addFood(10);
        plate.info();
    }
}