public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeNoise(){
        System.out.println("Собака с кличкой " + getName() + " возрастом " + getAge() + " лет издаёт звук Гав" );
    }
}
