package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e05 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public e05(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new uz4(this, (byte) 8));
    }

    public final boolean a() {
        e05 e05Var = (e05) this.f.getValue();
        return e05Var != null ? e05Var.a() : this.a;
    }

    public final boolean b() {
        e05 e05Var = (e05) this.f.getValue();
        return e05Var != null ? e05Var.b() : this.b;
    }

    public final boolean c() {
        e05 e05Var = (e05) this.f.getValue();
        return e05Var != null ? e05Var.c() : this.c;
    }

    public final boolean d() {
        e05 e05Var = (e05) this.f.getValue();
        return e05Var != null ? e05Var.d() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("mftplus_enable_backskip", "android-reinvent-free-flags", a()), new fpb("mftplus_enable_repeat", "android-reinvent-free-flags", b()), new fpb("mftplus_enable_seeking", "android-reinvent-free-flags", c()), new fpb("show_tooltip_on_skip_to_error", "android-reinvent-free-flags", d())});
    }

    public e05(luk lukVar) {
        this(false, false, false, false, lukVar);
    }
}
