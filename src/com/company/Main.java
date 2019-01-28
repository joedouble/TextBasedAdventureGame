package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to this Text-based Adventure Game.\n");
        System.out.println("You and your friends are hanging out after school.  You all are in the forest near your high school\'s football field.");
        System.out.println("All of a sudden you all hear a loud boom that shakes the ground coming from the direction of the football field and");
        System.out.println("you also hear the town air raid sirens go off. You and your friends are startled and you all aren't sure what you want");
        System.out.println("to do.  What do you want to do?  ENTER THE NUMBER ONLY:\n");
        System.out.println("[1. Head to the football field to see what's up?] [2. Call the police.] [3. Run to your car.]");

        Scanner choice = new Scanner(System.in);
        int userChoice1 = choice.nextInt();

        if (userChoice1 == 1) {
            System.out.println("\nYou chose head to the football field to see what's up?\n");
            System.out.println("You and your friends decide to head to the football field to see if you can find out what happened.");
            System.out.println("When you get there, you see what looks like a big red hot busted open meteor.  You and your friends");
            System.out.println("aren't sure what to do.  ENTER THE NUMBER ONLY:\n");
            System.out.println("[1. You all decide to get closer to investigate the meteor.] [2. You all decide to run away.]");

            int userChoice2 = choice.nextInt();

            if (userChoice2 ==1){
                System.out.println("\nYou and your friends decide to get closer.  As you all approach the meteor you " +
                        "all start to get nauseous but you all keep\ngetting closer and closer so you can see what's inside." +
                        "  Just as you all get close enough to look inside a hazmat van pulls\nup and people in hazmat suits " +
                        "arrive.  They pull you and your friends away and tell you that you've been exposed to lethal\ndoses " +
                        "of radiation.  The best they can do for you all is take you to the hospital.  When you get to " +
                        "the hospital you all die.\n\nThe end.");
            } else {
                System.out.println("\nInstead of heading towards the meteor, you all run away from it.  As you're hightailing it" +
                        " away to safety, you all pass by\nsome police cruisers and a hazmat truck.  The hazmat truck keeps going " +
                        "towards the meteor but the police cruiser turns back\naround to meet up with you all.  The cop gets out" +
                        " and tells you all that you're lucky.  What you thought was a meteor wasn't.\nIt was an experimental " +
                        "power source for the ISS that was being tested and it's highly radioactive.  You all would have died.\n" +
                        "He gives you all a ride home and tells you to pick up your car tomorrow.\n\nThe end.");
            }
        } else if (userChoice1 == 2) {
            System.out.println("\nYou and your friends pull out your cell phones and call the cops.  The cops are " +
                    "grateful you called.  They said they're\nactually on the way there to see what's going on.  They ask you all to drive home to avoid " +
                    "getting injured.\n\nThe end.");
        } else if (userChoice1 == 3) {
            System.out.println("\nYou and your friends run to your car.  You all turn on the radio.  The newscaster " +
                    "starts talking about a terrible\naccident on the space station.  The accident has caused the space station to break up and parts are " +
                    "falling to Earth now.\nThey said a large radioactive part has fallen near the high school.  You and your friends realize that's " +
                    "what the boom was\nand decide that since the authorities have it all handled, you can head home.\n\nThe end.");
        } else {
            System.out.println("Default choice.");
        }

    }
}