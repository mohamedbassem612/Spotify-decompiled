package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cob0 implements esb0 {
    public final mgc a;
    public final int b;

    public cob0(mgc mgcVar) {
        this.a = mgcVar;
        this.b = mgcVar.b;
    }

    public final int a() {
        return this.b;
    }

    public final Object b(int i) {
        g890 g890VarQ = this.a.q(i);
        return ((tjd) g890VarQ.c).a.invoke(Integer.valueOf(i - g890VarQ.a));
    }

    public final Object d(int i) {
        g890 g890VarQ = this.a.q(i);
        int i2 = g890VarQ.a;
        return new k5s(i);
    }

    public final void e(int i, Object obj, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(487616323);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.g(this) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 131) != 130)) {
            g890 g890VarQ = this.a.q(i);
            ((tjd) g890VarQ.c).b.invoke(Integer.valueOf(i - g890VarQ.a), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(this, i, obj, i2, (byte) 13);
        }
    }
}
