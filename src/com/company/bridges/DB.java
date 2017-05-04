package com.company.bridges;

import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public interface DB {

    List<String> getListAllFriends();
    int getMoney();
    List<String> getWall();
}
