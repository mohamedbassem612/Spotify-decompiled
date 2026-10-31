package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class shx {
    public static final List a;

    static {
        Float fValueOf = Float.valueOf(0.5625f);
        a = p7h.M(new Float[]{fValueOf, fValueOf, Float.valueOf(0.375f), Float.valueOf(0.25f)});
    }

    public static final void a(c380 c380Var, qim0 qim0Var, hcx hcxVar, idn0 idn0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        idn0 idn0Var2;
        idn0 idn0Var3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(744360063);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= x340Var.e(hcxVar == null ? -1 : hcxVar.ordinal()) ? 256 : 128;
        }
        int i7 = i3 | 27648;
        if ((196608 & i) == 0) {
            i7 = 93184 | i3;
        }
        if (x340Var.Y(i7 & 1, (74899 & i7) != 74898)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if (i5 != 0) {
                    qim0Var = nim0.a;
                }
                if (i6 != 0) {
                    hcxVar = hcx.d;
                }
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                idn0Var3 = (idn0) objT;
                i4 = i7 & (-458753);
            } else {
                x340Var.b0();
                i4 = i7 & (-458753);
                idn0Var3 = idn0Var;
            }
            qim0 qim0Var3 = qim0Var;
            x340Var.s();
            int i8 = ((i4 >> 3) & 14) | 24576;
            int i9 = i4 >> 6;
            ero1.c(qim0Var3, (gbx) null, (String) null, idn0Var3, apo.r(-2013838493, new ozw(c380Var, hcxVar, (byte) 13), x340Var), x340Var, i8 | (i9 & 112) | (i9 & 896));
            qim0Var2 = qim0Var3;
            idn0Var2 = idn0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            idn0Var2 = idn0Var;
        }
        hcx hcxVar2 = hcxVar;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2((Object) c380Var, qim0Var2, (Object) hcxVar2, (Object) idn0Var2, i, i2, (byte) 12);
        }
    }

    public static final void b(c380 c380Var, hcx hcxVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1928072207);
        int i2 = (x340Var.i(c380Var) ? 4 : 2) | i | (x340Var.e(hcxVar.ordinal()) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            float fA = hcxVar.a(x340Var);
            qim0Var2 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var2, fA);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
            phx phxVar = (phx) c380Var.get(0);
            List list = a;
            int i3 = i2 & 112;
            zqo1.f(phxVar, hcxVar, e(qim0Var2, ((Number) list.get(0)).floatValue(), 1.0f, 1.0f), x340Var, i3);
            zqo1.f((phx) c380Var.get(1), hcxVar, e(qim0Var2, ((Number) list.get(1)).floatValue(), 0.0f, 0.0f), x340Var, i3);
            zqo1.f((phx) c380Var.get(2), hcxVar, e(qim0Var2, ((Number) list.get(2)).floatValue(), 1.0f, 0.0f), x340Var, i3);
            if (c380Var.size() >= 4) {
                x340Var.i0(415636416);
                float fFloatValue = ((1.0f - ((Number) list.get(0)).floatValue()) - ((Number) list.get(3)).floatValue()) * hcxVar.a(x340Var);
                zqo1.f((phx) c380Var.get(3), hcxVar, e(eqr0.C(qim0Var2, (fFloatValue * 2.0f) / 3.0f, -(fFloatValue / 2.0f)), ((Number) list.get(3)).floatValue(), 0.0f, 1.0f), x340Var, i3);
                x340Var.r(false);
            } else {
                x340Var.i0(415966039);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(c380Var, hcxVar, qim0Var2, i, (byte) 10);
        }
    }

    public static final void c(phx phxVar, hcx hcxVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-642454022);
        int i2 = (x340Var.i(phxVar) ? 4 : 2) | i | (x340Var.e(hcxVar.ordinal()) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 1022;
            qim0 qim0Var3 = nim0.a;
            zqo1.f(phxVar, hcxVar, qim0Var3, x340Var, i3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(phxVar, hcxVar, qim0Var2, i, (byte) 11);
        }
    }

    public static final void d(phx phxVar, phx phxVar2, hcx hcxVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1376710934);
        int i2 = (x340Var.i(phxVar) ? 4 : 2) | i | (x340Var.i(phxVar2) ? 32 : 16) | (x340Var.e(hcxVar.ordinal()) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float fA = hcxVar.a(x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var3, fA);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = s8x.Q0;
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            int i3 = i2 >> 3;
            zqo1.f(phxVar2, hcxVar, e(qim0Var3, 0.655f, 0.0f, 0.0f), x340Var, i3 & 126);
            zqo1.f(phxVar, hcxVar, vqo1.l(e(qim0Var3, 0.655f, 1.0f, 1.0f)), x340Var, (i2 & 14) | (i3 & 112));
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i, phxVar, phxVar2, hcxVar, qim0Var2, (byte) 1);
        }
    }

    public static final qim0 e(qim0 qim0Var, float f, float f2, float f3) {
        return i541.D(qim0Var, f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, sgc1.u(f2, f3), null, false, 0L, 0L, 0, null, 1047548);
    }
}
