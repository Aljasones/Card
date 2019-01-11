import java.util.Scanner;

public class Card {
        public static void main (String [] args){

    Scanner scan = new Scanner (System.in);
    System.out.println("Сколько покупок хотите совершить?");
    int a = scan.nextInt(); //количество покупок
    int [] price = new int [a];

            for (int b=0; b<a; b++){
            System.out.println ("ВВедите стоимость покупки № "+b);
            price [b] = scan.nextInt(); // заносит стоимость каждой покупки в массив
           }

    int sum = 0;

           for (int b=0; b<a; b++){
             sum = sum + price [b];
           }

    int bonus = 0;
    String status = new String();

            if (sum<15000){
            bonus = sum/1000*50;
            status = "Blue";
            }
            else if (sum<150000){
            bonus = sum/1000*60;
            status = "Silver";
            }
            else{
            bonus = sum/1000*70;
            status = "Gold";
            }

     System.out.println("Статус карты = "+status+", количество бонусов = "+bonus);

            for (int b=0; b<a; b++){
                System.out.println ("Стоимость покупки №"+b+" - "+price[b]);
            }
    }
}
