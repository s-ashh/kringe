package com.company;

public class Main {
    public static final String BLACK = "\u001B[30m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[0m";

    public static void main(String[] args) {
        print();
    }
    public static  void  print(){
        System.out.print(BLUE + "██████" + BLACK + "█" + BLUE + "█" + BLACK + "█" + BLUE + "███" + BLACK + "█" + BLUE + "███████████████████████████\n" +
                BLUE + "███████" + BLACK + "██" + BLUE + "██" + BLACK + "█" + BLUE + "████" + BLACK + "█" + BLUE + "███████████████████████\n" +
                BLUE + "████████" + BLACK + "██" + BLUE + "█" + BLACK + "█" + BLUE + "████" + BLACK + "█" + BLUE + "███████████████████████\n" +
                BLUE + "████████" + BLACK + "██" + BLUE + "█" + BLACK + "█" + BLUE + "███" + BLACK + "█" + BLUE + "████████████████████████\n" +
                BLUE + "████████" + BLACK + "███" + BLUE + "████" + BLACK + "█" + BLUE + "███" + CYAN + "██████████████████" + BLUE + "███\n" +
                BLUE + "███" + BLACK + "█" + BLUE + "████" + BLACK + "██" + BLUE + "█████" + BLACK + "█" + BLUE + "█" + CYAN + "██████████████████████" + BLUE + "█\n" +
                BLUE + "███" + BLACK + "█" + BLUE + "█" + BLACK + "█" + BLUE + "███" + BLACK + "██" + BLUE + "███" + BLACK + "█" + YELLOW + "█" + CYAN + "███" + BLACK + "█" + CYAN + "████████████████████\n" +
                BLUE + "███" + BLACK + "█" + BLUE + "█" + BLACK + "█" + BLUE + "███" + BLACK + "██" + BLUE + "███" + YELLOW + "█" + CYAN + "███" + BLACK + "█" + CYAN + "█████████████████████\n" +
                BLUE + "███" + BLACK + "█" + BLUE + "█" + BLACK + "█" + BLUE + "███" + BLACK + "██" + BLUE + "██" + BLACK + "█" + CYAN + "████" + BLACK + "█" + CYAN + "█████████████████████\n" +
                BLUE + "███" + BLACK + "██" + BLUE + "█████" + BLACK + "███" + CYAN + "██" + BLACK + "█" + CYAN + "█" + BLACK + "█" + CYAN + "██████████████████████\n" +
                BLUE + "███" + BLACK + "█" + BLUE + "██████" + BLACK + "███" + CYAN + "██" + BLACK + "█" + CYAN + "█" + BLACK + "█" + CYAN + "██████████████████████\n" +
                BLUE + "███" + BLACK + "█" + BLUE + "██" + BLACK + "█" + BLUE + "███" + BLACK + "██" + YELLOW + "█" + CYAN + "███" + BLACK + "██" + CYAN + "██████████████████████\n" +
                BLUE + "█" + BLACK + "█" + BLUE + "█" + BLACK + "██" + BLUE + "██" + BLACK + "█" + BLUE + "██" + BLACK + "██" + YELLOW + "█" + CYAN + "███" + BLACK + "█" + CYAN + "███████████████████████\n" +
                BLUE + "█" + BLACK + "█" + BLUE + "██" + BLACK + "█" + BLUE + "██" + BLACK + "█" + BLUE + "██" + BLACK + "██" + CYAN + "████" + BLACK + "█" + CYAN + "██" + YELLOW + "█" + CYAN + "████████████████████\n" +
                BLUE + "██" + BLACK + "████" + BLUE + "█" + BLACK + "█" + BLUE + "██" + BLACK + "██" + BLUE + "███" + BLACK + "█" + CYAN + "██" + BLACK + "█" + CYAN + "█████████████████████\n" +
                BLUE + "█████" + BLACK + "██" + BLUE + "██" + BLACK + "██" + YELLOW + "█" + CYAN + "██" + BLACK + "███" + YELLOW + "█" + CYAN + "███████████" + PURPLE + "███████████\n" +
                BLUE + "██████" + BLACK + "██" + BLUE + "█" + BLACK + "██" + YELLOW + "█" + CYAN + "█" + BLACK + "█" + YELLOW + "█" + CYAN + "█████████" + PURPLE + "████████████████\n" +
                BLUE + "███████" + BLACK + "████" + CYAN + "█" +  BLACK + "█" + YELLOW + "█" + CYAN + "████████" + PURPLE + "██████████████████\n" +
                BLUE + "████████" + BLACK + "█████" + CYAN + "███████" + PURPLE + "████████████████████\n" +
                BLUE + "████████" + BLACK + "████" + CYAN + "███████" + PURPLE + "█████████████████████\n" +
                BLUE + "████████" + BLACK + "██" + YELLOW + "█" + CYAN + "██████" + PURPLE + "███████████████████████\n" +
                BLUE + "████████" + BLACK + "██" + YELLOW + "█" + CYAN + "█████" + PURPLE + "█████████████" + YELLOW + "███████████\n" +
                BLUE + "████████" + BLACK + "██" + YELLOW + "█" + CYAN + "████" + PURPLE + "███████████" + YELLOW + "██████████████\n" +
                BLUE + "███████" + BLACK + "███" + YELLOW + "█" + CYAN + "████" + PURPLE + "█████████" + YELLOW + "████████████████\n" +
                BLUE + "███████" + BLACK + "███" + YELLOW + "█" + CYAN + "███" + PURPLE + "████████" + YELLOW + "██████████████████\n" +
                BLUE + "███████" + BLACK + "███" + YELLOW + "█" + CYAN + "██" + PURPLE + "███████" + YELLOW + "████████████████████\n" +
                BLUE + "███████" + BLACK + "███" + YELLOW + "█" + CYAN + "█" + PURPLE + "███████" + YELLOW + "█████████████████████\n" +
                BLUE + "███████" + BLACK + "████" + PURPLE + "███████" + YELLOW + "██████████████████████\n" +
                BLUE + "███████" + BLACK + "████" + YELLOW + "█" + PURPLE + "█████" + YELLOW + "███████████████████████\n" +
                BLUE + "██████" + BLACK + "█████" + YELLOW + "█" + PURPLE + "█████" + YELLOW + "███████████████████████\n" +
                BLUE + "██████" + BLACK + "██████████" + WHITE + "███" + YELLOW + "████████████" + WHITE + "█████" + YELLOW + "████\n" +
                BLUE + "██████" + BLACK + "██████████████" + WHITE + "█" + YELLOW + "████████" + WHITE + "█████████" + YELLOW + "██\n" +
                BLUE + "████" + CYAN + "█" + BLACK + "██████████████████" + WHITE + "█" + YELLOW + "████" + WHITE + "███████████" + YELLOW + "█\n" +
                BLUE + "█" + CYAN + "██" + BLACK + "█████████████████████" + WHITE + "█" + YELLOW + "██" + WHITE + "█████████████\n" +
                CYAN + "█" + BLACK + "███████████████████████" + WHITE + "█" + YELLOW + "██" + WHITE + "█████████████\n" +
                BLACK + "████████████████████████" + YELLOW + "█" + BLUE + "███████████████\n" +
                BLACK + "████████████████████████" + YELLOW + "█" + BLUE + "███████████████\n" +
                BLACK + "███████████████████████" + YELLOW + "█" + BLUE + "████████████████\n" +
                BLACK + "███████████████████████" + BLUE + "███" + CYAN + "██" + BLUE + "███████" + CYAN + "███" + BLUE + "██\n" +
                BLACK + "██████████████████████" + BLUE + "█" + CYAN + "██" + BLUE + "██" + CYAN + "████" + BLUE + "█████████\n" +
                BLACK + "█████████████████████" + YELLOW + "█" + BLUE + "██████████████████\n" +
                BLACK + "█████████████████████" + BLUE + "██████" + CYAN + "██" + BLUE + "█████" + CYAN + "██" + BLUE + "████\n" +
                BLACK + "█████████████████████" + BLUE + "██████████" + CYAN + "██" + BLUE + "█████" + CYAN + "██\n" +
                BLACK + "█████████████████████" + WHITE + "█" + BLUE + "███████" + CYAN + "█" + BLUE + "██████████\n" +
                BLACK + "█████████████████████" + YELLOW + "█" + BLUE + "██████████████████\n" +
                BLACK + "██████████████████████" + WHITE + "█" + BLUE + "████████" + CYAN + "███" + BLUE + "██" + CYAN + "██" + BLUE + "██\n" +
                BLACK + "██████████████████████" + YELLOW + "█" + BLUE + "███" + CYAN + "██" + BLUE + "████████████\n" +
                BLACK + "███████████████████████" + WHITE + "█" + BLUE + "████████████████\n" +
                BLACK + "████████████████████████" + WHITE + "█" + BLUE + "██████" + CYAN + "█" + BLUE + "███" + CYAN + "█" + BLUE + "████\n" +
                BLACK + "████████████████████████" + YELLOW + "█" + BLUE + "███████████████\n"
        );
        System.out.println();
    }
}

