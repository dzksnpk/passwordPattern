package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern password = Pattern.compile("(password:?\\s*)(\\w+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = password.matcher(text);

        if (!matcher.find()) {
            System.out.println("No passwords found.");
        } else {
            do {
                System.out.println(matcher.group(2));
            } while (matcher.find());
        }
    }
}

