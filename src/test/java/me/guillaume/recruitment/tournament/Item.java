package me.guillaume.recruitment.tournament;

public class Item {

    private int count;
    private String name;

    private boolean justUsed;

    public Item(String item) {
        if(item.equals("buckler")) {
            this.name = item;
            this.count = 3;
        } else {
            this.name = item;
            this.count = 0;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public boolean isJustUsed() {
        return justUsed;
    }

    public void setUsed(boolean val) {
        this.justUsed = val;
    }

}
