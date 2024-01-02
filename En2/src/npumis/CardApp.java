package npumis;
import java.util.Scanner;
public class CardApp {

    public static void main(String[] args) {
        var console = new Scanner(System.in);
        CashCard cards[]= { new CashCard("A001", 500, 0),
        					new CashCard("A002", 300, 0),
        					new CashCard("A003", 1000, 1)};
        
        for (var card:cards) {
        	System.out.printf("明細 (%s, %d, %d)%n",
                    card.getNumber(), card.getBalance(), card.getBonus());
        	System.out.print("請輸入加值:");

        	card.store(console.nextInt());
        	System.out.printf("加值後明細 (%s, %d, %d)%n%n",
        			  card.getNumber(), card.getBalance(), card.getBonus());
        }

    }
}