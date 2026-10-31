package p;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class m69 {
    public static final ouz a = new ouz(wf10.a());

    public static l69 a(String str, Bundle bundle, ylq0 ylq0Var, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str.equals(b680.c.a())) {
            Map map = ylq0.b;
            cev0.r("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)), bundle, ylq0Var);
            cev0.r("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"), bundle, ylq0Var);
            cev0.r("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"), bundle, ylq0Var);
            String strOptString = jSONObject2.optString("introductoryPriceCycles");
            if (strOptString.length() > 0) {
                cev0.r("fb_intro_price_cycles", strOptString, bundle, ylq0Var);
            }
            String strOptString2 = jSONObject2.optString("introductoryPricePeriod");
            if (strOptString2.length() > 0) {
                cev0.r("fb_intro_period", strOptString2, bundle, ylq0Var);
            }
            String strOptString3 = jSONObject2.optString("introductoryPriceAmountMicros");
            if (strOptString3.length() > 0) {
                cev0.r("fb_intro_price_amount_micros", strOptString3, bundle, ylq0Var);
            }
        }
        return new l69(new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle, ylq0Var);
    }

    public static ArrayList b(String str, Bundle bundle, ylq0 ylq0Var, JSONObject jSONObject) throws JSONException {
        if (!str.equals(b680.c.a())) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject2 == null) {
                return null;
            }
            return p7h.O(new l69[]{new l69(new BigDecimal(jSONObject2.getLong("priceAmountMicros") / 1000000.0d), Currency.getInstance(jSONObject2.getString("priceCurrencyCode")), bundle, ylq0Var)});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject3 = jSONObject.getJSONArray("subscriptionOfferDetails").getJSONObject(i);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            ylq0 ylq0VarB = ylq0Var.b();
            String string = jSONObject3.getString("basePlanId");
            Map map = ylq0.b;
            cev0.r("fb_iap_base_plan", string, bundle2, ylq0VarB);
            JSONArray jSONArray2 = jSONObject3.getJSONArray("pricingPhases");
            JSONObject jSONObject4 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            cev0.r("fb_iap_subs_period", jSONObject4.optString("billingPeriod"), bundle2, ylq0VarB);
            if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                cev0.r("fb_iap_subs_auto_renewing", "false", bundle2, ylq0VarB);
            } else {
                cev0.r("fb_iap_subs_auto_renewing", "true", bundle2, ylq0VarB);
            }
            arrayList.add(new l69(new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d), Currency.getInstance(jSONObject4.getString("priceCurrencyCode")), bundle2, ylq0VarB));
        }
        return arrayList;
    }

    public static final boolean c() {
        c120 c120VarB = g120.b(wf10.b());
        return c120VarB != null && wgi1.c() && c120VarB.f;
    }

    public static final void d(int i, String str, String str2, boolean z, boolean z2) {
        ArrayList<l69> arrayListO;
        String str3;
        String str4;
        if (c()) {
            HashMap map = new HashMap();
            Bundle bundleC = null;
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = new JSONObject(str2);
                Bundle bundle = new Bundle(1);
                ylq0 ylq0Var = new ylq0();
                if (i != 0) {
                    cev0.r("fb_iap_sdk_supported_library_versions", kx40.c(i), bundle, ylq0Var);
                }
                cev0.r("fb_iap_product_id", jSONObject.getString("productId"), bundle, ylq0Var);
                cev0.r("fb_content_id", jSONObject.getString("productId"), bundle, ylq0Var);
                cev0.r("android_dynamic_ads_content_id", "client_implicit", bundle, ylq0Var);
                cev0.r("fb_iap_purchase_time", jSONObject.getString("purchaseTime"), bundle, ylq0Var);
                cev0.r("fb_iap_purchase_token", jSONObject.getString("purchaseToken"), bundle, ylq0Var);
                cev0.r("fb_iap_package_name", jSONObject.optString("packageName"), bundle, ylq0Var);
                cev0.r("fb_iap_product_title", jSONObject2.optString("title"), bundle, ylq0Var);
                cev0.r("fb_iap_product_description", jSONObject2.optString("description"), bundle, ylq0Var);
                String strOptString = jSONObject2.optString("type");
                cev0.r("fb_iap_product_type", strOptString, bundle, ylq0Var);
                z580 z580Var = z580.a;
                if (dhn.a.contains(z580.class)) {
                    str4 = null;
                } else {
                    try {
                        str4 = z580.d;
                    } catch (Throwable th) {
                        dhn.a(z580.class, th);
                        str4 = null;
                    }
                }
                if (str4 != null) {
                    Map map2 = ylq0.b;
                    cev0.r("fb_iap_client_library_version", str4, bundle, ylq0Var);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str5 = (String) entry.getKey();
                    String str6 = (String) entry.getValue();
                    Map map3 = ylq0.b;
                    cev0.r(str5, str6, bundle, ylq0Var);
                }
                arrayListO = jSONObject2.has("price_amount_micros") ? p7h.O(new l69[]{a(strOptString, bundle, ylq0Var, jSONObject, jSONObject2)}) : (jSONObject2.has("subscriptionOfferDetails") || jSONObject2.has("oneTimePurchaseOfferDetails")) ? b(strOptString, bundle, ylq0Var, jSONObject2) : null;
            } catch (JSONException | Exception unused) {
            }
            if (arrayListO == null || arrayListO.isEmpty()) {
                return;
            }
            if (!z || !b120.b("app_events_if_auto_log_subs", wf10.b(), false)) {
                str3 = z2 ? "fb_mobile_purchase_restored" : "fb_mobile_purchase";
            } else if (z2) {
                str3 = "SubscriptionRestore";
            } else {
                str3 = x580.a.h(str2) ? "StartTrial" : "Subscribe";
            }
            String str7 = str3;
            if (z && mn10.b(kn10.AndroidManualImplicitSubsDedupe)) {
                synchronized (m69.class) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (l69 l69Var : arrayListO) {
                            arrayList.add(new k580(str7, l69Var.d().doubleValue(), l69Var.a()));
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayListO, 10));
                        for (l69 l69Var2 : arrayListO) {
                            arrayList2.add(new mmr0(l69Var2.c(), l69Var2.b()));
                        }
                        bundleC = z580.c(arrayList, jCurrentTimeMillis, true, arrayList2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (!z && mn10.b(kn10.AndroidManualImplicitPurchaseDedupe)) {
                synchronized (m69.class) {
                    l69 l69Var3 = (l69) arrayListO.get(0);
                    bundleC = z580.c(k4p1.x(new k580("fb_mobile_purchase", l69Var3.d().doubleValue(), l69Var3.a())), System.currentTimeMillis(), true, k4p1.x(new mmr0(l69Var3.c(), l69Var3.b())));
                }
            }
            List list = w580.a;
            w580.a(bundleC, ((l69) arrayListO.get(0)).c(), ((l69) arrayListO.get(0)).b());
            if (str7.equals("fb_mobile_purchase")) {
                a.r(((l69) arrayListO.get(0)).d(), ((l69) arrayListO.get(0)).a(), ((l69) arrayListO.get(0)).c(), ((l69) arrayListO.get(0)).b());
            } else {
                a.q(str7, ((l69) arrayListO.get(0)).d(), ((l69) arrayListO.get(0)).a(), ((l69) arrayListO.get(0)).c(), ((l69) arrayListO.get(0)).b());
            }
        }
    }
}
