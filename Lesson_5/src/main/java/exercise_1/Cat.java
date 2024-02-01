package exercise_1;

public class Cat extends Animal {
    public static int count = 0;
    public int inBowl;
    public int ate;


    public Cat(String name, int swim, int run) {
        super.name = name;
        super.swim = swim;
        super.run = run;
    }


    @Override
    public void canSwim() {
        super.canSwim();
        System.out.println(name + " не умеет плавать");
    }

    @Override
    public void canRun() {
        super.canRun();
        int runMax = 200;
        if (run >= 0 && run <= runMax) {
            System.out.println(name + " пробежал " + run + " м.");
        } else {
            System.out.println(name + " не может пробежать больше 200 м.");
        }
    }

    public void inBowl(int inBowl) {
        this.inBowl = inBowl;
    }

    public void catAte(int ate) {
        this.ate = ate;
        if (ate > inBowl) {
            System.out.println(name + " съел: Кот не может съесть больше чем в миске ┐(￣ヘ￣)┌");
        } else {
            System.out.println(name + " съел: " + ate);
        }
    }

    public void isSatiety() {
        boolean satiety = ate < inBowl;
        if (satiety) {
            System.out.println(name + " сыт? " + true);
        } else {
            System.out.println(name + " не стал есть");
        }
    }

    public static class Cats {
        public String name;
        public int ate;
        public boolean satiety;

        public Cats(String name, int ate, boolean satiety) {
            this.name = name;
            this.ate = ate;
            this.satiety = satiety;
        }

        public void ate(Plate p) {
            p.removeFood(ate);
        }
    }


    public static class Plate {
        public int food;

        public Plate(int food) {
            this.food = food;
        }

        public void removeFood(int a) {
            food -= a;
        }

        public void addFood(int b) {
            food += b;
        }

        public void info() {
            System.out.println("Еды в миске: " + food);
        }
    }
}


