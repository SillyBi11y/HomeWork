import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File folder = new File("C:\\HW9");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> texts = new ArrayList();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                try(BufferedReader br = new BufferedReader(new FileReader(file))){
                    String s;
                    while ((s=br.readLine()) != null){
                        texts.add(s);
                    }

                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }

        String result = Arrays.toString(new ArrayList[]{texts}).replace("[", "").replace("]", "").replace(",", "");
        System.out.println(result); //для наглядности C:\HW9\result.txt

        try{
            File file = new File("C:\\HW9\\result.txt");
            file.createNewFile();
        }catch (IOException ex){
            ex.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\HW9\\result.txt"))){
            bw.write(result);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}