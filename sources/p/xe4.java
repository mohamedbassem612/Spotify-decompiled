package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xe4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new pe4(this, (byte) 5));

    public xe4(int i, luk lukVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = lukVar;
    }

    public final int a() {
        xe4 xe4Var = (xe4) this.d.getValue();
        return xe4Var != null ? xe4Var.a() : this.b;
    }

    public final boolean b() {
        xe4 xe4Var = (xe4) this.d.getValue();
        return xe4Var != null ? xe4Var.b() : this.a;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("is_age_assurance_reroute_enabled", "android-feature-age-verification", b()), new fpb("social_age_threshold", "android-feature-age-verification", a(), 0, 100)});
    }
}
