package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract /* synthetic */ class lzu0 {
    public static int[] _values() {
        return l1d.H(2);
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    public static int b(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "Animals & Pet Supplies";
            case 2:
                return "Apparel & Accessories";
            case 3:
                return "Arts & Entertainment";
            case 4:
                return "Baby & Toddler";
            case 5:
                return "Business & Industrial";
            case 6:
                return "Cameras & Optics";
            case 7:
                return "Electronics";
            case 8:
                return "Food, Beverages & Tobacco";
            case 9:
                return "Furniture";
            case 10:
                return "Hardware";
            case 11:
                return "Health & Beauty";
            case 12:
                return "Home & Garden";
            case 13:
                return "Luggage & Bags";
            case 14:
                return "Mature";
            case 15:
                return "Media";
            case 16:
                return "Office Supplies";
            case 17:
                return "Religious & Ceremonial";
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return "Software";
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return "Sporting Goods";
            case 20:
                return "Toys & Games";
            case 21:
                return "Vehicles & Parts";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "1d";
        }
        if (i == 2) {
            return "2d";
        }
        throw null;
    }

    public static /* synthetic */ void e(int i) {
        if (i != 0) {
            return;
        }
        bhn0.i("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void f(s3p s3pVar, k0v0 k0v0Var, String str, ArrayList arrayList) {
        arrayList.add(s3p.c(k0v0Var, str, s3pVar.b()));
    }

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return "NotSaved";
        }
        if (i == 2) {
            return "Saved";
        }
        if (i == 3) {
            return "Released";
        }
        throw null;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "AUDIO";
        }
        if (i == 2) {
            return "VIDEO";
        }
        if (i == 3) {
            return "NONE";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "ACTIVE";
        }
        if (i == 2) {
            return "INACTIVE";
        }
        throw null;
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "OPAQUE";
        }
        if (i == 2) {
            return "TRANSPARENT";
        }
        if (i == 3) {
            return "FADE";
        }
        throw null;
    }

    public static /* synthetic */ String k(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "INEXACT";
        }
        return "EXACT";
    }

    public static /* synthetic */ String l(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "SUBS";
        }
        return "INAPP";
    }

    public static /* synthetic */ int m(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("DEFAULT_ELIGIBILITY")) {
            return 1;
        }
        if (str.equals("INTRO")) {
            return 2;
        }
        if (str.equals("NONINTRO")) {
            return 3;
        }
        if (str.equals("WINBACK")) {
            return 4;
        }
        hhg1.n("No enum constant com.spotify.premiumdestination.destination.debug.PremiumPageEligibility.".concat(str));
        return 0;
    }

    public static /* synthetic */ int n(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("PROD")) {
            return 1;
        }
        if (str.equals("DEV")) {
            return 2;
        }
        if (str.equals("STAGING")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.premiumdestination.destination.debug.PremiumPageEnvironment.".concat(str));
        return 0;
    }

    public static /* synthetic */ int o(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("DEFAULT")) {
            return 1;
        }
        if (str.equals("PREPAID_TEMPLATE")) {
            return 2;
        }
        if (str.equals("GBB_CONTROL")) {
            return 3;
        }
        if (str.equals("GBB_REDESIGN_VARIANT_1_TRIAL")) {
            return 4;
        }
        if (str.equals("GBB_REDESIGN_VARIANT_2")) {
            return 5;
        }
        if (str.equals("PLAN_RECO_VARIANT_1")) {
            return 6;
        }
        if (str.equals("PLAN_RECO_VARIANT_2")) {
            return 7;
        }
        if (str.equals("FEATURE_CARDS_TRIAL_USER")) {
            return 8;
        }
        if (str.equals("FEATURE_CARDS_NON_TRIAL_USER")) {
            return 9;
        }
        if (str.equals("RTL_TEMPLATE")) {
            return 10;
        }
        if (str.equals("KOREA_TEMPLATE")) {
            return 11;
        }
        if (str.equals("NEW_COLORSETS_TEMPLATE")) {
            return 12;
        }
        if (str.equals("NEW_HERO_EXPERIMENT_VIDEO_US")) {
            return 13;
        }
        if (str.equals("NEW_HERO_EXPERIMENT_VIDEO_GENERIC")) {
            return 14;
        }
        if (str.equals("NEW_HERO_EXPERIMENT_STATIC_IMAGE")) {
            return 15;
        }
        if (str.equals("ERROR_STATE")) {
            return 16;
        }
        hhg1.n("No enum constant com.spotify.premiumdestination.destination.debug.PremiumPageLocalTemplate.".concat(str));
        return 0;
    }
}
