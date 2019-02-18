package com.stackroute.practice3;

public class removeVowel {

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
                places[i] = places[i].replaceAll("A|E|I|O|U|a|e|i|o|u","");
                }
        }
        return places;
    }
}
