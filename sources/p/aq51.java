package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aq51 extends fz31 {
    public final /* synthetic */ xpc h;
    public final /* synthetic */ uzr0 i;
    public final /* synthetic */ n3r t;

    public aq51(xpc xpcVar, uzr0 uzr0Var, n3r n3rVar) {
        this.h = xpcVar;
        this.i = uzr0Var;
        this.t = n3rVar;
    }

    @Override // p.fz31
    public final Object e() {
        uzr0 uzr0Var = this.i;
        xpc xpcVar = this.h;
        rsb1 rsb1Var = new rsb1(xpcVar);
        d2e0.h.getAndIncrement();
        rsb1Var.b = 0L;
        g3r g3rVar = new g3r(rsb1Var, this.t);
        try {
            g3rVar.a();
            Uri uri = xpcVar.i;
            uri.getClass();
            Object objD = uzr0Var.d(uri, g3rVar);
            zoi1.h(g3rVar);
            objD.getClass();
            return (kf20) objD;
        } catch (Throwable th) {
            zoi1.h(g3rVar);
            throw th;
        }
    }
}
