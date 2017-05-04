package com.company.bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class FBSocialWeb extends BasicSocialWeb {

    String getHistory(String date) {
        return "FB history lalalalala";
    }

    public List<Integer> getLikes(int userId, boolean showNegatives, int messageId) {
        return Arrays.asList(1, 2, 2, 2, 2);
    }
}
