package com.company;

import com.company.bridges.*;

public class Main {

    public static void main(String[] args) {
        BasicSocialWeb faceBookSocialWeb = new FBSocialWeb();
        BasicSocialWeb vkSocialWeb = new VKSocialWeb();
        ExtendedSocialWeb extendedSocialWeb1 = new ExtendedSocialWebAdapter(faceBookSocialWeb);
        ExtendedSocialWeb extendedSocialWeb2 = new ExtendedSocialWebAdapter(vkSocialWeb);

        System.out.println(extendedSocialWeb1.getHistory(1, "12.12.2015"));

        Detective detective = new DetectiveFacade();
        System.out.println(detective.getDossier(1));
        System.out.println(extendedSocialWeb1.getPaysHistory(1));

    }
}
