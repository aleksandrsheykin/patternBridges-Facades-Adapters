package com.company.bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class OracleDB implements DB {
    @Override
    public List<String> getListAllFriends() {
        return Arrays.asList("Anna", "Olesya", "Dasha");
    }

    @Override
    public int getMoney() {
        return 150;
    }

    @Override
    public List<String> getWall() {
        return Arrays.asList("story3", "Vasya privet", "Music");
    }
}
