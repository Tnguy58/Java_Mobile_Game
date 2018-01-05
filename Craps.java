/*
 * File: Craps.java
 * Author: Timothy Nguyen
 *
 * Created on January 04,2018 10:30 PM
 * to compile javac Craps.java
 * to run java Craps
 */

import java.util.*;

public class Craps {
    public static void main (String[] args) {
        HashMap<Integer, String> master_dice = new HashMap<Integer, String>();
        Scanner keyboard = new Scanner(System.in);
        boolean shouldContinue = true;
        int total_coins = 10;

        master_dice.put(1, "Pig"); 
        master_dice.put(2, "Pare"); 
        master_dice.put(3, "Shrimp"); 
        master_dice.put(4, "Crab"); 
        master_dice.put(5, "Deer"); 
        master_dice.put(6, "Fish");

        while(shouldContinue) {
            int pig_coins = 0;
            int pare_coins = 0;
            int shrimp_coins = 0;
            int crab_coins = 0;
            int deer_coins = 0;
            int fish_coins = 0;
            int pig_multiplier = 0;
            int pare_multiplier = 0;
            int shrimp_multiplier = 0;
            int crab_multiplier = 0;
            int deer_multiplier = 0;
            int fish_multiplier = 0;

            System.out.print("Pig : "); pig_coins = keyboard.nextInt();
            total_coins -= pig_coins;
            System.out.print("Pare : "); pare_coins = keyboard.nextInt();
            total_coins -= pare_coins;
            System.out.print("Shrimp : "); shrimp_coins = keyboard.nextInt();
            total_coins -= shrimp_coins;
            System.out.print("Crab : "); crab_coins = keyboard.nextInt();
            total_coins -= crab_coins;
            System.out.print("Deer : "); deer_coins = keyboard.nextInt();
            total_coins -= deer_coins;
            System.out.print("Fish : "); fish_coins = keyboard.nextInt();
            total_coins -= fish_coins;

            ListIterator<Integer> itr = null;
            List<Integer> li = new ArrayList<Integer>();

            for (int i = 1; i < 4; i++) {
                int dice_toss = randInt(1, 6);
                String value = master_dice.get(dice_toss);
                li.add(dice_toss);
                System.out.println("Dice " + i + " : " + value);  
            }

            itr = li.listIterator();

            while(itr.hasNext()) {
                switch (itr.next()) {
                    case 1:
                        if (pig_multiplier == 0)
                            pig_multiplier += 2;
                        else
                            pig_multiplier += 1;
                        break;
                    case 2:
                        if (pare_multiplier == 0)
                            pare_multiplier += 2;
                        else
                            pare_multiplier += 1;
                        break;
                    case 3:
                        if (shrimp_multiplier == 0) 
                            shrimp_multiplier += 2;
                        else
                            shrimp_multiplier += 1;
                        break;
                    case 4:
                        if (crab_multiplier == 0) 
                            crab_multiplier += 2;
                        else
                            crab_multiplier += 1;
                        break;
                    case 5:
                        if (deer_multiplier == 0)
                            deer_multiplier += 2;
                        else
                            deer_multiplier += 1;
                        break;
                    case 6:
                        if (fish_multiplier == 0)
                            fish_multiplier += 2;
                        else
                            fish_multiplier += 1;
                        break;
                }
            }

            total_coins += (pig_coins * pig_multiplier);
            total_coins += (pare_coins * pare_multiplier);
            total_coins += (shrimp_coins * shrimp_multiplier);
            total_coins += (crab_coins * crab_multiplier);
            total_coins += (deer_coins * deer_multiplier);
            total_coins += (fish_coins * fish_multiplier);

            System.out.println("Total Coins : " + total_coins);

            if (total_coins > 0) {
                shouldContinue = true;
            }
            else {
                shouldContinue = false;
            }
        } 
    }


    public static int randInt(int min, int max) {
        Random rand = new Random();
        return (rand.nextInt((max - min) + 1) + min);
    }
}