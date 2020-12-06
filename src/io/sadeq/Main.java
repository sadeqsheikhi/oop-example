package io.sadeq;

public class Main {

    public static void main(String[] args) {

        Office mainOffice = new Office("Sadeq");
        Section sectionA = new Section(1, "A");
        Section sectionB = new Section(1, "B");

        Reserve reserve1 = new Reserve("Marivan Wild Life Reserve", "Marivan", mainOffice);
        reserve1.addSection(sectionA);
        reserve1.addSection(sectionB);

        String officeManager = reserve1.getMainOffice().getOfficeManager();
        System.out.println(officeManager);
        reserve1.printSections();


        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");



        // populating the reserve
        Lion kingLion = new Lion("King", 550, 2010, "male", sectionA);
        Lion lion1 = new Lion("Lion 1", 500, 2012, "female", sectionA);
        Lion lion2 = new Lion("Lion 2", 500, 2008, "male", sectionA);
        Lion lion3 = new Lion("Lion 3", 500, 2009, "female", sectionA);

        Deer deer1 = new Deer("deer1", 300, 2015, "female", sectionA, "reindeer");

        Kangaroo kangaroo1 = new Kangaroo("kangaroo1", 400, 2018, "male", sectionB);


        // lion pack is created and members are recruited
        LionPack bigLionPack = new LionPack("Killer Crew", kingLion);

        bigLionPack.addMember(lion1);
        bigLionPack.addMember(lion2);
        bigLionPack.addMember(lion3);

        System.out.println("ALL MEMBERS OF THE PACK:");
        bigLionPack.printMembers();


        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");


        // big lion attacks deer
        kingLion.walk();
        deer1.walk();
        kingLion.attack(deer1);
        deer1.jump();
        kingLion.jump();
        kingLion.eat();
        System.out.println(kingLion.getName() + " eats poor deer");


        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");


        // lion2 attacks kangaroo but he escapes
        lion2.walk();
        kangaroo1.walk();
        lion2.attack(kangaroo1);
        lion2.jump();
        kangaroo1.jump();
        lion2.jump();
        kangaroo1.jump("rock");
        System.out.println(kangaroo1.getName() + " escapes the lion");
    }
}
