package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jk4 implements pdy0 {
    public final boolean a;
    public final tgp0 b;
    public final luk c;
    public final idd1 d = new idd1(new q30(this, (byte) 14));
    public final idd1 e = new idd1(new gk4(this, (byte) 1));

    public jk4(boolean z, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = tgp0Var;
        this.c = lukVar;
    }

    public final boolean a() {
        jk4 jk4Var = (jk4) this.e.getValue();
        return jk4Var != null ? jk4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb(rca.d, "android-genalpha-limitedexperienceindicator", a()));
    }
}
