public class Tuba implements Instrument{
int diameter;
    Tuba(int diameter){this.diameter = diameter;};

    @Override
    public void play(){
        System.out.println("Играет туба диаметром " + diameter + " см");
    }
}
