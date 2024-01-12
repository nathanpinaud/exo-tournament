package me.guillaume.recruitment.tournament;

public class Viking extends Player{

    public Viking() {
        super(120,6);
        items.add(new Item("axe"));
    }

    public Viking equip(String name) {
        items.add(new Item(name));
        return this;
    }
}
