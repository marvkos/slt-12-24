package at.technikum;

import java.util.Locale;

public class Main {
        public static void main(String[] args) {
        GreetingTranslator greetingTranslator = new GreetingTranslator();

        String greeting = greetingTranslator
                .getGreeting(Locale.FRANCE);
        greeting += " Technikum!!!";

        System.out.println(greeting);
    }
}
