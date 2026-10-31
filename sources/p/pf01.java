package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pf01 {
    public final Context a;
    public final wy70 b;
    public final idd1 c;
    public final idd1 d;
    public final idd1 e;
    public final h1i f;

    public pf01(Context context, wy70 wy70Var, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, h1i h1iVar) {
        this.a = context;
        this.b = wy70Var;
        this.c = idd1Var;
        this.d = idd1Var2;
        this.e = idd1Var3;
        this.f = h1iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pf01) {
            pf01 pf01Var = (pf01) obj;
            return u890.j(this.a, pf01Var.a) && this.b.equals(pf01Var.b) && this.c == pf01Var.c && this.d == pf01Var.d && this.e == pf01Var.e && this.f == pf01Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((c9r.c.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + c9r.c + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
