package com.example.floridamangui;
import java.util.HashMap;

public class HeadlineBank {
    public static HashMap<Integer,Headline> myHeadlines = new HashMap<>();

    public static void generateHeadlines() {
        Headline h1 = new Headline("FLORIDA MAN GETS BEAT UP BY ...","The easter bunny","The police","Ronald McDonald","5 lower school kids");
        myHeadlines.put(h1.getId(),h1);
        Headline h2 = new Headline("FLORIDA MAN CLINGS TO ... SPEEDING DOWN HIGHWAY", "Semitruck", "Car", "Motorcycle", "Ambulance");
        myHeadlines.put(h2.getId(), h2);
        Headline h3 = new Headline("FLORIDA MAN TRIES TO SHOOT ..., ... SHOOTS HIM INSTEAD", "Puppy, puppy", "Old lady, old lady", "Alligator, alligator", "Obama, Obama");
        myHeadlines.put(h3.getId(), h3);
        Headline h4 = new Headline("FLORIDA MAN USES 4 MILLION IN COVID RELIEF TO BUY ...", "Lamborghini", "A dog", "Illegal animals", "Lifetime supply of whey protein");
        myHeadlines.put(h4.getId(), h4);
        Headline h5 = new Headline("NAKED FLORIDA MAN DRINKS 2 LITERS OF ..., BURNS DOWN HOUSE BAKING ... ON GEORGE FOREMAN GRILL", "Vodka, cookies", "Rum, cookies", "Beer, cake", "Water, cake");
        myHeadlines.put(h5.getId(), h5);
        Headline h6 = new Headline("NAKED FLORIDA MAN THROWS ... AT CARS", "Rocks", "Bricks", "Computers", "Random Nokia phones");
        myHeadlines.put(h6.getId(), h6);
        Headline h7 = new Headline("FLORIDA MAN CHARGED WITH ASSAULT WITH A DEADLY WEAPON AFTER THROWING ... THROUGH WENDY'S DRIVE-THRU WINDOW", "Alligator", "Granede", "A rock", "Bluetooth speakers blasting Spongebob's theme song");
        myHeadlines.put(h7.getId(), h7);
        Headline h8 = new Headline("FLORIDA MAN STEALS A CAR, REALIZES A ... IS IN IT, DROPS ... OFF SAFELY, AND MAKES HIS GET AWAY", "Baby", "Dog", "Cat", "Land mine");
        myHeadlines.put(h8.getId(), h8);
        Headline h9 = new Headline("THOUSANDS OF GUN OWNERS IN FLORIDA PLANNING TO 'SHOOT DOWN' ...", "Hurricane irma", "Big bird", "Barney the dinosaur", "Wild turkey");
        myHeadlines.put(h9.getId(), h9);
        Headline h10 = new Headline("FLORIDA MAN TRIES TO STEAL GAMESTOP WHILE WEARING ... ON HIS HEAD", "Transparent bag", "The queen's guard hat", "Pink beret", "A defective mask");
        myHeadlines.put(h10.getId(), h10);
    }


    public static boolean outOfQuestions(int i) {
        if(i < myHeadlines.size()) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void headlines(Integer id, String story, String answer, String incorrect1, String incorrect2, String incorrect3)
        {

        HashMap<String, Object> storyObjects = new HashMap<String, Object>();



            //OVERRIDE EQUALS AND HASHCODE
    }
    public static Headline headlineManager{

            Object h = new Object();
    }
}
