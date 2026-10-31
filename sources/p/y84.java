package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y84 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 12));

    public y84(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        y84 y84Var = (y84) this.c.getValue();
        return y84Var != null ? y84Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("jumpstart_enabled", "android-car-mobile-jumpstart", a()));
    }
}
