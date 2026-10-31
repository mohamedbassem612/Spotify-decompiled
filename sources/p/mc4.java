package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mc4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new wb4(this, (byte) 6));

    public mc4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        mc4 mc4Var = (mc4) this.c.getValue();
        return mc4Var != null ? mc4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb(rca.d, "android-datasaver-limitedexperienceindicator", a()));
    }
}
