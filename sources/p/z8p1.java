package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.GraphPoint;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.GraphSection;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.HighlightedEntity;
import java.util.ArrayList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class z8p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(av1 av1Var, vu30 vu30Var, iu30 iu30Var, qim0 qim0Var, upo upoVar, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        boolean z;
        upo upoVarR;
        Object vt1Var;
        upo upoVar2;
        c9n c9nVar;
        int i3;
        ven0 ven0Var;
        Function0 function1;
        byte b2;
        Object obj;
        av1 av1Var2 = av1Var;
        vu30 vu30Var2 = vu30Var;
        upo upoVar3 = upoVar;
        Function0 function2 = function0;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1480879965);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(av1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(vu30Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? b0kVar3.g(upoVar3) : b0kVar3.i(upoVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(function2) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            Context baseContext = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    eg.m("No Activity found in context chain");
                    return;
                }
                if (baseContext instanceof Activity) {
                    Activity activity = (Activity) baseContext;
                    rt1 rt1VarL = x8p1.l(b0kVar3);
                    int i4 = activity.getResources().getDisplayMetrics().heightPixels;
                    int iJ = ywx0.j(rt1VarL.a, 250, 100, rt1VarL.b + rt1VarL.c);
                    if (iJ > i4) {
                        iJ = i4;
                    }
                    if (iJ > i4) {
                        iJ = i4;
                    }
                    if (upoVar3 == null) {
                        b0kVar3.i0(-1491451330);
                        upoVarR = byo1.r((av1Var2.t || iJ >= i4) ? wy71.b : wy71.a, b0kVar3);
                        z = false;
                        b0kVar3.r(false);
                    } else {
                        z = false;
                        b0kVar3.i0(-1491451950);
                        b0kVar3.r(false);
                        upoVarR = upoVar3;
                    }
                    Object objT = b0kVar3.T();
                    Object obj2 = objT;
                    if (objT == m4cVar) {
                        c9n c9nVarM = qxd0.M(o6x.a, b0kVar3);
                        b0kVar3.s0(c9nVarM);
                        obj2 = c9nVarM;
                    }
                    c9n c9nVar2 = (c9n) obj2;
                    boolean z2 = z;
                    ven0 ven0VarS = v8r.s(vu30Var2, b0kVar3);
                    boolean zG = b0kVar3.g(upoVarR);
                    Object objT2 = b0kVar3.T();
                    Object obj3 = objT2;
                    if (zG || objT2 == m4cVar) {
                        hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                        b0kVar3.s0(hrr0VarQ);
                        obj3 = hrr0VarQ;
                    }
                    ven0 ven0Var2 = (ven0) obj3;
                    boolean zG2 = b0kVar3.g(ven0Var2) | b0kVar3.i(upoVarR);
                    int i5 = i2 & 458752;
                    boolean zI = (i5 == 131072 ? true : z2) | zG2 | b0kVar3.i(c9nVar2) | b0kVar3.g(ven0VarS);
                    Object objT3 = b0kVar3.T();
                    if (zI || objT3 == m4cVar) {
                        upoVar2 = upoVarR;
                        c9nVar = c9nVar2;
                        i3 = i2;
                        vt1Var = new vt1(ven0Var2, upoVar2, function2, c9nVar, ven0VarS);
                        Function0 function3 = function2;
                        ven0Var = ven0Var2;
                        function1 = function3;
                        b0kVar3.s0(vt1Var);
                    } else {
                        upoVar2 = upoVarR;
                        c9nVar = c9nVar2;
                        i3 = i2;
                        vt1Var = objT3;
                        function1 = function2;
                        ven0Var = ven0Var2;
                    }
                    Function0 function4 = (Function0) vt1Var;
                    boolean zG3 = b0kVar3.g(activity) | b0kVar3.g(upoVar2);
                    Object objT4 = b0kVar3.T();
                    Object obj4 = objT4;
                    if (zG3 || objT4 == m4cVar) {
                        wwq0 wwq0Var = new wwq0(activity);
                        wwq0Var.b = new rr1(upoVar2, (byte) 1);
                        b0kVar3.s0(wwq0Var);
                        obj4 = wwq0Var;
                    }
                    wwq0 wwq0Var2 = (wwq0) obj4;
                    wwq0Var2.a = function4;
                    boolean zI2 = b0kVar3.i(wwq0Var2) | b0kVar3.i(activity);
                    Object objT5 = b0kVar3.T();
                    if (zI2 || objT5 == m4cVar) {
                        b2 = 0;
                        tt1 tt1Var = new tt1(wwq0Var2, activity, (byte) 0);
                        b0kVar3.s0(tt1Var);
                        obj = tt1Var;
                    } else {
                        b2 = 0;
                        obj = objT5;
                    }
                    qxd0.i(wwq0Var2, (iu30) obj, b0kVar3);
                    int i6 = ((i3 & 896) == 256 ? (byte) 1 : b2) | (b0kVar3.i(upoVar2) ? 1 : 0);
                    Object objT6 = b0kVar3.T();
                    Object obj5 = objT6;
                    if (i6 != 0 || objT6 == m4cVar) {
                        k2 k2Var = new k2(iu30Var, upoVar2, null, (byte) 10);
                        b0kVar3.s0(k2Var);
                        obj5 = k2Var;
                    }
                    n8b1 n8b1Var = upo.l;
                    qxd0.t(upoVar2, b0kVar3, (vu30) obj5);
                    geo0 geo0Var = geo0.b;
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(b0kVar3).a.a.a();
                    long j = u7h.k;
                    boolean zI3 = b0kVar3.i(c9nVar) | b0kVar3.g(ven0VarS);
                    Object objT7 = b0kVar3.T();
                    Object obj6 = objT7;
                    if (zI3 || objT7 == m4cVar) {
                        d4 d4Var = new d4((Object) c9nVar, (Object) ven0VarS, (byte) 22);
                        b0kVar3.s0(d4Var);
                        obj6 = d4Var;
                    }
                    iu30 iu30Var2 = (iu30) obj6;
                    int i7 = (b0kVar3.g(ven0Var) ? 1 : 0) | (i5 == 131072 ? (byte) 1 : b2);
                    Object objT8 = b0kVar3.T();
                    Object obj7 = objT8;
                    if (i7 != 0 || objT8 == m4cVar) {
                        cb cbVar = new cb(ven0Var, function1, (byte) 1);
                        b0kVar3.s0(cbVar);
                        obj7 = cbVar;
                    }
                    b0kVar2 = b0kVar3;
                    zxo1.n(upoVar2, iJ, iu30Var2, qim0Var, j, null, jA, false, false, false, false, 0.0f, (Function0) obj7, geo0Var, apo.r(1650712536, new ut1(iJ, rt1VarL, b2), b0kVar3), b0kVar2, 24584 | (i3 & 7168), 4000);
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                av1Var2 = av1Var;
                vu30Var2 = vu30Var;
                upoVar3 = upoVar;
                function2 = function0;
                i2 = i2;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(av1Var, vu30Var, iu30Var, qim0Var, upoVar, function0, i);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var) {
        h311 h311VarV;
        rj rjVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1853399461);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (ihc1.y0(str)) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    rjVar = new rj(str, qim0Var, i, (byte) 11);
                }
            } else {
                eso1.e(Uri.parse(str), isl.a, anm1.N("BackgroundImage", qim0Var), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var, 224304, 0, 3456);
            }
            h311VarV.d = rjVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            rjVar = new rj(str, qim0Var, i, (byte) 12);
            h311VarV.d = rjVar;
        }
    }

    public static final void c(gka gkaVar, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1989906366);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(gkaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function1) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (((wat) b0kVar3.k(t4k.h)).U0() > 1.0f) {
                b0kVar3.i0(2133234922);
                b0kVar3.r(false);
                z = true;
            } else {
                b0kVar3.i0(-1039563403);
                z = b0kVar3.k(t4k.n) == flb0.b;
                b0kVar3.r(false);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("Card", u291.f(qim0Var3, 1.0f).then(z ? u291.j(120.0f, 0.0f, 2, qim0Var3) : u291.h(qim0Var3, 120.0f)));
            boolean z2 = (i3 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new uv8(gkaVar, (byte) 29);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarN, true, (iu30) objT);
            mgx mgxVar = mgx.e;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(16.0f);
            String str = gkaVar.c;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                cwl1.b(qim0VarB, (tl3) null, cr31VarB, mgxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(str), function0), (gbx) null, apo.r(-1941294613, new ef8(gkaVar, function1, (byte) 6), b0kVar3), b0kVar2, 0, 48, 1506);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, gkaVar, function0, function1, qim0Var2, (byte) 27);
        }
    }

    public static final void d(gka gkaVar, Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-540703644);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(gkaVar) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarV = u291.v(nim0Var, 201.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarV);
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
            uwo1.e(gkaVar.a, anm1.N("Title", nim0Var), cbx.d(x340Var).f, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1712);
            uwo1.e(gkaVar.b, anm1.N("Subtitle", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1712);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            qim0 qim0VarN = anm1.N("CtaButton", nim0Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = yda.t;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarN, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            kiv kivVar = t4k.h;
            wat watVar = (wat) x340Var.k(kivVar);
            if (watVar.U0() == 1.0f) {
                x340Var.i0(1793971320);
                function1 = function0;
                f(i2 & 112, gkaVar.c, function1, x340Var);
                x340Var.r(false);
            } else {
                function1 = function0;
                x340Var.i0(1794052261);
                boolean zG = x340Var.g(watVar);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new xat(watVar.h(), 1.0f);
                    x340Var.s0(objT2);
                }
                mod.b(kivVar.a((wat) objT2), apo.r(-1660982360, new hka(gkaVar, function1), x340Var), x340Var, 56);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            j(gkaVar.e, x340Var, 0);
            x340Var.r(true);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hka(gkaVar, function1, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:106:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:112:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:113:0x040d  */
    /* JADX WARN: Code duplicated, block: B:98:0x038b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x038d  */
    public static final void e(ksw kswVar, wa30 wa30Var, iu30 iu30Var, il00 il00Var, b0k b0kVar, int i) {
        int i2;
        db30 db30Var;
        qim0 qim0Var;
        boolean z;
        wa30 wa30Var2;
        boolean z2;
        Object objT;
        hdx hdxVar;
        qim0 qim0VarN;
        String str;
        boolean z3;
        Object objT2;
        Function0 function0;
        il00 il00Var2 = il00Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(283879519);
        j06 j06Var = x340Var.a;
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? x340Var.g(wa30Var) : x340Var.i(wa30Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(il00Var2) : x340Var.i(il00Var2) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1169) != 1168)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.d, eraVar, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
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
            boolean z5 = wa30Var.e;
            c380 c380Var = wa30Var.d;
            db30 db30Var2 = wa30Var.c;
            if (z5) {
                x340Var.i0(-889433901);
                rwo1.c(c380Var, u291.h(u291.f(qim0Var2, 1.0f), 120.0f), x340Var, 48);
                x340Var.r(false);
            } else {
                x340Var.i0(-889341459);
                x340Var.r(false);
            }
            qim0 qim0VarZ = u291.z(u291.f(uyn1.B(dug.f(qim0Var2, ((u7h) c380Var.get(1)).a, d4o1.a), 0.0f, 20.0f, 0.0f, 0.0f, 13), 1.0f), (fra) null, 3);
            f36 f36Var = h36.c;
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            qim0 qim0VarH = l6o1.H(kk0.q(x340Var, qim0VarE2, lljVar4, 1.0f, false), es41VarC, false, 14);
            mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            String str2 = db30Var2.a;
            String str3 = db30Var2.g;
            String str4 = db30Var2.d;
            String str5 = db30Var2.c;
            if (str2.length() > 0) {
                x340Var.i0(-1517734335);
                db30Var = db30Var2;
                qim0 qim0VarB = u291.B(uyn1.B(qim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), (gra) null, 3);
                jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 54);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    qim0Var = qim0Var2;
                    x340Var.l(n4kVar);
                } else {
                    qim0Var = qim0Var2;
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                if (db30Var.b != null) {
                    x340Var.i0(364845440);
                    z = false;
                    w0h1.a(db30Var.b, isl.a, u291.r(anm1.N("ICON", qim0Var), 17.0f), db30Var.e, 0L, false, x340Var, 56, 48);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    z = false;
                    x340Var.i0(365107266);
                    x340Var.r(false);
                }
                qim0 qim0VarZ2 = u291.z(anm1.N("TAG", qim0Var), (fra) null, 3);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = m830.g;
                    x340Var.s0(objT3);
                }
                qim0 qim0VarB2 = s161.b(qim0VarZ2, z, (iu30) objT3);
                String str6 = db30Var.a;
                x340 x340Var2 = x340Var;
                long j = db30Var.e;
                uwr uwrVar = cbx.a;
                uwo1.e(str6, qim0VarB2, cbx.d(x340Var2).k, j, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                x340Var = x340Var2;
                x340Var.r(true);
                x340Var.r(z);
            } else {
                db30Var = db30Var2;
                qim0Var = qim0Var2;
                i2 = i2;
                z = false;
                x340Var.i0(-1516842527);
                x340Var.r(false);
            }
            if (str5.length() > 0) {
                x340Var.i0(-1516776838);
                qim0 qim0VarB3 = uyn1.B(u291.z(anm1.N("TITLE", qim0Var), (fra) null, 3), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                uwr uwrVar2 = cbx.a;
                x340 x340Var3 = x340Var;
                uwo1.e(str5, qim0VarB3, cbx.d(x340Var).c, 0L, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2040);
                x340Var = x340Var3;
                x340Var.r(z);
            } else {
                x340Var.i0(-1516544927);
                x340Var.r(z);
            }
            if (str4.length() > 0) {
                x340Var.i0(-1516472511);
                qim0 qim0VarZ3 = u291.z(anm1.N("DESCRIPTION", qim0Var), (fra) null, 3);
                uwr uwrVar3 = cbx.a;
                x340 x340Var4 = x340Var;
                uwo1.e(str4, qim0VarZ3, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2032);
                x340Var = x340Var4;
                x340Var.r(z);
            } else {
                x340Var.i0(-1516216575);
                x340Var.r(z);
            }
            x340Var.r(true);
            cb30 cb30Var = db30Var.f;
            uwr uwrVar4 = cbx.a;
            long j2 = cbx.a(x340Var).a.c;
            if (cb30Var != null) {
                x340Var.i0(-576507077);
                op71.g(x340Var, u291.r(qim0Var, 24.0f));
                boolean zF = x340Var.f(j2);
                Object objT4 = x340Var.T();
                if (zF || objT4 == m4cVar) {
                    objT4 = new sre((byte) 20, j2);
                    x340Var.s0(objT4);
                }
                vu30 vu30Var = (vu30) objT4;
                if ((i2 & 112) != 32) {
                    if ((i2 & 64) != 0) {
                        wa30Var2 = wa30Var;
                        if (x340Var.i(wa30Var2)) {
                        }
                        objT = x340Var.T();
                        if (z2 || objT == m4cVar) {
                            objT = new rr10(wa30Var2, (byte) 11);
                            x340Var.s0(objT);
                        }
                        hdxVar = new hdx(0, vu30Var, (vu30) objT, (vu30) null, (hw61) null, 25);
                        qim0VarN = anm1.N("BUTTON", qim0Var);
                        str = cb30Var.a;
                        if ((i2 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        objT2 = x340Var.T();
                        if (z3 || objT2 == m4cVar) {
                            objT2 = new y720(iu30Var, (byte) 27);
                            x340Var.s0(objT2);
                        }
                        function0 = (Function0) objT2;
                        if (ihc1.y0(str)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        }
                        x340 x340Var5 = x340Var;
                        foo1.c(new gbx(new y50(str), function0), hdxVar, qim0VarN, null, yla.r(x340Var), null, null, null, null, null, apo.r(431512997, new rr10(cb30Var, (byte) 12), x340Var), x340Var5, 0, 48, 2008);
                        x340Var = x340Var5;
                        x340Var.r(z);
                    } else {
                        wa30Var2 = wa30Var;
                    }
                    z2 = z;
                    objT = x340Var.T();
                    if (z2) {
                        objT = new rr10(wa30Var2, (byte) 11);
                        x340Var.s0(objT);
                    } else {
                        objT = new rr10(wa30Var2, (byte) 11);
                        x340Var.s0(objT);
                    }
                    hdxVar = new hdx(0, vu30Var, (vu30) objT, (vu30) null, (hw61) null, 25);
                    qim0VarN = anm1.N("BUTTON", qim0Var);
                    str = cb30Var.a;
                    if ((i2 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    objT2 = x340Var.T();
                    if (z3) {
                        objT2 = new y720(iu30Var, (byte) 27);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new y720(iu30Var, (byte) 27);
                        x340Var.s0(objT2);
                    }
                    function0 = (Function0) objT2;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    x340 x340Var6 = x340Var;
                    foo1.c(new gbx(new y50(str), function0), hdxVar, qim0VarN, null, yla.r(x340Var), null, null, null, null, null, apo.r(431512997, new rr10(cb30Var, (byte) 12), x340Var), x340Var6, 0, 48, 2008);
                    x340Var = x340Var6;
                    x340Var.r(z);
                } else {
                    wa30Var2 = wa30Var;
                }
                z2 = true;
                objT = x340Var.T();
                if (z2) {
                    objT = new rr10(wa30Var2, (byte) 11);
                    x340Var.s0(objT);
                } else {
                    objT = new rr10(wa30Var2, (byte) 11);
                    x340Var.s0(objT);
                }
                hdxVar = new hdx(0, vu30Var, (vu30) objT, (vu30) null, (hw61) null, 25);
                qim0VarN = anm1.N("BUTTON", qim0Var);
                str = cb30Var.a;
                if ((i2 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                objT2 = x340Var.T();
                if (z3) {
                    objT2 = new y720(iu30Var, (byte) 27);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new y720(iu30Var, (byte) 27);
                    x340Var.s0(objT2);
                }
                function0 = (Function0) objT2;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                x340 x340Var7 = x340Var;
                foo1.c(new gbx(new y50(str), function0), hdxVar, qim0VarN, null, yla.r(x340Var), null, null, null, null, null, apo.r(431512997, new rr10(cb30Var, (byte) 12), x340Var), x340Var7, 0, 48, 2008);
                x340Var = x340Var7;
                x340Var.r(z);
            } else {
                x340Var.i0(-575988137);
                x340Var.r(z);
            }
            if (str3.length() > 0) {
                x340Var.i0(-575928772);
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    il00Var2 = il00Var;
                    objT5 = new gb30((z710) il00Var2.b);
                    x340Var.s0(objT5);
                } else {
                    il00Var2 = il00Var;
                }
                otw.c((gb30) objT5, new fb30(wa30Var.a, wa30Var.b, str3), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(z);
            } else {
                il00Var2 = il00Var;
                x340Var.i0(-575626057);
                x340Var.r(z);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            wa30Var = wa30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, kswVar, wa30Var, iu30Var, il00Var2, (byte) 1);
        }
    }

    public static final void f(int i, String str, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1616061939);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else {
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(str), function0), new idx(6), null, null, yla.s(x340Var), null, null, null, null, null, apo.r(450115630, new nl(str, (byte) 25), x340Var), x340Var, 0, 48, 2012);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function0, i, (byte) 4);
        }
    }

    public static final void g(int i, long j, long j2, qim0 qim0Var, ib71 ib71Var, boolean z, float f, float f2, u7h u7hVar, String str, String str2, String str3, xb71 xb71Var, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        int i6;
        float f3;
        float f4;
        int i7;
        int i8;
        char c;
        int i9;
        int i10;
        b0k b0kVar2;
        u7h u7hVar2;
        String str4;
        float f5;
        float f6;
        qim0 qim0Var3;
        ib71 ib71Var2;
        String str5;
        xb71 xb71Var2;
        int i11;
        float f7;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1822172686);
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar3.e(l1d.C(i)) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i12 = i4 | (b0kVar3.f(j) ? 32 : 16) | (b0kVar3.f(j2) ? 256 : 128);
        int i13 = i3 & 8;
        if (i13 != 0) {
            i5 = i12 | 3072;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i5 = i12 | (b0kVar3.g(qim0Var2) ? 2048 : 1024);
        }
        int i14 = i3 & 16;
        if (i14 != 0) {
            i6 = i5 | 24576;
        } else {
            i6 = i5 | (b0kVar3.e(ib71Var == null ? -1 : ib71Var.ordinal()) ? 16384 : 8192);
        }
        int i15 = i6 | (b0kVar3.h(z) ? 131072 : 65536);
        int i16 = i3 & 64;
        if (i16 != 0) {
            i15 |= 1572864;
            f3 = f;
        } else {
            f3 = f;
            if ((i2 & 1572864) == 0) {
                i15 |= b0kVar3.d(f3) ? 1048576 : 524288;
            }
        }
        int i17 = i3 & 128;
        if (i17 != 0) {
            i15 |= 12582912;
            f4 = f2;
        } else {
            f4 = f2;
            if ((i2 & 12582912) == 0) {
                i15 |= b0kVar3.d(f4) ? 8388608 : 4194304;
            }
        }
        int i18 = i3 & 256;
        if (i18 != 0) {
            i7 = i15 | 100663296;
        } else {
            i7 = i15 | (b0kVar3.g(u7hVar) ? 67108864 : 33554432);
        }
        int i19 = i7 | (b0kVar3.g(str) ? 536870912 : 268435456);
        int i20 = i3 & 1024;
        if (i20 != 0) {
            c = 6;
            i8 = i20;
        } else {
            i8 = i20;
            c = b0kVar3.g(str2) ? (char) 4 : (char) 2;
        }
        int i21 = i3 & 2048;
        if (i21 != 0) {
            i9 = c | '0';
        } else {
            i9 = c | (b0kVar3.g(str3) ? ' ' : (char) 16);
        }
        int i22 = i9;
        int i23 = i3 & 4096;
        if (i23 != 0) {
            i10 = i22 | 384;
        } else {
            i10 = i22 | (b0kVar3.g(xb71Var) ? 256 : 128);
        }
        if (b0kVar3.Y(i19 & 1, ((i19 & 306783379) == 306783378 && (i10 & 147) == 146) ? false : true)) {
            qim0 qim0Var4 = i13 != 0 ? nim0.a : qim0Var2;
            ib71 ib71Var3 = i14 != 0 ? null : ib71Var;
            float f8 = i16 != 0 ? 220.0f : f3;
            if (i17 != 0) {
                f7 = 176.0f;
                i11 = i21;
            } else {
                i11 = i21;
                f7 = f4;
            }
            u7h u7hVar3 = i18 != 0 ? null : u7hVar;
            String str6 = i8 != 0 ? null : str2;
            String str7 = i11 != 0 ? null : str3;
            xb71 xb71Var3 = i23 != 0 ? null : xb71Var;
            boolean z2 = ((i19 & 57344) == 16384) | ((i19 & 458752) == 131072);
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = Float.valueOf((ib71Var3 == ib71.b || (ib71Var3 != null && z)) ? 0.7f : 1.0f);
                b0kVar3.s0(objT);
            }
            float fFloatValue = ((Number) objT).floatValue();
            qim0 qim0VarK = d9y0.k(qim0Var4, fFloatValue);
            ib71 ib71Var4 = ib71Var3;
            j2i j2iVarR = apo.r(2006208134, new gos(f7, f8, fFloatValue, f7 - 16.0f, str, i, str7, xb71Var3, ib71Var4, str6), b0kVar3);
            int i24 = i19 >> 3;
            b0kVar2 = b0kVar3;
            i3o1.a(j, j2, qim0VarK, u7hVar3, 0.0f, false, j2iVarR, b0kVar2, (i24 & 112) | (i24 & 14) | 1572864 | ((i19 >> 15) & 7168), 48);
            qim0Var3 = qim0Var4;
            u7hVar2 = u7hVar3;
            f6 = f7;
            f5 = f8;
            str5 = str7;
            xb71Var2 = xb71Var3;
            ib71Var2 = ib71Var4;
            str4 = str6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            u7hVar2 = u7hVar;
            str4 = str2;
            f5 = f3;
            f6 = f4;
            qim0Var3 = qim0Var2;
            ib71Var2 = ib71Var;
            str5 = str3;
            xb71Var2 = xb71Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hos(i, j, j2, qim0Var3, ib71Var2, z, f5, f6, u7hVar2, str, str4, str5, xb71Var2, i2, i3);
        }
    }

    public static final void h(wj81 wj81Var, z710 z710Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1676336495);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(wj81Var) : x340Var.i(wj81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(z710Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        boolean z = true;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131962471);
            String strO1 = cwl1.o0(x340Var, 2131962474);
            String strN0 = cwl1.n0(2131962472, new Object[]{strO0, strO1}, x340Var);
            c9 c9VarS = mqo1.s(new mae1(strO0, "https://support.spotify.com/article/explicit-content/plain/"), new mae1(strO1, "https://support.spotify.com/article/managed-accounts/plain/"));
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !x340Var.i(wj81Var))) {
                z = false;
            }
            boolean zI = x340Var.i(z710Var) | z;
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new c861(wj81Var, z710Var, (byte) 29);
                x340Var.s0(objT);
            }
            i8p1.i(strN0, c9VarS, (iu30) objT, qim0Var, null, 0L, 0L, x340Var, (i2 << 3) & 7168, 112);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(wj81Var, z710Var, qim0Var, i, (byte) 29);
        }
    }

    public static final void i(aoe0 aoe0Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1940609609);
        int i2 = i | (b0kVar3.i(aoe0Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(function1) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(b0kVar3, 2131952884);
            String strO1 = cwl1.o0(b0kVar3, 2131952890);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean zG = ((i2 & 896) == 256) | b0kVar3.g(strO0);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new f0n(strO0, function1, (byte) 2);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            uvx uvxVar = (uvx) b0kVar3.k(vvx.a);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).e.b;
            cvx cvxVar = cbx.b(b0kVar3).b;
            float f2 = cbx.b(b0kVar3).e.b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            uvx uvxVarA = uvx.a(uvxVar, (pgx) null, 2, new zzq0(f, 8.0f, f2 - 8.0f, 8.0f), (vzq0) null, (tvx) null, (p3v) null, 499);
            boolean z = (i2 & 112) == 32;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new aba0(function0, (byte) 22);
                b0kVar3.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarB, uvxVarA, null, false, null, null, new gbx(new y50(strO1), function2), null, null, null, null, apo.r(31025023, new fje0(aoe0Var, (byte) 0), b0kVar3), apo.r(-2009650082, new t1(strO0, function1, (byte) 5), b0kVar3), null, null, apo.r(458259195, new fje0(aoe0Var, (byte) 1), b0kVar3), b0kVar2, 64, 197040, 26556);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(i, (Object) aoe0Var, (Object) function0, (Object) function1, (Object) qim0Var2, (byte) 27);
        }
    }

    public static final void j(String str, b0k b0kVar, int i) {
        h311 h311VarV;
        nl nlVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1081816575);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            if (ihc1.y0(str)) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    nlVar = new nl(str, i, (byte) 26);
                }
            } else {
                eso1.e(Uri.parse(str), isl.a, anm1.N("MainImage", u291.s(nim0.a, 64.0f, 74.0f)), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var, 224304, 0, 3456);
            }
            h311VarV.d = nlVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            nlVar = new nl(str, i, (byte) 27);
            h311VarV.d = nlVar;
        }
    }

    public static final void k(cd71 cd71Var, z710 z710Var, wj81 wj81Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-703476602);
        int i2 = i | (b0kVar3.i(cd71Var) ? 4 : 2) | (b0kVar3.i(z710Var) ? 32 : 16) | (b0kVar3.g(wj81Var) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, cbx.b(b0kVar3).b.a, 5);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB);
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
            boolean zI = b0kVar3.i(cd71Var) | ((i2 & 896) == 256);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new fh61(wj81Var, cd71Var, (byte) 25);
                b0kVar3.s0(objT);
            }
            qim0Var2 = qim0Var3;
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), anm1.N("sign_up_education_give_permission_button", qim0Var3), null, null, null, null, null, null, null, vhj.a, b0kVar3, 0, 48, 2040);
            b0kVar2 = b0kVar3;
            op71.g(b0kVar2, u291.h(qim0Var2, cbx.b(b0kVar2).b.b));
            h(wj81Var, z710Var, new tq60(een.P0), b0kVar2, (i2 & 112) | ((i2 >> 6) & 14));
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, cd71Var, z710Var, wj81Var, qim0Var2, (byte) 10);
        }
    }

    public static final void l(View view, int i) {
        ut1 ut1Var = new ut1((Object) view, i, (byte) 13);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i3 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i4 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        ilh1 ilh1Var = new ilh1(ut1Var, new rc80(i2, i3, i4, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0), (byte) 13);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(view, ilh1Var);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new ah30(view, view));
        }
    }

    public static final ndo0 m(mav0 mav0Var) {
        return oap1.w(mav0Var, 16);
    }

    public static ish n(mey0 mey0Var, clm clmVar, ymd0 ymd0Var, nwt nwtVar, kko kkoVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, ytp0 ytp0Var, uvy uvyVar, boolean z10, boolean z11, boolean z12, int i) {
        zob1 huzVar;
        evz huzVar2;
        kko kkoVar2 = (i & 16) != 0 ? null : kkoVar;
        boolean z13 = (i & 32) != 0 ? false : z;
        boolean z14 = (i & 64) != 0 ? false : z2;
        boolean z15 = (i & 256) != 0 ? false : z4;
        boolean z16 = (i & 1024) != 0 ? true : z5;
        boolean z17 = (i & 2048) != 0 ? false : z6;
        boolean z18 = (i & 8192) != 0 ? false : z7;
        boolean z19 = (i & 16384) != 0 ? false : z8;
        boolean z20 = (65536 & i) != 0 ? false : z9;
        ytp0 ytp0Var2 = (131072 & i) != 0 ? null : ytp0Var;
        uvy uvyVar2 = (262144 & i) != 0 ? null : uvyVar;
        boolean z21 = (524288 & i) != 0 ? false : z10;
        boolean z22 = (1048576 & i) == 0;
        boolean z23 = (2097152 & i) != 0 ? false : z11;
        boolean z24 = (i & 4194304) != 0 ? false : z12;
        String str = mey0Var.c;
        if (kkoVar2 == null || (huzVar = kkoVar2.a()) == null) {
            huzVar = new huz((Object) null, (byte) 10);
        }
        mr20 mr20VarU = rqt0.u(huzVar);
        if (ytp0Var2 != null) {
            huzVar2 = ytp0Var2.E(z20 ? str : null);
        } else {
            huzVar2 = new huz(new y2u0(0, false, false, false), (byte) 10);
        }
        mr20 mr20VarU2 = rqt0.u(huzVar2);
        mr20 mr20VarI = t5p1.i(ymd0Var);
        return new ish(new mr20[]{mr20VarI, rqt0.t(clmVar.a, u2m.t), rqt0.t(nwtVar.a(), gsh.b), mr20VarU, mr20VarU2, uvyVar2 == null ? new huz((Object) null, (byte) 10) : new vd0((byte) 21, uvyVar2, str, rqt0.u(new ld2(mr20VarI, str, (byte) 3)))}, z13, z14, z3, z15, true, z16, z17, z18, z19, z22, z21, z23, z24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object o(uvy uvyVar, String str, String str2, onm onmVar) {
        jsh jshVar;
        if (onmVar instanceof jsh) {
            jshVar = (jsh) onmVar;
            int i = jshVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jshVar.b = i - Integer.MIN_VALUE;
            } else {
                jshVar = new jsh(onmVar);
            }
        } else {
            jshVar = new jsh(onmVar);
        }
        Object objA = jshVar.a;
        int i2 = jshVar.b;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                jshVar.b = 1;
                objA = uvyVar.a(str, str2, jshVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            return ((lvy) objA).b;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final yl80 p(GraphSection graphSection, String str, zl80 zl80Var) {
        int color = Color.parseColor(str);
        d761 d761VarA = b761.a(graphSection.u());
        String subtitle = graphSection.getSubtitle();
        String strT = graphSection.t();
        zl80 zl80Var2 = zl80.a;
        int i = zl80Var == zl80Var2 ? 2131963626 : 2131963601;
        String strS = graphSection.s();
        h290 h290VarR = graphSection.r();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarR, 10));
        int i2 = 0;
        for (Object obj : h290VarR) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            arrayList.add(new rzy(i2, ((GraphPoint) obj).getValue()));
            i2 = i3;
        }
        int iN = graphSection.n();
        Integer numValueOf = Integer.valueOf(iN);
        if (zl80Var != zl80.b || iN == 0) {
            numValueOf = null;
        }
        ul80 ul80Var = new ul80(d761VarA, subtitle, strT, i, strS, color, arrayList, numValueOf);
        int i4 = zl80Var == zl80Var2 ? 2131963629 : 2131963604;
        int i5 = zl80Var == zl80Var2 ? 2131963628 : 2131963603;
        HighlightedEntity highlightedEntityQ = graphSection.q();
        vl80 vl80Var = new vl80(highlightedEntityQ.getTitle(), highlightedEntityQ.getSubtitle(), highlightedEntityQ.getImageUrl(), highlightedEntityQ.getUri());
        HighlightedEntity highlightedEntityP = graphSection.p();
        return new yl80(zl80Var, ul80Var, new wl80(i4, i5, vl80Var, new vl80(highlightedEntityP.getTitle(), highlightedEntityP.getSubtitle(), highlightedEntityP.getImageUrl(), highlightedEntityP.getUri()), color), "Insights");
    }

    public static final String q(String str, jo70 jo70Var, mtl mtlVar) {
        io70 io70Var;
        Set set = s4b1.f;
        if (uic.g(str, blc0.ed)) {
            if ((mtlVar != null ? mtlVar.a : null) == ktl.b && jo70Var != null && (io70Var = jo70Var.e) != null) {
                return io70Var.b;
            }
        }
        return null;
    }

    public static ksk0 r() {
        return new ksk0((byte) 9);
    }

    public static final otu s(op80 op80Var) {
        lhp0 lhp0VarA = op80Var.a(yi20.R0);
        if (lhp0VarA != null) {
            return lhp0VarA.b;
        }
        return null;
    }

    public static final Object t(x8c0 x8c0Var, w8c0 w8c0Var, vu30 vu30Var, lnm lnmVar) {
        Object objS;
        if (w8c0Var != w8c0.b) {
            return (x8c0Var.b() != w8c0.a && (objS = smo1.s(new elu0(x8c0Var, w8c0Var, vu30Var, (lnm) null, (byte) 21), lnmVar)) == d9n.a) ? objS : rih1.a;
        }
        hhg1.n("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final Object u(iac0 iac0Var, w8c0 w8c0Var, vu30 vu30Var, lnm lnmVar) {
        Object objT = t(iac0Var.getLifecycle(), w8c0Var, vu30Var, lnmVar);
        return objT == d9n.a ? objT : rih1.a;
    }

    public static final void v(View view, int i, iu30 iu30Var) {
        view.setOnClickListener(new ahe1(i, new b1c1(iu30Var, (byte) 9)));
    }
}
