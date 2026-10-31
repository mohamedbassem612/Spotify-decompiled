package p;

import android.net.Uri;
import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class qej1 {
    public static final pxg1 a = irn1.o0(500, 0, new ceo(0.3f, 0.0f, 0.4f, 1.0f), 2);

    public static final void a(vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1375826951);
        if ((i & 48) == 0) {
            i2 = (x340Var.i(vu30Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarA = h2c.a.a(uyn1.B(u291.f(nim0.a, 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2), een.X);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (vu30Var == null) {
                x340Var.i0(-464021738);
                x340Var.r(false);
            } else {
                x340Var.i0(-1954631093);
                us71.j((i2 >> 3) & 14, vu30Var, x340Var, false);
            }
            op71.g(x340Var, new wnb0(1.0f, true));
            f(x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u9o(vu30Var, i, (byte) 3);
        }
    }

    public static final void b(zej1 zej1Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var;
        Function0 function2 = function1;
        String str = zej1Var.a;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1841858106);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(zej1Var) ? 4 : 2) | (x340Var2.i(function0) ? 32 : 16) | (x340Var2.i(function2) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            String strN0 = cwl1.n0(2131962420, new Object[]{str}, x340Var2);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            if (0.9f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(0.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.9f, true);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = l6j1.N0;
                x340Var = x340Var2;
                x340Var.s0(objT);
            } else {
                x340Var = x340Var2;
            }
            qim0 qim0VarB2 = s161.b(wnb0Var, true, (iu30) objT);
            boolean z2 = zej1Var.t.length() > 0;
            boolean z3 = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new sah1(function0, (byte) 28);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = bin.x(qim0VarB2, z2, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 14);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            j(0, str, x340Var, zej1Var.b);
            h(zej1Var.c, zej1Var.m, x340Var, 0);
            x340Var.r(true);
            if (0.1f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var2 = new wnb0(0.1f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.1f, true);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            boolean zG = x340Var.g(strN0);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new ysf1(strN0, (byte) 24);
                x340Var.s0(objT3);
            }
            function2 = function1;
            x340Var2 = x340Var;
            wro1.h(new gbx(z50.c, function2), ldx.c, s161.b(nim0Var, false, (iu30) objT3), (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, mqj.b, x340Var2, 0, 6, 984);
            x340Var2.r(true);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new pej1(zej1Var, function0, function2, i, (byte) 0);
        }
    }

    public static final void c(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1821047827);
        int i2 = i | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarA = h2c.a.a(uyn1.B(nim0Var, 0.0f, 8.0f, 8.0f, 0.0f, 9), een.f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarA, ((vex) zex.a.e).d, er31.b(4.0f));
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
            uwo1.e(str, uyn1.x(nim0Var, 4.0f), cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zsd1(str, i, (byte) 21);
        }
    }

    public static final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-548673599);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarC = u291.c(u291.f(nim0Var, 1.0f), 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarC, cbx.a(x340Var).a.a.a(), d4o1.a);
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
            qim0 qim0VarA = h2c.a.a(nim0Var, een.h);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(xtx.c, isl.a, u291.r(qim0VarA, 32.0f), 0L, 0L, false, x340Var, xtx.d | 48, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c1j1(i, (byte) 5);
        }
    }

    public static final void e(zej1 zej1Var, boolean z, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-890890386);
        int i2 = i | (x340Var.i(zej1Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(vu30Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(iu30Var2) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (zej1Var.l != 2) {
                ven0Var.setValue(Boolean.FALSE);
            }
            if (z) {
                x340Var.i0(-1912174446);
                g(zej1Var, x340Var, i2 & 126);
                x340Var.r(false);
            } else {
                x340Var.i0(-1912121033);
                if (zej1Var.n) {
                    x340Var.i0(-1912096915);
                    d(x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1912041394);
                    boolean zI = x340Var.i(ven0Var);
                    Object objT2 = x340Var.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new aya1(ven0Var, (byte) 24);
                        x340Var.s0(objT2);
                    }
                    k(zej1Var, iu30Var2, new qkn0((Function0) objT2, (byte) 11), ((Boolean) ven0Var.getValue()).booleanValue(), iu30Var, null, x340Var, ((i2 << 3) & 458752) | (i2 & 126) | ((i2 >> 9) & 896));
                    String str = zej1Var.o;
                    if (str == null) {
                        x340Var.i0(-1911758892);
                    } else {
                        x340Var.i0(-1911758891);
                        c(str, x340Var, 6);
                    }
                    x340Var.r(false);
                    a(vu30Var, x340Var, ((i2 >> 6) & 112) | 6);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(zej1Var, z, vu30Var, iu30Var, iu30Var2, i);
        }
    }

    public static final void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1604932772);
        if (x340Var.Y(i & 1, i != 0)) {
            gfx.b(6, mqj.a, x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c1j1(i, (byte) 6);
        }
    }

    public static final void g(zej1 zej1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1053044273);
        int i2 = (x340Var.i(zej1Var) ? 32 : 16) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (zej1Var.n) {
            x340Var.i0(-800725520);
            d(x340Var, 0);
            x340Var.r(false);
        } else {
            x340Var.i0(-800684662);
            i(zej1Var.g, x340Var, 6);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new muh1(zej1Var, i, (byte) 18);
        }
    }

    public static final void h(String str, m4m m4mVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(678118447);
        int i2 = 2;
        int i3 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.e(m4mVar.ordinal()) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = m4mVar.ordinal();
            if (iOrdinal == 0) {
                i2 = 1;
            } else if (iOrdinal != 1) {
                i2 = 0;
            }
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (i2 != 0) {
                x340Var.i0(670517199);
                kqn1.d(i2, 0, 0, x340Var, uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                x340Var.r(false);
            } else {
                x340Var.i0(670653847);
                x340Var.r(false);
            }
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, i3 & 14, 0, 1778);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eii1(str, m4mVar, i, (byte) 9);
        }
    }

    public static final void i(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1315483417);
        int i3 = i & 6;
        h2c h2cVar = h2c.a;
        if (i3 == 0) {
            i2 = (x340Var.i(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            eso1.e(Uri.parse(str), isl.a, h2cVar.a(u291.f(nim0.a, 1.0f), een.h), null, null, null, null, null, null, null, false, false, x340Var, 224304, 0, 4032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jea1(str, i, (byte) 1);
        }
    }

    public static final void j(int i, String str, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1231020494);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = z ? 2 : 1;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 2.0f, 7);
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarB, cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(i3), 0, (qx8) null, x340Var, i2 & 14, 0, 1712);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mv8((byte) 18, i, str, z);
        }
    }

    public static final void k(zej1 zej1Var, iu30 iu30Var, qkn0 qkn0Var, boolean z, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-85905736);
        int i2 = (x340Var.i(zej1Var) ? 32 : 16) | i;
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | (x340Var.i(qkn0Var) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192);
        if ((196608 & i) == 0) {
            i3 |= x340Var.i(iu30Var2) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if (x340Var.Y(i4 & 1, (599187 & i4) != 599186)) {
            qim0Var2 = nim0.a;
            if (iu30Var2 == null) {
                x340Var.i0(583011139);
                x340Var.r(false);
            } else {
                x340Var.i0(583011140);
                qim0 qim0VarA = h2c.a.a(u291.f(qim0Var2, 1.0f), een.h);
                boolean zG = ((i4 & 896) == 256) | x340Var.g(iu30Var2) | x340Var.i(qkn0Var);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new jyi1(iu30Var2, qkn0Var, iu30Var);
                    x340Var.s0(objT);
                }
                dm5.a((iu30) objT, qim0VarA, (iu30) null, x340Var, 0, 4);
                x340Var.r(false);
            }
            boolean z2 = (z || zej1Var.l == 2) ? false : true;
            pxg1 pxg1Var = a;
            fq7.g(z2, (qim0) null, xay.e(2, pxg1Var), xay.f(2, pxg1Var), (String) null, apo.r(-283098224, new g2j1(zej1Var, (byte) 6), x340Var), x340Var, 196608, 18);
            x340Var = x340Var;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(zej1Var, iu30Var, qkn0Var, z, iu30Var2, qim0Var2, i, (byte) 25);
        }
    }

    public static final void l(zej1 zej1Var, Function0 function0, String str, Function0 function1, Function0 function2, Function0 function3, qim0 qim0Var, vu30 vu30Var, iu30 iu30Var, b0k b0kVar, int i) {
        zej1 zej1Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        String strN0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-627911304);
        int i2 = i | (b0kVar3.i(zej1Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.g(str) ? 256 : 128) | (b0kVar3.i(function1) ? 2048 : 1024) | (b0kVar3.i(function2) ? 16384 : 8192) | (b0kVar3.i(function3) ? 131072 : 65536) | 1572864;
        if (b0kVar3.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = (x191) function0.invoke();
                b0kVar3.s0(objT);
            }
            x191 x191Var = (x191) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q((Object) null);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            String str2 = zej1Var.a;
            String str3 = zej1Var.c;
            if (ihc1.y0(str2)) {
                strN0 = x0d.k(b0kVar3, -1845928865, 2131963771, b0kVar3, false);
            } else if (ihc1.y0(str3)) {
                b0kVar3.i0(-1845925496);
                strN0 = cwl1.n0(2131963772, new Object[]{str2}, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1845922489);
                strN0 = cwl1.n0(2131963770, new Object[]{str2, str3}, b0kVar3);
                b0kVar3.r(false);
            }
            zej1Var2 = zej1Var;
            b0kVar2 = b0kVar3;
            nyx.a(2, (wux) null, apo.r(2103237957, new zx(zej1Var, strN0, function1, function2, function3, vu30Var, iu30Var, ven0Var2, ven0Var), b0kVar3), b0kVar2, 3078, 6);
            if (zej1Var2.l == 2 && !zej1Var2.n && !zej1Var2.s) {
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) ven0Var2.getValue();
                x191Var.f(new ltf1(ven0Var, (byte) 11));
                if (videoSurfaceView != null) {
                    x191Var.b(videoSurfaceView, zej1Var2.d, zej1Var2.h, zej1Var2.i, zej1Var2.e, zej1Var2.u, zej1Var2.f);
                }
            }
            qim0Var2 = nim0.a;
        } else {
            zej1Var2 = zej1Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zx(zej1Var2, function0, str, function1, function2, function3, qim0Var2, vu30Var, iu30Var, i);
        }
    }
}
