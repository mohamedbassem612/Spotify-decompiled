package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y34 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new g82(this, (byte) 22));

    public y34(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        y34 y34Var = (y34) this.c.getValue();
        return y34Var != null ? y34Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("max_accounts", "android-accountswitching-switcherstateimpl", a(), 0, 200));
    }
}
