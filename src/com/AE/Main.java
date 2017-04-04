package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.loseHealth(10);
//
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 150, "Sword");
        System.out.println("Initial health is " + player.getHealth());
        Printer brother = new Printer(200,0,false);
        System.out.println("The toner level is " + brother.getTonerLevel());
        brother.fillToner(20);
        brother.printPages(30);
        System.out.println("The printer is printing " + brother.getNumberOfPages() + " pages.");

        System.out.println("The toner level is " + brother.getTonerLevel());
        brother.fillToner(30);
        System.out.println("The toner level is " + brother.getTonerLevel());
        brother.fillToner(15);
        System.out.println("The toner level is " + brother.getTonerLevel());
        brother.printPages(50);
        System.out.println("The printer is printing " + brother.getNumberOfPages() + " pages.");
        System.out.println("The toner level is " + brother.getTonerLevel());
        brother.fillToner(50);
        System.out.println("The toner level is " + brother.getTonerLevel());
        brother.printPages(50);
        System.out.println("The printer is printing " + brother.getNumberOfPages() + " pages.");
        System.out.println("The toner level is " + brother.getTonerLevel());
    }
}
