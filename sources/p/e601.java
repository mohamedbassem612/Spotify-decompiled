package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e601 {
    public final cnq a;
    public final pux0 b;
    public final qxz0 c;
    public final m201 d;
    public final sxz0 e;
    public final frd1 f;
    public final iu30 g;
    public final mmv0 h;

    public e601(cnq cnqVar, pux0 pux0Var, qxz0 qxz0Var, m201 m201Var, g4q g4qVar, sxz0 sxz0Var, frd1 frd1Var, iu30 iu30Var) {
        this.a = cnqVar;
        this.b = pux0Var;
        this.c = qxz0Var;
        this.d = m201Var;
        this.e = sxz0Var;
        this.f = frd1Var;
        this.g = iu30Var;
        this.h = g4qVar.a(sxz0Var.e());
    }

    public final void a(v060 v060Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(15107329);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(v060Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            otw.c(v060Var.a, v060Var.b, (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(this, v060Var, i, (byte) 4);
        }
    }

    public final void b(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-288958228);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.h(u291.f(qim0Var2, 1.0f), 24.0f), er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarH = l6o1.H(dug.f(qim0VarQ, jA, u5j1Var), l6o1.C(0, 0, 1, x340Var), false, 14);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            t1c.a(dug.f(i1p1.q(u291.h(u291.v(qim0Var2, 36.0f), 4.0f), er31.b(2.0f)), u7h.b(u7h.f, 0.3f, 0.0f, 0.0f, 0.0f, 14), u5j1Var), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(this, qim0Var2, i, (byte) 5);
        }
    }

    public final void c(c380 c380Var, jkr0 jkr0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1490369984);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(jkr0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            int iS = ((err0) jkr0Var.d.c).s();
            int i4 = iS <= c380Var.size() ? iS : 0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            uwr uwrVar = cbx.a;
            jhc1.d(i4, qim0VarH, cbx.a(x340Var).a.a.a(), 0, (xu30) null, apo.r(-418839967, new ffx0(jkr0Var, this, c380Var, (byte) 15), x340Var), x340Var, 196608, 24);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(i, this, c380Var, jkr0Var, qim0Var2, (byte) 19);
        }
    }

    public final void d(c380 c380Var, int i, boolean z, boolean z2, String str, boolean z3, boolean z4, qim0 qim0Var, boolean z5, b0k b0kVar, int i2) {
        int i3;
        boolean z6;
        qim0 qim0Var2;
        boolean z7;
        qim0 qim0Var3;
        boolean z8;
        int i4;
        boolean z9;
        boolean z10;
        boolean z11;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-827777240);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(c380Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.g(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            z6 = z4;
            i3 |= x340Var.h(z6) ? 1048576 : 524288;
        } else {
            z6 = z4;
        }
        int i5 = i3 | 12582912;
        if ((100663296 & i2) == 0) {
            i5 |= x340Var.h(z5) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= x340Var.i(this) ? 536870912 : 268435456;
        }
        if (x340Var.Y(i5 & 1, (306783379 & i5) != 306783378)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a);
            int i6 = i5;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (z2) {
                x340Var.i0(1359378087);
                b(null, x340Var, (i6 >> 24) & 112);
                x340Var.r(false);
            } else {
                x340Var.i0(1359405956);
                x340Var.r(false);
            }
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = this.e.g(this.f, new a601(this, (byte) 1));
                x340Var.s0(objT);
            }
            v060 v060Var = (v060) objT;
            if (v060Var == null) {
                x340Var.i0(1359628814);
                z7 = false;
            } else {
                z7 = false;
                x340Var.i0(1359628815);
                a(v060Var, x340Var, (i6 >> 24) & 112);
            }
            x340Var.r(z7);
            if (z5) {
                x340Var = x340Var;
                qim0Var3 = qim0Var4;
                z8 = true;
                x340Var.i0(1362005988);
                x340Var.r(false);
            } else {
                x340Var.i0(1359779351);
                if (z3) {
                    x340Var.i0(1359765215);
                    boolean zI = x340Var.i(this);
                    Object objT2 = x340Var.T();
                    if (zI || objT2 == obj) {
                        objT2 = new b601(this, (byte) 0);
                        x340Var.s0(objT2);
                    }
                    iu30 iu30Var = (iu30) objT2;
                    boolean zI2 = x340Var.i(this);
                    Object objT3 = x340Var.T();
                    if (zI2 || objT3 == obj) {
                        objT3 = new b601(this, (byte) 1);
                        x340Var.s0(objT3);
                    }
                    qim0Var3 = qim0Var4;
                    i4 = 32;
                    ppo1.i(this.h, str, iu30Var, (iu30) objT3, z6, (qim0) null, x340Var, ((i6 >> 9) & 112) | ((i6 >> 6) & 57344));
                    x340Var = x340Var;
                    if (c380Var.isEmpty()) {
                        z9 = true;
                        z10 = false;
                        x340Var.i0(1360498148);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1360416463);
                        z9 = true;
                        z10 = false;
                        rqo1.g(6, 0, x340Var, uyn1.z(0.0f, 8.0f, 1, qim0Var3));
                        x340Var.r(false);
                    }
                    x340Var.r(z10);
                } else {
                    x340Var = x340Var;
                    qim0Var3 = qim0Var4;
                    i4 = 32;
                    z9 = true;
                    z10 = false;
                    x340Var.i0(1360508068);
                    x340Var.r(false);
                }
                if (c380Var.isEmpty()) {
                    z8 = z9;
                    z11 = z10;
                    x340Var.i0(1361998052);
                    x340Var.r(z11);
                } else {
                    x340Var.i0(1360595953);
                    boolean zI3 = x340Var.i(c380Var);
                    Object objT4 = x340Var.T();
                    if (zI3 || objT4 == obj) {
                        objT4 = new k27(c380Var, (byte) 4);
                        x340Var.s0(objT4);
                    }
                    kes kesVarB = lkr0.b(i, (Function0) objT4, x340Var, (i6 >> 3) & 14, 2);
                    Integer numValueOf = Integer.valueOf(i);
                    boolean zG = ((i6 & 112) == i4 ? true : z10) | x340Var.g(kesVarB);
                    Object objT5 = x340Var.T();
                    if (zG || objT5 == obj) {
                        objT5 = new i27(kesVarB, i, (lnm) null, (byte) 2);
                        x340Var.s0(objT5);
                    }
                    qxd0.t(numValueOf, x340Var, (vu30) objT5);
                    z8 = true;
                    c(c380Var, kesVarB, null, x340Var, (i6 & 14) | ((i6 >> 18) & 7168));
                    z11 = z10;
                    w0h1.c(kesVarB, (qim0) null, (vzq0) null, (gdr0) null, 0, 0.0f, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(-1437331325, new q340(c380Var, this, z), x340Var), x340Var, 0, 16382);
                    x340Var.r(z11);
                }
                x340Var.r(z11);
            }
            x340Var.r(z8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d601(this, c380Var, i, z, z2, str, z3, z4, qim0Var2, z5, i2);
        }
    }
}
