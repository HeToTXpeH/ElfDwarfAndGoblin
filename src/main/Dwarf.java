package main;

public class Dwarf extends Person{

    @Override
    public String getPerson(Person a) {
        if (Elf.class.isInstance(a)) {
            return "Elf";
        }
        else {
            return "Goblin";
        }
    }

    @Override
    public String WhoIs() {
        return "D";
    }
}
