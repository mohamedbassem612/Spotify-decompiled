package p;

import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class paz0 extends u861 {
    public String i;
    public vr51 j;

    @Override // p.u861
    public final void b() {
        try {
            i1k0.B("doFinalUpdateOnMainThread " + this);
            String str = this.i;
            if (str != null) {
                n3c.w = str;
                ne neVar = this.e;
                neVar.getClass();
                i1k0.B("[Storage] setIdentity: ".concat(str));
                neVar.Z("bnc_identity", str);
                i1k0.B("Identity is now set to: " + n3c.w);
            }
        } catch (Exception e) {
            i1k0.n("Caught Exception: doFinalUpdateOnMainThread " + this + ' ' + e.getMessage());
        }
    }

    @Override // p.u861
    public final void f(int i, String str) {
        i1k0.B("QueueOperationSetIdentity handleFailure " + this);
        vr51 vr51Var = this.j;
        if (vr51Var != null) {
            i1k0.B("QueueOperationSetIdentity handleFailure " + this);
            vr51Var.b(new JSONObject(), new r3c("Error in setIdentity method. Current identity value: " + this.e.F("bnc_identity") + ' ' + str, -1));
        }
    }

    @Override // p.u861
    public final void h(b961 b961Var, n3c n3cVar) {
        JSONObject jSONObjectD;
        i1k0.B("onRequestSucceeded " + this);
        vr51 vr51Var = this.j;
        if (vr51Var != null) {
            try {
                jSONObjectD = n3c.d(n3cVar.b.F("bnc_install_params"));
            } catch (Exception e) {
                i1k0.n("Caught exception " + this + " onRequestSucceeded: " + e.getMessage());
                jSONObjectD = null;
            }
            vr51Var.b(jSONObjectD, (r3c) null);
        }
    }

    @Override // p.u861
    public final boolean i() {
        return true;
    }

    @Override // p.u861
    public final void a() {
    }

    @Override // p.u861
    public final void g() {
    }
}
