/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adj = input.nextLine();
        System.out.print("Enter an adverb: ");
        String adv = input.nextLine();
        System.out.println("I heard he " + verb+" and enjoys "+noun+" company, specially when they are "+adj+" and "+adv);


    }
}
/*
    PseudoCode
    Ask user for noun
    Get noun from user using standard input
    Ask user for verb
    get verb from user using standard input
    Ask user for adjective
    get adjective from user using standard input
    Ask user for adverb
    get adverb from user using standard input
    put all together to make simple story, print story in standard output

 */