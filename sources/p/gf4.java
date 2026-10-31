package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gf4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new pe4(this, (byte) 14));

    public gf4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        gf4 gf4Var = (gf4) this.c.getValue();
        return gf4Var != null ? gf4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("group_blends_enabled", "android-feature-blend-members", a()));
    }
}
