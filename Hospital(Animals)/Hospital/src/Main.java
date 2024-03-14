//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Матроскин", 6);
        animals[1] = new Dog("Шарик", 5);
        animals[2] = new Rat("Рататуй", 2);

        for (Animal d : animals){
            d.makeNoise();
        }
    }
}