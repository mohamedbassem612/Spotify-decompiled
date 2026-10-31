package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b3g1 {
    public boolean a;

    public final void a(Context context, boolean z) {
        i1k0.B("disableTracking context: " + context + " disableTracking: " + z + " callback: null");
        if (this.a == z) {
            return;
        }
        this.a = z;
        ((SharedPreferences.Editor) ne.z(context).b).putBoolean("bnc_tracking_state", z).apply();
        if (!z) {
            i1k0.B("Tracking enabled. Registering app init");
            l3c t8e1Var = new t8e1((byte) 5);
            i1k0.B("onTrackingEnabled callback: " + t8e1Var);
            n3c n3cVarH = n3c.h();
            if (n3cVarH != null) {
                n3cVarH.p(n3cVarH.g(t8e1Var, true), false);
                return;
            }
            return;
        }
        i1k0.B("Tracking disabled. Clearing all pending requests");
        n3c.h().f.d();
        ne neVarZ = ne.z(context);
        neVarZ.Z("bnc_session_id", "bnc_no_value");
        neVarZ.U("bnc_no_value");
        neVarZ.V("bnc_no_value");
        neVarZ.Z("bnc_app_link", "bnc_no_value");
        neVarZ.Z("bnc_install_referrer", "bnc_no_value");
        neVarZ.Z("bnc_google_play_install_referrer_extras", "bnc_no_value");
        if (!TextUtils.isEmpty("bnc_no_value")) {
            neVarZ.Z("bnc_app_store_source", "bnc_no_value");
        }
        neVarZ.Z("bnc_google_search_install_identifier", "bnc_no_value");
        neVarZ.T("bnc_no_value");
        neVarZ.Z("bnc_external_intent_uri", "bnc_no_value");
        neVarZ.Z("bnc_external_intent_extra", "bnc_no_value");
        neVarZ.Y("bnc_no_value");
        neVarZ.Z("bnc_anon_id", "bnc_no_value");
        neVarZ.X(new JSONObject());
        ((w3c) n3c.h().b.e).a.clear();
    }
}
