package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v35 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g = new idd1(new k25(this, (byte) 22));

    public v35(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = lukVar;
    }

    public final boolean a() {
        v35 v35Var = (v35) this.g.getValue();
        return v35Var != null ? v35Var.a() : this.a;
    }

    public final boolean b() {
        v35 v35Var = (v35) this.g.getValue();
        return v35Var != null ? v35Var.b() : this.b;
    }

    public final boolean c() {
        v35 v35Var = (v35) this.g.getValue();
        return v35Var != null ? v35Var.c() : this.c;
    }

    public final boolean d() {
        v35 v35Var = (v35) this.g.getValue();
        return v35Var != null ? v35Var.d() : this.d;
    }

    public final boolean e() {
        v35 v35Var = (v35) this.g.getValue();
        return v35Var != null ? v35Var.e() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("accessory_onboarding_enabled", "android-tap-onboarding", a()), new fpb("jabra_elite_interactive_onboarding_enabled", "android-tap-onboarding", b()), new fpb("oppo_headphones_onboarding_enabled", "android-tap-onboarding", c()), new fpb("sony_headphones_onboarding_enabled", "android-tap-onboarding", d()), new fpb("xiaomi_headphones_onboarding_enabled", "android-tap-onboarding", e()));
    }
}
