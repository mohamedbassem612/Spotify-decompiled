package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.player.model.ContextTrack;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.npvwidget.WidgetUpdateCoordinator;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class i1k0 implements k1k0 {
    public static int a = 4;
    public static boolean b;
    public static fna c;
    public static b180 d;

    public static final ajm1 A(WrappedWidgetResources wrappedWidgetResources) {
        List<String> listM = p7h.M(new String[]{wrappedWidgetResources.u(), wrappedWidgetResources.y(), wrappedWidgetResources.w(), wrappedWidgetResources.v(), wrappedWidgetResources.s(), wrappedWidgetResources.t(), wrappedWidgetResources.x(), wrappedWidgetResources.r(), wrappedWidgetResources.p(), wrappedWidgetResources.o(), wrappedWidgetResources.q(), wrappedWidgetResources.n()});
        if (!(listM instanceof Collection) || !listM.isEmpty()) {
            for (String str : listM) {
                str.getClass();
                if (str.length() == 0) {
                    hhg1.n("Backend returned empty required fields");
                    return null;
                }
            }
        }
        return new ajm1(wrappedWidgetResources.u(), wrappedWidgetResources.y(), wrappedWidgetResources.w(), wrappedWidgetResources.v(), wrappedWidgetResources.s(), wrappedWidgetResources.t(), wrappedWidgetResources.x(), wrappedWidgetResources.r(), wrappedWidgetResources.p(), wrappedWidgetResources.o(), wrappedWidgetResources.q(), wrappedWidgetResources.n());
    }

    public static final void B(String str) {
        fna fnaVar;
        if (!b || i3a.g(5) > i3a.g(a) || str.length() <= 0 || (fnaVar = c) == null || fnaVar == null) {
            return;
        }
        fnaVar.l(str, "VERBOSE");
    }

    public static final void C(String str) {
        fna fnaVar;
        if (!b || i3a.g(2) > i3a.g(a) || str.length() <= 0 || (fnaVar = c) == null || fnaVar == null) {
            return;
        }
        fnaVar.l(str, "WARN");
    }

    public static final void a(hb51 hb51Var, umf0 umf0Var, pt3 pt3Var, pt3 pt3Var2, ldo ldoVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        ldo ldoVar2;
        qim0 qim0Var2;
        Function0 function0;
        boolean z;
        umf0 umf0Var2 = umf0Var;
        String str = hb51Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(988899080);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hb51Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(umf0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(pt3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(pt3Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            ldoVar2 = ldoVar;
            i2 |= x340Var.i(ldoVar2) ? 16384 : 8192;
        } else {
            ldoVar2 = ldoVar;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarF, lhc.g(x340Var).l);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z2) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            otw.c(ldoVar2, new vt3(str, hb51Var.d), (qim0) null, (ipb1) null, x340Var, (i3 >> 12) & 14, 12);
            pbh pbhVar = pbh.a;
            qim0 qim0VarA = pbhVar.a(1.0f, qim0Var3, true);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (ihc1.y0(str)) {
                x340Var.i0(686879174);
                otw.c(pt3Var, new mt3(hb51Var.c), (qim0) null, (ipb1) null, x340Var, (i3 >> 6) & 14, 12);
                x340Var.r(false);
            } else {
                if (hb51Var.i) {
                    x340Var.i0(687082565);
                    otw.c(pt3Var2, new zt3(!hb51Var.l.equals("SHOW_CATEGORY")), (qim0) null, (ipb1) null, x340Var, (i3 >> 9) & 14, 12);
                    x340Var.r(false);
                } else {
                    if (hb51Var.j) {
                        x340Var.i0(687362960);
                        qim0 qim0VarD2 = u291.d(qim0Var3, 1.0f);
                        mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var, 0);
                        int iHashCode3 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM3 = x340Var.m();
                        qim0 qim0VarE3 = zr7.E(x340Var, qim0VarD2);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function0);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(mbhVarA2, x340Var, lljVar);
                        nko1.H(xos0VarM3, x340Var, lljVar2);
                        x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                        nko1.H(qim0VarE3, x340Var, lljVar4);
                        qim0 qim0VarA2 = pbhVar.a(1.0f, qim0Var3, true);
                        gfh0 gfh0VarC2 = t1c.c(graVar, false);
                        int iHashCode4 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM4 = x340Var.m();
                        qim0 qim0VarE4 = zr7.E(x340Var, qim0VarA2);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function0);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var, lljVar);
                        nko1.H(xos0VarM4, x340Var, lljVar2);
                        x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                        nko1.H(qim0VarE4, x340Var, lljVar4);
                        otw.c(pt3Var, lt3.a, (qim0) null, (ipb1) null, x340Var, ((i3 >> 6) & 14) | 48, 12);
                        x340Var.r(true);
                        boolean z3 = (i3 & 458752) == 131072;
                        Object objT = x340Var.T();
                        if (z3 || objT == fkj0.X) {
                            objT = new ge3(iu30Var, (byte) 5);
                            x340Var.s0(objT);
                        }
                        foo1.c(new gbx(z50.c, (Function0) objT), ldx.c, uyn1.x(qim0Var3, 16.0f), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, y5i.a, x340Var, 0, 48, 2040);
                        x340Var = x340Var;
                        x340Var.r(true);
                        x340Var.r(false);
                    } else {
                        if (!hb51Var.e.isEmpty() || hb51Var.h) {
                            x340Var.i0(688363051);
                            umf0Var2 = umf0Var;
                            h(hb51Var, umf0Var2, iu30Var, x340Var, (i3 & 126) | ((i3 >> 9) & 896));
                            x340Var.r(false);
                        } else {
                            x340Var.i0(688174602);
                            otw.c(pt3Var, new nt3(str), (qim0) null, (ipb1) null, x340Var, (i3 >> 6) & 14, 12);
                            x340Var.r(false);
                        }
                        z = true;
                    }
                    umf0Var2 = umf0Var;
                    z = true;
                }
                x340Var.r(z);
                x340Var.r(z);
                qim0Var2 = qim0Var3;
            }
            z = true;
            x340Var.r(z);
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(hb51Var, umf0Var2, pt3Var, pt3Var2, ldoVar, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1051199985);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131953565);
            String strO1 = cwl1.o0(x340Var, R.string.cancel);
            String strO2 = cwl1.o0(x340Var, 2131953567);
            String strO3 = cwl1.o0(x340Var, 2131953566);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new cb(function1, ven0Var, (byte) 8);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(-1691661108);
                i3u i3uVar = new i3u(4, false, false, false);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function2, i3uVar, (hux) null, strO2, strO3, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function1)), x340Var, 2359344, 4);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(-1691158381);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 9);
        }
    }

    public static final void c(gbx gbxVar, qex qexVar, lex lexVar, hw61 hw61Var, max maxVar, boolean z, idn0 idn0Var, ga80 ga80Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        max maxVar2;
        idn0 idn0Var2;
        ga80 ga80Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(323096740);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(gbxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(qexVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(lexVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(hw61Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            maxVar2 = maxVar;
            i2 |= b0kVar3.g(maxVar2) ? 16384 : 8192;
        } else {
            maxVar2 = maxVar;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            idn0Var2 = idn0Var;
            i2 |= b0kVar3.g(idn0Var2) ? 1048576 : 524288;
        } else {
            idn0Var2 = idn0Var;
        }
        if ((12582912 & i) == 0) {
            ga80Var2 = ga80Var;
            i2 |= b0kVar3.g(ga80Var2) ? 8388608 : 4194304;
        } else {
            ga80Var2 = ga80Var;
        }
        if ((100663296 & i) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 536870912 : 268435456;
        }
        if (b0kVar3.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarThen = j(z, lexVar).then(qim0Var);
            float f = lexVar.b;
            int i3 = i2 << 3;
            b0kVar2 = b0kVar3;
            cwl1.b(u291.u(qim0VarThen, f, f, 0.0f, 0.0f, 12), (tl3) null, hw61Var, qexVar.a, k(z, lexVar, b0kVar3), maxVar2, false, idn0Var2, ga80Var2, gbxVar, (gbx) null, apo.r(-957369573, new adx(lexVar, j2iVar, (byte) 1), b0kVar3), b0kVar2, ((i2 >> 3) & 896) | (458752 & i3) | (29360128 & i3) | (i3 & 234881024) | ((i2 << 27) & 1879048192), 48, 1090);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bex(gbxVar, qexVar, lexVar, hw61Var, maxVar, z, idn0Var, ga80Var, qim0Var, j2iVar, i);
        }
    }

    public static final void d(boolean z, iu30 iu30Var, qex qexVar, lex lexVar, hw61 hw61Var, max maxVar, boolean z2, idn0 idn0Var, ga80 ga80Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        hw61 hw61Var2;
        max maxVar2;
        idn0 idn0Var2;
        ga80 ga80Var2;
        j2i j2iVar2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-646726085);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(qexVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(lexVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            hw61Var2 = hw61Var;
            i2 |= b0kVar3.g(hw61Var2) ? 16384 : 8192;
        } else {
            hw61Var2 = hw61Var;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.h(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            maxVar2 = maxVar;
            i2 |= b0kVar3.g(maxVar2) ? 1048576 : 524288;
        } else {
            maxVar2 = maxVar;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.h(z2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            idn0Var2 = idn0Var;
            i2 |= b0kVar3.g(idn0Var2) ? 67108864 : 33554432;
        } else {
            idn0Var2 = idn0Var;
        }
        if ((805306368 & i) == 0) {
            ga80Var2 = ga80Var;
            i2 |= b0kVar3.g(ga80Var2) ? 536870912 : 268435456;
        } else {
            ga80Var2 = ga80Var;
        }
        int i3 = i2 & 306783379;
        int i4 = i2;
        byte b2 = 0;
        if (b0kVar3.Y(i4 & 1, (i3 == 306783378 && (((b0kVar3.g(qim0Var) ? (char) 4 : (char) 2) | '0') & 19) == 18) ? false : true)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarThen = j(z2, lexVar).then(qim0Var);
            float f = lexVar.b;
            j2iVar2 = j2iVar;
            int i5 = i4 << 3;
            b0kVar2 = b0kVar3;
            cwl1.c(z, iu30Var, u291.u(qim0VarThen, f, f, 0.0f, 0.0f, 12), (tl3) null, hw61Var2, qexVar.a, k(z2, lexVar, b0kVar3), maxVar2, false, idn0Var2, ga80Var2, apo.r(-1634331356, new cex(lexVar, j2iVar2, b2), b0kVar3), b0kVar2, (i4 & 57470) | (i5 & 29360128) | ((i4 << 9) & 234881024) | (i5 & 1879048192), ((i4 >> 27) & 14) | 48, 8);
        } else {
            j2iVar2 = j2iVar;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new dex(z, iu30Var, qexVar, lexVar, hw61Var, maxVar, z2, idn0Var, ga80Var, qim0Var, j2iVar2, i);
        }
    }

    public static final void e(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1316093419);
        int i2 = i | 54 | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = u291.b(0.0f, 16.0f, 1, qim0Var3);
            long j = cbx.a(x340Var).b.c;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarB, j, er31.b(2.0f));
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var, 48);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarV = u291.v(qim0Var3, 12.0f);
            zov0 zov0Var2 = cbx.b(x340Var).g;
            qim0 qim0VarH = u291.h(qim0VarV, 12.0f);
            avw0 avw0Var = cbx.b(x340Var).c;
            wkt0.a(zkt0.a, uyn1.x(qim0VarH, 1.0f), (ksl) null, cbx.a(x340Var).a.d, z, x340Var, ((i2 << 6) & 57344) | 6, 4);
            uwo1.e(x0d.k(x340Var, -1640578236, 2131956919, x340Var, false), (qim0) null, cbx.d(x340Var).n, cbx.a(x340Var).a.d, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(qim0Var2, z, i, (byte) 19);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(int i, int i2, b0k b0kVar, qim0 qim0Var) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        int i5;
        long j;
        lee1 lee1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-941777728);
        if ((i2 & 48) == 0) {
            i3 = (x340Var.i(qim0Var) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0Var, 16.0f, 8.0f);
            int iC = l1d.C(i);
            if (iC == 0) {
                i4 = 1189713271;
                i5 = 2131953398;
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, 1189711734, false);
                }
                i4 = 1189716252;
                i5 = 2131953399;
            }
            String strK = x0d.k(x340Var, i4, i5, x340Var, false);
            int iC2 = l1d.C(i);
            if (iC2 == 0) {
                x340Var.i0(1189721380);
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                if (iC2 != 1) {
                    throw p3d1.k(x340Var, 1189719160, false);
                }
                x340Var.i0(1189723399);
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            }
            int iC3 = l1d.C(i);
            if (iC3 == 0) {
                x340Var.i0(1189726798);
                lee1Var = cbx.d(x340Var).h;
                x340Var.r(false);
            } else {
                if (iC3 != 1) {
                    throw p3d1.k(x340Var, 1189724670, false);
                }
                x340Var.i0(1189729033);
                lee1Var = cbx.d(x340Var).j;
                x340Var.r(false);
            }
            uwo1.e(strK, qim0VarY, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sf40(i, qim0Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0129  */
    /* JADX WARN: Code duplicated, block: B:80:0x012d  */
    /* JADX WARN: Code duplicated, block: B:82:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x014c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0158  */
    /* JADX WARN: Code duplicated, block: B:89:0x0165  */
    /* JADX WARN: Code duplicated, block: B:90:0x0167  */
    /* JADX WARN: Code duplicated, block: B:93:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0170  */
    /* JADX WARN: Code duplicated, block: B:97:0x019a  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a2  */
    public static final void g(tqw0 tqw0Var, iu30 iu30Var, qim0 qim0Var, mr20 mr20Var, mr20 mr20Var2, Function0 function0, gpv0 gpv0Var, b0k b0kVar, int i, int i2) {
        mr20 mr20Var3;
        mr20 mr20Var4;
        int i3;
        int i4;
        Function0 function1;
        int i5;
        int i6;
        int i7;
        gpv0 gpv0Var2;
        int i8;
        int i9;
        boolean z;
        tqw0 tqw0Var2;
        qim0 qim0Var2;
        mr20 mr20Var5;
        mr20 mr20Var6;
        Function0 function2;
        gpv0 gpv0Var3;
        h311 h311VarV;
        crw0 crw0Var;
        int i10;
        mr20 mr20Var7;
        Function0 function3;
        qim0 qim0Var3;
        Function0 function4;
        int i11;
        mr20 mr20Var8;
        mr20 mr20Var9;
        gpv0 gpv0Var4;
        Object objT;
        Function0 function5;
        boolean z2;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2086730718);
        int i12 = i | (x340Var.g(tqw0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if ((i2 & 8) == 0) {
            mr20Var3 = mr20Var;
            int i13 = x340Var.i(mr20Var3) ? 2048 : 1024;
            int i14 = i12 | i13;
            if ((i2 & 16) == 0) {
                mr20Var4 = mr20Var2;
                int i15 = x340Var.i(mr20Var4) ? 16384 : 8192;
                i3 = i14 | i15;
                i4 = i2 & 32;
                if (i4 != 0) {
                    i6 = i3 | 196608;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if (x340Var.i(function1)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i6 = i3 | i5;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    i9 = i6 | 1572864;
                    gpv0Var2 = gpv0Var;
                } else {
                    gpv0Var2 = gpv0Var;
                    if (x340Var.i(gpv0Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i9 = i6 | i8;
                }
                if ((599187 & i9) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i9 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        i10 = i2 & 8;
                        mr20Var7 = r6x.a;
                        if (i10 != 0) {
                            i9 &= -7169;
                            mr20Var3 = mr20Var7;
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            mr20Var4 = mr20Var7;
                        }
                        if (i4 != 0) {
                            objT = x340Var.T();
                            if (objT == m4cVar) {
                                objT = tnt0.c1;
                                x340Var.s0(objT);
                            }
                            function3 = (Function0) objT;
                        } else {
                            function3 = function1;
                        }
                        qim0Var3 = nim0.a;
                        if (i7 != 0) {
                            Function0 function6 = function3;
                            i11 = i9;
                            qim0Var2 = qim0Var3;
                            mr20Var8 = mr20Var3;
                            mr20Var9 = mr20Var4;
                            gpv0Var4 = null;
                            function4 = function6;
                        } else {
                            function4 = function3;
                            i11 = i9;
                            qim0Var2 = qim0Var3;
                        }
                        x340Var.s();
                        if (!(tqw0Var instanceof ee30)) {
                            if (tqw0Var instanceof ths0) {
                                x340Var.i0(438791870);
                                x340Var.r(false);
                                h311VarV = x340Var.v();
                                if (h311VarV == null) {
                                    return;
                                } else {
                                    crw0Var = new crw0(tqw0Var, iu30Var, qim0Var2, mr20Var8, mr20Var9, function4, gpv0Var4, i, i2, (byte) 0);
                                }
                            } else {
                                function5 = function4;
                                tqw0Var2 = tqw0Var;
                                if (!(tqw0Var2 instanceof ihs0)) {
                                    throw p3d1.k(x340Var, -401496493, false);
                                }
                                x340Var.i0(438842028);
                                ihs0 ihs0Var = (ihs0) tqw0Var2;
                                if ((i11 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objT2 = x340Var.T();
                                if (z2 || objT2 == m4cVar) {
                                    objT2 = new h7w0(iu30Var, (byte) 4);
                                    x340Var.s0(objT2);
                                }
                                rqo1.j(ihs0Var, (Function0) objT2, iu30Var, qim0Var2, function5, x340Var, (i11 & 14) | ((i11 << 3) & 896) | 3072 | ((i11 >> 3) & 57344));
                                x340Var.r(false);
                            }
                            h311VarV.d = crw0Var;
                        }
                        x340Var.i0(438546846);
                        int i16 = i11 >> 3;
                        int i17 = (i11 & 126) | (i16 & 896) | (i16 & 7168) | 24576 | (i16 & 458752);
                        qim0 qim0Var4 = qim0Var2;
                        hap1.a((ee30) tqw0Var, iu30Var, mr20Var8, mr20Var9, qim0Var4, gpv0Var4, x340Var, i17, 0);
                        qim0Var2 = qim0Var4;
                        x340Var.r(false);
                        function5 = function4;
                        tqw0Var2 = tqw0Var;
                        function2 = function5;
                        mr20Var5 = mr20Var8;
                        mr20Var6 = mr20Var9;
                        gpv0Var3 = gpv0Var4;
                    } else {
                        x340Var.b0();
                        if ((i2 & 8) != 0) {
                            i9 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                        }
                        i11 = i9;
                        function4 = function1;
                        qim0Var2 = qim0Var;
                    }
                    mr20Var8 = mr20Var3;
                    mr20Var9 = mr20Var4;
                    gpv0Var4 = gpv0Var2;
                    x340Var.s();
                    if (!(tqw0Var instanceof ee30)) {
                        if (tqw0Var instanceof ths0) {
                            x340Var.i0(438791870);
                            x340Var.r(false);
                            h311VarV = x340Var.v();
                            if (h311VarV == null) {
                                return;
                            } else {
                                crw0Var = new crw0(tqw0Var, iu30Var, qim0Var2, mr20Var8, mr20Var9, function4, gpv0Var4, i, i2, (byte) 0);
                            }
                        } else {
                            function5 = function4;
                            tqw0Var2 = tqw0Var;
                            if (!(tqw0Var2 instanceof ihs0)) {
                                throw p3d1.k(x340Var, -401496493, false);
                            }
                            x340Var.i0(438842028);
                            ihs0 ihs0Var2 = (ihs0) tqw0Var2;
                            if ((i11 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objT2 = x340Var.T();
                            if (z2) {
                                objT2 = new h7w0(iu30Var, (byte) 4);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new h7w0(iu30Var, (byte) 4);
                                x340Var.s0(objT2);
                            }
                            rqo1.j(ihs0Var2, (Function0) objT2, iu30Var, qim0Var2, function5, x340Var, (i11 & 14) | ((i11 << 3) & 896) | 3072 | ((i11 >> 3) & 57344));
                            x340Var.r(false);
                        }
                        h311VarV.d = crw0Var;
                    }
                    x340Var.i0(438546846);
                    int i18 = i11 >> 3;
                    int i19 = (i11 & 126) | (i18 & 896) | (i18 & 7168) | 24576 | (i18 & 458752);
                    qim0 qim0Var5 = qim0Var2;
                    hap1.a((ee30) tqw0Var, iu30Var, mr20Var8, mr20Var9, qim0Var5, gpv0Var4, x340Var, i19, 0);
                    qim0Var2 = qim0Var5;
                    x340Var.r(false);
                    function5 = function4;
                    tqw0Var2 = tqw0Var;
                    function2 = function5;
                    mr20Var5 = mr20Var8;
                    mr20Var6 = mr20Var9;
                    gpv0Var3 = gpv0Var4;
                } else {
                    tqw0Var2 = tqw0Var;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    mr20Var5 = mr20Var3;
                    mr20Var6 = mr20Var4;
                    function2 = function1;
                    gpv0Var3 = gpv0Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    crw0Var = new crw0(tqw0Var2, iu30Var, qim0Var2, mr20Var5, mr20Var6, function2, gpv0Var3, i, i2, (byte) 1);
                    h311VarV.d = crw0Var;
                }
            }
            mr20Var4 = mr20Var2;
            i3 = i14 | i15;
            i4 = i2 & 32;
            if (i4 != 0) {
                i6 = i3 | 196608;
                function1 = function0;
            } else {
                function1 = function0;
                if (x340Var.i(function1)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i6 = i3 | i5;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                i9 = i6 | 1572864;
                gpv0Var2 = gpv0Var;
            } else {
                gpv0Var2 = gpv0Var;
                if (x340Var.i(gpv0Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i9 = i6 | i8;
            }
            if ((599187 & i9) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i9 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    i10 = i2 & 8;
                    mr20Var7 = r6x.a;
                    if (i10 != 0) {
                        i9 &= -7169;
                        mr20Var3 = mr20Var7;
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        mr20Var4 = mr20Var7;
                    }
                    if (i4 != 0) {
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = tnt0.c1;
                            x340Var.s0(objT);
                        }
                        function3 = (Function0) objT;
                    } else {
                        function3 = function1;
                    }
                    qim0Var3 = nim0.a;
                    if (i7 != 0) {
                        Function0 function7 = function3;
                        i11 = i9;
                        qim0Var2 = qim0Var3;
                        mr20Var8 = mr20Var3;
                        mr20Var9 = mr20Var4;
                        gpv0Var4 = null;
                        function4 = function7;
                    } else {
                        function4 = function3;
                        i11 = i9;
                        qim0Var2 = qim0Var3;
                        mr20Var8 = mr20Var3;
                        mr20Var9 = mr20Var4;
                        gpv0Var4 = gpv0Var2;
                    }
                } else {
                    i10 = i2 & 8;
                    mr20Var7 = r6x.a;
                    if (i10 != 0) {
                        i9 &= -7169;
                        mr20Var3 = mr20Var7;
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        mr20Var4 = mr20Var7;
                    }
                    if (i4 != 0) {
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = tnt0.c1;
                            x340Var.s0(objT);
                        }
                        function3 = (Function0) objT;
                    } else {
                        function3 = function1;
                    }
                    qim0Var3 = nim0.a;
                    if (i7 != 0) {
                        Function0 function8 = function3;
                        i11 = i9;
                        qim0Var2 = qim0Var3;
                        mr20Var8 = mr20Var3;
                        mr20Var9 = mr20Var4;
                        gpv0Var4 = null;
                        function4 = function8;
                    } else {
                        function4 = function3;
                        i11 = i9;
                        qim0Var2 = qim0Var3;
                        mr20Var8 = mr20Var3;
                        mr20Var9 = mr20Var4;
                        gpv0Var4 = gpv0Var2;
                    }
                }
                x340Var.s();
                if (!(tqw0Var instanceof ee30)) {
                    if (tqw0Var instanceof ths0) {
                        x340Var.i0(438791870);
                        x340Var.r(false);
                        h311VarV = x340Var.v();
                        if (h311VarV == null) {
                            return;
                        } else {
                            crw0Var = new crw0(tqw0Var, iu30Var, qim0Var2, mr20Var8, mr20Var9, function4, gpv0Var4, i, i2, (byte) 0);
                        }
                    } else {
                        function5 = function4;
                        tqw0Var2 = tqw0Var;
                        if (!(tqw0Var2 instanceof ihs0)) {
                            throw p3d1.k(x340Var, -401496493, false);
                        }
                        x340Var.i0(438842028);
                        ihs0 ihs0Var3 = (ihs0) tqw0Var2;
                        if ((i11 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT2 = x340Var.T();
                        if (z2) {
                            objT2 = new h7w0(iu30Var, (byte) 4);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new h7w0(iu30Var, (byte) 4);
                            x340Var.s0(objT2);
                        }
                        rqo1.j(ihs0Var3, (Function0) objT2, iu30Var, qim0Var2, function5, x340Var, (i11 & 14) | ((i11 << 3) & 896) | 3072 | ((i11 >> 3) & 57344));
                        x340Var.r(false);
                    }
                    h311VarV.d = crw0Var;
                }
                x340Var.i0(438546846);
                int i110 = i11 >> 3;
                int i111 = (i11 & 126) | (i110 & 896) | (i110 & 7168) | 24576 | (i110 & 458752);
                qim0 qim0Var6 = qim0Var2;
                hap1.a((ee30) tqw0Var, iu30Var, mr20Var8, mr20Var9, qim0Var6, gpv0Var4, x340Var, i111, 0);
                qim0Var2 = qim0Var6;
                x340Var.r(false);
                function5 = function4;
                tqw0Var2 = tqw0Var;
                function2 = function5;
                mr20Var5 = mr20Var8;
                mr20Var6 = mr20Var9;
                gpv0Var3 = gpv0Var4;
            } else {
                tqw0Var2 = tqw0Var;
                x340Var.b0();
                qim0Var2 = qim0Var;
                mr20Var5 = mr20Var3;
                mr20Var6 = mr20Var4;
                function2 = function1;
                gpv0Var3 = gpv0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                crw0Var = new crw0(tqw0Var2, iu30Var, qim0Var2, mr20Var5, mr20Var6, function2, gpv0Var3, i, i2, (byte) 1);
                h311VarV.d = crw0Var;
            }
        }
        mr20Var3 = mr20Var;
        int i112 = i12 | i13;
        if ((i2 & 16) == 0) {
            mr20Var4 = mr20Var2;
            if (x340Var.i(mr20Var4)) {
            }
            i3 = i112 | i15;
            i4 = i2 & 32;
            if (i4 != 0) {
                i6 = i3 | 196608;
                function1 = function0;
            } else {
                function1 = function0;
                if (x340Var.i(function1)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i6 = i3 | i5;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                i9 = i6 | 1572864;
                gpv0Var2 = gpv0Var;
            } else {
                gpv0Var2 = gpv0Var;
                if (x340Var.i(gpv0Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i9 = i6 | i8;
            }
            if ((599187 & i9) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i9 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    i10 = i2 & 8;
                    mr20Var7 = r6x.a;
                    if (i10 != 0) {
                        i9 &= -7169;
                        mr20Var3 = mr20Var7;
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        mr20Var4 = mr20Var7;
                    }
                    if (i4 != 0) {
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = tnt0.c1;
                            x340Var.s0(objT);
                        }
                        function3 = (Function0) objT;
                    } else {
                        function3 = function1;
                    }
                    qim0Var3 = nim0.a;
                    if (i7 != 0) {
                        Function0 function9 = function3;
                        i11 = i9;
                        qim0Var2 = qim0Var3;
                        mr20Var8 = mr20Var3;
                        mr20Var9 = mr20Var4;
                        gpv0Var4 = null;
                        function4 = function9;
                    } else {
                        function4 = function3;
                        i11 = i9;
                        qim0Var2 = qim0Var3;
                        mr20Var8 = mr20Var3;
                        mr20Var9 = mr20Var4;
                        gpv0Var4 = gpv0Var2;
                    }
                } else {
                    i10 = i2 & 8;
                    mr20Var7 = r6x.a;
                    if (i10 != 0) {
                        i9 &= -7169;
                        mr20Var3 = mr20Var7;
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        mr20Var4 = mr20Var7;
                    }
                    if (i4 != 0) {
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = tnt0.c1;
                            x340Var.s0(objT);
                        }
                        function3 = (Function0) objT;
                    } else {
                        function3 = function1;
                    }
                    qim0Var3 = nim0.a;
                    if (i7 != 0) {
                        Function0 function10 = function3;
                        i11 = i9;
                        qim0Var2 = qim0Var3;
                        mr20Var8 = mr20Var3;
                        mr20Var9 = mr20Var4;
                        gpv0Var4 = null;
                        function4 = function10;
                    } else {
                        function4 = function3;
                        i11 = i9;
                        qim0Var2 = qim0Var3;
                        mr20Var8 = mr20Var3;
                        mr20Var9 = mr20Var4;
                        gpv0Var4 = gpv0Var2;
                    }
                }
                x340Var.s();
                if (!(tqw0Var instanceof ee30)) {
                    if (tqw0Var instanceof ths0) {
                        x340Var.i0(438791870);
                        x340Var.r(false);
                        h311VarV = x340Var.v();
                        if (h311VarV == null) {
                            return;
                        } else {
                            crw0Var = new crw0(tqw0Var, iu30Var, qim0Var2, mr20Var8, mr20Var9, function4, gpv0Var4, i, i2, (byte) 0);
                        }
                    } else {
                        function5 = function4;
                        tqw0Var2 = tqw0Var;
                        if (!(tqw0Var2 instanceof ihs0)) {
                            throw p3d1.k(x340Var, -401496493, false);
                        }
                        x340Var.i0(438842028);
                        ihs0 ihs0Var4 = (ihs0) tqw0Var2;
                        if ((i11 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT2 = x340Var.T();
                        if (z2) {
                            objT2 = new h7w0(iu30Var, (byte) 4);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new h7w0(iu30Var, (byte) 4);
                            x340Var.s0(objT2);
                        }
                        rqo1.j(ihs0Var4, (Function0) objT2, iu30Var, qim0Var2, function5, x340Var, (i11 & 14) | ((i11 << 3) & 896) | 3072 | ((i11 >> 3) & 57344));
                        x340Var.r(false);
                    }
                    h311VarV.d = crw0Var;
                }
                x340Var.i0(438546846);
                int i113 = i11 >> 3;
                int i114 = (i11 & 126) | (i113 & 896) | (i113 & 7168) | 24576 | (i113 & 458752);
                qim0 qim0Var7 = qim0Var2;
                hap1.a((ee30) tqw0Var, iu30Var, mr20Var8, mr20Var9, qim0Var7, gpv0Var4, x340Var, i114, 0);
                qim0Var2 = qim0Var7;
                x340Var.r(false);
                function5 = function4;
                tqw0Var2 = tqw0Var;
                function2 = function5;
                mr20Var5 = mr20Var8;
                mr20Var6 = mr20Var9;
                gpv0Var3 = gpv0Var4;
            } else {
                tqw0Var2 = tqw0Var;
                x340Var.b0();
                qim0Var2 = qim0Var;
                mr20Var5 = mr20Var3;
                mr20Var6 = mr20Var4;
                function2 = function1;
                gpv0Var3 = gpv0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                crw0Var = new crw0(tqw0Var2, iu30Var, qim0Var2, mr20Var5, mr20Var6, function2, gpv0Var3, i, i2, (byte) 1);
                h311VarV.d = crw0Var;
            }
        }
        mr20Var4 = mr20Var2;
        i3 = i112 | i15;
        i4 = i2 & 32;
        if (i4 != 0) {
            i6 = i3 | 196608;
            function1 = function0;
        } else {
            function1 = function0;
            if (x340Var.i(function1)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i6 = i3 | i5;
        }
        i7 = i2 & 64;
        if (i7 != 0) {
            i9 = i6 | 1572864;
            gpv0Var2 = gpv0Var;
        } else {
            gpv0Var2 = gpv0Var;
            if (x340Var.i(gpv0Var2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i9 = i6 | i8;
        }
        if ((599187 & i9) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i9 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                i10 = i2 & 8;
                mr20Var7 = r6x.a;
                if (i10 != 0) {
                    i9 &= -7169;
                    mr20Var3 = mr20Var7;
                }
                if ((i2 & 16) != 0) {
                    i9 &= -57345;
                    mr20Var4 = mr20Var7;
                }
                if (i4 != 0) {
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = tnt0.c1;
                        x340Var.s0(objT);
                    }
                    function3 = (Function0) objT;
                } else {
                    function3 = function1;
                }
                qim0Var3 = nim0.a;
                if (i7 != 0) {
                    Function0 function11 = function3;
                    i11 = i9;
                    qim0Var2 = qim0Var3;
                    mr20Var8 = mr20Var3;
                    mr20Var9 = mr20Var4;
                    gpv0Var4 = null;
                    function4 = function11;
                } else {
                    function4 = function3;
                    i11 = i9;
                    qim0Var2 = qim0Var3;
                    mr20Var8 = mr20Var3;
                    mr20Var9 = mr20Var4;
                    gpv0Var4 = gpv0Var2;
                }
            } else {
                i10 = i2 & 8;
                mr20Var7 = r6x.a;
                if (i10 != 0) {
                    i9 &= -7169;
                    mr20Var3 = mr20Var7;
                }
                if ((i2 & 16) != 0) {
                    i9 &= -57345;
                    mr20Var4 = mr20Var7;
                }
                if (i4 != 0) {
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = tnt0.c1;
                        x340Var.s0(objT);
                    }
                    function3 = (Function0) objT;
                } else {
                    function3 = function1;
                }
                qim0Var3 = nim0.a;
                if (i7 != 0) {
                    Function0 function12 = function3;
                    i11 = i9;
                    qim0Var2 = qim0Var3;
                    mr20Var8 = mr20Var3;
                    mr20Var9 = mr20Var4;
                    gpv0Var4 = null;
                    function4 = function12;
                } else {
                    function4 = function3;
                    i11 = i9;
                    qim0Var2 = qim0Var3;
                    mr20Var8 = mr20Var3;
                    mr20Var9 = mr20Var4;
                    gpv0Var4 = gpv0Var2;
                }
            }
            x340Var.s();
            if (!(tqw0Var instanceof ee30)) {
                if (tqw0Var instanceof ths0) {
                    x340Var.i0(438791870);
                    x340Var.r(false);
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        crw0Var = new crw0(tqw0Var, iu30Var, qim0Var2, mr20Var8, mr20Var9, function4, gpv0Var4, i, i2, (byte) 0);
                    }
                } else {
                    function5 = function4;
                    tqw0Var2 = tqw0Var;
                    if (!(tqw0Var2 instanceof ihs0)) {
                        throw p3d1.k(x340Var, -401496493, false);
                    }
                    x340Var.i0(438842028);
                    ihs0 ihs0Var5 = (ihs0) tqw0Var2;
                    if ((i11 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT2 = x340Var.T();
                    if (z2) {
                        objT2 = new h7w0(iu30Var, (byte) 4);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new h7w0(iu30Var, (byte) 4);
                        x340Var.s0(objT2);
                    }
                    rqo1.j(ihs0Var5, (Function0) objT2, iu30Var, qim0Var2, function5, x340Var, (i11 & 14) | ((i11 << 3) & 896) | 3072 | ((i11 >> 3) & 57344));
                    x340Var.r(false);
                }
                h311VarV.d = crw0Var;
            }
            x340Var.i0(438546846);
            int i115 = i11 >> 3;
            int i116 = (i11 & 126) | (i115 & 896) | (i115 & 7168) | 24576 | (i115 & 458752);
            qim0 qim0Var8 = qim0Var2;
            hap1.a((ee30) tqw0Var, iu30Var, mr20Var8, mr20Var9, qim0Var8, gpv0Var4, x340Var, i116, 0);
            qim0Var2 = qim0Var8;
            x340Var.r(false);
            function5 = function4;
            tqw0Var2 = tqw0Var;
            function2 = function5;
            mr20Var5 = mr20Var8;
            mr20Var6 = mr20Var9;
            gpv0Var3 = gpv0Var4;
        } else {
            tqw0Var2 = tqw0Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
            mr20Var5 = mr20Var3;
            mr20Var6 = mr20Var4;
            function2 = function1;
            gpv0Var3 = gpv0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            crw0Var = new crw0(tqw0Var2, iu30Var, qim0Var2, mr20Var5, mr20Var6, function2, gpv0Var3, i, i2, (byte) 1);
            h311VarV.d = crw0Var;
        }
    }

    public static final void h(hb51 hb51Var, umf0 umf0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1700973865);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hb51Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(umf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            Integer numValueOf = Integer.valueOf(hb51Var.m);
            boolean zI = x340Var.i(hb51Var) | x340Var.i(xtb0VarA);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new hi2(hb51Var, xtb0VarA, (lnm) null, (byte) 14);
                x340Var.s0(objT);
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = yv91.a(new ih1(xtb0VarA, (byte) 3));
                x340Var.s0(objT2);
            }
            tob1 tob1Var = (tob1) objT2;
            Object value = tob1Var.getValue();
            boolean zI2 = x340Var.i(tob1Var) | ((i2 & 896) == 256);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new k2(tob1Var, iu30Var, (lnm) null, (byte) 25);
                x340Var.s0(objT3);
            }
            qxd0.t(value, x340Var, (vu30) objT3);
            boolean zI3 = x340Var.i(hb51Var) | x340Var.i(umf0Var);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new cc2(hb51Var, umf0Var, (byte) 15);
                x340Var.s0(objT4);
            }
            ujo1.d((qim0) null, xtb0VarA, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT4, x340Var, 0, 509);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(hb51Var, umf0Var, iu30Var, i, (byte) 13);
        }
    }

    public static final void i(y7e1 y7e1Var, Function0 function0, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, yt91 yt91Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        k6a1 k6a1Var;
        lz20 lz20Var;
        int i2;
        Integer num;
        byte b2;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(665293817);
        j06 j06Var = x340Var2.a;
        int i3 = i | (x340Var2.i(y7e1Var) ? 4 : 2) | (x340Var2.i(function0) ? 32 : 16) | 384 | (x340Var2.i(iu30Var) ? 2048 : 1024) | (x340Var2.i(iu30Var2) ? 16384 : 8192) | (x340Var2.i(yt91Var) ? 131072 : 65536);
        if (x340Var2.Y(i3 & 1, (74899 & i3) != 74898)) {
            k6a1 k6a1Var2 = (k6a1) x340Var2.k(t4k.q);
            Object objT = x340Var2.T();
            if (objT == obj) {
                objT = pzm.i(x340Var2);
            }
            lz20 lz20Var2 = (lz20) objT;
            boolean zG = x340Var2.g(yt91Var);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == obj) {
                objT2 = yt91Var != null ? Integer.valueOf(((err0) yt91Var.c).s()) : null;
                x340Var2.s0(objT2);
            }
            Integer num2 = (Integer) objT2;
            Integer numValueOf = yt91Var != null ? Integer.valueOf(((err0) yt91Var.c).s()) : null;
            boolean zI = x340Var2.i(yt91Var) | x340Var2.g(num2) | x340Var2.i(lz20Var2) | x340Var2.i(k6a1Var2);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == obj) {
                Integer num3 = numValueOf;
                k6a1Var = k6a1Var2;
                lz20Var = lz20Var2;
                i2 = i3;
                num = num3;
                wba1 wba1Var = new wba1(yt91Var, num2, lz20Var, k6a1Var, (lnm) null, (byte) 0);
                x340Var2.s0(wba1Var);
                objT3 = wba1Var;
            } else {
                i2 = i3;
                num = numValueOf;
                lz20Var = lz20Var2;
                k6a1Var = k6a1Var2;
            }
            qxd0.t(num, x340Var2, (vu30) objT3);
            String strO0 = cwl1.o0(x340Var2, 2131962745);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var2).a.a.a();
            mta mtaVar = cbx.b(x340Var2).d;
            cvx cvxVar = cbx.b(x340Var2).b;
            float f = zjy.p(0.0f, new p3v(40.0f)).a;
            float fX0 = ((wat) x340Var2.k(t4k.h)).X0(45.6f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            lz20 lz20Var3 = lz20Var;
            qim0 qim0VarB = uyn1.B(dug.e(too1.y(qim0VarF, lhc.g(x340Var2).c), v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(jA, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(jA)}), 0.0f, fX0, 8), (hw61) null, 0.0f, 6), 0.0f, f, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            int i4 = i2;
            boolean z2 = (i2 & 7168) == 2048;
            Object objT4 = x340Var2.T();
            if (z2 || objT4 == obj) {
                objT4 = new et61(iu30Var, (byte) 15);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarU = lrn1.u(qim0VarF2, (iu30) objT4);
            boolean z3 = (i4 & 57344) == 16384;
            Object objT5 = x340Var2.T();
            if (z3 || objT5 == obj) {
                objT5 = new et61(iu30Var2, (byte) 16);
                x340Var2.s0(objT5);
            }
            qim0 qim0VarX = ern1.x(qim0VarU, (iu30) objT5);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, uyn1.x(qim0VarX, 16.0f));
            Object objT6 = x340Var2.T();
            if (objT6 == obj) {
                objT6 = bba1.t;
                x340Var2.s0(objT6);
            }
            qim0 qim0VarB2 = s161.b(qim0VarP, false, (iu30) objT6);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            k6a1 k6a1Var3 = k6a1Var;
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            mta mtaVar2 = cbx.b(x340Var2).d;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF3);
            cr31 cr31Var = er31.a;
            qim0 qim0VarQ = i1p1.q(qim0VarJ, cr31Var);
            long jC = cbx.a(x340Var2).a.b.c();
            avw0 avw0Var = cbx.b(x340Var2).c;
            qim0 qim0VarF4 = dug.f(d1u.E(1.0f, jC, qim0VarQ, cr31Var), cbx.a(x340Var2).a.b.a(), d4o1.a);
            gfh0 gfh0VarC2 = t1c.c(een.g, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF4);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            String strO1 = cwl1.o0(x340Var2, 2131962746);
            qim0 qim0VarF5 = u291.f(qim0Var3, 1.0f);
            boolean zI2 = x340Var2.i(yt91Var);
            Object objT7 = x340Var2.T();
            if (zI2 || objT7 == obj) {
                objT7 = new dr91(yt91Var, (byte) 16);
                x340Var2.s0(objT7);
            }
            qim0 qim0VarN = anm1.N("song_dna_search_input_field", cev0.G(qim0VarF5, (iu30) objT7));
            boolean zG2 = x340Var2.g(strO0);
            Object objT8 = x340Var2.T();
            if (zG2 || objT8 == obj) {
                objT8 = new pg61(strO0, (byte) 28);
                x340Var2.s0(objT8);
            }
            qim0 qim0VarB3 = s161.b(qim0VarN, false, (iu30) objT8);
            lee1 lee1Var = cbx.d(x340Var2).g;
            long j = cbx.a(x340Var2).b.a;
            long j2 = cbx.a(x340Var2).b.a;
            long j3 = cbx.a(x340Var2).b.d;
            long j4 = cbx.a(x340Var2).b.b;
            long j5 = u7h.j;
            zxx zxxVar = new zxx(j, j2, j4, j3, j5, j5, cbx.a(x340Var2).b.c, 0L, 896);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            cvx cvxVar4 = cbx.b(x340Var2).b;
            kua0 kua0Var = new kua0(0, (Boolean) null, 0, 3, 119);
            boolean zI3 = x340Var2.i(k6a1Var3);
            Object objT9 = x340Var2.T();
            if (zI3 || objT9 == obj) {
                b2 = 2;
                objT9 = new y351(k6a1Var3, (byte) 2);
                x340Var2.s0(objT9);
            } else {
                b2 = 2;
            }
            rwo1.b(y7e1Var, qim0VarB3, (max) null, strO1, vjj.a, apo.r(1223033794, new t251(y7e1Var, function0, b2), x340Var2), false, false, (dk80) null, lee1Var, kua0Var, (yta0) objT9, d6e1.b, (vu30) null, (idn0) null, (uwg) null, (es41) null, zzq0VarH, 8.0f, false, zxxVar, x340Var2, (i4 & 14) | 221184, 0, 647620);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
            qim0 qim0VarU2 = qxy0.u(vby0.p(u291.r(qim0Var3, 0.0f), lz20Var3), null, 3);
            Object objT10 = x340Var.T();
            if (objT10 == obj) {
                objT10 = bba1.X;
                x340Var.s0(objT10);
            }
            t1c.a(anm1.N("song_dna_search_input_focus_sink", s161.b(qim0VarU2, false, (iu30) objT10)), x340Var, 0);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0(y7e1Var, function0, qim0Var2, iu30Var, iu30Var2, yt91Var, i);
        }
    }

    public static final qim0 j(boolean z, lex lexVar) {
        float f = z ? -(lexVar.b + 8.0f) : 0.0f;
        n511 n511Var = ckk1.a;
        return new vb5(f, irn1.l0(0.0f, 400.0f, new p3v(0.4f), 1));
    }

    public static final gc5 k(boolean z, lex lexVar, b0k b0kVar) {
        float f = z ? lexVar.b : 0.0f;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        Object obj = fkj0.X;
        if (objT == obj) {
            objT = new o95(new p3v(f), rno1.c, (Object) null, 12);
            x340Var.s0(objT);
        }
        o95 o95Var = (o95) objT;
        p3v p3vVar = new p3v(f);
        boolean zI = x340Var.i(o95Var) | x340Var.d(f);
        Object objT2 = x340Var.T();
        if (zI || objT2 == obj) {
            objT2 = new jpo(o95Var, f, null, (byte) 1);
            x340Var.s0(objT2);
        }
        qxd0.t(p3vVar, x340Var, (vu30) objT2);
        boolean zG = x340Var.g(o95Var);
        Object objT3 = x340Var.T();
        if (zG || objT3 == obj) {
            objT3 = new gc5(o95Var);
            x340Var.s0(objT3);
        }
        return (gc5) objT3;
    }

    public static qim0 l(qim0 qim0Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, c5f0 c5f0Var, int i) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 16) != 0) {
            c5f0Var = null;
        }
        c5f0 c5f0Var2 = c5f0Var;
        return f8d1.b(qim0Var, c5f0Var2, new qj40(function1, c5f0Var2, function2, function3, function0));
    }

    public static final void m(String str) {
        fna fnaVar;
        if (!b || i3a.g(4) > i3a.g(a) || str == null || str.length() <= 0 || (fnaVar = c) == null || fnaVar == null) {
            return;
        }
        fnaVar.l(str, "DEBUG");
    }

    public static final void n(String str) {
        fna fnaVar;
        if (!b || i3a.g(1) > i3a.g(a) || str.length() <= 0 || (fnaVar = c) == null || fnaVar == null) {
            return;
        }
        fnaVar.l(str, "ERROR");
    }

    public static final int o() {
        return a;
    }

    public static final void q(String str) {
        fna fnaVar;
        if (str.length() <= 0 || (fnaVar = c) == null || fnaVar == null) {
            return;
        }
        fnaVar.l(str, "INFO");
    }

    public static final String r() {
        w6b1 w6b1VarA = f7b1.a(blc0.Bb);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        if (str != null) {
            return str;
        }
        eg.m("No URI found for MULTIEVENT_BOTTOMSHEET");
        return null;
    }

    public static final Object s(h1y h1yVar, ou80 ou80Var, onm onmVar) {
        Object objI = fc11.i(h1yVar.a(new f1y(new rzx("your-dj"), ou80Var, null)), onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }

    public static rih1 t(Context context, String str, scn0 scn0Var) throws ClassNotFoundException {
        WidgetInteraction.WrappedDismiss wrappedDismiss;
        u5b1 u5b1Var;
        Class<?> cls = Class.forName(str);
        if (!f30.class.isAssignableFrom(cls)) {
            eg.m("Provided class must implement ActionCallback.");
            return null;
        }
        String str2 = (String) apl1.b(scn0Var, apl1.a);
        if (str2 != null && (wrappedDismiss = (WidgetInteraction) apl1.b(scn0Var, apl1.b)) != null) {
            String str3 = (String) scn0Var.a.get(apl1.c);
            if ((wrappedDismiss instanceof WidgetInteraction.CurateCommand) || (wrappedDismiss instanceof WidgetInteraction.NextCommand) || (wrappedDismiss instanceof WidgetInteraction.PauseCommand) || (wrappedDismiss instanceof WidgetInteraction.PlayCommand) || (wrappedDismiss instanceof WidgetInteraction.PreviousCommand) || (wrappedDismiss instanceof WidgetInteraction.SeekBackwardCommand) || (wrappedDismiss instanceof WidgetInteraction.SeekForwardCommand)) {
                apl1.c(context, wrappedDismiss, str2);
            } else if ((wrappedDismiss instanceof WidgetInteraction.ItemClick.GridItemClick) || (wrappedDismiss instanceof WidgetInteraction.ItemClick.HeroItemClick)) {
                if (((WidgetInteraction.ItemClick) wrappedDismiss).getShouldOpenEntityPage()) {
                    Intent intentB = dro.B((String) null, str2, wrappedDismiss);
                    intentB.setFlags(268435456);
                    context.startActivity(intentB, apl1.a());
                } else {
                    apl1.c(context, wrappedDismiss, str2);
                }
            } else if ((wrappedDismiss instanceof WidgetInteraction.NpvMetadata) || (wrappedDismiss instanceof WidgetInteraction.SpotifyLogo) || (wrappedDismiss instanceof WidgetInteraction.Background) || (wrappedDismiss instanceof WidgetInteraction.Login) || (wrappedDismiss instanceof WidgetInteraction.WrappedClick)) {
                Intent intentB2 = dro.B(str3, str2, wrappedDismiss);
                intentB2.setFlags(268435456);
                context.startActivity(intentB2, apl1.a());
            } else if (wrappedDismiss instanceof WidgetInteraction.RefreshWidget) {
                ynb0 ynb0Var = dro.h;
                if (ynb0Var == null || (u5b1Var = (u5b1) ynb0Var.get()) == null) {
                    eg.m("IntentFactory not initialized");
                    return null;
                }
                Intent intent = new Intent(u5b1Var.a, u5b1Var.b.getClass());
                intent.setAction("com.spotify.widgets.widgets.ACTION_REFRESH");
                context.sendBroadcast(intent);
            } else {
                if (!(wrappedDismiss instanceof WidgetInteraction.WrappedDismiss)) {
                    eg.o();
                    return null;
                }
                Intent intent2 = new Intent(context, (Class<?>) WidgetUpdateCoordinator.class);
                intent2.setAction("com.spotify.widgets.widgets.ACTION_DISMISS_CAMPAIGN");
                intent2.putExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION", (Parcelable) wrappedDismiss);
                context.sendBroadcast(intent2);
            }
        }
        return rih1.a;
    }

    public static final void u(fna fnaVar) {
        c = fnaVar;
    }

    public static final void v() {
        b = true;
    }

    public static final void w() {
        a = 5;
    }

    public static final String x(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static final wjf0 y(Bundle bundle) {
        boolean z = bundle.getBoolean("translation_mode_enabled");
        ofm0 ofm0Var = (ofm0) jhc1.t(bundle, "page_mode", ofm0.class);
        if (ofm0Var == null) {
            ofm0Var = ofm0.a;
        }
        return new wjf0(z, ofm0Var, bundle.getInt("start_y", 0));
    }

    public static final dof1 z(ContextTrack contextTrack) {
        return new dof1(l4o1.l(contextTrack), (String) contextTrack.metadata().get("title"), (String) contextTrack.metadata().get("image_url"), contextTrack.uri());
    }

    public abstract String p();
}
