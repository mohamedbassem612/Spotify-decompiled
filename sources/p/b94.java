package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b94 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 14));

    public b94(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        b94 b94Var = (b94) this.c.getValue();
        return b94Var != null ? b94Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("clear_stale_cookies", "android-checkout", a()));
    }
}
