package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ov1 {
    public final gxo a;
    public final cbr0 b;
    public final av1 c;
    public final kly0 d;
    public upo e;
    public final hrr0 f = v8r.q(Boolean.FALSE);

    public ov1(gxo gxoVar, cbr0 cbr0Var, av1 av1Var, fwo fwoVar) {
        this.a = gxoVar;
        this.b = cbr0Var;
        this.c = av1Var;
        this.d = fwoVar;
    }

    public final void a(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        int i4;
        qim0 qim0Var4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2014128734);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else if ((i & 6) == 0) {
            qim0Var2 = qim0Var;
            i3 = (x340Var.g(qim0Var2) ? 4 : 2) | i;
        } else {
            qim0Var2 = qim0Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(this) ? 32 : 16;
        }
        byte b = 0;
        byte b2 = 1;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                int i6 = i3;
                qim0Var4 = nim0.a;
                i4 = i6;
            } else {
                i4 = i3;
                qim0Var4 = qim0Var2;
            }
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new nv1(this, b);
                x340Var.s0(objT);
            }
            qxd0.i(rih1.a, (iu30) objT, x340Var);
            upo upoVar = this.e;
            boolean zI2 = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new kk(this, (lnm) null, (byte) 2);
                x340Var.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            boolean zI3 = x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new nv1(this, b2);
                x340Var.s0(objT3);
            }
            iu30 iu30Var = (iu30) objT3;
            boolean zI4 = x340Var.i(this);
            Object objT4 = x340Var.T();
            if (zI4 || objT4 == m4cVar) {
                objT4 = new g3(this, (byte) 23);
                x340Var.s0(objT4);
            }
            int i7 = (i4 << 9) & 7168;
            n8b1 n8b1Var = upo.l;
            z8p1.a(this.c, vu30Var, iu30Var, qim0Var4, upoVar, (Function0) objT4, x340Var, i7 | 32768);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(this, qim0Var3, i, i2, (byte) 1);
        }
    }

    public final void b(qim0 qim0Var, g431 g431Var, b0k b0kVar, int i) {
        g431 g431Var2;
        int i2;
        g431 g431VarH;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(830186366);
        int i3 = i | 16 | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                i2 = i3 & (-113);
                g431VarH = ((cir0) x340Var.k(k2r0.a)).h();
            } else {
                x340Var.b0();
                i2 = i3 & (-113);
                g431VarH = g431Var;
            }
            x340Var.s();
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-984902335);
            if (((Boolean) this.f.getValue()).booleanValue()) {
                x340Var.i0(-984897283);
                a((i2 >> 3) & 112, 1, x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(-984834818);
                x340Var.r(false);
                boolean zI = x340Var.i(this);
                Object objT = x340Var.T();
                if (zI || objT == obj) {
                    objT = new nv1(this, (byte) 2);
                    x340Var.s0(objT);
                }
                qxd0.i(rih1.a, (iu30) objT, x340Var);
                boolean zG = x340Var.g(g431VarH);
                Object objT2 = x340Var.T();
                if (zG || objT2 == obj) {
                    objT2 = this.a.a(g431VarH);
                    x340Var.s0(objT2);
                }
                xw1 xw1Var = (xw1) objT2;
                Object objT3 = x340Var.T();
                if (objT3 == obj) {
                    upo upoVar = this.e;
                    wy71 wy71VarC = upoVar != null ? upoVar.c() : null;
                    wy71 wy71Var = wy71.b;
                    if (wy71VarC != wy71Var) {
                        wy71Var = wy71.a;
                    }
                    objT3 = new mj11(wy71Var, null, new zn1(this, (byte) 1), 14);
                    x340Var.s0(objT3);
                }
                otw.b(xw1Var, new vw1((mj11) objT3), new joa0("add-to-playlist"), (qim0) null, x340Var, 0, 8);
            }
            x340Var.r(false);
            x340Var.r(true);
            g431Var2 = g431VarH;
        } else {
            x340Var.b0();
            g431Var2 = g431Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q1((Object) this, (Object) qim0Var, (Object) g431Var2, i, (byte) 21);
        }
    }
}
