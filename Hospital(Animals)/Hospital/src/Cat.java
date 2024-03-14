public class Cat extends Animal{

    public Cat(String name, int age){
        super(name, age);

    }
    @Override
    public void makeNoise(){
        System.out.println("Кот с кличкой " + getName() + " возрастом " + getAge() + " лет издаёт звук Мяу" );
    }
}
