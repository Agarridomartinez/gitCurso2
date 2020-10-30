package com.adrianCurso;

import java.util.Scanner;

class RockPaperScissors2 {
    public static void main(String args[]){
        // player choice
        Scanner console = new Scanner(System.in);
        System.out.print("Please, choose (rock, paper or scissors): ");
        String player = console.next().toLowerCase();

        // check only valid options: rock, paper or scissors
        if ( !(player.equals("rock") || player.equals("paper") || player.equals("scissors")) ) {
            System.out.println("Not valid option!");
            return; // termination of program
        }

        // computer choice
        String[] options = {"rock", "paper", "scissors"};

        int random = (int) (Math.random() * 3);  // random number between 0 and 2
        String computer = options[random];  // translate number 0, 1, 2 to rock, paper, scissors

        System.out.println("The computer choose: " + computer);

        // Who wins?
        // Complete the code with if-else statements
        if(player.equals(computer)){
            System.out.println("It's a tie!");
        }
        else {
            if (player.equals("rock") && computer.equals("scissors")) {
                System.out.println("Player wins this round!");
            }
            else if (player.equals("scissors") && computer.equals("paper")){
                System.out.println("Player wins this round!");
            }
            else if (player.equals("paper")&& computer.equals("rock")){
                System.out.println("Player wins this round!");
            }
            else System.out.println("Computer wins this round!");
        }

    }
}