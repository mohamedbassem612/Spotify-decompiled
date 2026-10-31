package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oaz0 extends u861 {
    public Context i;

    @Override // p.u861
    public final void b() {
        try {
            i1k0.B("doFinalUpdateOnMainThread " + this);
            ne neVarZ = ne.z(this.i);
            i1k0.B("[Storage] setIdentity: bnc_no_value");
            neVarZ.Z("bnc_identity", "bnc_no_value");
            i1k0.B("Identity set to: " + neVarZ.F("bnc_identity"));
            neVarZ.m();
        } catch (Exception e) {
            i1k0.n("Caught Exception: doFinalUpdateOnMainThread " + this + ' ' + e.getMessage());
        }
    }

    @Override // p.u861
    public final void f(int i, String str) {
        i1k0.B("QueueOperationLogout handleFailure " + this);
    }

    @Override // p.u861
    public final void h(b961 b961Var, n3c n3cVar) {
        i1k0.B("QueueOperationLogout onRequestSucceeded " + this);
    }

    @Override // p.u861
    public final void a() {
    }

    @Override // p.u861
    public final void g() {
    }
}
