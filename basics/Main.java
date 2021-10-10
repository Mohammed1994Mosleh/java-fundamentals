import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        pluralize("dog", 1);
        flipNHeads(1);
        LocalDateTime();
    }


    public static void pluralize(String word, int num) {
        if (num > 1 || num == 0) {

            System.out.println("I own " + num + " " + word + "s" + ".");
        } else {
            System.out.println("I own " + num + " " + word + ".");
        }
    }
    public static void flipNHeads(int num2) {
        int counter0=0;
        int counter=0;
        Random rand = new Random();
        float float_random=rand.nextFloat();
        while(counter<num2){
            float_random=rand.nextFloat();
            if(float_random<0.5){
                counter=0;
                System.out.println("tails");
            }
            else{
               counter++;
                System.out.println("heads");
            }
            counter0++;
        }

        System.out.println("it tooks"+counter0+"flips to flop"+num2+"in row");

    }
    public static void LocalDateTime() {
        int x=0;

        int y=-1;
        while (x !=1){
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            if(y != now.getSecond()){
                y=now.getSecond();
                // if()
                String formatDateTime = now.format(format);
                System.out.println(formatDateTime);

            }


        }


    }

}