package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fj4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public fj4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new sh4(this, (byte) 23));
    }

    public static fj4 e(aey0 aey0Var) {
        return new fj4(aey0Var.c("android-fitness:capping_enabled", true), aey0Var.c("android-fitness:feature_enabled", false), aey0Var.c("android-fitness:share_card_abstract_map_enabled", false), aey0Var.c("android-fitness:share_card_journey_enabled", false), null);
    }

    public final boolean a() {
        fj4 fj4Var = (fj4) this.f.getValue();
        return fj4Var != null ? fj4Var.a() : this.a;
    }

    public final boolean b() {
        fj4 fj4Var = (fj4) this.f.getValue();
        return fj4Var != null ? fj4Var.b() : this.b;
    }

    public final boolean c() {
        fj4 fj4Var = (fj4) this.f.getValue();
        return fj4Var != null ? fj4Var.c() : this.c;
    }

    public final boolean d() {
        fj4 fj4Var = (fj4) this.f.getValue();
        return fj4Var != null ? fj4Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("capping_enabled", "android-fitness", a()), new fpb("feature_enabled", "android-fitness", b()), new fpb("share_card_abstract_map_enabled", "android-fitness", c()), new fpb("share_card_journey_enabled", "android-fitness", d()));
    }

    public fj4(luk lukVar) {
        this(true, false, false, false, lukVar);
    }

    public fj4() {
        this(true, false, false, false, null);
    }
}
