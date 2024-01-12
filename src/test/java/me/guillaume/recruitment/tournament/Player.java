package me.guillaume.recruitment.tournament;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    private int hp;
    private int dmg;

    public List<Item> items = new ArrayList<>();

    public Player(int hp, int dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }

    public int hitPoints() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public boolean hasAxe() {
        for(Item item : items) {
            if(item.getName().equals("axe")) {
                return true;
            }
        }
        return false;
    }

    public boolean checkButcher(Player player) {

        for (Item item : items) {
            System.out.println(item.isJustUsed());
            if(!item.isJustUsed()) {

                item.setUsed(true);
                if(player.hasAxe()) {
                    item.setCount(item.getCount() - 1);
                    if(item.getCount() == 0) {
                        items.remove(item);
                    }
                }


                return true;

            } else {
                item.setUsed(false);
            }
        }
        return false;
    }

    public void minusHp(int hp, Player player) {
        if(!checkButcher(player)) {
            if(this.hitPoints() >= hp) {
                this.setHp(this.hitPoints() - hp);
            } else {
                this.setHp(0);
            }
            System.out.println(this.hitPoints());

        }
    }

    public boolean isDead() {
        return this.hitPoints() == 0;
    }

    public void engage(Player player) {
        while(this.hitPoints() != 0 && player.hitPoints() != 0) {
            player.minusHp(this.getDmg(), this);
            if(!player.isDead()) {
                this.minusHp(player.getDmg(), player);
            }
        }
    }

}
