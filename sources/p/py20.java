package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class py20 {
    public static final k5k a = mod.i(a9o.S0);

    public static final qim0 a(qim0 qim0Var, long j, cr31 cr31Var, b0k b0kVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            uwr uwrVar = cbx.a;
            j = cbx.a(b0kVar).c.a;
        }
        long j2 = j;
        hw61 hw61Var = cr31Var;
        if ((i2 & 2) != 0) {
            hw61Var = d4o1.a;
        }
        hw61 hw61Var2 = hw61Var;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = xto.t(Boolean.FALSE);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        boolean zI = x340Var.i(ven0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new d7v(ven0Var, (byte) 29);
            x340Var.s0(objT2);
        }
        qim0 qim0VarG = cev0.G(qim0Var, (iu30) objT2);
        Boolean bool = (Boolean) ven0Var.getValue();
        boolean zBooleanValue = bool.booleanValue();
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = zr7.d();
            x340Var.s0(objT3);
        }
        idn0 idn0Var = (idn0) objT3;
        boolean zH = x340Var.h(true) | x340Var.h(zBooleanValue) | x340Var.i(idn0Var);
        Object objT4 = x340Var.T();
        if (zH || objT4 == m4cVar) {
            objT4 = new kv1(zBooleanValue, idn0Var, (lnm) null);
            x340Var.s0(objT4);
        }
        qxd0.s(true, bool, (vu30) objT4, x340Var);
        return b(qim0VarG, idn0Var, j2, hw61Var2, null, x340Var, 0, 0);
    }

    public static final qim0 b(qim0 qim0Var, idn0 idn0Var, long j, hw61 hw61Var, p3v p3vVar, b0k b0kVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            uwr uwrVar = cbx.a;
            j = cbx.a(b0kVar).c.a;
        }
        if ((i2 & 4) != 0) {
            hw61Var = d4o1.a;
        }
        if ((i2 & 8) != 0) {
            p3vVar = null;
        }
        boolean z = (((i & 896) ^ 384) > 256 && ((x340) b0kVar).f(j)) || (i & 384) == 256;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (z || objT == fkj0.X) {
            objT = new oy20((byte) 0, j);
            x340Var.s0(objT);
        }
        uwr uwrVar2 = cbx.a;
        avw0 avw0Var = cbx.b(x340Var).c;
        return da80.a(qim0Var, idn0Var, new iy20((iu30) objT, hw61Var, p3vVar));
    }
}
