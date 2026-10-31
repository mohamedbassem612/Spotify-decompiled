package p;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vxq0 {
    public static final vxq0 a = new vxq0();
    public static boolean b;
    public static boolean c;
    public static CustomAudienceManager d;
    public static m550 e;
    public static String f;

    static {
        "Fledge: ".concat(vxq0.class.getSimpleName());
    }

    public static final void a() {
        String string;
        if (dhn.a.contains(vxq0.class)) {
            return;
        }
        try {
            c = true;
            Context contextA = wf10.a();
            e = new m550(contextA);
            f = "https://www." + wf10.s + "/privacy_sandbox/pa/logic";
            try {
                CustomAudienceManager customAudienceManager = CustomAudienceManager.get(contextA);
                d = customAudienceManager;
                if (customAudienceManager != null) {
                    b = true;
                }
                string = null;
            } catch (Error e2) {
                string = e2.toString();
                e2.toString();
            } catch (Exception e3) {
                string = e3.toString();
                e3.toString();
            }
            if (b) {
                return;
            }
            m550 m550Var = e;
            if (m550Var == null) {
                u890.C("gpsDebugLogger");
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            m550Var.a(bundle, "gps_pa_failed");
        } catch (Throwable th) {
            dhn.a(vxq0.class, th);
        }
    }

    public final void b(String str, String str2) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            String strC = c(str, str2);
            if (strC == null) {
                return;
            }
            try {
                k550 k550Var = new k550((byte) 1);
                AdData.Builder builder = new AdData.Builder();
                String str3 = f;
                if (str3 == null) {
                    u890.C("baseUri");
                    throw null;
                }
                AdData adDataBuild = builder.setRenderUri(Uri.parse(str3.concat("/ad"))).setMetadata("{'isRealAd': false}").build();
                TrustedBiddingData.Builder builder2 = new TrustedBiddingData.Builder();
                String str4 = f;
                if (str4 == null) {
                    u890.C("baseUri");
                    throw null;
                }
                TrustedBiddingData trustedBiddingDataBuild = builder2.setTrustedBiddingUri(Uri.parse(str4.concat("?trusted_bidding"))).setTrustedBiddingKeys(Collections.singletonList("")).build();
                CustomAudience.Builder buyer = new CustomAudience.Builder().setName(strC).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb = new StringBuilder();
                String str5 = f;
                if (str5 == null) {
                    u890.C("baseUri");
                    throw null;
                }
                sb.append(str5);
                sb.append("?daily&app_id=");
                sb.append(str);
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(Uri.parse(sb.toString()));
                String str6 = f;
                if (str6 == null) {
                    u890.C("baseUri");
                    throw null;
                }
                JoinCustomAudienceRequest joinCustomAudienceRequestBuild = new JoinCustomAudienceRequest.Builder().setCustomAudience(dailyUpdateUri.setBiddingLogicUri(Uri.parse(str6.concat("?bidding"))).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString("{}")).setAds(Collections.singletonList(adDataBuild)).build()).build();
                CustomAudienceManager customAudienceManager = d;
                if (customAudienceManager != null) {
                    customAudienceManager.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), k550Var);
                }
            } catch (Error e2) {
                e2.toString();
                m550 m550Var = e;
                if (m550Var == null) {
                    u890.C("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e2.toString());
                m550Var.a(bundle, "gps_pa_failed");
            } catch (Exception e3) {
                e3.toString();
                m550 m550Var2 = e;
                if (m550Var2 == null) {
                    u890.C("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e3.toString());
                m550Var2.a(bundle2, "gps_pa_failed");
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final String c(String str, String str2) {
        if (!dhn.a.contains(this) && str2 != null) {
            try {
                if (!str2.equals("_removed_") && !ihc1.h0(str2, "gps", false)) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / 1000) + "@1";
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return null;
            }
        }
        return null;
    }
}
