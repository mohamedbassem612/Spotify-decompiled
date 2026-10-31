package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public tm4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new om4(this, (byte) 3));
    }

    public final boolean a() {
        tm4 tm4Var = (tm4) this.f.getValue();
        return tm4Var != null ? tm4Var.a() : this.a;
    }

    public final boolean b() {
        tm4 tm4Var = (tm4) this.f.getValue();
        return tm4Var != null ? tm4Var.b() : this.b;
    }

    public final boolean c() {
        tm4 tm4Var = (tm4) this.f.getValue();
        return tm4Var != null ? tm4Var.c() : this.c;
    }

    public final boolean d() {
        tm4 tm4Var = (tm4) this.f.getValue();
        return tm4Var != null ? tm4Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_compose_marquee_overlay", "android-libs-marquee", a()), new fpb("enable_genrecs_spring2026_compliance", "android-libs-marquee", b()), new fpb("enable_marquee", "android-libs-marquee", c()), new fpb("is_permission_dialog_on_presave_enabled", "android-libs-marquee", d()));
    }

    public tm4(luk lukVar) {
        this(false, false, false, false, lukVar);
    }
}
