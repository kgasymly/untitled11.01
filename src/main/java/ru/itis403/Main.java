package ru.itis403;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("(J|j)ava", "Java"));
    }
}