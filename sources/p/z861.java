package p;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z861 extends v861 {
    @Override // p.u861
    public final void f(int i, String str) {
        if (this.i != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                l1d.A(e, new StringBuilder("Caught JSONException "));
            }
            this.i.b(jSONObject, new r3c("Trouble initializing Branch. " + this + " failed. " + str, i));
        }
    }

    @Override // p.v861, p.u861
    public final void g() {
        super.g();
        ne neVar = this.e;
        long jA = neVar.A("bnc_referrer_click_ts");
        long jA2 = neVar.A("bnc_install_begin_ts");
        long jA3 = neVar.A("bnc_referrer_click_server_ts");
        long jA4 = neVar.A("bnc_install_begin_server_ts");
        if (jA > 0) {
            try {
                JSONObject jSONObject = this.c;
                f4t f4tVar = f4t.RandomizedBundleToken;
                jSONObject.put("clicked_referrer_ts", jA);
            } catch (JSONException e) {
                l1d.A(e, new StringBuilder("Caught JSONException "));
                return;
            }
        }
        if (jA2 > 0) {
            JSONObject jSONObject2 = this.c;
            f4t f4tVar2 = f4t.RandomizedBundleToken;
            jSONObject2.put("install_begin_ts", jA2);
        }
        if (!q1o1.l().equals("bnc_no_value")) {
            JSONObject jSONObject3 = this.c;
            f4t f4tVar3 = f4t.RandomizedBundleToken;
            jSONObject3.put("link_click_id", q1o1.l());
        }
        if (jA3 > 0) {
            JSONObject jSONObject4 = this.c;
            f4t f4tVar4 = f4t.RandomizedBundleToken;
            jSONObject4.put("clicked_referrer_server_ts", jA3);
        }
        if (jA4 > 0) {
            JSONObject jSONObject5 = this.c;
            f4t f4tVar5 = f4t.RandomizedBundleToken;
            jSONObject5.put("install_begin_server_ts", jA4);
        }
        if (n3c.h() != null) {
            n3c.h().e.getClass();
            JSONObject jSONObjectE = q3c.E();
            JSONObject jSONObject6 = this.c;
            f4t f4tVar6 = f4t.RandomizedBundleToken;
            jSONObject6.put("operational_metrics", jSONObjectE);
        }
    }

    @Override // p.v861, p.u861
    public final void h(b961 b961Var, n3c n3cVar) {
        ne neVar = this.e;
        super.h(b961Var, n3cVar);
        try {
            JSONObject jSONObjectA = b961Var.a();
            f4t f4tVar = f4t.RandomizedBundleToken;
            neVar.Z("bnc_user_url", jSONObjectA.getString("link"));
            if (b961Var.a().has("data")) {
                JSONObject jSONObject = new JSONObject(b961Var.a().getString("data"));
                if (jSONObject.has("+clicked_branch_link") && jSONObject.getBoolean("+clicked_branch_link") && neVar.F("bnc_install_params").equals("bnc_no_value")) {
                    neVar.Z("bnc_install_params", b961Var.a().getString("data"));
                }
            }
            if (b961Var.a().has("link_click_id")) {
                neVar.U(b961Var.a().getString("link_click_id"));
            } else {
                neVar.U("bnc_no_value");
            }
            if (b961Var.a().has("invoke_features") && b961Var.a().getJSONObject("invoke_features").has("enhanced_web_link_ux")) {
                JSONObject jSONObject2 = b961Var.a().getJSONObject("invoke_features");
                i1k0.B("Opening browser from install request.");
                n3cVar.n(jSONObject2);
            } else {
                if (b961Var.a().has("data")) {
                    neVar.Y(b961Var.a().getString("data"));
                } else {
                    neVar.Y("bnc_no_value");
                }
                l3c l3cVar = this.i;
                if (l3cVar != null) {
                    l3cVar.b(n3cVar.i(), null);
                }
            }
            neVar.Z("bnc_app_version", tqt.f((Context) rm5.t().b));
        } catch (Exception e) {
            i1k0.C("Caught Exception ServerRequestRegisterInstall onRequestSucceeded: " + e.getMessage());
        }
        v861.n(n3cVar);
    }
}
