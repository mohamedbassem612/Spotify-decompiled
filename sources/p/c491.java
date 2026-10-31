package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c491 implements xpw {
    public final rey0 a = k1o1.p();
    public final eih1 b = f3o1.u();
    public final psw c;

    public c491() {
        j2i j2iVarJ = apo.j(-2072396227, new c771(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVarJ, (byte) 0);
    }

    public final rqw a() {
        return this.b;
    }

    public final jsw c() {
        return this.c;
    }

    public final void e(float f, float f2, int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(310949770);
        int i4 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.d(f2) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
            qim0 qim0VarS = u291.s(qim0Var4, f, f2);
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(dug.f(qim0VarS, cbx.a(x340Var).a.b.a(), er31.b(8.0f)), 0L, er31.b(8.0f), 13), x340Var, 0);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ff60(this, f, f2, qim0Var3, i, i2, (byte) 1);
        }
    }

    public final mqw getBehavior() {
        return this.a;
    }
}
