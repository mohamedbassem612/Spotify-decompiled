package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g = new idd1(new gk4(this, (byte) 23));

    public fm4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = lukVar;
    }

    public final boolean a() {
        fm4 fm4Var = (fm4) this.g.getValue();
        return fm4Var != null ? fm4Var.a() : this.a;
    }

    public final boolean b() {
        fm4 fm4Var = (fm4) this.g.getValue();
        return fm4Var != null ? fm4Var.b() : this.b;
    }

    public final boolean c() {
        fm4 fm4Var = (fm4) this.g.getValue();
        return fm4Var != null ? fm4Var.c() : this.c;
    }

    public final boolean d() {
        fm4 fm4Var = (fm4) this.g.getValue();
        return fm4Var != null ? fm4Var.d() : this.d;
    }

    public final boolean e() {
        fm4 fm4Var = (fm4) this.g.getValue();
        return fm4Var != null ? fm4Var.e() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("auto_service_reconnect", "android-libs-checkout-flags", a()), new fpb("gpb_enabled", "android-libs-checkout-flags", b()), new fpb("native_choice_screen", "android-libs-checkout-flags", c()), new fpb("native_uc_choice_screen", "android-libs-checkout-flags", d()), new fpb("samsung_disable_gpb", "android-libs-checkout-flags", e()));
    }
}
