package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x34 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new g82(this, (byte) 21));

    public x34(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        x34 x34Var = (x34) this.d.getValue();
        return x34Var != null ? x34Var.a() : this.a;
    }

    public final boolean b() {
        x34 x34Var = (x34) this.d.getValue();
        return x34Var != null ? x34Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("cached_has_users", "android-accountswitching", a()), new fpb("direct_prefs_access", "android-accountswitching", b())});
    }
}
