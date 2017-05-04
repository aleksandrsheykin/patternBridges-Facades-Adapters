package com.company.bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class VKSocialWeb extends BasicSocialWeb {

    public String getHistory() {
        return "vk history, ahaha loool";
    }

    public List<Integer> getLikes(int userId, boolean showNegatives, int messageId) {
        return Arrays.asList(1, 2, 3, 3, 4);
    }
}
