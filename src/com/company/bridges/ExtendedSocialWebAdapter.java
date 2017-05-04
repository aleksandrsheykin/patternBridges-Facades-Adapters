package com.company.bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class ExtendedSocialWebAdapter implements ExtendedSocialWeb {
    private BasicSocialWeb basicSocialWeb;

    public ExtendedSocialWebAdapter(BasicSocialWeb basicSocialWeb) {
        this.basicSocialWeb = basicSocialWeb;
    }

    @Override
    public String getHistory(int userId, String date) {
        if (basicSocialWeb instanceof VKSocialWeb) {
            return new VKSocialWeb().getHistory();
        } else if (basicSocialWeb instanceof FBSocialWeb) {
            return new FBSocialWeb().getHistory("12.12.2015");
        }
        return null;
    }

    @Override
    public List<Integer> getLikes(int userId, boolean showNegative, int messageId) {
        if (basicSocialWeb instanceof VKSocialWeb) {
            return new VKSocialWeb().getLikes(12, false, 43);
        } else if (basicSocialWeb instanceof FBSocialWeb) {
            return new FBSocialWeb().getLikes(44, true, 231);
        }
        return null;
    }

    @Override
    public List<Integer> getPaysHistory(int userId) {
        return Arrays.asList(150, 200, 320, 500);
    }
}
