public class Drum implements Instrument{
    String size;

    Drum(String size){
        this.size = size;
    };

    @Override
    public void play(){System.out.println("Играет " + size + " барабан");}
}
