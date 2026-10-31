package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class n871 {
    public static final float a = 218.0f * 0.3f;

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(798408230);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarS = u291.s(qim0Var2, 218.0f, 103.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarS);
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
            lrx lrxVar = lrx.c;
            gra graVar = een.X;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0Var2, graVar);
            float f = a;
            b(lrxVar, eqr0.l(qim0VarA, -f), -15.0f, x340Var, lrx.d, 0);
            b(grx.c, lrn1.x(h2cVar.a(qim0Var2, graVar), 1.0f), 0.0f, x340Var, grx.d, 4);
            b(nkx.c, eqr0.l(h2cVar.a(qim0Var2, graVar), f), 15.0f, x340Var, nkx.d | 384, 0);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void b(hux huxVar, qim0 qim0Var, float f, b0k b0kVar, int i, int i2) {
        int i3;
        float f2;
        boolean z;
        h311 h311VarV;
        float f3;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2108168062);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                f2 = f;
                i3 |= x340Var.d(f2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                cr31 cr31VarB = er31.b(12.0f);
                qim0 qim0VarQ = i1p1.q(u291.r(k1u.u(qim0Var, f3), 76.0f), cr31VarB);
                uwr uwrVar = cbx.a;
                qim0 qim0VarE2 = d1u.E(3.0f, cbx.a(x340Var).a.c, dug.f(qim0VarQ, cbx.a(x340Var).a.a.a(), d4o1.a), cr31VarB);
                gfh0VarC = t1c.c(een.h, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarE2);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                w0h1.a(huxVar, isl.a, u291.r(nim0.a, 25.0f), cbx.a(x340Var).c.b, 0L, false, x340Var, 440 | (i3 & 14), 48);
                x340Var.r(true);
                f2 = f3;
            } else {
                x340Var.b0();
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new h57(huxVar, qim0Var, f2, i, i2, (byte) 3);
            }
        }
        i3 |= 384;
        f2 = f;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                f3 = 0.0f;
            } else {
                f3 = f2;
            }
            cr31 cr31VarB2 = er31.b(12.0f);
            qim0 qim0VarQ2 = i1p1.q(u291.r(k1u.u(qim0Var, f3), 76.0f), cr31VarB2);
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarE3 = d1u.E(3.0f, cbx.a(x340Var).a.c, dug.f(qim0VarQ2, cbx.a(x340Var).a.a.a(), d4o1.a), cr31VarB2);
            gfh0VarC = t1c.c(een.h, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarE3);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            w0h1.a(huxVar, isl.a, u291.r(nim0.a, 25.0f), cbx.a(x340Var).c.b, 0L, false, x340Var, 440 | (i3 & 14), 48);
            x340Var.r(true);
            f2 = f3;
        } else {
            x340Var.b0();
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h57(huxVar, qim0Var, f2, i, i2, (byte) 3);
        }
    }
}
