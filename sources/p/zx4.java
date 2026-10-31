package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zx4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public zx4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new sx4(this, (byte) 4));
    }

    public final boolean a() {
        zx4 zx4Var = (zx4) this.f.getValue();
        return zx4Var != null ? zx4Var.a() : this.a;
    }

    public final boolean b() {
        zx4 zx4Var = (zx4) this.f.getValue();
        return zx4Var != null ? zx4Var.b() : this.b;
    }

    public final boolean c() {
        zx4 zx4Var = (zx4) this.f.getValue();
        return zx4Var != null ? zx4Var.c() : this.c;
    }

    public final boolean d() {
        zx4 zx4Var = (zx4) this.f.getValue();
        return zx4Var != null ? zx4Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("bypass_auth_for_pme", "android-pme-mbs-configuration", a()), new fpb("content_programming_for_pme_enabled", "android-pme-mbs-configuration", b()), new fpb("remote_recently_played_for_pme_enabled", "android-pme-mbs-configuration", c()), new fpb("restrict_check_enabled", "android-pme-mbs-configuration", d()));
    }

    public zx4(luk lukVar) {
        this(false, true, false, true, lukVar);
    }
}
