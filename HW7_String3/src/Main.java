import java.util.regex.Pattern;
import java.util.regex.Matcher;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String str = "ahb acb aeb aeeb adcb axeb";
    String regex = "a.b";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(str);
    while(matcher.find()){
    System.out.println(matcher.group());
    }
    }
}