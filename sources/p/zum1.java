package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zum1 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new yrm1(this, (byte) 1));

    public zum1(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        zum1 zum1Var = (zum1) this.c.getValue();
        return zum1Var != null ? zum1Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb(rca.d, "your-library-pro", a()));
    }
}
