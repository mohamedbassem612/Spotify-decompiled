package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class co4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public co4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new zn4(this, (byte) 2));
    }

    public final boolean a() {
        co4 co4Var = (co4) this.e.getValue();
        return co4Var != null ? co4Var.a() : this.a;
    }

    public final boolean b() {
        co4 co4Var = (co4) this.e.getValue();
        return co4Var != null ? co4Var.b() : this.b;
    }

    public final boolean c() {
        co4 co4Var = (co4) this.e.getValue();
        return co4Var != null ? co4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_gabito_error_logging", "android-libs-podcast-ads", a()), new fpb("enable_mock_endpoint", "android-libs-podcast-ads", b()), new fpb("npb_cta_button_shown", "android-libs-podcast-ads", c())});
    }

    public co4(luk lukVar) {
        this(false, false, true, lukVar);
    }
}
