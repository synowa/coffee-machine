package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker(400,540,120,9,550);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String action = scanner.next();

            if ("exit".equals(action)) {
                break;
            } else {
                coffeeMaker.interact(action);
            }
        }
    }
}
