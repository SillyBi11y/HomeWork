//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int D = 25;
        int M = 12;
        if(D>=20 & D<=31 & M==1 | D>=1 & D<=18 & M==2){
            System.out.println("Водолей");
        }else if(D>=19 & D<=29 & M==2 | D>=1 & D<=20 & M==3){
            System.out.println("Рыбы");
        }else if(D>=21 & D<=31 & M==3 | D>=1 & D<=19 & M==4) {
            System.out.println("Овен");
        }else if(D>=20 & D<=30 & M==4 | D>=1 & D<=20 & M==5) {
            System.out.println("Телец");
        }else if(D>=21 & D<=31 & M==5 | D>=1 & D<=21 & M==6) {
            System.out.println("Близнецы");
        }else if(D>=22 & D<=30 & M==6 | D>=1 & D<=2 & M==7) {
            System.out.println("Рак");
        }else if(D>=23 & D<=31 & M==7 | D>=1 & D<=22 & M==8) {
            System.out.println("Лев");
        }else if(D>=23 & D<=31 & M==8 | D>=1 & D<=22 & M==9) {
            System.out.println("Дева");
        }else if(D>=23 & D<=30 & M==9 | D>=1 & D<=22 & M==10) {
            System.out.println("Весы");
        }else if(D>=23 & D<=31 & M==10 | D>=1 & D<=22 & M==11) {
            System.out.println("Скорпион");
        }else if(D>=23 & D<=30 & M==11 | D>=1 & D<=21 & M==12) {
            System.out.println("Стрелец");
        }else if(D>=22 & D<=31 & M==12 | D>=1 & D<=19 & M==1) {
            System.out.println("Козерог");
        }
    }
}