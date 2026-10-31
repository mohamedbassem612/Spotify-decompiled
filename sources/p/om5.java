package p;

import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class om5 {
    public static final Map a = sqg0.J(new mmr0[]{new mmr0(im5.ANON_ID, new nm5(1, 1)), new mmr0(im5.APP_USER_ID, new nm5(1, 2)), new mmr0(im5.ADVERTISER_ID, new nm5(1, 3)), new mmr0(im5.PAGE_ID, new nm5(1, 4)), new mmr0(im5.PAGE_SCOPED_USER_ID, new nm5(1, 5)), new mmr0(im5.ADV_TE, new nm5(2, 7)), new mmr0(im5.APP_TE, new nm5(2, 8)), new mmr0(im5.CONSIDER_VIEWS, new nm5(2, 9)), new mmr0(im5.DEVICE_TOKEN, new nm5(2, 10)), new mmr0(im5.EXT_INFO, new nm5(2, 11)), new mmr0(im5.INCLUDE_DWELL_DATA, new nm5(2, 12)), new mmr0(im5.INCLUDE_VIDEO_DATA, new nm5(2, 13)), new mmr0(im5.INSTALL_REFERRER, new nm5(2, 14)), new mmr0(im5.INSTALLER_PACKAGE, new nm5(2, 15)), new mmr0(im5.RECEIPT_DATA, new nm5(2, 16)), new mmr0(im5.URL_SCHEMES, new nm5(2, 17)), new mmr0(im5.USER_DATA, new nm5(1, 0))});
    public static final Map b = sqg0.J(new mmr0[]{new mmr0(bqo.EVENT_TIME, new mm5(0, 2)), new mmr0(bqo.EVENT_NAME, new mm5(0, 3)), new mmr0(bqo.VALUE_TO_SUM, new mm5(3, 1)), new mmr0(bqo.CONTENT_IDS, new mm5(3, 4)), new mmr0(bqo.CONTENTS, new mm5(3, 5)), new mmr0(bqo.CONTENT_TYPE, new mm5(3, 6)), new mmr0(bqo.CURRENCY, new mm5(3, 17)), new mmr0(bqo.DESCRIPTION, new mm5(3, 7)), new mmr0(bqo.LEVEL, new mm5(3, 8)), new mmr0(bqo.MAX_RATING_VALUE, new mm5(3, 9)), new mmr0(bqo.NUM_ITEMS, new mm5(3, 10)), new mmr0(bqo.PAYMENT_INFO_AVAILABLE, new mm5(3, 11)), new mmr0(bqo.REGISTRATION_METHOD, new mm5(3, 12)), new mmr0(bqo.SEARCH_STRING, new mm5(3, 13)), new mmr0(bqo.SUCCESS, new mm5(3, 14)), new mmr0(bqo.ORDER_ID, new mm5(3, 15)), new mmr0(bqo.AD_TYPE, new mm5(3, 16))});
    public static final Map c = sqg0.J(new mmr0[]{new mmr0("fb_mobile_achievement_unlocked", o2n.UNLOCKED_ACHIEVEMENT), new mmr0("fb_mobile_activate_app", o2n.ACTIVATED_APP), new mmr0("fb_mobile_add_payment_info", o2n.ADDED_PAYMENT_INFO), new mmr0("fb_mobile_add_to_cart", o2n.ADDED_TO_CART), new mmr0("fb_mobile_add_to_wishlist", o2n.ADDED_TO_WISHLIST), new mmr0("fb_mobile_complete_registration", o2n.COMPLETED_REGISTRATION), new mmr0("fb_mobile_content_view", o2n.VIEWED_CONTENT), new mmr0("fb_mobile_initiated_checkout", o2n.INITIATED_CHECKOUT), new mmr0("fb_mobile_level_achieved", o2n.ACHIEVED_LEVEL), new mmr0("fb_mobile_purchase", o2n.PURCHASED), new mmr0("fb_mobile_rate", o2n.RATED), new mmr0("fb_mobile_search", o2n.SEARCHED), new mmr0("fb_mobile_spent_credits", o2n.SPENT_CREDITS), new mmr0("fb_mobile_tutorial_completion", o2n.COMPLETED_TUTORIAL)});

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.HashMap] */
    public static final Object a(Object obj, String str) {
        int i;
        if (str.equals("extInfo") || str.equals("url_schemes") || str.equals("fb_content_id") || str.equals("fb_content") || str.equals("data_processing_options")) {
            i = 1;
        } else if (str.equals("advertiser_tracking_enabled") || str.equals("application_tracking_enabled")) {
            i = 2;
        } else {
            i = str.equals("_logTime") ? 3 : 0;
        }
        String str2 = obj instanceof String ? (String) obj : null;
        if (i == 0 || str2 == null) {
            return obj;
        }
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC != 1) {
                if (iC == 2) {
                    return nhc1.c0(obj.toString());
                }
                eg.o();
                return null;
            }
            Integer numC0 = nhc1.c0(str2.toString());
            if (numC0 != null) {
                return Boolean.valueOf(numC0.intValue() != 0);
            }
            return null;
        }
        try {
            ArrayList<??> arrayListF = fpi1.f(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            for (?? F : arrayListF) {
                try {
                    try {
                        F = fpi1.g(new JSONObject((String) F));
                    } catch (JSONException unused) {
                        F = fpi1.f(new JSONArray((String) F));
                    }
                } catch (JSONException unused2) {
                }
                arrayList.add(F);
            }
            return arrayList;
        } catch (JSONException unused3) {
            fza fzaVar = oue0.a;
            synchronized (wf10.b) {
                return rih1.a;
            }
        }
    }
}
