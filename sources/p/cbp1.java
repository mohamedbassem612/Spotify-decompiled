package p;

import com.spotify.timesyncedtext.v1.GetTimeSyncedTextResponse;
import com.spotify.timesyncedtext.v1.TimeSyncedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class cbp1 {
    public static b180 a;
    public static b180 b;

    public static final void a(float f, float f2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2056677075);
        int i2 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.d(f2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(qim0Var3, 1.0f), 0.0f, f, 0.0f, 0.0f, 13);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarK = d9y0.k(u291.j(56.0f, 0.0f, 2, qim0VarB), f2);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarK);
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
            String strO0 = cwl1.o0(x340Var, 2131952023);
            lee1 lee1Var = cbx.d(x340Var).k;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0Var3, er31.b(4.0f)), ((vex) zex.a.e).c, d4o1.a);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.y(qim0VarF, 4.0f, 2.0f), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k82(f, f2, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1734378955);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            irn1.u(null, qxi.b, null, null, apo.r(-941028818, new oa5(function0, (byte) 9), x340Var), x340Var, 24624, 13);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function0, i, (byte) 0);
        }
    }

    public static final void c(iu30 iu30Var, yiv0 yiv0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1455259582);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(yiv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(nim0.a) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nyx.a(3, (wux) null, apo.r(294542859, new hws0(iu30Var, yiv0Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(iu30Var, yiv0Var, i);
        }
    }

    public static final void d(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        String str2 = str;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-998333222);
        int i2 = (x340Var2.g(str2) ? 4 : 2) | i | (x340Var2.g(qim0Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            mpx mpxVar = mpx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var2).g;
            nim0 nim0Var = nim0.a;
            w0h1.a(mpxVar, isl.a, u291.r(nim0Var, 48.0f), cbx.a(x340Var2).b.a, 0L, false, x340Var2, mpx.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(ydh.g(8.0f, 2131959351, x340Var2, x340Var2, nim0Var), null, cbx.d(x340Var2).d, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            str2 = str;
            uwo1.e(str2, null, kk0.p(nim0Var, 8.0f, x340Var2, x340Var2).g, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, i2 & 14, 0, 2034);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str2, qim0Var, i, (byte) 12);
        }
    }

    public static final void e(yiv0 yiv0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1112935268);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(yiv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (yiv0Var.c == 2) {
                x340Var.i0(-1692735255);
                f(iu30Var, x340Var, (i3 >> 3) & 126);
                x340Var.r(false);
            } else {
                x340Var.i0(-1692676417);
                c(iu30Var, yiv0Var, x340Var, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | (i3 & 896));
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(yiv0Var, iu30Var, qim0Var2, i, (byte) 27);
        }
    }

    public static final void f(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1083094868);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.g(nim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarB = uyn1.B(nim0Var, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new smt0(iu30Var, (byte) 15);
                x340Var.s0(objT);
            }
            foo1.g(new gbx(z50.c, (Function0) objT), qim0VarB, jax.a, yla.s(x340Var), null, null, g9j.a, g9j.b, x340Var, 14156160, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30(iu30Var, i, (byte) 29);
        }
    }

    public static final void g(qim0 qim0Var, float f, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        float f2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-609138673);
        int i2 = i | 54 | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            ven0 ven0VarS = v8r.s(bool, x340Var);
            Boolean bool2 = (Boolean) ven0VarS.getValue();
            bool2.getClass();
            boolean zI = ((i2 & 896) == 256) | x340Var.i(ven0VarS);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new uk90(function0, ven0VarS, (lnm) null, (byte) 2);
                x340Var.s0(objT2);
            }
            qxd0.t(bool2, x340Var, (vu30) objT2);
            boolean zI2 = x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new i2g1(ven0Var, (byte) 16);
                x340Var.s0(objT3);
            }
            f2 = 50.0f;
            ef6 ef6Var = new ef6(50.0f, (iu30) objT3, (byte) 8);
            qim0Var2 = nim0.a;
            qim0 qim0VarX = ern1.x(qim0Var2, ef6Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            f2 = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ys((Object) qim0Var2, f2, (Object) function0, (Object) j2iVar, i, (byte) 15);
        }
    }

    public static final String h(String str, String str2) {
        return f4i1.f(str, "_", str2);
    }

    public static long i(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static ti30 j(th30 th30Var, zf30 zf30Var) {
        return new ti30(zf30Var.getClass(), th30Var.f0(zf30Var), zf30Var.f, -1);
    }

    public static ti30 k(zf30 zf30Var) {
        return new ti30(zf30Var.getClass(), null, zf30Var.f, -1);
    }

    public static final b180 l() {
        b180 b180Var = a;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.CollectionActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(3.0f, 22.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        cwh0VarG.u(3.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, 2.0f, 0.0f);
        cwh0VarG.v(18.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        cwh0VarG.l(15.5f, 2.134f);
        cwh0VarG.b(1.0f, 1.0f, false, false, 14.0f, 3.0f);
        cwh0VarG.v(18.0f);
        cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        cwh0VarG.i(6.0f);
        cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        cwh0VarG.u(6.464f);
        cwh0VarG.c(1.0f, 1.0f, false, false, -0.5f, -0.866f);
        cwh0VarG.e();
        cwh0VarG.l(9.0f, 2.0f);
        cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        cwh0VarG.v(18.0f);
        cwh0VarG.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
        cwh0VarG.u(3.0f);
        cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        a = b180VarB;
        return b180VarB;
    }

    public static final int m(long j) {
        return (int) (j >> 32);
    }

    public static final int n(long j) {
        return (int) (j & 4294967295L);
    }

    public static yok0 o() {
        r6h1 r6h1Var = r6h1.c;
        return new yok0((byte) 22);
    }

    public static final nn61 p() {
        n7o0 n7o0Var = n7o0.a;
        nn61 nn61Var = new nn61((byte) 23);
        nn61Var.b = n7o0Var;
        nn61Var.c = ytw0.i;
        return nn61Var;
    }

    public static final mwz0 q(GetTimeSyncedTextResponse getTimeSyncedTextResponse) {
        h290<TimeSyncedText> h290VarN = getTimeSyncedTextResponse.n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (TimeSyncedText timeSyncedText : h290VarN) {
            arrayList.add(new kwz0(timeSyncedText.p(), new n5f0(timeSyncedText.o(), timeSyncedText.n())));
        }
        return new mwz0(arrayList);
    }

    public static final int r(c2b0 c2b0Var) {
        int iOrdinal = c2b0Var.ordinal();
        if (iOrdinal == 0) {
            return 5;
        }
        if (iOrdinal == 1) {
            return 3;
        }
        if (iOrdinal == 2) {
            return 4;
        }
        if (iOrdinal == 3) {
            return 2;
        }
        if (iOrdinal == 4) {
            return 1;
        }
        eg.o();
        return 0;
    }

    public static final mwz0 s(mwz0 mwz0Var, long j, Long l) {
        List list = mwz0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            kwz0 kwz0Var = (kwz0) obj;
            if (Long.valueOf(kwz0Var.b.b).longValue() >= j && (l == null || Long.valueOf(kwz0Var.b.a).longValue() <= l.longValue())) {
                arrayList.add(obj);
            }
        }
        return new mwz0(arrayList);
    }
}
