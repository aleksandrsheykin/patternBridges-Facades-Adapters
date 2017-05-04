package com.company.bridges;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class BasicSocialWeb implements SocialWeb {

    private DB db = new OracleDB();

    private List<String> friends = new ArrayList<>();
    {
        friends.add("Oksana");
        friends.add("Stas");
        friends.add("Ivan");
        friends.add("Kirill");
    }
    private int money = 0;

    @Override
    public List<String> getFriends() {
        return db.getListAllFriends();
    }

    @Override
    public void pay(int value) {
        money += db.getMoney() + value;
        System.out.println("pay");
    }

    @Override
    public void getWall() {
        System.out.println("wall");
    }
}
