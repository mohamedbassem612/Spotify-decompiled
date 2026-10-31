package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class af4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final feh1 e;
    public final idd1 f;

    public af4(boolean z, boolean z2, int i, boolean z3, feh1 feh1Var) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = feh1Var;
        this.f = new idd1(new pe4(this, (byte) 8));
    }

    public static af4 e(aey0 aey0Var) {
        return new af4(aey0Var.c("android-feature-agesignal:age_verification_enabled", true), aey0Var.c("android-feature-agesignal:authenticated_verification_enabled", false), aey0Var.b(0, 100, 13, "android-feature-agesignal:signup_minimum_age"), aey0Var.c("android-feature-agesignal:warmup_verification_enabled", true), null);
    }

    public final boolean a() {
        af4 af4Var = (af4) this.f.getValue();
        return af4Var != null ? af4Var.a() : this.a;
    }

    public final boolean b() {
        af4 af4Var = (af4) this.f.getValue();
        return af4Var != null ? af4Var.b() : this.b;
    }

    public final int c() {
        af4 af4Var = (af4) this.f.getValue();
        return af4Var != null ? af4Var.c() : this.c;
    }

    public final boolean d() {
        af4 af4Var = (af4) this.f.getValue();
        return af4Var != null ? af4Var.d() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("age_verification_enabled", "android-feature-agesignal", a()), new fpb("authenticated_verification_enabled", "android-feature-agesignal", b()), new fpb("signup_minimum_age", "android-feature-agesignal", c(), 0, 100), new fpb("warmup_verification_enabled", "android-feature-agesignal", d())});
    }

    public af4(feh1 feh1Var) {
        this(true, false, 13, true, feh1Var);
    }
}
