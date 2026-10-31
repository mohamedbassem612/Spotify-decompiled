package p;

import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bxv {
    public final otu a;
    public final zxv b;

    public bxv(otu otuVar, zxv zxvVar) {
        this.a = otuVar;
        this.b = zxvVar;
    }

    public final void a(int i, iu30 iu30Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1958924407);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(this) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            gra graVar = een.h;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarI = zr7.i(dug.f(qim0VarF, cbx.a(x340Var).a.c, d4o1.a), gft.t);
            WeakHashMap weakHashMap = osl1.x;
            float fA = poo1.x(lhc.g(x340Var).e, x340Var).a();
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarI, 0.0f, 0.0f, 0.0f, fA + 12.0f, 7);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarB);
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            idx idxVar = new idx(4);
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new f2t(this, iu30Var, (byte) 23);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-116347652, new vx1(i, (byte) 16), x340Var), x340Var, 0, 48, 2044);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(this, i, iu30Var, i2, (byte) 24);
        }
    }

    public final void b(eyv eyvVar, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(381979197);
        int i2 = (x340Var.g(eyvVar) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(this) ? 256 : 128);
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
            c(null, null, bli.b, x340Var, ((i2 << 3) & 7168) | 384);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = rnv.d1;
                x340Var.s0(objT);
            }
            bby bbyVarP = xay.p(1, (iu30) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = rnv.e1;
                x340Var.s0(objT2);
            }
            fq7.g(!eyvVar.a.isEmpty(), (qim0) null, bbyVarP, xay.t(1, (iu30) objT2), (String) null, apo.r(1531299359, new ywv(this, eyvVar, iu30Var), x340Var), x340Var, 196608, 18);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zwv(this, eyvVar, iu30Var, i);
        }
    }

    public final void c(qim0 qim0Var, mmr0[] mmr0VarArr, vu30 vu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        mmr0[] mmr0VarArr2;
        mmr0[] mmr0VarArr3;
        int i2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(535570531);
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
            h311VarV.d = new m5r(i, this, qim0Var2, mmr0VarArr2, vu30Var, (byte) 9);
        }
    }

    public final void d(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        bxv bxvVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(569123178);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = z ? 2131955298 : 2131955297;
            gft gftVar = gft.t;
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
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = axv.b;
                x340Var.s0(objT);
            }
            boolean z2 = false;
            uwo1.e(cwl1.o0(x340Var, 2131955299), s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            lee1 lee1Var2 = cbx.d(x340Var).j;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 6.0f, 0.0f, 0.0f, 13);
            boolean z3 = (i2 & 896) == 256;
            if ((i2 & 112) == 32) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                bxvVar = this;
                objT2 = new wrs(bxvVar, iu30Var, (byte) 29);
                x340Var.s0(objT2);
            } else {
                bxvVar = this;
            }
            uwo1.f(wmo1.y(i3, 2131955296, "manage_settings", (zma1) null, (iu30) objT2, x340Var, 8), qim0VarB, lee1Var2, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4088);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            bxvVar = this;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(bxvVar, z, iu30Var, i, (byte) 14);
        }
    }

    public final void e(eyv eyvVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(373056926);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(eyvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? x340Var.g(this) : x340Var.i(this) ? 2048 : 1024;
        }
        int i4 = i3;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            xtb0 xtb0VarA = vpb1.A(x340Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = yv91.a(new ih1(xtb0VarA, (byte) 16));
                x340Var.s0(objT);
            }
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(x340Var).g;
            j2i j2iVarR = apo.r(667813963, new lpk((tob1) objT, (byte) 3), x340Var);
            j2i j2iVarR2 = apo.r(917915242, new zwv(this, eyvVar, iu30Var), x340Var);
            j2i j2iVarR3 = apo.r(1484722245, new k8(this, xtb0VarA, eyvVar, iu30Var, (byte) 26), x340Var);
            int i5 = ((i4 >> 3) & 14) | 25008;
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, j2iVarR, j2iVarR2, u85Var, j2iVarR3, x340Var, i5, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, eyvVar, qim0Var2, iu30Var, (byte) 10);
        }
    }

    public final void f(xtb0 xtb0Var, vzq0 vzq0Var, eyv eyvVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        eyv eyvVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1611551848);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xtb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vzq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            eyvVar2 = eyvVar;
            i2 |= x340Var.g(eyvVar2) ? 256 : 128;
        } else {
            eyvVar2 = eyvVar;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? x340Var.g(this) : x340Var.i(this) ? 16384 : 8192;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            q1d0 q1d0VarN = jyo1.n(xtb0Var, this.b.i, (h3h1) null, x340Var, 4);
            qim0 qim0VarL = bmq0.L(u291.d(nim0.a, 1.0f), k1o1.q(x340Var), (g6o0) null);
            boolean zI = ((i3 & 896) == 256) | ((57344 & i3) == 16384 || ((i3 & 32768) != 0 && x340Var.i(this))) | ((i3 & 7168) == 2048) | x340Var.i(q1d0VarN);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                ggh gghVar = new ggh((Object) q1d0VarN, (Object) eyvVar2, (Object) this, iu30Var, (byte) 25);
                x340Var.s0(gghVar);
                objT = gghVar;
            }
            ujo1.d(qim0VarL, xtb0Var, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, (i3 << 3) & 1008, 504);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 4, i, (Object) this, (Object) xtb0Var, (Object) vzq0Var, (Object) eyvVar, (Object) iu30Var);
        }
    }
}
