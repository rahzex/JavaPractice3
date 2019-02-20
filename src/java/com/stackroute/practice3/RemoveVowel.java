package com.stackroute.practice3;

//     4. Write a program to set up an array of places, Loop round and remove the vowels. Display the new
//        words in console

public class RemoveVowel {
    //method to Remove vowels from a string
    static String[] remove(String[] places){
        for(int i=0; i<places.length; i++){
            if(places[i].contains("I")
                    || places[i].contains("E")
                    || places[i].contains("A")
                    || places[i].contains("O")
                    || places[i].contains("U")
                    || places[i].contains("a")
                    || places[i].contains("e")
                    || places[i].contains("i")
                    || places[i].contains("o")
                    || places[i].contains("u")){
                places[i] = places[i].replaceAll("A|E|I|O|U|a|e|i|o|u",""); //replacing all the vowels
                }
        }
        return places;
    }
}
