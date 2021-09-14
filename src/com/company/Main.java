/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 barhom alko
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string?");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ok = s.charAt(i);

        }

        System.out.println("\n"+s+" has "+s.length()+" characters.");
    }
    }

