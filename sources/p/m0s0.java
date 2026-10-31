package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m0s0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new gyq0(this, (byte) 22));

    public m0s0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        m0s0 m0s0Var = (m0s0) this.c.getValue();
        return m0s0Var != null ? m0s0Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("use_cmp_alexa_linking", "partner-account-linking-alexa", a()));
    }
}
