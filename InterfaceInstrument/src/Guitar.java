public class Guitar implements Instrument{
    int nOfStrings;
    Guitar(int nOfStrings){
    this.nOfStrings = nOfStrings;
    };

    @Override
    public void play(){
        System.out.println("Играет гитара с " + nOfStrings + " струнами");
    }


}
