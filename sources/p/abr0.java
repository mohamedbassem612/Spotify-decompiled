package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class abr0 {
    public static final kiv a = new kiv(v0r0.i, (byte) 1);

    public static final void a(int i, j2i j2iVar, b0k b0kVar, vu30 vu30Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1194205822);
        int i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new xar0();
                x340Var.s0(objT);
            }
            xar0 xar0Var = (xar0) objT;
            kdn0 kdn0Var = xar0Var.e;
            ven0 ven0VarB = b2p1.B(kdn0Var, kdn0Var.e(), x340Var, 0);
            bbr0 bbr0Var = (bbr0) ven0VarB.getValue();
            boolean zG = x340Var.g(ven0VarB) | x340Var.i(vu30Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new cto0(ven0VarB, vu30Var, null, (byte) 19);
                x340Var.s0(objT2);
            }
            qxd0.t(bbr0Var, x340Var, (vu30) objT2);
            mod.b(a.a(xar0Var), j2iVar, x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a61(vu30Var, j2iVar, i, (byte) 2);
        }
    }

    public static final void b(bbr0 bbr0Var, b0k b0kVar, int i) {
        h311 h311VarV;
        zar0 zar0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1182298596);
        int i2 = (x340Var.i(bbr0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            xar0 xar0Var = (xar0) x340Var.k(a);
            if (xar0Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    zar0Var = new zar0(bbr0Var, i, (byte) 1);
                }
            } else {
                boolean zI = x340Var.i(xar0Var) | x340Var.i(bbr0Var);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new ozp0(xar0Var, bbr0Var, (byte) 18);
                    x340Var.s0(objT);
                }
                qxd0.h(bbr0Var, xar0Var, (iu30) objT, x340Var);
            }
            h311VarV.d = zar0Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            zar0Var = new zar0(bbr0Var, i, (byte) 0);
            h311VarV.d = zar0Var;
        }
    }
}
