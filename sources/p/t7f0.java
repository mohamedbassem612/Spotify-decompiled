package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t7f0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new jgd0(this, (byte) 20));

    public t7f0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        t7f0 t7f0Var = (t7f0) this.c.getValue();
        return t7f0Var != null ? t7f0Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb(rca.d, "lossless-bulk-redownloads", a()));
    }
}
