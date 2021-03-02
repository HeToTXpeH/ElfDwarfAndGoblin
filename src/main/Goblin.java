package main;

public class Goblin extends Person{

    @Override
    public String getPerson(Person a) {
        if (Elf.class.isInstance(a)) {
            return "Dwarf";
        }
        else {
            return "Elf";
        }
    }

    @Override
    public String WhoIs() {
        return "G";
    }
}
