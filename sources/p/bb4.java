package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bb4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 21));

    public bb4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        bb4 bb4Var = (bb4) this.c.getValue();
        return bb4Var != null ? bb4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("token_exchanger_timekeeper_enabled", "android-connectivity-cosmosauthtoken", a()));
    }
}
