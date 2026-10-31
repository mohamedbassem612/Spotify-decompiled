package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z34 implements pdy0 {
    public final boolean a;
    public final feh1 b;
    public final idd1 c = new idd1(new g82(this, (byte) 23));

    public z34(boolean z, xz11 xz11Var) {
        this.a = z;
        this.b = xz11Var;
    }

    public final boolean a() {
        z34 z34Var = (z34) this.c.getValue();
        return z34Var != null ? z34Var.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("enable_account_switching", "android-accountswitching", a()));
    }
}
