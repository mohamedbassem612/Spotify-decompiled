package p;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.productstate.ConvertProductStateValueException;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class y7y0 {
    public static b180 a;

    public static final boolean A(Map map) {
        return u890.j(map.get("catalogue"), "free");
    }

    public static final boolean B(Map map) {
        return u890.j(map.get("horizon"), "FULL");
    }

    public static final boolean C(Map map) {
        return (G(map) || L(map) || !yto.j((String) map.get("pick-and-shuffle"))) ? false : true;
    }

    public static final boolean D(Map map) {
        return t("is-mobile-only-tier", map);
    }

    public static final boolean E(Map map) {
        return t("music-video-disabled", map);
    }

    public static final boolean F(Map map) {
        return !t("nft-disabled", map);
    }

    public static final boolean G(Map map) {
        return "premium".equals(map.get("type"));
    }

    public static final boolean H(Map map) {
        return t("is-puffin", map);
    }

    public static final boolean I(String str) {
        if (str == null) {
            return true;
        }
        int i = hu50.a;
        return ((eu50) eu50.b).a.H(str).b() == 1929113152;
    }

    public static final ezc J(o241 o241Var) {
        return yoi1.g(((p241) o241Var).b("dma-mode-available").map(rh20.e1));
    }

    public static tr80 K(tr80 tr80Var, tr80 tr80Var2, int i, int i2) {
        int i3 = ((rr80) tr80Var).a;
        int i4 = ((rr80) tr80Var).b;
        int iMin = Math.min(i3, ((rr80) tr80Var2).a);
        int iMax = Math.max(i4, ((rr80) tr80Var2).b);
        int iMax2 = Math.max(0, iMin);
        int i5 = (iMax - iMax2) + 1;
        if (i5 < i) {
            int i6 = i - i5;
            int iC = l1d.C(i2);
            if (iC == 0) {
                iMax += i6;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                int iMin2 = Math.min(i6, iMax2);
                iMax2 -= iMin2;
                iMax += i6 - iMin2;
            }
        }
        return new tr80(iMax2, iMax, 1);
    }

    public static final boolean L(Map map) {
        return !I((String) map.get("streaming-rules"));
    }

    public static final Function0 M(Function0 function0, Function0 function1, Function0 function2, b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == m4cVar) {
            objT = qxd0.M(o6x.a, x340Var);
            x340Var.s0(objT);
        }
        c9n c9nVar = (c9n) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = bb00.h(0, x340Var);
        }
        hdn0 hdn0Var = (hdn0) objT2;
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = v8r.q((Object) null);
            x340Var.s0(objT3);
        }
        ven0 ven0Var = (ven0) objT3;
        ven0 ven0VarS = v8r.s(function0, x340Var);
        ven0 ven0VarS2 = v8r.s(function1, x340Var);
        ven0 ven0VarS3 = v8r.s(function2, x340Var);
        Object objT4 = x340Var.T();
        if (objT4 == m4cVar) {
            dy7 dy7Var = new dy7(c9nVar, ven0Var, hdn0Var, ven0VarS3, ven0VarS, ven0VarS2);
            x340Var.s0(dy7Var);
            objT4 = dy7Var;
        }
        return (Function0) objT4;
    }

    public static final void N(amq0 amq0Var, int i, Object obj) {
        amq0Var.f[(amq0Var.g - amq0Var.b[amq0Var.c - 1].b) + i] = obj;
    }

    public static final void O(amq0 amq0Var, int i, Object obj, int i2, Object obj2) {
        int i3 = amq0Var.g - amq0Var.b[amq0Var.c - 1].b;
        Object[] objArr = amq0Var.f;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void P(amq0 amq0Var, Object obj, Object obj2, Object obj3) {
        int i = amq0Var.g - amq0Var.b[amq0Var.c - 1].b;
        Object[] objArr = amq0Var.f;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public static final void Q(amq0 amq0Var, ynm0 ynm0Var, Object obj, Object obj2, Object obj3) {
        int i = amq0Var.g - amq0Var.b[amq0Var.c - 1].b;
        Object[] objArr = amq0Var.f;
        objArr[i] = ynm0Var;
        objArr[i + 1] = obj;
        objArr[i + 3] = obj2;
        objArr[i + 2] = obj3;
    }

    public static final max R(boolean z, b0k b0kVar) {
        if (z) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-605495463);
            x340Var.r(false);
            return jax.a;
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-605494101);
        hax haxVar = new hax(cwl1.o0(x340Var2, 2131962752));
        x340Var2.r(false);
        return haxVar;
    }

    public static final Object S(Context context, kx5 kx5Var, vu30 vu30Var, onm onmVar) {
        tnb0 tnb0Var = tnb0.c;
        dt40 dt40Var = new dt40(vu30Var, (lnm) null, (byte) 0);
        if (kx5Var != null) {
            Object objD = nt40.a.d(context, tnb0Var, u2o1.k(kx5Var.a), dt40Var, onmVar);
            return objD == d9n.a ? objD : rih1.a;
        }
        hhg1.n("The glance ID is not the one of an App Widget");
        return null;
    }

    public static final vwl1 T(vwl1 vwl1Var) {
        vwl1 vwl1VarB;
        boolean zE = vwl1Var.e.e("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zE2 = vwl1Var.e.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zE3 = vwl1Var.e.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!zE && zE2 && zE3) {
            String str = vwl1Var.c;
            cwq cwqVar = new cwq();
            cwqVar.d(vwl1Var.e.a);
            cwqVar.a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            vwl1VarB = vwl1.b(vwl1Var, (String) null, (wvl1) null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", cwqVar.a(), 0, 0L, 0, 0, 0L, 0, 33554411);
        } else {
            vwl1VarB = vwl1Var;
        }
        if (Build.VERSION.SDK_INT > 25) {
            return vwl1VarB;
        }
        gjl gjlVar = vwl1VarB.j;
        String str2 = vwl1VarB.c;
        if (u890.j(str2, ConstraintTrackingWorker.class.getName())) {
            return vwl1VarB;
        }
        if (!gjlVar.e && !gjlVar.f) {
            return vwl1VarB;
        }
        cwq cwqVar2 = new cwq();
        cwqVar2.d(vwl1VarB.e.a);
        cwqVar2.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
        return vwl1.b(vwl1VarB, (String) null, (wvl1) null, ConstraintTrackingWorker.class.getName(), cwqVar2.a(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v24 */
    public static final void a(c380 c380Var, boolean z, boolean z2, boolean z3, iu30 iu30Var, b0k b0kVar, int i) {
        boolean z4;
        qim0 qim0Var;
        ?? r9;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1200536718);
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.h(z3) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            fra fraVar = een.N0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
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
            hrx hrxVar = z3 ? hrx.c : null;
            String strO0 = cwl1.o0(x340Var, 2131960775);
            int i3 = 57344 & i2;
            boolean z5 = i3 == 16384;
            Object objT = x340Var.T();
            if (z5 || objT == m4cVar) {
                objT = new ux90(iu30Var, (byte) 4);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            x2g0.i(c380Var, (qim0) null, hcx.c, hrxVar, 3, new gbx(new y50(strO0), function0), (String) null, x340Var, (i2 & 14) | 24960 | (hrx.d << 9), 66);
            kk0.s(1.0f, true, x340Var);
            if (z2) {
                x340Var.i0(747560391);
                boolean z6 = i3 == 16384;
                Object objT2 = x340Var.T();
                if (z6 || objT2 == m4cVar) {
                    objT2 = new ux90(iu30Var, (byte) 5);
                    x340Var.s0(objT2);
                }
                qim0Var = null;
                r9 = 0;
                cev0.k(0, (Function0) objT2, x340Var, (qim0) null);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                ab80.p(nim0Var, 8.0f, x340Var, false);
            } else {
                qim0Var = null;
                r9 = 0;
                x340Var.i0(747688204);
                x340Var.r(false);
            }
            z4 = z;
            if (z4) {
                x340Var.i0(-252974517);
                ?? r12 = i3 == 16384 ? 1 : r9;
                Object objT3 = x340Var.T();
                if (r12 != 0 || objT3 == m4cVar) {
                    objT3 = new ux90(iu30Var, (byte) 6);
                    x340Var.s0(objT3);
                }
                cev0.d((int) r9, (Function0) objT3, x340Var, qim0Var);
                x340Var.r((boolean) r9);
            } else {
                if (z4) {
                    throw p3d1.k(x340Var, -252975370, (boolean) r9);
                }
                x340Var.i0(-252972307);
                ?? r13 = i3 == 16384 ? 1 : r9;
                Object objT4 = x340Var.T();
                if (r13 != 0 || objT4 == m4cVar) {
                    objT4 = new ux90(iu30Var, (byte) 7);
                    x340Var.s0(objT4);
                }
                cev0.f((int) r9, (Function0) objT4, x340Var, qim0Var);
                x340Var.r((boolean) r9);
            }
            x340Var.r(true);
        } else {
            z4 = z;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gj80(c380Var, z4, z2, z3, iu30Var, i, (byte) 1);
        }
    }

    public static final void b(String str, String str2, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2010566073);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(iu30Var2) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131952317);
            String strO1 = cwl1.o0(x340Var, 2131952318);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 4.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            i8p1.i(cwl1.n0(2131952319, new Object[]{str2, strO0}, x340Var), mqo1.s(new mae1[]{new mae1(strO0, nik1.V5.b("spotify:internal:parental-control:child:" + str + ":manage-content:approved").a)}), iu30Var, (qim0) null, cbx.d(x340Var).j, 0L, 0L, x340Var, i2 & 896, 104);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            i8p1.i(cwl1.n0(2131952320, new Object[]{strO1}, x340Var), mqo1.s(new mae1[]{new mae1(strO1, "https://support.spotify.com/article/explicit-content/plain")}), iu30Var2, (qim0) null, cbx.d(x340Var).j, 0L, 0L, x340Var, (i2 >> 3) & 896, 104);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, str, str2, iu30Var, iu30Var2, (byte) 27);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static final void c(String str, c380 c380Var, boolean z, boolean z2, boolean z3, boolean z4, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        qim0 qim0Var;
        ?? r12;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(171903676);
        int i4 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.i(c380Var) ? 32 : 16) | (b0kVar2.h(z) ? 256 : 128) | (b0kVar2.h(z2) ? 2048 : 1024) | (b0kVar2.h(z3) ? 16384 : 8192) | (b0kVar2.h(z4) ? 131072 : 65536) | (b0kVar2.i(iu30Var) ? 1048576 : 524288);
        if (b0kVar2.Y(i4 & 1, (599187 & i4) != 599186)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            hrx hrxVar = z4 ? hrx.c : null;
            String strO0 = cwl1.o0(b0kVar2, 2131960775);
            int i5 = 3670016 & i4;
            boolean z5 = i5 == 1048576;
            Object objT = b0kVar2.T();
            if (z5 || objT == m4cVar) {
                objT = new ux90(iu30Var, (byte) 8);
                b0kVar2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            x2g0.i(c380Var, (qim0) null, hcx.c, hrxVar, 3, new gbx(new y50(strO0), function0), (String) null, b0kVar2, ((i4 >> 3) & 14) | 24960 | (hrx.d << 9), 66);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(nim0Var, 8.0f));
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            uwo1.e(str, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), cbx.d(b0kVar2).e, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, i4 & 14, 0, 1720);
            b0kVar2 = b0kVar2;
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            op71.g(b0kVar2, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            if (z2) {
                b0kVar2.i0(-876385909);
                i2 = i5;
                i3 = 1048576;
                boolean z6 = i2 == 1048576;
                Object objT2 = b0kVar2.T();
                if (z6 || objT2 == m4cVar) {
                    objT2 = new ux90(iu30Var, (byte) 9);
                    b0kVar2.s0(objT2);
                }
                qim0Var = null;
                r12 = 0;
                cev0.a(0, (Function0) objT2, b0kVar2, (qim0) null);
                b0kVar2.r(false);
            } else {
                i2 = i5;
                i3 = 1048576;
                qim0Var = null;
                r12 = 0;
                b0kVar2.i0(-876325366);
                b0kVar2.r(false);
            }
            if (z3) {
                b0kVar2.i0(-876298427);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                op71.g(b0kVar2, u291.v(nim0Var, 8.0f));
                ?? r13 = i2 == i3 ? 1 : r12;
                Object objT3 = b0kVar2.T();
                if (r13 != 0 || objT3 == m4cVar) {
                    objT3 = new ux90(iu30Var, (byte) 10);
                    b0kVar2.s0(objT3);
                }
                cev0.k((int) r12, (Function0) objT3, b0kVar2, qim0Var);
                b0kVar2.r((boolean) r12);
            } else {
                b0kVar2.i0(-876170614);
                b0kVar2.r((boolean) r12);
            }
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(nim0Var, 8.0f));
            if (z) {
                b0kVar2.i0(248834445);
                ?? r14 = i2 == i3 ? 1 : r12;
                Object objT4 = b0kVar2.T();
                if (r14 != 0 || objT4 == m4cVar) {
                    objT4 = new ux90(iu30Var, (byte) 11);
                    b0kVar2.s0(objT4);
                }
                cev0.d((int) r12, (Function0) objT4, b0kVar2, qim0Var);
                b0kVar2.r((boolean) r12);
            } else {
                if (z) {
                    throw p3d1.k(b0kVar2, 248833592, (boolean) r12);
                }
                b0kVar2.i0(248836655);
                ?? r15 = i2 == i3 ? 1 : r12;
                Object objT5 = b0kVar2.T();
                if (r15 != 0 || objT5 == m4cVar) {
                    objT5 = new ux90(iu30Var, (byte) 12);
                    b0kVar2.s0(objT5);
                }
                cev0.f((int) r12, (Function0) objT5, b0kVar2, qim0Var);
                b0kVar2.r((boolean) r12);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ov01(str, c380Var, z, z2, z3, z4, iu30Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0094 A[PHI: r16
      0x0094: PHI (r16v14 int) = (r16v0 int), (r16v6 int), (r16v7 int) binds: [B:50:0x0092, B:61:0x00b1, B:60:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x012d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0178  */
    /* JADX WARN: Code duplicated, block: B:83:0x017c  */
    /* JADX WARN: Code duplicated, block: B:86:0x018d  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0221  */
    /* JADX WARN: Code duplicated, block: B:92:0x026a  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:99:0x02fd  */
    public static final void d(String str, String str2, String str3, Function0 function0, Function0 function1, qim0 qim0Var, String str4, hux huxVar, b0k b0kVar, int i, int i2) {
        int i3;
        String str5;
        int i4;
        int i5;
        boolean zI;
        int i6;
        boolean z;
        String str6;
        qim0 qim0Var2;
        hux huxVar2;
        b0k b0kVar2;
        String str7;
        h311 h311VarV;
        String str8;
        hux huxVar3;
        era eraVar;
        f36 f36Var;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        hux huxVar4;
        b0k b0kVar3;
        byte b;
        float f;
        float f2;
        b0k b0kVar4;
        b0k b0kVar5;
        String str9;
        b0k b0kVar6 = (x340) b0kVar;
        b0kVar6.k0(-1573685298);
        j06 j06Var = ((x340) b0kVar6).a;
        if ((i & 6) == 0) {
            i3 = (b0kVar6.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar6.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar6.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar6.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar6.i(function1) ? 16384 : 8192;
        }
        int i7 = 196608 | i3;
        int i8 = i2 & 64;
        if (i8 == 0) {
            if ((1572864 & i) == 0) {
                str5 = str4;
                i7 |= b0kVar6.g(str5) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            i5 = 12582912;
            if (i4 == 0) {
                i7 |= i5;
            } else if ((i & 12582912) == 0) {
                if ((i & 16777216) == 0) {
                    zI = b0kVar6.g(huxVar);
                } else {
                    zI = b0kVar6.i(huxVar);
                }
                if (zI) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i7 |= i5;
            }
            i6 = i7;
            if ((i6 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar6.Y(i6 & 1, z)) {
                if (i8 != 0) {
                    str8 = null;
                } else {
                    str8 = str5;
                }
                if (i4 != 0) {
                    huxVar3 = null;
                } else {
                    huxVar3 = huxVar;
                }
                eraVar = een.Q0;
                uwr uwrVar = cbx.a;
                long j = cbx.a(b0kVar6).a.c;
                cua cuaVar = cbx.b(b0kVar6).f;
                cr31 cr31VarB = er31.b(8.0f);
                qim0Var2 = nim0.a;
                qim0 qim0VarX = uyn1.x(dug.f(qim0Var2, j, cr31VarB), cbx.b(b0kVar6).e.c);
                f36Var = h36.c;
                mbhVarA = jbh.a(f36Var, eraVar, b0kVar6, 0);
                iHashCode = Long.hashCode(((x340) b0kVar6).T);
                xos0VarM = b0kVar6.m();
                qim0VarE = zr7.E(b0kVar6, qim0VarX);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar6.m0();
                z2 = ((x340) b0kVar6).S;
                n4kVar = hmb0.t1;
                if (z2) {
                    b0kVar6.l(n4kVar);
                } else {
                    b0kVar6.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, b0kVar6, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, b0kVar6, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, b0kVar6, lljVar3);
                nko1.F(b0kVar6);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, b0kVar6, lljVar4);
                huxVar4 = huxVar3;
                qim0 qim0VarH = l6o1.H(u291.f(qim0Var2, 1.0f), l6o1.C(0, 0, 1, b0kVar6), false, 14);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar6, 0);
                int iHashCode2 = Long.hashCode(((x340) b0kVar6).T);
                xos0 xos0VarM2 = b0kVar6.m();
                qim0 qim0VarE2 = zr7.E(b0kVar6, qim0VarH);
                b0kVar6.m0();
                if (((x340) b0kVar6).S) {
                    b0kVar6.l(n4kVar);
                } else {
                    b0kVar6.v0();
                }
                nko1.H(mbhVarA2, b0kVar6, lljVar);
                nko1.H(xos0VarM2, b0kVar6, lljVar2);
                x0d.q(iHashCode2, b0kVar6, lljVar3, b0kVar6);
                nko1.H(qim0VarE2, b0kVar6, lljVar4);
                if (huxVar4 != null) {
                    b0kVar6.i0(-1947879084);
                    long j2 = cbx.a(b0kVar6).b.a;
                    zov0 zov0Var = cbx.b(b0kVar6).g;
                    b = 16;
                    f = 1.0f;
                    f2 = 8.0f;
                    w0h1.a(huxVar4, isl.a, u291.r(qim0Var2, 64.0f), j2, 0L, false, b0kVar6, 56 | ((i6 >> 21) & 14), 48);
                    huxVar2 = huxVar4;
                    b0kVar3 = b0kVar6;
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    x0d.s(qim0Var2, 16.0f, b0kVar3, false);
                } else {
                    huxVar2 = huxVar4;
                    b0kVar3 = b0kVar6;
                    b = 16;
                    f = 1.0f;
                    f2 = 8.0f;
                    b0kVar3.i0(-1947560032);
                    b0kVar3.r(false);
                }
                b0kVar4 = b0kVar3;
                uwo1.e(str, u291.f(qim0Var2, f), cbx.d(b0kVar3).e, cbx.a(b0kVar3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, i6 & 14, 0, 2016);
                if (str8 != null) {
                    b0kVar4.i0(-1947308064);
                    cvx cvxVar2 = cbx.b(b0kVar4).b;
                    String str10 = str8;
                    uwo1.e(str10, u291.f(qim0Var2, f), kk0.p(qim0Var2, f2, b0kVar4, b0kVar4).j, cbx.a(b0kVar4).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, (i6 >> 18) & 14, 0, 2016);
                    str9 = str10;
                    b0kVar5 = b0kVar4;
                    b0kVar5.r(false);
                } else {
                    b0kVar5 = b0kVar4;
                    str9 = str8;
                    b0kVar5.i0(-1947000544);
                    b0kVar5.r(false);
                }
                b0kVar5.r(true);
                op71.g(b0kVar5, u291.h(qim0Var2, cbx.b(b0kVar5).b.b));
                idx idxVar = new idx(4);
                z50 z50Var = z50.c;
                b0kVar2 = b0kVar5;
                foo1.c(new gbx(z50Var, function0), idxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(629633657, new pji(str2, b), b0kVar5), b0kVar2, 0, 48, 2044);
                cvx cvxVar3 = cbx.b(b0kVar5).b;
                op71.g(b0kVar5, u291.h(qim0Var2, f2));
                str6 = str3;
                foo1.c(new gbx(z50Var, function1), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-105187166, new pji(str6, (byte) 17), b0kVar5), b0kVar2, 0, 48, 2044);
                b0kVar5.r(true);
                str7 = str9;
            } else {
                str6 = str3;
                b0kVar6.b0();
                qim0Var2 = qim0Var;
                huxVar2 = huxVar;
                b0kVar2 = b0kVar6;
                str7 = str5;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new s2l(str, str2, str6, function0, function1, qim0Var2, str7, huxVar2, i, i2);
            }
        }
        i7 = 1769472 | i3;
        str5 = str4;
        i4 = i2 & 128;
        i5 = 12582912;
        if (i4 == 0) {
            i7 |= i5;
        } else if ((i & 12582912) == 0) {
            if ((i & 16777216) == 0) {
                zI = b0kVar6.g(huxVar);
            } else {
                zI = b0kVar6.i(huxVar);
            }
            if (zI) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i7 |= i5;
        }
        i6 = i7;
        if ((i6 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar6.Y(i6 & 1, z)) {
            if (i8 != 0) {
                str8 = null;
            } else {
                str8 = str5;
            }
            if (i4 != 0) {
                huxVar3 = null;
            } else {
                huxVar3 = huxVar;
            }
            eraVar = een.Q0;
            uwr uwrVar2 = cbx.a;
            long j3 = cbx.a(b0kVar6).a.c;
            cua cuaVar2 = cbx.b(b0kVar6).f;
            cr31 cr31VarB2 = er31.b(8.0f);
            qim0Var2 = nim0.a;
            qim0 qim0VarX2 = uyn1.x(dug.f(qim0Var2, j3, cr31VarB2), cbx.b(b0kVar6).e.c);
            f36Var = h36.c;
            mbhVarA = jbh.a(f36Var, eraVar, b0kVar6, 0);
            iHashCode = Long.hashCode(((x340) b0kVar6).T);
            xos0VarM = b0kVar6.m();
            qim0VarE = zr7.E(b0kVar6, qim0VarX2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar6.m0();
            z2 = ((x340) b0kVar6).S;
            n4kVar = hmb0.t1;
            if (z2) {
                b0kVar6.l(n4kVar);
            } else {
                b0kVar6.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(mbhVarA, b0kVar6, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, b0kVar6, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, b0kVar6, lljVar7);
            nko1.F(b0kVar6);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, b0kVar6, lljVar8);
            huxVar4 = huxVar3;
            qim0 qim0VarH2 = l6o1.H(u291.f(qim0Var2, 1.0f), l6o1.C(0, 0, 1, b0kVar6), false, 14);
            mbh mbhVarA3 = jbh.a(f36Var, eraVar, b0kVar6, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar6).T);
            xos0 xos0VarM3 = b0kVar6.m();
            qim0 qim0VarE3 = zr7.E(b0kVar6, qim0VarH2);
            b0kVar6.m0();
            if (((x340) b0kVar6).S) {
                b0kVar6.l(n4kVar);
            } else {
                b0kVar6.v0();
            }
            nko1.H(mbhVarA3, b0kVar6, lljVar5);
            nko1.H(xos0VarM3, b0kVar6, lljVar6);
            x0d.q(iHashCode3, b0kVar6, lljVar7, b0kVar6);
            nko1.H(qim0VarE3, b0kVar6, lljVar8);
            if (huxVar4 != null) {
                b0kVar6.i0(-1947879084);
                long j4 = cbx.a(b0kVar6).b.a;
                zov0 zov0Var2 = cbx.b(b0kVar6).g;
                b = 16;
                f = 1.0f;
                f2 = 8.0f;
                w0h1.a(huxVar4, isl.a, u291.r(qim0Var2, 64.0f), j4, 0L, false, b0kVar6, 56 | ((i6 >> 21) & 14), 48);
                huxVar2 = huxVar4;
                b0kVar3 = b0kVar6;
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                x0d.s(qim0Var2, 16.0f, b0kVar3, false);
            } else {
                huxVar2 = huxVar4;
                b0kVar3 = b0kVar6;
                b = 16;
                f = 1.0f;
                f2 = 8.0f;
                b0kVar3.i0(-1947560032);
                b0kVar3.r(false);
            }
            b0kVar4 = b0kVar3;
            uwo1.e(str, u291.f(qim0Var2, f), cbx.d(b0kVar3).e, cbx.a(b0kVar3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, i6 & 14, 0, 2016);
            if (str8 != null) {
                b0kVar4.i0(-1947308064);
                cvx cvxVar5 = cbx.b(b0kVar4).b;
                String str11 = str8;
                uwo1.e(str11, u291.f(qim0Var2, f), kk0.p(qim0Var2, f2, b0kVar4, b0kVar4).j, cbx.a(b0kVar4).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, (i6 >> 18) & 14, 0, 2016);
                str9 = str11;
                b0kVar5 = b0kVar4;
                b0kVar5.r(false);
            } else {
                b0kVar5 = b0kVar4;
                str9 = str8;
                b0kVar5.i0(-1947000544);
                b0kVar5.r(false);
            }
            b0kVar5.r(true);
            op71.g(b0kVar5, u291.h(qim0Var2, cbx.b(b0kVar5).b.b));
            idx idxVar2 = new idx(4);
            z50 z50Var2 = z50.c;
            b0kVar2 = b0kVar5;
            foo1.c(new gbx(z50Var2, function0), idxVar2, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(629633657, new pji(str2, b), b0kVar5), b0kVar2, 0, 48, 2044);
            cvx cvxVar6 = cbx.b(b0kVar5).b;
            op71.g(b0kVar5, u291.h(qim0Var2, f2));
            str6 = str3;
            foo1.c(new gbx(z50Var2, function1), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-105187166, new pji(str6, (byte) 17), b0kVar5), b0kVar2, 0, 48, 2044);
            b0kVar5.r(true);
            str7 = str9;
        } else {
            str6 = str3;
            b0kVar6.b0();
            qim0Var2 = qim0Var;
            huxVar2 = huxVar;
            b0kVar2 = b0kVar6;
            str7 = str5;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new s2l(str, str2, str6, function0, function1, qim0Var2, str7, huxVar2, i, i2);
        }
    }

    public static final void e(int i, int i2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        int i3;
        qim0 qim0Var2;
        Function0 function2;
        Function0 function3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(732208493);
        int i4 = i | 6;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i | 54;
            function1 = function0;
        } else {
            function1 = function0;
            i3 = i4 | (x340Var.i(function1) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = u6t.b1;
                    x340Var.s0(objT);
                }
                function3 = (Function0) objT;
            } else {
                function3 = function1;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 8.0f, 0.0f, cbx.b(x340Var).b.c, 5);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            Function0 function4 = function3;
            uwo1.e(cwl1.o0(x340Var, 2131955105), (qim0) null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(ydh.g(8.0f, 2131955103, x340Var, x340Var, qim0Var3), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.a));
            foo1.c(new gbx(z50.c, function4), new idx(4), (qim0) null, (max) null, yla.r(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, dki.a, x340Var, 0, 48, 2012);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
            function2 = function4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            function2 = function1;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyu(qim0Var2, function2, i, i2, (byte) 0);
        }
    }

    public static final void f(qc0 qc0Var, boolean z, iu30 iu30Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1721872881);
        int i2 = i | (x340Var.i(qc0Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nyx.a(2, (wux) null, apo.r(1838206492, new qy90(qc0Var, z, iu30Var, j2iVar), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ey(qc0Var, z, iu30Var, qim0Var2, j2iVar, i, (byte) 21);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1982661522);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
            List listM = p7h.M(new Float[]{Float.valueOf(0.67f), Float.valueOf(0.81f), Float.valueOf(0.58f)});
            x340Var.i0(-1045841676);
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                qim0 qim0VarH = u291.h(u291.f(qim0Var2, ((Number) it.next()).floatValue()), 24.0f);
                uwr uwrVar = cbx.a;
                t1c.a(cwl1.l0(qim0VarH, ((vex) zex.a.e).j, (hw61) null, 10), x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 5);
        }
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1483086381);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(new d36(40.0f, true, new um5(false)), een.P0, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
            x340Var.i0(1650494488);
            for (int i3 = 0; i3 < 3; i3++) {
                g(null, x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 6);
        }
    }

    public static final void i(String str, b0k b0kVar, int i) {
        int i2;
        Uri uri;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1775737331);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            as80 as80Var = mif1.P0;
            if (str == null || (uri = Uri.parse(str)) == null) {
                uri = Uri.EMPTY;
            }
            uri.getClass();
            ltx ltxVar = ltx.c;
            nux nuxVar = new nux(ltxVar, ltxVar);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            eso1.e(uri, isl.a, xcg1.k(cbx.a, i1p1.q(nim0.a, er31.b(4.0f))), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1073741872, 0, 3512);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jea1(str, i, (byte) 0);
        }
    }

    public static final void j(String str, c380 c380Var, int i, boolean z, boolean z2, j2i j2iVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1220378500);
        int i3 = i2 | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(c380Var) ? 32 : 16) | (b0kVar3.e(i == 0 ? -1 : l1d.C(i)) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.h(z2) ? 16384 : 8192) | (b0kVar3.i(function0) ? 1048576 : 524288) | 12582912;
        boolean z3 = false;
        if (b0kVar3.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            if (!z && z2) {
                z3 = true;
            }
            max maxVarR = R(z2, b0kVar3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(1, null, 3, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), null, null, null, 0, null, 498);
            String strO0 = cwl1.o0(b0kVar3, 2131962759);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = hea1.e;
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("song_dna_search_track_row", s161.b(qim0VarF, true, (iu30) objT)), uvxVar, maxVarR, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, apo.r(261590893, new rv71(j2iVar, (byte) 29), b0kVar3), (xu30) null, apo.r(-1232743092, new pfm(i, c380Var, z3), b0kVar3), akj.a, (xu30) null, (xu30) null, apo.r(-1771073848, new c2(z3, str, (byte) 9), b0kVar3), b0kVar2, 805306432, 197040, 26040);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bw1(str, c380Var, i, z, z2, j2iVar, function0, qim0Var2, i2);
        }
    }

    public static final void k(String str, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1612537995);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.i(iu30Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0.a);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            wnb0 wnb0VarQ = kk0.q(x340Var2, qim0VarE, y580.Y, 1.0f, true);
            uwr uwrVar = cbx.a;
            uwo1.e(str, wnb0VarQ, cbx.d(x340Var2).e, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, i2 & 14, 0, 1720);
            x340Var = x340Var2;
            if (z) {
                x340Var.i0(1788692522);
                boolean z2 = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new ux90(iu30Var, (byte) 13);
                    x340Var.s0(objT);
                }
                cev0.a(0, (Function0) objT, x340Var, (qim0) null);
                x340Var.r(false);
            } else {
                x340Var.i0(1788753065);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uw90(str, z, iu30Var, i, (byte) 1);
        }
    }

    public static final void l(f7g0 f7g0Var, vyr0 vyr0Var, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        vyr0 vyr0Var2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-889030088);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(f7g0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            vyr0Var2 = vyr0Var;
            i2 |= x340Var.g(vyr0Var2) ? 32 : 16;
        } else {
            vyr0Var2 = vyr0Var;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i2 |= x340Var.h(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2;
            otw.c(vyr0Var2, new tyr0(f7g0Var.b, f7g0Var.c, f7g0Var.e, f7g0Var.d, f7g0Var.g, f7g0Var.h, f7g0Var.i, f7g0Var.t, z3, f7g0Var.X), qim0Var, (ipb1) null, x340Var, ((i3 >> 3) & 14) | ((i3 >> 6) & 896), 8);
            if (z2) {
                x340Var.i0(1968676601);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x0d.s(nim0.a, 8.0f, x340Var, false);
            } else {
                x340Var.i0(1968754442);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg((Object) f7g0Var, (Object) vyr0Var, z, z2, (Object) qim0Var, i, (byte) 9);
        }
    }

    public static final String m(jce0 jce0Var) {
        if (jce0Var != jce0.a) {
            return "";
        }
        upc upcVar = upc.o;
        upcVar.getClass();
        return nyn1.Z(upcVar);
    }

    public static final boolean n(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final View o(pim0 pim0Var) {
        k75 k75Var = oap1.B(pim0Var.a).P0;
        View interopView = k75Var != null ? k75Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        eg.m("Could not fetch interop view");
        return null;
    }

    public static final boolean p(sy21 sy21Var, yqg yqgVar) {
        ry21 ry21Var = sy21Var.a;
        ry21 ry21Var2 = ry21Var.t;
        if (ry21Var2 == null) {
            return false;
        }
        upc upcVarA = ry21Var.a.a();
        if (upcVarA.j && upcVarA.h == Integer.MAX_VALUE) {
            return true;
        }
        if (ry21Var2 == null) {
            return false;
        }
        upc upcVar = upc.n;
        int i = nyn1.Y(ry21Var2.f).c;
        if (i != -1) {
            return yqgVar.b() <= TimeUnit.SECONDS.toMillis((long) i) + ry21Var2.Z;
        }
        return true;
    }

    public static final boolean q(Map map) {
        return u("allow-live-events", map, true);
    }

    public static final void r(WorkDatabase workDatabase, btk btkVar, nvl1 nvl1Var) {
        int i;
        ArrayList arrayListO = p7h.O(new nvl1[]{nvl1Var});
        int i2 = 0;
        while (!arrayListO.isEmpty()) {
            nvl1 nvl1Var2 = (nvl1) r7h.d0(arrayListO);
            List list = nvl1Var2.d;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((rwl1) it.next()).b.j.i.isEmpty() && (i = i + 1) < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            }
            i2 += i;
            List list2 = nvl1Var2.g;
            if (list2 != null) {
                arrayListO.addAll(list2);
            }
        }
        if (i2 == 0) {
            return;
        }
        int iIntValue = ((Number) qyo1.x(workDatabase.A().a, true, false, new qti1((byte) 26))).intValue();
        if (iIntValue + i2 <= 8) {
            return;
        }
        hhg1.n(l1d.j(iIntValue, i2, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    public static final qim0 s(qim0 qim0Var) {
        return qim0Var.then(fy20.a).then(c030.a).then(e030.a).then(a030.a);
    }

    public static final boolean t(String str, Map map) {
        try {
            return yto.j((String) map.get(str));
        } catch (ConvertProductStateValueException e) {
            Logger.e(e, "Unable to extract product state", new Object[0]);
            return false;
        }
    }

    public static final boolean u(String str, Map map, boolean z) {
        try {
            return yto.k((String) map.get(str), z);
        } catch (ConvertProductStateValueException e) {
            Logger.e(e, "Unable to extract product state", new Object[0]);
            return z;
        }
    }

    public static final int v(d441 d441Var) {
        return d9y0.m(d441Var, "work_spec_id");
    }

    public static final int w(d441 d441Var, String str) {
        int iM = d9y0.m(d441Var, str);
        if (iM >= 0) {
            return iM;
        }
        int columnCount = d441Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(d441Var.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + o7h.y0(arrayList, (CharSequence) null, (String) null, (String) null, (iu30) null, 63) + ']');
    }

    public static final boolean x(Map map) {
        return u("has-audiobooks-available", map, false);
    }

    public static final Observable y(o241 o241Var) {
        return ((p241) o241Var).a.map(ud20.d1);
    }

    public static final boolean z(Map map) {
        return u("allow-child-video", map, true);
    }
}
