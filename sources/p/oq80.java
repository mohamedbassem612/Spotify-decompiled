package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oq80 {
    public final Context a;
    public final u9c b;
    public final int c;
    public final amm0 d;
    public final f5n e;
    public final cxc f;
    public final z8c0 g;
    public final dmm0 h;
    public nq80 i;
    public nq80 j;
    public final idd1 k = new idd1(new nd70(this, (byte) 19));

    public oq80(Context context, u9c u9cVar, int i, amm0 amm0Var, f5n f5nVar, cxc cxcVar, z8c0 z8c0Var, dmm0 dmm0Var) {
        this.a = context;
        this.b = u9cVar;
        this.c = i;
        this.d = amm0Var;
        this.e = f5nVar;
        this.f = cxcVar;
        this.g = z8c0Var;
        this.h = dmm0Var;
    }

    public final ixg a(Object obj) {
        nq80 nq80Var = null;
        if (yap1.n(this.c)) {
            nq80 nq80Var2 = this.j;
            if (nq80Var2 == null) {
                u890.C("coilInstrumentationCallback");
                throw null;
            }
            nq80Var = nq80Var2;
        }
        vy70 vy70Var = new vy70(this.a);
        vy70Var.c = obj;
        return new ixg((rf01) this.k.getValue(), vy70Var, nq80Var);
    }
}
