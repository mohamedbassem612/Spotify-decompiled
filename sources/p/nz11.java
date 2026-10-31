package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nz11 implements pdy0 {
    public final boolean a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new vwz0(this, (byte) 24));

    public nz11(boolean z, int i, cz11 cz11Var) {
        this.a = z;
        this.b = i;
        this.c = cz11Var;
    }

    public final boolean a() {
        nz11 nz11Var = (nz11) this.d.getValue();
        return nz11Var != null ? nz11Var.a() : this.a;
    }

    public final int b() {
        nz11 nz11Var = (nz11) this.d.getValue();
        return nz11Var != null ? nz11Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_fetch_readiness", "remote-config-fetching", a()), new fpb("millis_to_defer", "remote-config-fetching", b(), 0, 10000));
    }
}
