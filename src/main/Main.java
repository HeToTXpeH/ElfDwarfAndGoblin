package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person arr[] = new Person[3];
        arr[0] = new Dwarf();
        arr[1] = new Elf();
        arr[2] = new Goblin();

        try {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.println("Question to the first person: Who is on the (write right or left)");
                String text = scanner.nextLine();
                if (text.equals("right"))
                    System.out.println("At right is " + arr[i].getPerson(arr[(i + 1) % 3]));
                else if (text.equals("left"))
                    System.out.println("At left is " + arr[i].getPerson(arr[(i + 2) % 3]));
                else
                    throw new ElfException("Input error");
            }
            boolean a = true;
            for (int i = 0; i < 3; i++) {
                System.out.println("Who is? If its Elf print E if Goblin print G if Dwarf print D");
                String text = scanner.nextLine();
                if (!(text.equals(arr[i].WhoIs()))) {
                    a = false;
                    break;
                }
            }
            if (a)
                System.out.println("U win!");
            else
                System.out.println("U lost");
        }
        catch (ElfException a) {
            System.out.println(a.toString());
        }
    }
}
