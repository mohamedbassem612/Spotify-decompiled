package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class l4p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [int] */
    /* JADX WARN: Type inference failed for: r29v2 */
    public static final void a(spv spvVar, t71 t71Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws Throwable {
        ?? r15;
        float f;
        Throwable th;
        boolean z = t71Var.e;
        boolean z2 = t71Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1631078489);
        int i2 = i | (x340Var.i(spvVar) ? 4 : 2) | (x340Var.g(t71Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new pd1(new qj(iu30Var, (byte) 18));
                x340Var.s0(objT);
            }
            pd1 pd1Var = (pd1) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = new ui51();
                x340Var.s0(objT2);
            }
            ui51 ui51Var = (ui51) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = new f9t0(new qj(iu30Var, (byte) 19), false);
                x340Var.s0(objT3);
            }
            f9t0 f9t0Var = (f9t0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == obj) {
                objT4 = new fgg0();
                x340Var.s0(objT4);
            }
            fgg0 fgg0Var = (fgg0) objT4;
            qim0 qim0VarN = anm1.N("add-account-column-test-tag", l6o1.H(u291.d(qim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14));
            u85 u85Var = (erl1) x340Var.k(szf0.b);
            if (u85Var == null) {
                x340Var.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var).g;
            } else {
                x340Var.i0(-241885792);
            }
            x340Var.r(false);
            qim0 qim0VarY = too1.y(qim0VarN, new bgc0(u85Var, 32));
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
            boolean z3 = t71Var.b;
            nim0 nim0Var = nim0.a;
            if (z3) {
                x340Var.i0(-1221150343);
                egg0 egg0Var = new egg0(z2, false);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                r15 = 0;
                f = 1.0f;
                th = null;
                otw.c(fgg0Var, egg0Var, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), (ipb1) null, x340Var, 0, 8);
                x340Var.r(false);
            } else {
                r15 = 0;
                f = 1.0f;
                th = null;
                x340Var.i0(-1220912015);
                x340Var.r(false);
            }
            if (z2) {
                x340Var.i0(-1220603503);
                x340Var.r((boolean) r15);
            } else {
                x340Var.i0(-1220861051);
                otw.c(ui51Var, new si51(cwl1.o0(x340Var, 2131959766), 1), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r((boolean) r15);
            }
            x340Var.i0(-455015287);
            ?? r29 = r15;
            for (Object obj2 : t71Var.a) {
                int i3 = r29 + 1;
                if (r29 < 0) {
                    p7h.T();
                    throw th;
                }
                y8t0 y8t0Var = (y8t0) obj2;
                otw.c(f9t0Var, new c9t0(y8t0Var.a, y8t0Var.b, y8t0Var.c, y8t0Var.d, y8t0Var.e, (int) r29), (qim0) null, (ipb1) null, x340Var, 0, 12);
                r29 = i3;
            }
            x340Var.r((boolean) r15);
            od1 od1Var = od1.a;
            if (z2) {
                x340Var.i0(-1220124181);
                qim0 qim0VarF = u291.f(nim0Var, f);
                uwr uwrVar2 = cbx.a;
                op71.g(x340Var, u291.h(qim0VarF, cbx.b(x340Var).b.b));
                otw.c(pd1Var, od1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
                if (z) {
                    x340Var.i0(-1219874507);
                    otw.c(spvVar, new rpv((boolean) r15), (qim0) null, (ipb1) null, x340Var, i2 & 14, 12);
                    op71.g(x340Var, u291.h(u291.f(nim0Var, f), cbx.b(x340Var).b.a));
                    x340Var.r((boolean) r15);
                } else {
                    x340Var.i0(-1219693839);
                    x340Var.r((boolean) r15);
                }
                x340Var.r((boolean) r15);
            } else {
                x340Var.i0(-1219662529);
                if (z != 0) {
                    x340Var.i0(-1219637419);
                    otw.c(spvVar, new rpv((boolean) r15), (qim0) null, (ipb1) null, x340Var, i2 & 14, 12);
                    qim0 qim0VarF2 = u291.f(nim0Var, f);
                    uwr uwrVar3 = cbx.a;
                    op71.g(x340Var, u291.h(qim0VarF2, cbx.b(x340Var).b.a));
                    x340Var.r((boolean) r15);
                } else {
                    x340Var.i0(-1219456751);
                    x340Var.r((boolean) r15);
                }
                otw.c(ui51Var, new si51(cwl1.o0(x340Var, 2131959459), 2), (qim0) null, (ipb1) null, x340Var, 0, 12);
                otw.c(pd1Var, od1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
                x340Var.r((boolean) r15);
            }
            qim0 qim0VarF3 = u291.f(nim0Var, f);
            uwr uwrVar4 = cbx.a;
            op71.g(x340Var, u291.h(qim0VarF3, cbx.b(x340Var).b.c));
            x340Var.r(true);
            if (t71Var.c == 2) {
                x340Var.i0(1803899732);
                zr7.c(th, x340Var, (int) r15);
                x340Var.r((boolean) r15);
            } else {
                x340Var.i0(1803937211);
                x340Var.r((boolean) r15);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, (Object) spvVar, (Object) t71Var, (Object) iu30Var, (Object) qim0Var, (byte) 9);
        }
    }

    public static final void b(int i, long j, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1005006745);
        int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | 384 | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var3, 48.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = bin.x(uyn1.x(qim0VarR, 8.0f), false, null, null, null, function0, 15);
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
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            avw0 avw0Var = cbx.b(x340Var).c;
            o4p1.b(z, j, qim0VarD, 2.0f, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 0);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d8h(j, z, qim0Var2, function0, i);
        }
    }

    public static final void c(x5r x5rVar, iu30 iu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        Function0 function1;
        qim0 qim0Var2;
        djc0 djc0Var;
        boolean z;
        qim0 qim0Var3;
        m4c m4cVar;
        boolean z2;
        x5r x5rVar2 = x5rVar;
        d761 d761Var = x5rVar2.d;
        d761 d761Var2 = x5rVar2.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1357154723);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(x5rVar2) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarN = anm1.N("date_header", u291.f(qim0Var4, 1.0f));
            Object objT = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = r5r.b;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT);
            fra fraVar = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
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
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var4);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            if (d761Var2 != null) {
                x340Var.i0(-1288257234);
                djc0Var = null;
                vnr0 vnr0VarG = d761Var2.g((djc0) null, x340Var, 1);
                boolean z4 = (i2 & 14) == 4;
                Object objT2 = x340Var.T();
                if (z4 || objT2 == m4cVar2) {
                    z2 = false;
                    x5rVar2 = x5rVar;
                    objT2 = new s5r(x5rVar2, (byte) 0);
                    x340Var.s0(objT2);
                } else {
                    z2 = false;
                    x5rVar2 = x5rVar;
                }
                qim0 qim0VarA = s161.a(qim0Var4, (iu30) objT2);
                m4cVar = m4cVar2;
                z = z2;
                qim0Var3 = qim0Var4;
                qgo1.f(vnr0VarG, qim0VarA, null, 0, false, null, x340Var, 8, 60);
                x340Var.r(z);
            } else {
                djc0Var = null;
                z = false;
                x5rVar2 = x5rVar;
                qim0Var3 = qim0Var4;
                m4cVar = m4cVar2;
                x340Var.i0(-1287491441);
                String str = x5rVar2.b;
                String str2 = x5rVar2.a;
                boolean z5 = (i2 & 14) == 4;
                Object objT3 = x340Var.T();
                if (z5 || objT3 == m4cVar) {
                    objT3 = new s5r(x5rVar2, (byte) 1);
                    x340Var.s0(objT3);
                }
                d(0, str, str2, x340Var, s161.a(qim0Var3, (iu30) objT3));
                x340Var.r(false);
            }
            if (x5rVar2.f != null) {
                x340Var.i0(-1287210085);
                int i3 = (i2 >> 3) & 14;
                iu30Var2 = iu30Var;
                e(i3, x340Var, iu30Var2, anm1.N("date_header_help_button", qim0Var3));
                x340Var.r(z);
            } else {
                iu30Var2 = iu30Var;
                x340Var.i0(-1287054403);
                x340Var.r(z);
            }
            x340Var.r(true);
            if (d761Var != null) {
                x340Var.i0(816989030);
                vnr0 vnr0VarG2 = d761Var.g(djc0Var, x340Var, 1);
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = r5r.c;
                    x340Var.s0(objT4);
                }
                qgo1.f(vnr0VarG2, s161.a(qim0Var3, (iu30) objT4), null, 0, false, null, x340Var, 8, 60);
                x340Var.r(z);
            } else {
                x340Var.i0(817222553);
                x340Var.r(z);
            }
            x340Var.r(true);
            if (x5rVar2.t instanceof y5r) {
                function1 = function0;
                x340Var.i0(-238054205);
                x340Var.r(z);
            } else {
                x340Var.i0(-238187784);
                function1 = function0;
                j((i2 >> 6) & 14, function1, x340Var, anm1.N("date_header_share_button", qim0Var3));
                x340Var.r(z);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            iu30Var2 = iu30Var;
            function1 = function0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(x5rVar2, iu30Var2, function1, qim0Var2, i, (byte) 13);
        }
    }

    public static final void d(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-331579552);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
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
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(b0kVar3).e, u7h.f, null, null, 0, false, null, 0, null, b0kVar3, i2 & 14, 0, 2034);
            b0kVar2 = b0kVar3;
            lee1 lee1Var = cbx.d(b0kVar2).e;
            long jK = f5p1.k(b0kVar2, 2131104091);
            cvx cvxVar = cbx.b(b0kVar2).b;
            uwo1.e(str2, uyn1.B(nim0.a, 4.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var, jK, null, null, 0, false, null, 0, null, b0kVar3, (i2 >> 3) & 14, 0, 2032);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 11);
        }
    }

    public static final void e(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        Object obj;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-133992681);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                obj = objT;
                cl70 cl70Var = new cl70(context);
                cl70Var.setImageTintList(ColorStateList.valueOf(context.getColor(2131104090)));
                cl70Var.setImportantForAccessibility(2);
                b0kVar3.s0(cl70Var);
                obj = cl70Var;
            }
            obj = objT;
            cl70 cl70Var2 = (cl70) obj;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                g660 g660Var = new g660();
                g660Var.a = cl70Var2;
                objT2 = v8r.q(g660Var);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            String strO0 = cwl1.o0(b0kVar3, 2131963210);
            String strO1 = cwl1.o0(b0kVar3, 2131963211);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarB = uyn1.B(qim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean zG = b0kVar3.g(strO0);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new i3o(strO0, (byte) 5);
                b0kVar3.s0(objT3);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, true, (iu30) objT3);
            boolean zI = ((i3 & 14) == 4) | b0kVar3.i(ven0Var);
            Object objT4 = b0kVar3.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new wq9(iu30Var, ven0Var, (byte) 11);
                b0kVar3.s0(objT4);
            }
            qim0 qim0VarX = bin.x(qim0VarB2, false, strO1, null, null, (Function0) objT4, 13);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarX);
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
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            boolean zI2 = b0kVar3.i(cl70Var2);
            Object objT5 = b0kVar3.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new t5r(cl70Var2, (byte) 0);
                b0kVar3.s0(objT5);
            }
            iu30 iu30Var2 = (iu30) objT5;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            qim0 qim0VarR = u291.r(nim0.a, 16.0f);
            boolean zI3 = b0kVar3.i(ven0Var);
            Object objT6 = b0kVar3.T();
            if (zI3 || objT6 == m4cVar) {
                objT6 = new bzm(ven0Var, (byte) 12);
                b0kVar3.s0(objT6);
            }
            iu30 iu30Var3 = (iu30) objT6;
            b0kVar2 = b0kVar3;
            qim0Var2 = qim0Var;
            dm5.a(iu30Var2, qim0VarR, iu30Var3, b0kVar2, 0, 0);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            qim0Var2 = qim0Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(iu30Var, qim0Var2, i, (byte) 7);
        }
    }

    public static final void f(int i, String str, b0k b0kVar, qim0 qim0Var) {
        byte b2;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(626055127);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | 48;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var3);
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
            ilx ilxVar = ilx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar2).g;
            w0h1.a(ilxVar, isl.a, u291.r(qim0Var3, 16.0f), ((vex) zex.a.b).h, 0L, false, b0kVar2, ilx.d | 48, 48);
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.r(qim0Var3, 4.0f));
            b0kVar2 = b0kVar2;
            b2 = 1;
            uwo1.e(str, null, cbx.d(b0kVar2).j, 0L, null, null, 0, false, null, 0, null, b0kVar2, i2 & 14, 0, 2042);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b2 = 1;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var2, i, b2);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-562956518);
        int i2 = i | 6;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f), null, null, false, null, null, null, null, null, wcj.a, null, wcj.b, null, wcj.c, null, wcj.d, b0kVar2, 805306368, 199728, 22014);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var2, i, (byte) 13);
        }
    }

    public static final void h(zzz0 zzz0Var, iu30 iu30Var, b0k b0kVar, int i) {
        float f;
        Object mhgVar;
        xzz0 xzz0Var = zzz0Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1352114576);
        pw31 pw31Var = pw31.a;
        int i2 = (x340Var.g(pw31Var) ? 4 : 2) | i | (x340Var.g(zzz0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ss50 ss50Var = (ss50) x340Var.k(t4k.l);
            if (xzz0Var.a()) {
                x340Var.i0(-1992977038);
                x340Var.r(false);
                f = 0.0f;
            } else {
                x340Var.i0(-1992976138);
                uwr uwrVar = cbx.a;
                f = cbx.b(x340Var).b.a;
                x340Var.r(false);
            }
            float f2 = f;
            qim0 qim0VarA = pw31Var.a(1.0f, nim0.a, false);
            boolean zI = ((i2 & 112) == 32) | x340Var.i(ss50Var) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                mhgVar = new mhg(zzz0Var, ss50Var, iu30Var, false, (byte) 4);
                x340Var.s0(mhgVar);
            } else {
                mhgVar = objT;
            }
            qim0 qim0VarB = f8d1.b(qim0VarA, rih1.a, (PointerInputEventHandler) mhgVar);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            o4p1.e(zzz0Var, null, f2, x340Var, (i2 >> 3) & 14);
            dem1.j(6, zzz0Var.i, x340Var, xzz0Var.a());
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u8e0(zzz0Var, iu30Var, i);
        }
    }

    public static final void i(lik1 lik1Var, zzz0 zzz0Var, idm idmVar, iu30 iu30Var, b0k b0kVar, int i) {
        xzz0 xzz0Var = zzz0Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1783151486);
        int i2 = i | (x340Var.g(lik1Var) ? 4 : 2) | (x340Var.g(zzz0Var) ? 32 : 16) | (x340Var.i(idmVar) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(d9y0.k(nim0.a, ((Number) z95.b(zzz0Var.h instanceof rzz0 ? 0.5f : 1.0f, irn1.o0(150, 0, mlv.d, 2), "dimAlpha", (iu30) null, x340Var, 3072, 20).getValue()).floatValue()), 1.0f);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            byte b2 = 29;
            jw31 jw31VarA = ew31.a(new d36(6.0f, true, new g21(xzz0Var.a() ? een.R0 : een.P0, (byte) 29)), fraVar, x340Var, 48);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(2125415039);
            smc0 smc0VarN = k4p1.n();
            smc0VarN.add(apo.r(-325997216, new mb90(lik1Var, zzz0Var, idmVar, b2), x340Var));
            smc0VarN.add(apo.r(1913504215, new u8e0(zzz0Var, iu30Var), x340Var));
            smc0VarN.add(pwi.a);
            List listK = k4p1.k(smc0VarN);
            x340Var.r(false);
            if (!xzz0Var.a()) {
                listK = o7h.T0(listK);
            }
            x340Var.i0(2125429332);
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                ((vu30) it.next()).invoke(x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(i, (Object) lik1Var, (Object) zzz0Var, (Object) idmVar, (Object) iu30Var, (byte) 25);
        }
    }

    public static final void j(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1211533352);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            wro1.h(new gbx(z50.c, function0), ldx.c, qim0Var, null, yla.s(x340Var).a(), null, false, null, null, rhi.a, x340Var, (i2 << 3) & 896, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 10);
        }
    }

    public static final void k(float f, float f2, int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(101266541);
        int i4 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.d(f2) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
            qim0 qim0VarS = u291.s(qim0Var4, f, f2);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarS, jA, er31.b(8.0f));
            cua cuaVar2 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(qim0VarF, 0L, er31.b(8.0f), 13), x340Var, 0);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mu11(f, i, f2, qim0Var3, i2);
        }
    }

    public static final void l(float f, int i, int i2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-304514344);
        int i4 = (x340Var.d(f) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (x340Var.i(qim0Var) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0VarR = u291.r(qim0Var, f);
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(dug.f(qim0VarR, cbx.a(x340Var).a.b.a(), er31.a), 0L, er31.b(f), 13), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ewb(f, qim0Var, i, i2);
        }
    }

    public static final void m(qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1607728846);
        int i2 = i | 6;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f), null, null, false, null, null, null, null, null, null, null, wcj.e, wcj.f, null, null, wcj.g, b0kVar2, 0, 197040, 26622);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var2, i, (byte) 14);
        }
    }

    public static final Set n(nx9 nx9Var) {
        return f46.S0(new Object[]{nx9Var.b(), nx9Var.e(), nx9Var.k(), nx9Var.f(), nx9Var.h(), nx9Var.t(), nx9Var.p()});
    }

    public static final void o(EditorInfo editorInfo) {
        if (a4x.d()) {
            a4x.a().j(editorInfo);
        }
    }

    public static final Object p(mr20 mr20Var, lnm lnmVar) {
        Object objCollect = mr20Var.collect(kfo0.a, lnmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }

    public static final Object q(mr20 mr20Var, vu30 vu30Var, lnm lnmVar) {
        Object objP = p(o4p1.k(hu20.c(mr20Var, vu30Var), 0, 2), lnmVar);
        return objP == d9n.a ? objP : rih1.a;
    }

    public static lpk0 r(r6h1 r6h1Var) {
        return new lpk0(r6h1Var);
    }

    public static final Object s(vr20 vr20Var, mr20 mr20Var, lnm lnmVar) {
        u4p1.S(vr20Var);
        Object objCollect = mr20Var.collect(vr20Var, lnmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }

    public static final go80 t(klm klmVar, acp0 acp0Var, acp0 acp0Var2, acp0 acp0Var3, acp0 acp0Var4, acp0 acp0Var5, acp0 acp0Var6) {
        return klmVar.a("SupportedNavigationCommandRegistrarDaemon", new ndp0(acp0Var, acp0Var2, acp0Var3, acp0Var4, acp0Var5, acp0Var6, (byte) 2));
    }

    public static final xab1 u(c9n c9nVar, mr20 mr20Var) {
        return fn31.T(c9nVar, (o8n) null, 0, new mx(mr20Var, (lnm) null, (byte) 22), 3);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0 A[PHI: r5
      0x00d0: PHI (r5v8 java.lang.String) = (r5v7 java.lang.String), (r5v26 java.lang.String) binds: [B:34:0x00c2, B:38:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2 A[PHI: r5
      0x00e2: PHI (r5v10 java.lang.String) = (r5v9 java.lang.String), (r5v23 java.lang.String) binds: [B:42:0x00d4, B:46:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    /* JADX WARN: Code duplicated, block: B:68:0x0115  */
    /* JADX WARN: Code duplicated, block: B:69:0x0118  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b A[PHI: r5
      0x011b: PHI (r5v12 java.lang.String) = (r5v11 java.lang.String), (r5v20 java.lang.String) binds: [B:50:0x00e6, B:63:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0161  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0164  */
    /* JADX WARN: Code duplicated, block: B:84:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0170  */
    /* JADX WARN: Code duplicated, block: B:86:0x0173  */
    /* JADX WARN: Code duplicated, block: B:88:0x0177  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:99:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [p.wx71] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:28:0x0088). Please report as a decompilation issue!!! */
    public static final Object v(bfd bfdVar, lw71 lw71Var, String str, onm onmVar) {
        ex71 ex71Var;
        List listJ;
        Set linkedHashSet;
        bfd bfdVar2;
        String str2;
        ex71 ex71Var2;
        lw71 lw71Var2;
        String str3;
        Object objSingletonList;
        Object objT;
        d9n d9nVar;
        List list;
        Set set;
        lpl lplVar;
        wb71 wb71VarL;
        String str4;
        ?? wx71Var;
        String str5;
        String str6;
        ?? r15;
        wb71 wb71Var;
        yb71 yb71Var;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        nb71 nb71Var;
        String str13;
        if (onmVar instanceof ex71) {
            ex71Var = (ex71) onmVar;
            int i = ex71Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ex71Var.f = i - Integer.MIN_VALUE;
            } else {
                ex71Var = new ex71(onmVar);
            }
        } else {
            ex71Var = new ex71(onmVar);
        }
        Object obj = ex71Var.e;
        int i2 = ex71Var.f;
        int i3 = 1;
        String str14 = null;
        if (i2 == 0) {
            listJ = hrt.j(obj);
            linkedHashSet = new LinkedHashSet();
            if (str != null) {
                linkedHashSet.add(str);
            }
            bfdVar2 = bfdVar;
            str2 = str;
            ex71Var2 = ex71Var;
            lw71Var2 = lw71Var;
            String str15 = lw71Var2.a;
            str3 = lw71Var2.b;
            if (str3 != null) {
                objSingletonList = Collections.singletonList(str3);
            } else {
                objSingletonList = str14;
            }
            if (objSingletonList == null) {
                objSingletonList = z6x.a;
            }
            cqf cqfVar = lw71Var2.c;
            ex71Var2.a = bfdVar2;
            ex71Var2.b = lw71Var2;
            ex71Var2.c = listJ;
            ex71Var2.d = linkedHashSet;
            ex71Var2.f = i3;
            objT = bfdVar2.t(str15, 20, str2, objSingletonList, cqfVar, ex71Var2);
            d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
            Set set2 = linkedHashSet;
            list = listJ;
            obj = objT;
            set = set2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set3 = ex71Var.d;
            list = ex71Var.c;
            lw71 lw71Var3 = ex71Var.b;
            bfd bfdVar3 = ex71Var.a;
            hm5.M(obj);
            ex71Var2 = ex71Var;
            set = set3;
            lw71Var2 = lw71Var3;
            bfdVar2 = bfdVar3;
        }
        xpf xpfVar = (xpf) obj;
        List list2 = list;
        List<tom> list3 = xpfVar.a;
        ArrayList arrayList = new ArrayList();
        for (tom tomVar : list3) {
            lplVar = tomVar.f;
            wb71VarL = wro1.L(lplVar.b);
            if (wb71VarL instanceof wb71) {
                String str16 = tomVar.a;
                wb71Var = wb71VarL;
                yb71Var = wb71Var.e;
                str4 = str14;
                str7 = wb71Var.a;
                if (str7 != null) {
                    str8 = str7;
                } else {
                    if (yb71Var != null) {
                        str7 = yb71Var.a;
                    } else {
                        str7 = str4;
                    }
                    if (str7 == null) {
                        str8 = "";
                    } else {
                        str8 = str7;
                    }
                }
                str9 = wb71Var.b;
                if (str9 != null) {
                    str10 = str9;
                } else {
                    if (yb71Var != null) {
                        str9 = yb71Var.b;
                    } else {
                        str9 = str4;
                    }
                    if (str9 == null) {
                        str10 = "";
                    } else {
                        str10 = str9;
                    }
                }
                str11 = wb71Var.d;
                if (str11 == null) {
                    nb71Var = wb71Var.c.b;
                    if (!(nb71Var instanceof mb71)) {
                        str11 = str4;
                    } else if (nb71Var instanceof nb71) {
                        str11 = nb71Var.a;
                    } else if (nb71Var instanceof pb71) {
                        str11 = ((pb71) nb71Var).a;
                    } else {
                        if (!(nb71Var instanceof ob71)) {
                            eg.o();
                            return str4;
                        }
                        str11 = str4;
                    }
                    if (str11 == null) {
                        if (yb71Var != null) {
                            str13 = yb71Var.d;
                        } else {
                            str13 = str4;
                        }
                        if (str13 == null) {
                            str12 = "";
                        } else {
                            str12 = str13;
                        }
                    } else {
                        str12 = str11;
                    }
                } else {
                    str12 = str11;
                }
                wx71Var = new wx71(str16, str8, str10, str12, lplVar.a, tomVar.d, tomVar.c);
            } else {
                str4 = str14;
                if (wb71VarL instanceof yb71) {
                    yb71 yb71Var2 = (yb71) wb71VarL;
                    wx71Var = new wx71(tomVar.a, yb71Var2.a, yb71Var2.b, yb71Var2.d, lplVar.a, tomVar.d, tomVar.c);
                } else {
                    wx71Var = str4;
                }
            }
            if (wx71Var != 0) {
                str5 = wx71Var.b;
            } else {
                str5 = str4;
            }
            if (str5 != null || ihc1.y0(str5)) {
                if (wx71Var != 0) {
                    str6 = wx71Var.c;
                } else {
                    str6 = str4;
                }
                if (str6 != null || ihc1.y0(str6)) {
                    r15 = wx71Var;
                    r15 = str4;
                }
            }
            if (r15 != 0) {
                arrayList.add(r15);
            }
            str14 = str4;
        }
        String str17 = str14;
        r7h.W(arrayList, list2);
        String str18 = xpfVar.b;
        if (str18 == null && set.add(str18)) {
            str2 = str18;
        } else {
            str2 = str17;
        }
        if (list.size() < 10 || str2 == null) {
            return new dju(list, str2);
        }
        listJ = list;
        str14 = str17;
        i3 = 1;
        linkedHashSet = set;
        String str19 = lw71Var2.a;
        str3 = lw71Var2.b;
        if (str3 != null) {
            objSingletonList = Collections.singletonList(str3);
        } else {
            objSingletonList = str14;
        }
        if (objSingletonList == null) {
            objSingletonList = z6x.a;
        }
        cqf cqfVar2 = lw71Var2.c;
        ex71Var2.a = bfdVar2;
        ex71Var2.b = lw71Var2;
        ex71Var2.c = listJ;
        ex71Var2.d = linkedHashSet;
        ex71Var2.f = i3;
        objT = bfdVar2.t(str19, 20, str2, objSingletonList, cqfVar2, ex71Var2);
        d9nVar = d9n.a;
        if (objT == d9nVar) {
            return d9nVar;
        }
        Set set4 = linkedHashSet;
        list = listJ;
        obj = objT;
        set = set4;
        xpf xpfVar2 = (xpf) obj;
        List list4 = list;
        List<tom> list5 = xpfVar2.a;
        ArrayList arrayList2 = new ArrayList();
        while (r8.hasNext()) {
            lplVar = tomVar.f;
            wb71VarL = wro1.L(lplVar.b);
            if (wb71VarL instanceof wb71) {
                String str110 = tomVar.a;
                wb71Var = wb71VarL;
                yb71Var = wb71Var.e;
                str4 = str14;
                str7 = wb71Var.a;
                if (str7 != null) {
                    str8 = str7;
                } else {
                    if (yb71Var != null) {
                        str7 = yb71Var.a;
                    } else {
                        str7 = str4;
                    }
                    if (str7 == null) {
                        str8 = "";
                    } else {
                        str8 = str7;
                    }
                }
                str9 = wb71Var.b;
                if (str9 != null) {
                    str10 = str9;
                } else {
                    if (yb71Var != null) {
                        str9 = yb71Var.b;
                    } else {
                        str9 = str4;
                    }
                    if (str9 == null) {
                        str10 = "";
                    } else {
                        str10 = str9;
                    }
                }
                str11 = wb71Var.d;
                if (str11 == null) {
                    nb71Var = wb71Var.c.b;
                    if (!(nb71Var instanceof mb71)) {
                        str11 = str4;
                    } else if (nb71Var instanceof nb71) {
                        str11 = nb71Var.a;
                    } else if (nb71Var instanceof pb71) {
                        str11 = ((pb71) nb71Var).a;
                    } else {
                        if (!(nb71Var instanceof ob71)) {
                            eg.o();
                            return str4;
                        }
                        str11 = str4;
                    }
                    if (str11 == null) {
                        if (yb71Var != null) {
                            str13 = yb71Var.d;
                        } else {
                            str13 = str4;
                        }
                        if (str13 == null) {
                            str12 = "";
                        } else {
                            str12 = str13;
                        }
                    } else {
                        str12 = str11;
                    }
                } else {
                    str12 = str11;
                }
                wx71Var = new wx71(str110, str8, str10, str12, lplVar.a, tomVar.d, tomVar.c);
            } else {
                str4 = str14;
                if (wb71VarL instanceof yb71) {
                    yb71 yb71Var3 = (yb71) wb71VarL;
                    wx71Var = new wx71(tomVar.a, yb71Var3.a, yb71Var3.b, yb71Var3.d, lplVar.a, tomVar.d, tomVar.c);
                } else {
                    wx71Var = str4;
                }
            }
            if (wx71Var != 0) {
                str5 = wx71Var.b;
            } else {
                str5 = str4;
            }
            if (str5 != null) {
                if (wx71Var != 0) {
                    str6 = wx71Var.c;
                } else {
                    str6 = str4;
                }
                if (str6 != null) {
                    r15 = wx71Var;
                    r15 = str4;
                } else {
                    r15 = wx71Var;
                    r15 = str4;
                }
            } else {
                if (wx71Var != 0) {
                    str6 = wx71Var.c;
                } else {
                    str6 = str4;
                }
                if (str6 != null) {
                    r15 = wx71Var;
                    r15 = str4;
                } else {
                    r15 = wx71Var;
                    r15 = str4;
                }
            }
            if (r15 != 0) {
                arrayList2.add(r15);
            }
            str14 = str4;
        }
        String str111 = str14;
        r7h.W(arrayList2, list4);
        String str112 = xpfVar2.b;
        if (str112 == null) {
            str2 = str111;
        } else {
            str2 = str111;
        }
        if (list.size() < 10) {
        }
        return new dju(list, str2);
    }

    public static final Flowable w(Flowable flowable, boolean z) {
        return z ? new FlowableRefCount(flowable.Q()) : flowable;
    }

    public static final uvj1 x(y1k1 y1k1Var) {
        Object next;
        uvj1 uvj1Var;
        int iMin;
        int i = y1k1Var.b;
        int i2 = y1k1Var.a;
        Iterator it = o7h.a1(uvj1.g, new epj1((byte) 4)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            uvj1Var = (uvj1) next;
            iMin = Math.min(i2, i);
            if (Math.max(i2, i) >= uvj1Var.c) {
                break;
            }
        } while (iMin < uvj1Var.d);
        uvj1 uvj1Var2 = (uvj1) next;
        return uvj1Var2 == null ? uvj1.e : uvj1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[PHI: r7 r8
      0x0066: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v5 java.lang.String) binds: [B:21:0x004f, B:26:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r8v1 p.kko) = (r8v0 p.kko), (r8v2 p.kko) binds: [B:21:0x004f, B:26:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r10 == r6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object y(java.lang.String r7, p.kko r8, p.lm61 r9, p.onm r10) {
        /*
            boolean r0 = r10 instanceof p.fx71
            if (r0 == 0) goto L13
            r0 = r10
            p.fx71 r0 = (p.fx71) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.fx71 r0 = new p.fx71
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.d
            r2 = 2
            r3 = 1
            p.rih1 r4 = p.rih1.a
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            p.hm5.M(r10)
            return r4
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L33:
            java.lang.String r7 = r0.b
            p.kko r8 = r0.a
            p.hm5.M(r10)
            goto L5e
        L3b:
            p.hm5.M(r10)
            java.util.Set r10 = p.s4b1.f
            p.s4b1 r7 = p.uic.x(r7)
            java.lang.String r7 = r7.z()
            if (r7 != 0) goto L4b
            goto L73
        L4b:
            boolean r10 = p.nzy.d(r7)
            if (r10 == 0) goto L66
            r0.a = r8
            r0.b = r7
            r0.d = r3
            java.lang.Object r10 = r9.invoke(r7, r0)
            if (r10 != r6) goto L5e
            goto L72
        L5e:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r9 = p.u890.j(r10, r9)
            if (r9 == 0) goto L73
        L66:
            r0.a = r5
            r0.b = r5
            r0.d = r2
            java.lang.Object r7 = r8.b(r7, r5, r0)
            if (r7 != r6) goto L73
        L72:
            return r6
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l4p1.y(java.lang.String, p.kko, p.lm61, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    public static final void z(EditorInfo editorInfo, x180 x180Var, c8e1 c8e1Var) {
        int i;
        int i2;
        int i3 = x180Var.e;
        boolean z = x180Var.a;
        int i4 = 4;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                eg.m("invalid ImeAction");
                return;
            }
        }
        editorInfo.imeOptions = i;
        int i5 = x180Var.d;
        if (i5 != 1) {
            if (i5 == 2) {
                editorInfo.inputType = 1;
                i |= Integer.MIN_VALUE;
                editorInfo.imeOptions = i;
            } else if (i5 == 3) {
                editorInfo.inputType = 2;
                i4 = 2;
            } else if (i5 == 4) {
                editorInfo.inputType = 3;
                i4 = 3;
            } else if (i5 == 5) {
                editorInfo.inputType = 17;
                i4 = 17;
            } else if (i5 == 6) {
                i4 = 33;
                editorInfo.inputType = 33;
            } else if (i5 == 7) {
                i4 = 129;
                editorInfo.inputType = 129;
            } else if (i5 == 8) {
                editorInfo.inputType = 18;
                i4 = 18;
            } else if (i5 == 9) {
                i4 = 8194;
                editorInfo.inputType = 8194;
            } else if (i5 == 10) {
                i4 = 145;
                editorInfo.inputType = 145;
            } else if (i5 == 11) {
                i4 = 113;
                editorInfo.inputType = 113;
            } else if (i5 == 12) {
                i4 = 97;
                editorInfo.inputType = 97;
            } else if (i5 == 13) {
                i4 = 49;
                editorInfo.inputType = 49;
            } else if (i5 == 14) {
                i4 = 65;
                editorInfo.inputType = 65;
            } else if (i5 == 15) {
                i4 = 81;
                editorInfo.inputType = 81;
            } else if (i5 == 16) {
                i4 = 177;
                editorInfo.inputType = 177;
            } else if (i5 == 17) {
                i4 = 193;
                editorInfo.inputType = 193;
            } else if (i5 == 18) {
                editorInfo.inputType = 4;
            } else {
                i4 = 20;
                if (i5 == 19) {
                    editorInfo.inputType = 20;
                } else if (i5 == 20) {
                    i4 = 36;
                    editorInfo.inputType = 36;
                } else if (i5 == 21) {
                    i4 = 4098;
                    editorInfo.inputType = 4098;
                } else if (i5 == 22) {
                    i4 = 12290;
                    editorInfo.inputType = 12290;
                } else if (i5 == 23) {
                    i4 = 8210;
                    editorInfo.inputType = 8210;
                } else if (i5 == 24) {
                    i4 = 4114;
                    editorInfo.inputType = 4114;
                } else if (i5 != 25) {
                    eg.m("Invalid Keyboard Type");
                    return;
                } else {
                    i4 = 12306;
                    editorInfo.inputType = 12306;
                }
            }
            if (!z && (i4 & 15) == 1) {
                i4 |= 131072;
                editorInfo.inputType = i4;
                if (i3 == 1) {
                    editorInfo.imeOptions = 1073741824 | i;
                }
            }
            if ((i4 & 15) == 1) {
                i2 = x180Var.b;
                if (i2 == 1) {
                    i4 |= 4096;
                    editorInfo.inputType = i4;
                } else if (i2 == 2) {
                    i4 |= 8192;
                    editorInfo.inputType = i4;
                } else if (i2 == 3) {
                    i4 |= 16384;
                    editorInfo.inputType = i4;
                }
                if (x180Var.c) {
                    editorInfo.inputType = 32768 | i4;
                }
            }
            long j = c8e1Var.b;
            int i6 = nbe1.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            w5w.d(editorInfo, c8e1Var.a.b);
            editorInfo.imeOptions |= 33554432;
        }
        editorInfo.inputType = 1;
        i4 = 1;
        if (!z) {
            i4 |= 131072;
            editorInfo.inputType = i4;
            if (i3 == 1) {
                editorInfo.imeOptions = 1073741824 | i;
            }
        }
        if ((i4 & 15) == 1) {
            i2 = x180Var.b;
            if (i2 == 1) {
                i4 |= 4096;
                editorInfo.inputType = i4;
            } else if (i2 == 2) {
                i4 |= 8192;
                editorInfo.inputType = i4;
            } else if (i2 == 3) {
                i4 |= 16384;
                editorInfo.inputType = i4;
            }
            if (x180Var.c) {
                editorInfo.inputType = 32768 | i4;
            }
        }
        long j2 = c8e1Var.b;
        int i7 = nbe1.c;
        editorInfo.initialSelStart = (int) (j2 >> 32);
        editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
        w5w.d(editorInfo, c8e1Var.a.b);
        editorInfo.imeOptions |= 33554432;
    }
}
