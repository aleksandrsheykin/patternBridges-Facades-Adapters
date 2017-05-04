package com.company.bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class PostgreDB implements DB {

    @Override
    public List<String> getListAllFriends() {
        return Arrays.asList("Misha", "Vasya", "Kolya");
    }

    @Override
    public int getMoney() {
        return 150;
    }

    @Override
    public List<String> getWall() {
        return Arrays.asList("story1", "kukichiki", "SoundLandPub");
    }
}
