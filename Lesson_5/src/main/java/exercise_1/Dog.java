package exercise_1;

public class Dog extends Animal {
    static int count = 0;

    public Dog(String name, int swim, int run) {
        super.name = name;
        super.swim = swim;
        super.run = run;
    }

    @Override
    public void canSwim() {
        super.canSwim();
        int swimMax = 10;
        if (swim >= 0 && swim <= swimMax) {
            System.out.println(name + " проплыл " + swim + " м.");
        } else {
            System.out.println(name + " не может проплыть больше 10 м.");
        }
    }

    @Override
    public void canRun() {
        super.canRun();
        int runMax = 500;
        if (run >= 0 && run <= runMax) {
            System.out.println(name + " пробежал " + run + " м.");
        } else {
            System.out.println(name + " не может пробежать больше 500 м.");
        }
    }
}
