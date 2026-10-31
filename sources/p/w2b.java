package p;

import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class w2b {
    public static final long a = fc11.G(12);
    public static final long b = fc11.G(8);
    public static final vy5 c = vy5.c;

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1959439051);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131952742);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), new idx(4), u291.f(qim0Var, 1.0f), z ? jax.a : new hax(strO0), null, null, null, null, null, null, apo.r(-467762038, new nl(strO0, (byte) 28), x340Var), x340Var, 0, 48, 2024);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, function0, qim0Var, i, (byte) 2);
        }
    }

    public static final void b(String str, euc1 euc1Var, it8 it8Var, vu30 vu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws Throwable {
        vu30 vu30Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        k6a1 k6a1Var;
        y7e1 y7e1Var;
        Object f80Var;
        int i2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2007225346);
        int i3 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(euc1Var) ? 32 : 16) | (b0kVar3.g(it8Var) ? 256 : 128) | (b0kVar3.i(vu30Var) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192) | 196608;
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new y7e1(str == null ? "" : str, 2);
                b0kVar3.s0(objT);
            }
            y7e1 y7e1Var2 = (y7e1) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = yv91.a(new tr1(y7e1Var2, (byte) 3));
                b0kVar3.s0(objT2);
            }
            tob1 tob1Var = (tob1) objT2;
            k6a1 k6a1Var2 = (k6a1) b0kVar3.k(t4k.q);
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = pzm.i(b0kVar3);
            }
            lz20 lz20Var = (lz20) objT3;
            int i4 = i3 & 896;
            int i5 = i3 & 7168;
            boolean zI = (i4 == 256) | b0kVar3.i(k6a1Var2) | (i5 == 2048) | b0kVar3.i(y7e1Var2);
            Object objT4 = b0kVar3.T();
            if (zI || objT4 == m4cVar) {
                k6a1Var = k6a1Var2;
                y7e1Var = y7e1Var2;
                i2 = i4;
                f80Var = new f80(it8Var, k6a1Var, vu30Var, y7e1Var, (byte) 12);
                b0kVar3.s0(f80Var);
            } else {
                k6a1Var = k6a1Var2;
                i2 = i4;
                y7e1Var = y7e1Var2;
                f80Var = objT4;
            }
            Function0 function1 = (Function0) f80Var;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            boolean z = i2 == 256;
            Object objT5 = b0kVar3.T();
            if (z || objT5 == m4cVar) {
                objT5 = new kk(it8Var, (lnm) null, (byte) 25);
                b0kVar3.s0(objT5);
            }
            rih1 rih1Var = rih1.a;
            qxd0.t(rih1Var, b0kVar3, (vu30) objT5);
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarD, lhc.g(b0kVar3).c);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            qim0Var2 = qim0Var3;
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarY);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            d((i3 >> 12) & 14, function0, b0kVar3, null);
            rqo1.g(0, 1, b0kVar3, null);
            y7e1 y7e1Var3 = y7e1Var;
            b0kVar2 = b0kVar3;
            vu30Var2 = vu30Var;
            k6a1 k6a1Var3 = k6a1Var;
            e(y7e1Var3, lz20Var, function1, new wnb0(1.0f, true), b0kVar2, 0);
            boolean zI2 = b0kVar2.i(k6a1Var3) | (i5 == 2048);
            Object objT6 = b0kVar2.T();
            if (zI2 || objT6 == m4cVar) {
                objT6 = new hj8(k6a1Var3, vu30Var2, (byte) 13);
                b0kVar2.s0(objT6);
            }
            i(euc1Var, it8Var, (vu30) objT6, null, b0kVar2, (i3 >> 3) & 126);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            c(uyn1.z(0.0f, 12.0f, 1, qim0VarZ), b0kVar2, 0);
            boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            a(0, function1, b0kVar2, uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 16.0f, 7), zBooleanValue);
            b0kVar2.r(true);
            boolean zI3 = b0kVar2.i(lz20Var);
            Object objT7 = b0kVar2.T();
            if (zI3 || objT7 == m4cVar) {
                objT7 = new fx1(lz20Var, null, (byte) 2);
                b0kVar2.s0(objT7);
            }
            qxd0.t(rih1Var, b0kVar2, (vu30) objT7);
        } else {
            vu30Var2 = vu30Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new k40(str, euc1Var, it8Var, vu30Var2, function0, qim0Var2, i, (byte) 9);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1594293978);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            f65 f65Var = (f65) x340Var.k(t4k.s);
            String strO0 = cwl1.o0(x340Var, 2131952744);
            String strO1 = cwl1.o0(x340Var, 2131952745);
            String strO2 = cwl1.o0(x340Var, 2131952746);
            int iW0 = ihc1.w0(strO0, strO1, 0, false, 6);
            ye5 ye5VarO = kk0.o(-1186799514, x340Var);
            ye5VarO.g(strO0.substring(0, iW0));
            boolean zI = x340Var.i(f65Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new j03(f65Var, (byte) 1);
                x340Var.s0(objT);
            }
            vhg.c(ye5VarO, strO1, strO2, vhg.a, (iu30) objT);
            ye5VarO.g(strO0.substring(strO1.length() + iW0));
            af5 af5VarP = ye5VarO.p();
            x340Var.r(false);
            uwr uwrVar = cbx.a;
            uwo1.d(af5VarP, cbx.a(x340Var).b.b, u291.f(qim0Var, 1.0f), cbx.d(x340Var).m, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4080);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 12);
        }
    }

    public static final void d(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1243320728);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131952743);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            qim0Var2 = qim0Var3;
            foo1.c(gbxVar, ldxVar, h2cVar.a(qim0Var3, graVar), null, gdxVarS, null, null, null, null, null, apo.r(-78803469, new nl(strO0, (byte) 29), x340Var), x340Var, 0, 48, 2008);
            String strO1 = cwl1.o0(x340Var, 2131952749);
            uwr uwrVar = cbx.a;
            uwo1.e(strO1, h2cVar.a(qim0Var2, een.h), cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var2, i, (byte) 6);
        }
    }

    public static final void e(y7e1 y7e1Var, lz20 lz20Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(884345653);
        int i2 = i | (x340Var2.i(y7e1Var) ? 4 : 2) | (x340Var2.i(lz20Var) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(qim0Var) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).b.a;
            long j2 = cbx.a(x340Var2).b.b;
            long j3 = cbx.a(x340Var2).b.b;
            long j4 = cbx.a(x340Var2).b.d;
            long j5 = u7h.j;
            fyx fyxVar = new fyx(new zxx(j, j2, j3, j4, j5, j5, cbx.a(x340Var2).b.c, 0L, 896));
            String strO0 = cwl1.o0(x340Var2, 2131952748);
            lee1 lee1Var = cbx.d(x340Var2).l;
            qim0 qim0VarP = vby0.p(u291.f(nim0.a, 1.0f).then(new wnb0(1.0f, true)), lz20Var);
            c6e1 c6e1Var = new c6e1(3, 0, 2);
            kua0 kua0Var = new kua0(3, (Boolean) null, 0, 2, 118);
            boolean zI = x340Var2.i(y7e1Var) | ((i2 & 896) == 256);
            Object objT = x340Var2.T();
            if (zI || objT == obj) {
                objT = new u2b(y7e1Var, function0, (byte) 0);
                x340Var2.s0(objT);
            }
            rwo1.a(y7e1Var, fyxVar, qim0VarP, null, strO0, null, null, false, c, lee1Var, kua0Var, (yta0) objT, c6e1Var, null, null, null, null, null, 0.0f, false, x340Var2, i2 & 14, 0, 0, 2081256);
            x340Var = x340Var2;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = yv91.a(new tr1(y7e1Var, (byte) 4));
                x340Var.s0(objT2);
            }
            String str = ((Number) ((tob1) objT2).getValue()).intValue() + " / 2000";
            lee1 lee1Var2 = cbx.d(x340Var).m;
            long j6 = cbx.a(x340Var).b.b;
            tq60 tq60Var = new tq60(een.R0);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(tq60Var, 16.0f, 0.0f, 16.0f, 12.0f, 2), lee1Var2, j6, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, y7e1Var, lz20Var, function0, qim0Var, (byte) 23);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2077412920);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarH = u291.h(qim0Var, ((wat) x340Var.k(t4k.h)).y(a));
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(qim0VarH, cbx.a(x340Var).a.b.a(), er31.b(2.0f), 12), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 13);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2041621024);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            float fY = ((wat) x340Var.k(t4k.h)).y(b);
            float fM = dsa0.m(x340Var, 2131165371);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarC = u291.c(u291.v(qim0Var2, fM), 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarE = d1u.E(1.0f, jA, qim0VarC, er31.b(8.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarE, 16.0f);
            mbh mbhVarA = jbh.a(new d36(fY, false, new g21(een.N0, (byte) 28)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
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
            qim0 qim0VarF = u291.f(qim0Var2, 0.7f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            f(uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 4.0f, 7), x340Var, 0);
            f(u291.f(qim0Var2, 0.9f), x340Var, 0);
            f(u291.f(qim0Var2, 0.5f), x340Var, 0);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 14);
        }
    }

    public static final void h(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1237853191);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | 384 | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = vq9.X0;
                b0kVar3.s0(objT);
            }
            vu30 vu30Var = (vu30) objT;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            hdx hdxVar = new hdx(0, (vu30) null, (vu30) null, vu30Var, er31.b(8.0f), 7);
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
            float fM = dsa0.m(b0kVar3, 2131165371);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarC = u291.c(u291.v(qim0Var3, fM), 1.0f);
            String strF = f4i1.f(str, ". ", str2);
            if (ihc1.y0(strF)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(strF), function0), hdxVar, qim0VarC, null, null, zzq0Var, null, null, null, null, apo.r(-343682776, new b4(str, str2, (byte) 4), b0kVar3), b0kVar2, 0, 48, 1976);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hq6(str, str2, qim0Var2, function0, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(euc1 euc1Var, it8 it8Var, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) throws Throwable {
        x340 x340Var;
        qim0 qim0Var2;
        qim0 qim0Var3;
        ktc1 ktc1Var;
        Integer num;
        qim0 qim0Var4;
        Throwable th;
        it8 it8Var2 = it8Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1045737160);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var2.g(euc1Var) : x340Var2.i(euc1Var) ? 4 : 2) | i : i;
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(it8Var2) : x340Var2.i(it8Var2) ? 32 : 16;
        }
        vu30 vu30Var2 = vu30Var;
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(vu30Var2) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        boolean z = false;
        if (x340Var2.Y(i4 & 1, (i4 & 1171) != 1170)) {
            qim0 qim0Var5 = nim0.a;
            qim0 qim0VarT = l6o1.t(sgc1.D(2, u291.f(qim0Var5, 1.0f)), l6o1.C(0, 0, 1, x340Var2), 14);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarT);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            Throwable th2 = null;
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            if (u890.j(euc1Var, duc1.a)) {
                x340Var2.i0(-1094348754);
                for (int i5 = 0; i5 < 3; i5++) {
                    g(null, x340Var2, 0);
                }
                x340Var2.r(false);
                qim0Var3 = qim0Var5;
                x340Var = x340Var2;
            } else {
                if (!(euc1Var instanceof cuc1)) {
                    throw p3d1.k(x340Var2, 795981354, false);
                }
                x340Var2.i0(-1094214772);
                int i6 = 0;
                for (Object obj : ((cuc1) euc1Var).a) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        Throwable th3 = th2;
                        p7h.T();
                        throw th3;
                    }
                    ktc1 ktc1Var2 = (ktc1) obj;
                    Integer numValueOf = Integer.valueOf(i6);
                    String str = ktc1Var2.a;
                    int i8 = i4 & 112;
                    boolean zE = (i8 == i3 || ((i4 & 64) != 0 && x340Var2.i(it8Var2))) | x340Var2.e(i6) | x340Var2.i(ktc1Var2);
                    Object objT = x340Var2.T();
                    if (zE || objT == m4cVar) {
                        qim0 qim0Var6 = qim0Var5;
                        ktc1Var = ktc1Var2;
                        num = numValueOf;
                        qim0Var4 = qim0Var6;
                        v2b v2bVar = new v2b(it8Var2, i6, ktc1Var, (lnm) null, (byte) 0);
                        th = null;
                        x340Var2.s0(v2bVar);
                        objT = v2bVar;
                    } else {
                        qim0Var4 = qim0Var5;
                        num = numValueOf;
                        th = null;
                        ktc1Var = ktc1Var2;
                    }
                    qxd0.s(num, str, (vu30) objT, x340Var2);
                    String str2 = ktc1Var.a;
                    String str3 = ktc1Var.b;
                    boolean zE2 = (i8 == 32 || ((i4 & 64) != 0 && x340Var2.i(it8Var2))) | x340Var2.e(i6) | x340Var2.i(ktc1Var) | ((i4 & 896) == 256);
                    Object objT2 = x340Var2.T();
                    if (zE2 || objT2 == m4cVar) {
                        ka0 ka0Var = new ka0(it8Var2, i6, ktc1Var, vu30Var2, (byte) 2);
                        x340Var2.s0(ka0Var);
                        objT2 = ka0Var;
                    }
                    h(0, str2, str3, (Function0) objT2, x340Var2, null);
                    it8Var2 = it8Var;
                    vu30Var2 = vu30Var;
                    i6 = i7;
                    qim0Var5 = qim0Var4;
                    i3 = 32;
                    th2 = th;
                    z = false;
                }
                qim0Var3 = qim0Var5;
                x340Var = x340Var2;
                x340Var.r(z);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, euc1Var, it8Var, vu30Var, qim0Var2, (byte) 3);
        }
    }
}
