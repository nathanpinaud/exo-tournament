package me.guillaume.recruitment.tournament;

public class Swordsman extends Player {

    public Swordsman() {
        super(100,5);
        items.add(new Item("sword"));
    }

    public Swordsman equip(String name) {
        this.items.add(new Item(name));
        return this;
    }


}
