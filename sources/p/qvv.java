package p;

import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qvv {
    public final gmt a;
    public final lwv b;
    public final vcp c;

    public qvv(gmt gmtVar, lwv lwvVar, vcp vcpVar) {
        this.a = gmtVar;
        this.b = lwvVar;
        this.c = vcpVar;
    }

    public final void a(int i, iu30 iu30Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(392139593);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        byte b = 1;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarI = zr7.i(dug.f(qim0VarF, cbx.a(x340Var).a.c, d4o1.a), gft.i);
            WeakHashMap weakHashMap = osl1.x;
            float fA = poo1.x(lhc.g(x340Var).e, x340Var).a();
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarI, 0.0f, 0.0f, 0.0f, fA + 12.0f, 7);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarB);
            cvx cvxVar3 = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new g21(een.Q0, (byte) 29));
            cvx cvxVar4 = cbx.b(x340Var).b;
            k5p1.d(qim0VarZ, d36Var, new d36(16.0f, false, new g21(een.N0, (byte) 28)), (pl3) null, 0, 0, apo.r(2129198532, new zo7(this, iu30Var, i, b), x340Var), x340Var, 1572864, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(this, i, iu30Var, i2, (byte) 23);
        }
    }

    public final void b(qwv qwvVar, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(514192611);
        int i2 = (x340Var.g(qwvVar) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfh0 gfh0VarC = t1c.c(een.X, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            c(null, null, ali.b, x340Var, ((i2 << 3) & 7168) | 384);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = rnv.W0;
                x340Var.s0(objT);
            }
            bby bbyVarP = xay.p(1, (iu30) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = rnv.X0;
                x340Var.s0(objT2);
            }
            fq7.g(!qwvVar.b.isEmpty(), (qim0) null, bbyVarP, xay.t(1, (iu30) objT2), (String) null, apo.r(-433440059, new nzd((Object) this, (Object) qwvVar, (Object) iu30Var, (byte) 24), x340Var), x340Var, 196608, 18);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pvv(this, qwvVar, iu30Var, i);
        }
    }

    public final void c(qim0 qim0Var, mmr0[] mmr0VarArr, vu30 vu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        mmr0[] mmr0VarArr2;
        mmr0[] mmr0VarArr3;
        int i2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1688758052);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 = i | 22;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                Float fValueOf = Float.valueOf(1.0f);
                uwr uwrVar = cbx.a;
                mmr0VarArr3 = new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.j)), new mmr0(fValueOf, new u7h(cbx.a(x340Var).a.c))};
                i2 = i3 & (-113);
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                i2 = i3 & (-113);
                qim0Var3 = qim0Var;
                mmr0VarArr3 = mmr0VarArr;
            }
            x340Var.s();
            qim0 qim0VarE = dug.e(qim0Var3, v9c.t((mmr0[]) Arrays.copyOf(mmr0VarArr3, mmr0VarArr3.length), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
            nko1.H(qim0VarE2, x340Var, y580.Y);
            us71.j((i2 >> 6) & 14, vu30Var, x340Var, true);
            mmr0VarArr2 = mmr0VarArr3;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            mmr0VarArr2 = mmr0VarArr;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, qim0Var2, mmr0VarArr2, vu30Var, (byte) 7);
        }
    }

    public final void d(qwv qwvVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1439791986);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qwvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (qwvVar.c) {
            x340Var.i0(995514151);
            h4g0 h4g0Var = new h4g0(qwvVar.b.size());
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new hws(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            otw.c(this.c.a(h4g0Var, (iu30) objT), rih1.a, (qim0) null, (ipb1) null, x340Var, 48, 12);
            x340Var.r(false);
        } else {
            x340Var.i0(996049428);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t((Object) this, (Object) qwvVar, (Object) iu30Var, i, (byte) 16);
        }
    }

    public final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1286883036);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            gft gftVar = gft.i;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarI = zr7.i(nim0Var, gftVar);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarI);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            lee1 lee1Var = cbx.d(x340Var).d;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = rnv.Y0;
                x340Var.s0(objT);
            }
            uwo1.e(cwl1.o0(x340Var, 2131955288), s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            lee1 lee1Var2 = cbx.d(x340Var).j;
            String strO0 = cwl1.o0(x340Var, 2131955283);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(nim0Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), lee1Var2, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new utt(this, i, (byte) 20);
        }
    }

    public final void f(qwv qwvVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1304308534);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qwvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            xtb0 xtb0VarA = vpb1.A(x340Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = yv91.a(new ih1(xtb0VarA, (byte) 15));
                x340Var.s0(objT);
            }
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(x340Var).g;
            j2i j2iVarR = apo.r(1642424439, new lpk((tob1) objT, (byte) 2), x340Var);
            j2i j2iVarR2 = apo.r(-941264490, new pvv(this, qwvVar, iu30Var), x340Var);
            j2i j2iVarR3 = apo.r(-1331072399, new e6j(this, xtb0VarA, (byte) 26), x340Var);
            int i4 = i3 >> 3;
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, j2iVarR, j2iVarR2, u85Var, j2iVarR3, x340Var, (i4 & 14) | 25008, 0);
            d(qwvVar, iu30Var, x340Var, (i3 & 14) | (i4 & 112) | (i4 & 896));
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, qwvVar, qim0Var2, iu30Var, (byte) 8);
        }
    }

    public final void g(xtb0 xtb0Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-276304825);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xtb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vzq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            q1d0 q1d0VarN = jyo1.n(xtb0Var, this.b.e, (h3h1) null, x340Var, 4);
            qim0 qim0VarL = bmq0.L(u291.d(nim0.a, 1.0f), k1o1.q(x340Var), (g6o0) null);
            boolean zI = x340Var.i(this) | x340Var.i(q1d0VarN);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new wrs(q1d0VarN, this, (byte) 28);
                x340Var.s0(objT);
            }
            ujo1.d(qim0VarL, xtb0Var, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, (i2 << 3) & 1008, 504);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t((Object) this, (Object) xtb0Var, (Object) vzq0Var, i, (byte) 17);
        }
    }
}
