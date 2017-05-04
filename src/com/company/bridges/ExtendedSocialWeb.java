package com.company.bridges;

import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public interface ExtendedSocialWeb {
    String getHistory(int userId, String date);
    List<Integer> getLikes(int userId, boolean showNegative, int messageId);
    List<Integer> getPaysHistory(int userId);
}
