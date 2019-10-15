package org.fasttrackit;


public class App {
    public static void main(String[] args) {
    String result = censor ("Az uj Samsung monitorom nagyon szep, de a Samsung telefonom meg annal is sokkal szebb.", "Samsung", "***");
        System.out.println(result);
            if (result.contains("***"));
                 System.out.println("Ez itt nem a reklam helye!");
    }

    static String censor (String text, String toChange, String newWord){
        text = text.replaceAll(toChange, newWord);
                return text;
    }

}
