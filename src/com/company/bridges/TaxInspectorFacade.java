package com.company.bridges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class TaxInspectorFacade implements TaxInspector {

    @Override
    public List<Integer> getPayHistory() {
        BasicSocialWeb fbSocialWeb = new FBSocialWeb();
        BasicSocialWeb vkSocialWeb = new VKSocialWeb();
        ExtendedSocialWeb extendedSocialWebFB = new ExtendedSocialWebAdapter(fbSocialWeb);
        ExtendedSocialWeb extendedSocialWebVK = new ExtendedSocialWebAdapter(vkSocialWeb);

        List<Integer> r = new ArrayList<>();
        r.addAll(extendedSocialWebFB.getPaysHistory(1));
        r.addAll(extendedSocialWebVK.getPaysHistory(1));
        return r;

    }

}
