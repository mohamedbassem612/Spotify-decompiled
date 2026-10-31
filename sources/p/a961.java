package p;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a961 extends v861 {
    @Override // p.u861
    public final void f(int i, String str) {
        if (this.i != null) {
            n3c.h().getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) n3c.h().f.d;
            f4t f4tVar = f4t.RandomizedBundleToken;
            if (Boolean.parseBoolean((String) concurrentHashMap.get("instant_dl_session"))) {
                return;
            }
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
        if (n3c.h().i) {
            l3c l3cVar = this.i;
            if (l3cVar != null) {
                l3cVar.b(n3c.h().i(), null);
            }
            y861 y861Var = n3c.h().f;
            f4t f4tVar = f4t.RandomizedBundleToken;
            y861Var.b("instant_dl_session", "true");
            n3c.h().i = false;
        }
    }

    @Override // p.v861, p.u861
    public final void h(b961 b961Var, n3c n3cVar) {
        super.h(b961Var, n3cVar);
        i1k0.B("onRequestSucceeded " + this + " " + b961Var + " on callback " + this.i);
        try {
            JSONObject jSONObjectA = b961Var.a();
            f4t f4tVar = f4t.RandomizedBundleToken;
            boolean zHas = jSONObjectA.has("link_click_id");
            ne neVar = this.e;
            if (zHas) {
                neVar.U(b961Var.a().getString("link_click_id"));
            } else {
                neVar.U("bnc_no_value");
            }
            if (b961Var.a().has("invoke_features") && b961Var.a().getJSONObject("invoke_features").has("enhanced_web_link_ux")) {
                JSONObject jSONObject = b961Var.a().getJSONObject("invoke_features");
                i1k0.B("Opening browser from open request.");
                n3cVar.n(jSONObject);
            } else {
                if (b961Var.a().has("data")) {
                    neVar.Y(b961Var.a().getString("data"));
                } else {
                    neVar.Y("bnc_no_value");
                }
                if (this.i != null) {
                    n3c.h().getClass();
                    if (!Boolean.parseBoolean((String) ((ConcurrentHashMap) n3c.h().f.d).get("instant_dl_session"))) {
                        this.i.b(n3cVar.i(), null);
                    }
                }
            }
            neVar.Z("bnc_app_version", tqt.f((Context) rm5.t().b));
        } catch (Exception e) {
            i1k0.C("Caught Exception ServerRequestRegisterOpen onRequestSucceeded: " + e.getMessage());
        }
        v861.n(n3cVar);
    }
}
