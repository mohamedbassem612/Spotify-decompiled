package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vbl1 implements o1i {
    public final cce a;
    public final bcl1 b;
    public final hcl1 c;
    public final mv2 d;
    public final t75 e;
    public final m0t f;

    public vbl1(cce cceVar, bcl1 bcl1Var, hcl1 hcl1Var, mv2 mv2Var, t75 t75Var, m0t m0tVar) {
        this.a = cceVar;
        this.b = bcl1Var;
        this.c = hcl1Var;
        this.d = mv2Var;
        this.e = t75Var;
        this.f = m0tVar;
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        return new x0i(new w0i(o0iVar.e, "two_column_layout", ((ybl1) z0iVar).t, null, 8));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(ybl1 ybl1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        ybl1 ybl1Var2;
        int i2;
        qim0 qim0Var2;
        vbl1 vbl1Var;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1535321641);
        if ((i & 6) == 0) {
            ybl1Var2 = ybl1Var;
            i2 = (x340Var.g(ybl1Var2) ? 4 : 2) | i;
        } else {
            ybl1Var2 = ybl1Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            vbl1Var = this;
            i2 |= x340Var.i(vbl1Var) ? 2048 : 1024;
        } else {
            vbl1Var = this;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == obj) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == obj) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            boolean z3 = i3 == 4;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == obj) {
                objT3 = v8r.q(0);
                x340Var.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) objT3;
            boolean z4 = i3 == 4;
            Object objT4 = x340Var.T();
            if (z4 || objT4 == obj) {
                objT4 = v8r.q(0);
                x340Var.s0(objT4);
            }
            ven0 ven0Var4 = (ven0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = c97.b(0.0f);
                x340Var.s0(objT5);
            }
            o95 o95Var = (o95) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == obj) {
                objT6 = c97.b(0.0f);
                x340Var.s0(objT6);
            }
            o95 o95Var2 = (o95) objT6;
            Object objT7 = x340Var.T();
            if (objT7 == obj) {
                objT7 = new ylv(o95Var, o95Var2);
                x340Var.s0(objT7);
            }
            ylv ylvVar = (ylv) objT7;
            Object objT8 = x340Var.T();
            if (objT8 == obj) {
                objT8 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT8);
            }
            c9n c9nVar = (c9n) objT8;
            Object objT9 = x340Var.T();
            if (objT9 == obj) {
                objT9 = new tm51();
                x340Var.s0(objT9);
            }
            mod.b(die1.a.a((tm51) objT9), apo.r(-926635671, new o06(qim0Var2, ven0Var3, ven0Var4, ybl1Var2, o0iVar, vbl1Var, ven0Var, ven0Var2, c9nVar, ylvVar, (byte) 7), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swk1(i, this, ybl1Var, o0iVar, qim0Var, (byte) 7);
        }
    }
}
