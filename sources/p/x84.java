package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x84 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 11));

    public x84(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        x84 x84Var = (x84) this.c.getValue();
        return x84Var != null ? x84Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb(rca.d, "android-car-mobile-interoperability-monitor", a()));
    }
}
