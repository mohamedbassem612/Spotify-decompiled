package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class tz2 {
    public static final pxg1 a = irn1.o0(300, 0, (dlv) null, 6);

    public static final void a(pxt0 pxt0Var, h72 h72Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2053488477);
        int i2 = (x340Var.i(pxt0Var) ? 4 : 2) | i | (x340Var.i(h72Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mod.b(t4k.n.a(flb0.a), apo.r(612066659, new qz2(h72Var, pxt0Var, dsa0.m(x340Var, 2131167119), dsa0.m(x340Var, 2131166956)), x340Var), x340Var, 56);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(pxt0Var, h72Var, qim0Var2, i, (byte) 6);
        }
    }

    public static final void b(h72 h72Var, float f, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1978255816);
        int i2 = (x340Var.i(h72Var) ? 4 : 2) | i | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = x340Var.g(h72Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = h72.o(new jpg0(((dpt0) ((kly0) h72Var.c).get()).a(), fw2.c1));
                x340Var.s0(objT);
            }
            otw.c((xpw) objT, rih1.a, u291.r(anm1.N(zwt0.PlayPause.a, nim0.a), f), (ipb1) null, x340Var, 48, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rz2(h72Var, f, i, (byte) 0);
        }
    }

    public static final void c(zwt0 zwt0Var, mxt0 mxt0Var, h72 h72Var, float f, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1075195173);
        int i2 = i | (x340Var.e(mxt0Var.ordinal()) ? 32 : 16) | (x340Var.i(h72Var) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = fw2.Z0;
                x340Var.s0(objT);
            }
            hm5.a(mxt0Var, (qim0) null, (iu30) objT, (tl3) null, zwt0Var.name(), (iu30) null, apo.r(-290707129, new sz2(h72Var, zwt0Var, f), x340Var), x340Var, ((i2 >> 3) & 14) | 1573248, 42);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ys(zwt0Var, mxt0Var, h72Var, f, i, (byte) 2);
        }
    }

    public static final void d(zwt0 zwt0Var, nxt0 nxt0Var, h72 h72Var, float f, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-825204247);
        int i2 = i | (x340Var.e(nxt0Var == null ? -1 : nxt0Var.ordinal()) ? 32 : 16) | (x340Var.i(h72Var) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = fw2.a1;
                x340Var.s0(objT);
            }
            hm5.a(nxt0Var, (qim0) null, (iu30) objT, (tl3) null, zwt0Var.name(), (iu30) null, apo.r(-483407377, new sz2(zwt0Var, f, h72Var), x340Var), x340Var, ((i2 >> 3) & 14) | 1573248, 42);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ys(zwt0Var, nxt0Var, h72Var, f, i, (byte) 3);
        }
    }
}
