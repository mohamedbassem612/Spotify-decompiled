package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class moo0 {
    public final ynb0 a;
    public final ynb0 b;
    public final ynb0 c;
    public final gqo0 d;
    public final ynb0 e;
    public final ynb0 f;

    public moo0(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, gqo0 gqo0Var, ynb0 ynb0Var4, ynb0 ynb0Var5) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ynb0Var3;
        this.d = gqo0Var;
        this.e = ynb0Var4;
        this.f = ynb0Var5;
    }

    public final void a(fpo fpoVar) {
        dg30 dg30Var = (dg30) this.b.get();
        Resources resources = dg30Var.getResources();
        yro0 yro0Var = new yro0(8, resources.getString(2131959178), resources.getString(2131959175), resources.getString(2131959177), resources.getString(2131959176));
        dto0 dto0Var = (dto0) this.c.get();
        drj0 drj0Var = null;
        if (fpoVar != null) {
            bto0 bto0Var = (bto0) this.f.get();
            za80 za80Var = new za80(fpoVar, null, (byte) 1);
            bto0Var.getClass();
            drj0Var = new drj0(bto0Var, za80Var, (byte) 15);
        }
        dto0Var.d(dg30Var, yro0Var, drj0Var);
    }
}
