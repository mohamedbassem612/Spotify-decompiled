package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ab4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final feh1 d;
    public final idd1 e = new idd1(new u74(this, (byte) 20));

    public ab4(boolean z, boolean z2, boolean z3, xz11 xz11Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = xz11Var;
    }

    public final boolean a() {
        ab4 ab4Var = (ab4) this.e.getValue();
        return ab4Var != null ? ab4Var.a() : this.a;
    }

    public final boolean b() {
        ab4 ab4Var = (ab4) this.e.getValue();
        return ab4Var != null ? ab4Var.b() : this.b;
    }

    public final boolean c() {
        ab4 ab4Var = (ab4) this.e.getValue();
        return ab4Var != null ? ab4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("net_capabilities_oem_paid_support_enabled", "android-connectivity-connectiontypeflags", a()), new fpb("should_use_single_thread", "android-connectivity-connectiontypeflags", b()), new fpb("unauth_net_capabilities_validated_disregarded_enabled", "android-connectivity-connectiontypeflags", c()));
    }
}
