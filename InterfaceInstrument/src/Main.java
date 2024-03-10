//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Instrument[] array = new Instrument[3];
        array[0] = new Guitar(6);
        array[1] = new Drum("большой");
        array[2] = new Tuba(10);

        for(Instrument i: array){
            i.play();
        }

    }
}