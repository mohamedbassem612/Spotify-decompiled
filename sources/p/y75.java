package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y75 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f = new idd1(new f55(this, (byte) 26));

    public y75(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
    }

    public final boolean a() {
        y75 y75Var = (y75) this.f.getValue();
        return y75Var != null ? y75Var.a() : this.a;
    }

    public final boolean b() {
        y75 y75Var = (y75) this.f.getValue();
        return y75Var != null ? y75Var.b() : this.b;
    }

    public final boolean c() {
        y75 y75Var = (y75) this.f.getValue();
        return y75Var != null ? y75Var.c() : this.c;
    }

    public final boolean d() {
        y75 y75Var = (y75) this.f.getValue();
        return y75Var != null ? y75Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("cross_device_prompt_installation_enabled", "android-wear-activation", a()), new fpb("debug_snackbar_enabled", "android-wear-activation", b()), new fpb("onboarding_enabled", "android-wear-activation", c()), new fpb("onboarding_experiment_enabled", "android-wear-activation", d()));
    }
}
