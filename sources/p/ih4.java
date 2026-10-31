package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ih4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new cg4(this, (byte) 21));

    public ih4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        ih4 ih4Var = (ih4) this.e.getValue();
        return ih4Var != null ? ih4Var.a() : this.a;
    }

    public final boolean b() {
        ih4 ih4Var = (ih4) this.e.getValue();
        return ih4Var != null ? ih4Var.b() : this.b;
    }

    public final boolean c() {
        ih4 ih4Var = (ih4) this.e.getValue();
        return ih4Var != null ? ih4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_early_pip_fragment_install", "android-feature-pip", a()), new fpb("pip_end_message", "android-feature-pip", b()), new fpb("pip_start_message", "android-feature-pip", c())});
    }
}
