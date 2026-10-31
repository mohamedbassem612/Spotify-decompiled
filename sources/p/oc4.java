package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oc4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f = new idd1(new wb4(this, (byte) 8));

    public oc4(boolean z, int i, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
        this.e = lukVar;
    }

    public final boolean a() {
        oc4 oc4Var = (oc4) this.f.getValue();
        return oc4Var != null ? oc4Var.a() : this.a;
    }

    public final int b() {
        oc4 oc4Var = (oc4) this.f.getValue();
        return oc4Var != null ? oc4Var.b() : this.b;
    }

    public final boolean c() {
        oc4 oc4Var = (oc4) this.f.getValue();
        return oc4Var != null ? oc4Var.c() : this.c;
    }

    public final boolean d() {
        oc4 oc4Var = (oc4) this.f.getValue();
        return oc4Var != null ? oc4Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enhanced_search_back_navigation_mirroring_enabled", "android-decipher", a()), new fpb("enhanced_search_grace_period_seconds", "android-decipher", b(), 0, 3600), new fpb("enhanced_search_query_mirroring_enabled", "android-decipher", c()), new fpb("feature_enabled", "android-decipher", d()));
    }
}
