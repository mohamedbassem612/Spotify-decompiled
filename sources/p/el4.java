package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class el4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new gk4(this, (byte) 6));

    public el4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        el4 el4Var = (el4) this.e.getValue();
        return el4Var != null ? el4Var.a() : this.a;
    }

    public final boolean b() {
        el4 el4Var = (el4) this.e.getValue();
        return el4Var != null ? el4Var.b() : this.b;
    }

    public final boolean c() {
        el4 el4Var = (el4) this.e.getValue();
        return el4Var != null ? el4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("employee_validation_enabled", "android-integrity", a()), new fpb("time_tracking_enabled", "android-integrity", b()), new fpb("validation_enabled", "android-integrity", c()));
    }
}
