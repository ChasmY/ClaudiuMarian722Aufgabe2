package View;


import Controller.Controller;
import Model.Speisen;
import Model.Zutat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    Controller controller = new Controller();

    Zutat zutat = new Zutat(0, "", 0);

    public void start(){
        System.out.println("--- MENU ---");
        System.out.println("Here are your options:");
        System.out.println("1 - Show all the dishes and ingredients");
        System.out.println("2 - Add a new dish with an ingredient");
        System.out.println("3 - Show the dishes with a specific ingredient");
        System.out.println("4 - Show the dishes sorted by price");
        System.out.println("0 - Exit the program");

        Scanner console = new Scanner(System.in);
        while(console.hasNextInt()){
            int c = console.nextInt();
            if (c == 1){
                controller.speisenRepo.printAll();
                start();
            }
            if (c == 2){
                Speisen stadt = new Speisen(1, "speise1");
                Speisen stadt1 = new Speisen(2, "speise2");


                Zutat zutat1 = new Zutat(20,"zutat1",3);
                Zutat zutat2 = new Zutat(23,"zutat2", 5);
                Zutat zutat3 = new Zutat(5, "zutat3", 2);
                List<Zutat> zutats = new ArrayList<>();
                zutats.add(zutat1);
                zutats.add(zutat2);
                zutats.add(zutat3);

                controller.insert(stadt,zutats);
                controller.insert(stadt1, zutats);
                controller.speisenRepo.printAll();

                Zutat zutat4 = new Zutat(25, "zutat4", 5);
                List<Zutat> zutats1 = new ArrayList<>();
                zutats1.add(zutat4);

                controller.insert(stadt, zutats1);
                controller.speisenRepo.printAll();
                start();
            }
            if(c == 3){
                Scanner console3 = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String str= console3.nextLine();
            }
            if(c == 4){
                System.out.println("1 - Show dishes ascending");
                System.out.println("2 - Show dishes descending");
                Scanner console4 = new Scanner(System.in);
                while(console4.hasNextInt()){
                    int c4 = console4.nextInt();

                    if (c4 == 1) {
                    }
                    if(c4 == 2){

                    }
                }
            }
            if(c == 0){
                System.exit(0);
            }
        }
    }
}
