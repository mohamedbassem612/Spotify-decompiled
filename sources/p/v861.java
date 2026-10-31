package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class v861 extends u861 {
    public l3c i;
    public final boolean j;

    public v861(Context context, int i, boolean z) {
        super(context, i);
        this.j = !z;
    }

    public static void n(n3c n3cVar) {
        l6p1.p(n3cVar.h);
        Context context = n3cVar.d;
        ptf1.h(context);
        ptf1.g(context);
        i1k0.B("onInitSessionCompleted on thread " + Thread.currentThread().getName());
    }

    @Override // p.u861
    public void g() {
        ne neVar = this.e;
        super.g();
        JSONObject jSONObject = this.c;
        try {
            String strF = neVar.F("bnc_app_link");
            if (!strF.equals("bnc_no_value")) {
                f4t f4tVar = f4t.RandomizedBundleToken;
                jSONObject.put("android_app_link_url", strF);
            }
            String strF2 = neVar.F("bnc_push_identifier");
            if (!strF2.equals("bnc_no_value")) {
                f4t f4tVar2 = f4t.RandomizedBundleToken;
                jSONObject.put("push_identifier", strF2);
            }
            String strF3 = neVar.F("bnc_external_intent_uri");
            if (!strF3.equals("bnc_no_value")) {
                f4t f4tVar3 = f4t.RandomizedBundleToken;
                jSONObject.put("external_intent_uri", strF3);
            }
            String strF4 = neVar.F("bnc_external_intent_extra");
            if (!strF4.equals("bnc_no_value")) {
                f4t f4tVar4 = f4t.RandomizedBundleToken;
                jSONObject.put("external_intent_extra", strF4);
            }
            String strF5 = neVar.F("bnc_initial_referrer");
            i1k0.B("getInitialReferrer " + strF5);
            if (!TextUtils.isEmpty(strF5) && !strF5.equals("bnc_no_value")) {
                f4t f4tVar5 = f4t.RandomizedBundleToken;
                jSONObject.put("initial_referrer", strF5);
            }
            String strF6 = neVar.F("bnc_enhanced_web_link_ux_used");
            long jA = neVar.A("bnc_url_load_ms");
            if (!TextUtils.isEmpty(strF6) && !"bnc_no_value".equals(strF6)) {
                JSONObject jSONObject2 = new JSONObject();
                f4t f4tVar6 = f4t.RandomizedBundleToken;
                jSONObject2.put("ux_type", strF6);
                jSONObject2.put("url_load_ms", jA);
                jSONObject.put("web_link_context", jSONObject2);
                neVar.Z("bnc_enhanced_web_link_ux_used", (String) null);
                neVar.W(0L, "bnc_url_load_ms");
            }
        } catch (JSONException e) {
            l1d.A(e, new StringBuilder("Caught JSONException "));
        }
        n3c.e(false);
    }

    @Override // p.u861
    public void h(b961 b961Var, n3c n3cVar) {
        int i;
        n3c n3cVarH = n3c.h();
        y861 y861Var = n3cVarH.f;
        if (y861Var == null) {
            return;
        }
        ne neVar = n3c.h().b;
        synchronized (y861.f) {
            i = 0;
            for (int i2 = 0; i2 < ((List) y861Var.b).size(); i2++) {
                try {
                    if (((List) y861Var.b).get(i2) instanceof v861) {
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        boolean z = i <= 1;
        i1k0.B("postInitClear " + neVar + " can clear init data " + z);
        if (neVar != null && z) {
            neVar.V("bnc_no_value");
            neVar.Z("bnc_google_search_install_identifier", "bnc_no_value");
            neVar.Z("bnc_google_play_install_referrer_extras", "bnc_no_value");
            neVar.Z("bnc_external_intent_uri", "bnc_no_value");
            neVar.Z("bnc_external_intent_extra", "bnc_no_value");
            neVar.Z("bnc_app_link", "bnc_no_value");
            neVar.Z("bnc_push_identifier", "bnc_no_value");
            neVar.Z("bnc_install_referrer", "bnc_no_value");
            ((SharedPreferences.Editor) neVar.b).putBoolean("bnc_is_full_app_conversion", false).apply();
            neVar.T("bnc_no_value");
            if (neVar.A("bnc_previous_update_time") == 0) {
                neVar.W(neVar.A("bnc_last_known_update_time"), "bnc_previous_update_time");
            }
        }
        n3cVarH.f.r(t861.a);
        n3cVarH.f.p("unlockSDKInitWaitLock");
    }

    @Override // p.u861
    public final boolean i() {
        JSONObject jSONObject = this.c;
        f4t f4tVar = f4t.RandomizedBundleToken;
        if (!jSONObject.has("android_app_link_url") && !jSONObject.has("push_identifier") && !jSONObject.has("link_identifier")) {
            return false;
        }
        jSONObject.remove("randomized_device_token");
        jSONObject.remove("randomized_bundle_token");
        jSONObject.remove("external_intent_extra");
        jSONObject.remove("external_intent_uri");
        jSONObject.remove("latest_install_time");
        jSONObject.remove("latest_update_time");
        jSONObject.remove("first_install_time");
        jSONObject.remove("previous_update_time");
        jSONObject.remove("install_begin_ts");
        jSONObject.remove("clicked_referrer_ts");
        jSONObject.remove("hardware_id");
        jSONObject.remove("is_hardware_id_real");
        jSONObject.remove("local_ip");
        jSONObject.remove("referrer_gclid");
        jSONObject.remove("identity");
        jSONObject.remove("anon_id");
        try {
            jSONObject.put("tracking_disabled", true);
            return true;
        } catch (JSONException e) {
            l1d.A(e, new StringBuilder("Caught JSONException "));
            return true;
        }
    }

    @Override // p.u861
    public final void j(JSONObject jSONObject) {
        super.j(jSONObject);
        ne neVar = this.e;
        neVar.J(jSONObject);
        String strF = tqt.f((Context) rm5.t().b);
        if (!rm5.v(strF)) {
            f4t f4tVar = f4t.RandomizedBundleToken;
            jSONObject.put("app_version", strF);
        }
        String strF2 = tqt.f((Context) rm5.t().b);
        long jK = tqt.k((Context) rm5.t().b);
        long jO = tqt.o((Context) rm5.t().b);
        int i = 2;
        if ("bnc_no_value".equals(neVar.F("bnc_app_version"))) {
            if (jO - jK < 86400000) {
                i = 0;
            }
        } else if (neVar.F("bnc_app_version").equals(strF2)) {
            i = 1;
        }
        f4t f4tVar2 = f4t.RandomizedBundleToken;
        jSONObject.put("update", i);
        jSONObject.put("latest_install_time", jK);
        jSONObject.put("latest_update_time", jO);
        long jA = neVar.A("bnc_original_install_time");
        if (jA == 0) {
            neVar.W(jK, "bnc_original_install_time");
        } else {
            jK = jA;
        }
        jSONObject.put("first_install_time", jK);
        long jA2 = neVar.A("bnc_last_known_update_time");
        if (jA2 < jO) {
            neVar.W(jA2, "bnc_previous_update_time");
            neVar.W(jO, "bnc_last_known_update_time");
        }
        jSONObject.put("previous_update_time", neVar.A("bnc_previous_update_time"));
        m(jSONObject);
        String str = n3c.w;
        if (TextUtils.isEmpty(str) || str.equals("bnc_no_value")) {
            return;
        }
        jSONObject.put("identity", str);
    }

    @Override // p.u861
    public final boolean k() {
        return true;
    }

    @Override // p.u861
    public final boolean l() {
        return true;
    }
}
