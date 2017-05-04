package com.company.bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class DetectiveFacade implements Detective {
    @Override
    public List<String> getDossier(int userId) {
        BasicSocialWeb fbSocialWeb = new FBSocialWeb();
        BasicSocialWeb vkSocialWeb = new VKSocialWeb();
        ExtendedSocialWeb extendedSocialWebFB = new ExtendedSocialWebAdapter(fbSocialWeb);
        ExtendedSocialWeb extendedSocialWebVK = new ExtendedSocialWebAdapter(vkSocialWeb);

        return Arrays.asList(
                extendedSocialWebFB.getHistory(1, "01.01.1900"),
                extendedSocialWebVK.getHistory(1, "01.01.1900"));

    }
}
