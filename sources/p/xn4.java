package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xn4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 28));

    public xn4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        xn4 xn4Var = (xn4) this.c.getValue();
        return xn4Var != null ? xn4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_call_trials_facade", "android-libs-on-demand-trials", a()));
    }
}
