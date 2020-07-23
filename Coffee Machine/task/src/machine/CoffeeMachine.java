package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterNow = 400;
        int milkNow = 540;
        int coffeeBeansNow = 120;
        int disposableCupsNow = 9;
        int moneyNow = 550;

        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String coffeeType = new Scanner(System.in).next();
                    if (disposableCupsNow >= 1) {
                        switch (coffeeType) {
                            case "1":
                                if (waterNow >= 250 && coffeeBeansNow >= 16) {
                                    System.out.println("I have enough resources, making you a coffee!\n");
                                    waterNow -= 250;
                                    coffeeBeansNow -= 16;
                                    disposableCupsNow -= 1;
                                    moneyNow += 4;
                                } else if (waterNow < 250) {
                                    System.out.println("Sorry, not enough water!");
                                } else {
                                    System.out.println("Sorry, not enough coffee beans!");
                                }
                                break;
                            case "2":
                                if (waterNow >= 350 && milkNow >= 75 && coffeeBeansNow >= 20) {
                                    System.out.println("I have enough resources, making you a coffee!\n");
                                    waterNow -= 350;
                                    milkNow -= 75;
                                    coffeeBeansNow -= 20;
                                    disposableCupsNow -= 1;
                                    moneyNow += 7;
                                } else if (waterNow < 350) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milkNow < 75) {
                                    System.out.println("Sorry, not enough milk!");
                                } else {
                                    System.out.println("Sorry, not enough coffee beans!");
                                }
                                break;
                            case "3":
                                if (waterNow >= 200 && milkNow >= 100 && coffeeBeansNow >= 12) {
                                    System.out.println("I have enough resources, making you a coffee!\n");
                                    waterNow -= 200;
                                    milkNow -= 100;
                                    coffeeBeansNow -= 12;
                                    disposableCupsNow -= 1;
                                    moneyNow += 6;
                                } else if (waterNow < 200) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milkNow < 100) {
                                    System.out.println("Sorry, not enough milk!");
                                } else {
                                    System.out.println("Sorry, not enough coffee beans!");
                                }
                                break;
                            case "back":
                                break;
//                            default:
//                                break;
                        }
                    } else {
                        System.out.println("Sorry, not enough disposable cups");
                    }
                    break;
                case "fill":
                    System.out.println("\nWrite how many ml of water do you want to add:");
                    int addedWater = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int addedMilk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int addedCoffeeBeans = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int addedDisposableCups = scanner.nextInt();

                    waterNow += addedWater;
                    milkNow += addedMilk;
                    coffeeBeansNow += addedCoffeeBeans;
                    disposableCupsNow += addedDisposableCups;
                    break;
                case "take":
                    System.out.printf("\nI gave you $%d\n", moneyNow);
                    moneyNow -= moneyNow;
                    break;
                case "remaining":
                    System.out.printf("\nThe coffee machine has:\n%d of water\n%d of milk\n%d of coffee beans\n" +
                            "%d of disposable cups\n$%d of money\n", waterNow, milkNow, coffeeBeansNow, disposableCupsNow, moneyNow);
                    break;
                case "exit":
                    return;
                default:
                    break;
            }
        }
    }
}
       /* int waterNow = 400;
        int milkNow = 540;
        int coffeeBeansNow = 120;
        int disposableCupsNow = 9;
        int moneyNow = 550;

        System.out.printf("The coffee machine has:\n%d of water\n%d of milk\n%d of coffee beans\n" +
                "%d of disposable cups\n%d of money\n\n", waterNow, milkNow, coffeeBeansNow, disposableCupsNow, moneyNow);
        System.out.println("Write action (buy, fill, take): ");
        String action = scanner.next();
        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                String coffeeType = new Scanner(System.in).next();
                disposableCupsNow -= 1;
                switch (coffeeType) {
                    case "1":
                        waterNow -= 250;
                        coffeeBeansNow -= 16;
                        moneyNow += 4;
                        break;
                    case "2":
                        waterNow -= 350;
                        milkNow -= 75;
                        coffeeBeansNow -= 20;
                        moneyNow += 7;
                        break;
                    case "3":
                        waterNow -= 200;
                        milkNow -= 100;
                        coffeeBeansNow -= 12;
                        moneyNow += 6;
                        break;
                    default:
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                int addedWater = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int addedMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int addedCoffeeBeans = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int addedDisposableCups = scanner.nextInt();

                waterNow += addedWater;
                milkNow += addedMilk;
                coffeeBeansNow += addedCoffeeBeans;
                disposableCupsNow += addedDisposableCups;
                break;
            case "take":
                System.out.printf("\nI gave you $%d\n", moneyNow);
                moneyNow -= moneyNow;
                break;
            default:
                break;
        }
        System.out.printf("\nThe coffee machine has:\n%d of water\n%d of milk\n%d of coffee beans\n" +
                "%d of disposable cups\n%d of money", waterNow, milkNow, coffeeBeansNow, disposableCupsNow, moneyNow);*/
       /* System.out.println("Write how many ml of water the coffee machine has:");
        int waterNow = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkNow = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeansNow = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeeded = scanner.nextInt();

        int[] oneCupIngredients = {200, 50, 15};
        if (waterNow == 0 && milkNow == 0 && coffeeBeansNow == 0 && cupsNeeded == 0) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (waterNow != 0 && milkNow != 0 && coffeeBeansNow != 0) {
            int minAmountOfCups = Math.min(Math.min(waterNow / oneCupIngredients[0], milkNow / oneCupIngredients[1]),
                    coffeeBeansNow / oneCupIngredients[2]);
            if (cupsNeeded == minAmountOfCups) {
                System.out.println("Yes, I can make that amount of coffee");
            } else if (cupsNeeded < minAmountOfCups) {
                int howManyMoreCups = minAmountOfCups - cupsNeeded;
                System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)\n", howManyMoreCups);
            } else {
                System.out.printf("No, I can make only %d cup(s) of coffee\n", minAmountOfCups);
            }
        } else {
            System.out.println("No, I can make only 0 cup(s) of coffee");
        }*/
        /*System.out.println("Write how many cups of coffee you will need:");
        int amountOfCups = scanner.nextInt();
        int water = amountOfCups * 200;
        int milk = amountOfCups * 50;
        int coffeeBeans = amountOfCups * 15;

        System.out.printf("For %d cups of coffee you will need:\n", amountOfCups);
        System.out.printf("%d ml of water\n", water);
        System.out.printf("%d ml of milk\n", milk);
        System.out.printf("%d g of coffee beans", coffeeBeans);*/
