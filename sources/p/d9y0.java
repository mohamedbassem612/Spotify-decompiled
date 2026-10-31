package p;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class d9y0 {
    public static b180 a;

    public static final void a(hzu hzuVar, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1268374931);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(hzuVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            hzu hzuVar2 = z ? hzuVar : null;
            gra graVar = een.i;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = wvu.Y0;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = wvu.Z0;
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            hm5.a(hzuVar2, qim0Var3, iu30Var, graVar, "count", (iu30) objT2, gki.b, x340Var, ((i3 >> 3) & 112) | 1794432, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(hzuVar, z, qim0Var2, i, (byte) 11);
        }
    }

    public static final void b(float f, Float f2, hzu hzuVar, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        String strN0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1738039253);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.d(f) ? 4 : 2) | (b0kVar3.g(f2) ? 32 : 16) | (b0kVar3.g(hzuVar) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = z && hzuVar != null && hzuVar.a >= hzuVar.b;
            String strO0 = cwl1.o0(b0kVar3, z2 ? 2131959050 : 2131959052);
            if (hzuVar != null) {
                b0kVar3.i0(-2096099796);
                strN0 = cwl1.n0(z2 ? 2131959049 : 2131959051, new Object[]{Integer.valueOf(hzuVar.a), Integer.valueOf(hzuVar.b)}, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-2095805916);
                b0kVar3.r(false);
                strN0 = strO0;
            }
            boolean zG = b0kVar3.g(strN0);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new i3o(strN0, (byte) 20);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0Var, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z3 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            nim0 nim0Var = nim0.a;
            cvx cvxVar2 = ywx0.k(nim0Var, 12.0f, b0kVar3, b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarZ);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            uwo1.e(strO0, new wnb0(1.0f, true), cbx.d(b0kVar3).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2040);
            b0kVar2 = b0kVar3;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(nim0Var, 16.0f));
            a(hzuVar, z, null, b0kVar2, (i2 >> 6) & 126);
            b0kVar2.r(true);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            qim0 qim0VarO = ab80.o(nim0Var, 16.0f, b0kVar2, nim0Var, 1.0f);
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            h(f, f2, uyn1.z(16.0f, 0.0f, 2, qim0VarO), b0kVar2, i2 & 126);
            cvx cvxVar6 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 12.0f));
            rqo1.g(0, 1, b0kVar2, (qim0) null);
            cvx cvxVar7 = cbx.b(b0kVar2).b;
            x0d.s(nim0Var, 12.0f, b0kVar2, true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kzu(f, f2, hzuVar, z, qim0Var, i);
        }
    }

    public static final void c(p0a0 p0a0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(379563850);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = i | (b0kVar2.g(p0a0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i2 |= b0kVar2.i(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        int i3 = i2 | 384;
        if (b0kVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            long jC = cbx.a(b0kVar2).a.a.c();
            cua cuaVar = cbx.b(b0kVar2).f;
            qim0 qim0VarX = bin.x(dug.f(qim0VarZ, jC, er31.b(16.0f)), false, p0a0Var.c, (pm31) null, (idn0) null, function1, 13);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, 12.0f, 12.0f);
            boolean z2 = (i3 & 14) == 4;
            Object objT = b0kVar2.T();
            if (z2 || objT == fkj0.X) {
                objT = new hu90(p0a0Var, (byte) 8);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarY, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarA);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            qim0 qim0VarE3 = d1u.E(1.0f, cbx.a(b0kVar2).b.c, u291.r(qim0Var3, 40.0f), er31.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarE3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE4, b0kVar2, lljVar4);
            mnx mnxVar = mnx.c;
            qim0 qim0VarR = u291.r(qim0Var3, 20.0f);
            long j = cbx.a(b0kVar2).b.c;
            int i4 = mnx.d | 48;
            isl islVar = isl.a;
            w0h1.a(mnxVar, islVar, qim0VarR, j, 0L, false, b0kVar2, i4, 48);
            b0kVar2.r(true);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(qim0Var3, 12.0f));
            uwo1.e(p0a0Var.a, new wnb0(1.0f, true), cbx.d(b0kVar2).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2040);
            b0kVar2 = b0kVar2;
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(qim0Var3, 8.0f));
            w0h1.a(plx.c, islVar, (qim0) null, cbx.a(b0kVar2).b.b, 0L, false, b0kVar2, plx.d | 48, 52);
            b0kVar2.r(true);
            cvx cvxVar6 = cbx.b(b0kVar2).b;
            x0d.s(qim0Var3, 16.0f, b0kVar2, true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(p0a0Var, function0, qim0Var2, i, (byte) 15);
        }
    }

    public static final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-979392239);
        if (x340Var.Y(i & 1, i != 0)) {
            Activity activity = (Activity) x340Var.k(mce0.a);
            if (activity == null) {
                x340Var.i0(-1361302580);
            } else {
                x340Var.i0(-1361302579);
                boolean zI = x340Var.i(activity);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new wmf0(activity, null);
                    x340Var.s0(objT);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT);
            }
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 12);
        }
    }

    public static final void e(String str, boolean z, long j, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(662333821);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.f(j) ? 256 : 128) | (b0kVar3.i(iu30Var) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            r9e1.a(str.length() == 0 ? "♪" : str, u291.f(nim0.a, 1.0f), 0L, 0L, FontWeight.Z, 0L, 0, 0L, 0, false, 0, 0, iu30Var, new lee1(((u7h) w191.a(z ? z4p1.g(4280138068L) : u7h.b(u7h.f, 0.7f, 0.0f, 0.0f, 0.0f, 14), irn1.o0(500, 0, (dlv) null, 6), "lineColor", b0kVar3, 384, 8).getValue()).a, j, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777212), b0kVar2, 0, (i2 << 9) & 3670016, 65468);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mx9(str, z, j, iu30Var, i);
        }
    }

    public static final void f(qtf0 qtf0Var, Flowable flowable, yqg yqgVar, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-921475142);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(qtf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(flowable) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(yqgVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= b0kVar3.i(iu30Var2) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 & 458752;
            boolean z = i4 == 131072;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new uef0(iu30Var2, (byte) 12);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i4 == 131072;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new uef0(iu30Var2, (byte) 13);
                b0kVar3.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z3 = i4 == 131072;
            Object objT3 = b0kVar3.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new uef0(iu30Var2, (byte) 14);
                b0kVar3.s0(objT3);
            }
            Function0 function0M = y7y0.M(function0, function1, (Function0) objT3, b0kVar3);
            d(b0kVar3, 0);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            nx61 nx61Var = vu40.h;
            b0kVar2 = b0kVar3;
            w3d1.a(qim0VarD, (hw61) null, poz0.r(b0kVar3).f, 0L, 0.0f, 0.0f, (qqb) null, apo.r(-1651112833, new uk20(function0M, qtf0Var, flowable, yqgVar, iu30Var, (byte) 27), b0kVar3), b0kVar2, 12582912, 122);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(qtf0Var, flowable, yqgVar, qim0Var2, iu30Var, iu30Var2, i, (byte) 29);
        }
    }

    public static final void g(String str, String str2, String str3, Function0 function0, qim0 qim0Var, boolean z, String str4, c380 c380Var, b0k b0kVar, int i) {
        x340 x340Var;
        String str5;
        lee1 lee1Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-540088146);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(str3) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024) | (x340Var2.i(qim0Var) ? 16384 : 8192) | (x340Var2.h(z) ? 131072 : 65536) | (x340Var2.g(str4) ? 1048576 : 524288) | (x340Var2.g(c380Var) ? 8388608 : 4194304);
        if (x340Var2.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            long jA = cbx.a(x340Var2).a.a.a();
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarF = dug.f(qim0Var, jA, er31.b(8.0f));
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarN = anm1.N("multi-user-plan-verification-card", u291.f(uyn1.x(qim0VarF, 16.0f), 1.0f));
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            uwo1.e(str, (qim0) null, cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, i2 & 14, 0, 2034);
            uwo1.e(str2, (qim0) null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, (i2 >> 3) & 14, 0, 2034);
            x340 x340Var3 = x340Var2;
            nim0 nim0Var = nim0.a;
            if (str4 == null) {
                x340Var3.i0(-62570960);
                x340Var3.r(false);
            } else {
                x340Var3.i0(-62570959);
                cvx cvxVar3 = cbx.b(x340Var3).b;
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var3, 0);
                int iHashCode2 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM2 = x340Var3.m();
                qim0 qim0VarE2 = zr7.E(x340Var3, nim0Var);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, x340Var3, lljVar);
                nko1.H(xos0VarM2, x340Var3, lljVar2);
                x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
                nko1.H(qim0VarE2, x340Var3, lljVar4);
                ktx ktxVar = ktx.c;
                zov0 zov0Var = cbx.b(x340Var3).g;
                w0h1.a(ktxVar, isl.a, u291.r(nim0Var, 12.0f), cbx.a(x340Var3).b.e, 0L, false, x340Var3, ktx.d | 48, 48);
                if (z) {
                    x340Var3.i0(-2000587997);
                    lee1Var = cbx.d(x340Var3).j;
                } else {
                    x340Var3.i0(-2000586937);
                    lee1Var = cbx.d(x340Var3).k;
                }
                x340Var3.r(false);
                uwo1.e(str4, (qim0) null, lee1Var, cbx.a(x340Var3).b.e, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2034);
                x340Var3 = x340Var3;
                x340Var3.r(true);
                x340Var3.r(false);
            }
            if (c380Var == null) {
                x340Var3.i0(-61906661);
                x340Var3.r(false);
            } else {
                x340Var3.i0(-61906660);
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    gji0 gji0Var = (gji0) it.next();
                    arrayList.add(new phx(10, 0L, gji0Var.d, (String) null, gji0Var.b));
                }
                phx[] phxVarArr = (phx[]) arrayList.toArray(new phx[0]);
                x340 x340Var4 = x340Var3;
                fc11.a(mqo1.s(Arrays.copyOf(phxVarArr, phxVarArr.length)), anm1.N("member-facepile", nim0Var), hcx.c, (hux) null, false, 6, (gbx) null, (String) null, (idn0) null, x340Var4, 197000, 472);
                x340Var3 = x340Var4;
                x340Var3.r(false);
            }
            boolean z3 = (i2 & 7168) == 2048;
            Object objT = x340Var3.T();
            if (z3 || objT == fkj0.X) {
                objT = new kek0(function0, (byte) 6);
                x340Var3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            jdx jdxVar = jdx.c;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var3).b;
            str5 = str3;
            x340 x340Var5 = x340Var3;
            foo1.c(gbxVar, jdxVar, anm1.N("verification-action-button", uyn1.z(8.0f, 0.0f, 2, qim0VarF2)), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-778546599, new tej0(str5, (byte) 8), x340Var3), x340Var5, 0, 48, 2040);
            x340Var = x340Var5;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            str5 = str3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q3(str, str2, str5, function0, qim0Var, z, str4, c380Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static final void h(float f, Float f2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        float fFloatValue;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1496275397);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (f2 == null) {
                fFloatValue = f;
            } else {
                Float f3 = f2.floatValue() > f ? f2 : null;
                if (f3 != null) {
                    fFloatValue = f3.floatValue();
                } else {
                    fFloatValue = f;
                }
            }
            uwr uwrVar = cbx.a;
            xpv0 xpv0Var = cbx.c(x340Var).c;
            tto1.d(((Number) z95.b(fFloatValue, irn1.l0(pto1.q(120, 2, 30.0f), 120.0f, (Object) null, 4), "download-progress", (iu30) null, x340Var, 3072, 20).getValue()).floatValue(), (i2 >> 3) & 112, 12, 0L, 0L, x340Var, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jh6(f2, f, qim0Var, i, (byte) 2);
        }
    }

    public static final void i(List list, String str, String str2, String str3, long j, long j2, long j3, double d, boolean z, Flowable flowable, yqg yqgVar, iu30 iu30Var, b0k b0kVar, int i) throws Throwable {
        String str4;
        b0k b0kVar2;
        frr0 frr0Var;
        int i2;
        Throwable th;
        xtb0 xtb0Var;
        Object aryVar;
        dw91 dw91Var;
        List list2 = list;
        String str5 = str2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1000720989);
        j06 j06Var = ((x340) b0kVar3).a;
        int i3 = i | (b0kVar3.i(list2) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str5) ? 256 : 128) | (b0kVar3.g(str3) ? 2048 : 1024) | (b0kVar3.f(j) ? 16384 : 8192) | (b0kVar3.f(j2) ? 131072 : 65536) | (b0kVar3.f(j3) ? 1048576 : 524288) | (b0kVar3.c(d) ? 8388608 : 4194304) | (b0kVar3.h(z) ? 67108864 : 33554432) | (b0kVar3.i(flowable) ? 536870912 : 268435456);
        int i4 = (b0kVar3.g(yqgVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16);
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            int i5 = ((i3 >> 27) & 14) | ((i4 << 3) & 112);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = p3d1.m(0L, b0kVar3);
            }
            frr0 frr0Var2 = (frr0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zI = b0kVar3.i(flowable) | b0kVar3.i(ven0Var);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new anf0(flowable, ven0Var, (lnm) null);
                b0kVar3.s0(objT3);
            }
            qxd0.t(flowable, b0kVar3, (vu30) objT3);
            boolean zI2 = ((((i5 & 112) ^ 48) > 32 && b0kVar3.g(yqgVar)) || (i5 & 48) == 32) | b0kVar3.i(ven0Var) | b0kVar3.i(frr0Var2);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == m4cVar) {
                frr0Var = frr0Var2;
                i2 = 0;
                objT4 = new v4e0(ven0Var, frr0Var, yqgVar, (lnm) null, (byte) 9);
                th = null;
                b0kVar3.s0(objT4);
            } else {
                frr0Var = frr0Var2;
                i2 = 0;
                th = null;
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT4);
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = yv91.a(new bsc0(list2, frr0Var, (byte) 16));
                b0kVar3.s0(objT5);
            }
            tob1 tob1Var = (tob1) objT5;
            long jG = fc11.G(22);
            xtb0 xtb0VarA = aub0.a(i2, b0kVar3, 3);
            boolean zG = b0kVar3.g(list2);
            Object objT6 = b0kVar3.T();
            if (zG || objT6 == m4cVar) {
                objT6 = new dw91();
                b0kVar3.s0(objT6);
            }
            dw91 dw91Var2 = (dw91) objT6;
            Integer numValueOf = Integer.valueOf(((Number) tob1Var.getValue()).intValue());
            boolean zI3 = b0kVar3.i(tob1Var) | b0kVar3.i(xtb0VarA) | b0kVar3.i(dw91Var2) | b0kVar3.i(list2) | ((i4 & 112) == 32);
            Object objT7 = b0kVar3.T();
            if (zI3 || objT7 == m4cVar) {
                xtb0Var = xtb0VarA;
                dw91Var = dw91Var2;
                aryVar = new ary((byte) 15, xtb0Var, dw91Var, list, iu30Var, tob1Var, (lnm) null);
                list2 = list;
                tob1Var = tob1Var;
                b0kVar3.s0(aryVar);
            } else {
                xtb0Var = xtb0VarA;
                aryVar = objT7;
                dw91Var = dw91Var2;
            }
            qxd0.t(numValueOf, b0kVar3, (vu30) aryVar);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = uyn1.y(u291.d(nim0Var, 1.0f), 16.0f, 16.0f);
            era eraVar = een.Q0;
            b36 b36Var = h36.e;
            mbh mbhVarA = jbh.a(b36Var, eraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw th;
            }
            b0kVar3.m0();
            boolean z2 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf2, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            qim0 qim0VarR = exd0.r(i541.D(u291.f(u291.h(nim0Var, 118.0f), 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039), new rs7(1, (byte) 13));
            boolean zI4 = b0kVar3.i(list2) | b0kVar3.i(tob1Var) | b0kVar3.f(jG) | b0kVar3.i(dw91Var) | b0kVar3.d(33.0f);
            Object objT8 = b0kVar3.T();
            if (zI4 || objT8 == m4cVar) {
                f28 f28Var = new f28(list2, jG, dw91Var, tob1Var);
                b0kVar3.s0(f28Var);
                objT8 = f28Var;
            }
            ujo1.d(qim0VarR, xtb0Var, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT8, b0kVar3, 113246208, 124);
            obg1.j(j, j2, j3, d, z, u291.f(nim0Var, 1.0f), b0kVar3, (i3 >> 12) & 65534);
            b0kVar2 = b0kVar3;
            qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            jw31 jw31VarA = ew31.a(b36Var, een.N0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarB);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            upn1.a(qkm1.e, u291.r(nim0Var, 24.0f), "Lyrics", b0kVar2, 384, 0);
            op71.g(b0kVar2, u291.r(nim0Var, 8.0f));
            StringBuilder sb = new StringBuilder();
            str4 = str;
            sb.append(str4);
            sb.append(" • ");
            str5 = str2;
            sb.append(str5);
            String string = sb.toString();
            long jG2 = fc11.G(18);
            long j4 = u7h.f;
            r9e1.a(string, (qim0) null, 0L, 0L, FontWeight.Z, 0L, 3, 0L, 0, false, 0, 0, (iu30) null, new lee1(j4, jG2, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777212), b0kVar2, 0, 0, 129982);
            b0kVar2.r(true);
            if (str3.length() > 0) {
                b0kVar2.i0(2113585505);
                r9e1.a(cwl1.n0(2131957817, new Object[]{str3}, b0kVar2), uyn1.B(nim0Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 0L, 0L, (FontWeight) null, 0L, 3, 0L, 0, false, 0, 0, (iu30) null, new lee1(u7h.b(j4, 0.7f, 0.0f, 0.0f, 0.0f, 14), fc11.G(12), (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777212), b0kVar2, 0, 0, 130044);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(2113850927);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            str4 = str;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ymf0(list, str4, str5, str3, j, j2, j3, d, z, flowable, yqgVar, iu30Var, i);
        }
    }

    public static final dqc j(iu30 iu30Var) {
        return new dqc(iu30Var, (byte) 3);
    }

    public static final qim0 k(qim0 qim0Var, float f) {
        return f == 1.0f ? qim0Var : i541.D(qim0Var, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, true, 0L, 0L, 0, (f2b) null, 1044475);
    }

    public static final gt40 l(gt40 gt40Var, q10 q10Var) {
        return gt40Var.c(new q60(q10Var, R.color.transparent));
    }

    public static final int m(d441 d441Var, String str) {
        int columnCount = d441Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(d441Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String strN = cy30.n("`", str, '`');
        int columnCount2 = d441Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (strN.equals(d441Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = d441Var.getColumnCount();
            String strConcat = ".".concat(str);
            String strN2 = cy30.n(".", str, '`');
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = d441Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (nhc1.R(columnName, strConcat, false) || (columnName.charAt(0) == '`' && nhc1.R(columnName, strN2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static htl1 n(float f, float f2) {
        ltl1 ltl1Var;
        brl1 brl1Var;
        if (f <= 0.0f) {
            throw new IllegalArgumentException(("Width must be positive, received " + f).toString());
        }
        if (f < 600.0f) {
            ltl1Var = ltl1.b;
        } else {
            ltl1Var = f < 840.0f ? ltl1.c : ltl1.d;
        }
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException(("Height must be positive, received " + f2).toString());
        }
        if (f2 < 480.0f) {
            brl1Var = brl1.b;
        } else {
            brl1Var = f2 < 900.0f ? brl1.c : brl1.d;
        }
        return new htl1(ltl1Var, brl1Var);
    }

    public static final mr20 o(g0l g0lVar) {
        return rqt0.u(new wef(yoi1.g(((inr) g0lVar).d()), (byte) 8));
    }

    public static c1m0 p(brl0 brl0Var, int i, String str) {
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC == 1) {
                return new c1m0(brl0Var, 3);
            }
            int i2 = 2;
            if (iC != 2) {
                eg.o();
                return null;
            }
            if (str == null) {
                return new c1m0(brl0Var, 1);
            }
            if (!str.equals("artists")) {
                i2 = str.equals("songs") ? 4 : 0;
            }
            if (i2 != 0) {
                return new c1m0(brl0Var, i2);
            }
        }
        return null;
    }

    public static final qim0 q(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new fz20(new hz20(iu30Var)));
    }

    public static Set r() {
        return e9c.c;
    }

    public static void s() {
        bby bbyVar = bby.b;
    }

    public static final boolean t(Map map) {
        return yto.j((String) map.get("pick-and-shuffle"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void u(Activity activity, onm onmVar) {
        zmf0 zmf0Var;
        if (onmVar instanceof zmf0) {
            zmf0Var = (zmf0) onmVar;
            int i = zmf0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zmf0Var.c = i - Integer.MIN_VALUE;
            } else {
                zmf0Var = new zmf0(onmVar);
            }
        } else {
            zmf0Var = new zmf0(onmVar);
        }
        Object objH = zmf0Var.b;
        int i2 = zmf0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objH);
                zmf0Var.c = 1;
                objH = flx0.d.h(activity, zmf0Var);
                if (objH == d9n.a) {
                    return;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return;
                    } else {
                        flx0 flx0Var = zmf0Var.a;
                        hm5.M(objH);
                        throw new KotlinNothingValueException();
                    }
                }
                hm5.M(objH);
            }
            flx0 flx0Var2 = (flx0) objH;
            flx0Var2.a();
            zmf0Var.a = flx0Var2;
            zmf0Var.c = 2;
            hap1.f(zmf0Var);
        } catch (Throwable th) {
            tj70 tj70Var = ((flx0) activity).b;
            tj70Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(vj70.j);
                parcelObtain.writeInt(128);
                if (!tj70Var.a.transact(4, parcelObtain, parcelObtain2, 0)) {
                    throw new RemoteException("Method clearWindowFlags is unimplemented.");
                }
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                activity.close();
                throw th;
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(pux0 pux0Var, e9y0 e9y0Var, onm onmVar) throws Throwable {
        c9y0 c9y0Var;
        Throwable th;
        String str;
        h7y0 m231Var;
        if (onmVar instanceof c9y0) {
            c9y0Var = (c9y0) onmVar;
            int i = c9y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c9y0Var.c = i - Integer.MIN_VALUE;
            } else {
                c9y0Var = new c9y0(onmVar);
            }
        } else {
            c9y0Var = new c9y0(onmVar);
        }
        Object objH = c9y0Var.b;
        int i2 = c9y0Var.c;
        if (i2 == 0) {
            hm5.M(objH);
            String str2 = e9y0Var.a.a;
            try {
                c9y0Var.a = str2;
                c9y0Var.c = 1;
                objH = pux0Var.h(str2, c9y0Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
                str = str2;
            } catch (Throwable th2) {
                th = th2;
                str = str2;
                m231Var = new m231(th);
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = c9y0Var.a;
            try {
                hm5.M(objH);
            } catch (Throwable th3) {
                th = th3;
                m231Var = new m231(th);
            }
        }
        m231Var = (h7y0) objH;
        Throwable thA = e331.a(m231Var);
        if (thA == null || (thA instanceof TimeoutCancellationException) || !(thA instanceof CancellationException)) {
            return e331.a(m231Var) == null ? new g9y0(str, m231Var) : new f9y0(str);
        }
        throw thA;
    }

    public static final ano w(hjf1 hjf1Var, boolean z) {
        zkt0 zkt0Var = z ? zkt0.a : zkt0.b;
        String str = hjf1Var.a;
        String str2 = hjf1Var.c;
        String str3 = hjf1Var.d;
        g07 g07Var = new g07(hjf1Var.e, yz6.d);
        boolean z2 = hjf1Var.u;
        return new ano(zkt0Var, str, str2, str3, new s27(g07Var, z2 ? 2 : 1, 1), hjf1Var.p, hjf1Var.m, hjf1Var.g, z2, hjf1Var.v, false, hjf1Var.q, hjf1Var.w);
    }

    public static final gzf1 x(hjf1 hjf1Var, int i) {
        String str = hjf1Var.c;
        String str2 = hjf1Var.d;
        k4m k4mVar = hjf1Var.p;
        boolean z = hjf1Var.j;
        ezf1 ezf1Var = hjf1Var.i;
        boolean z2 = hjf1Var.m;
        boolean z3 = hjf1Var.g;
        List list = hjf1Var.q;
        g07 g07Var = new g07(hjf1Var.e, yz6.d);
        boolean z4 = hjf1Var.u;
        return new gzf1(str, str2, k4mVar, z, ezf1Var, z2, z3, list, hjf1Var.f > 0, !hjf1Var.n, hjf1Var.k, hjf1Var.l == 2, new s27(g07Var, z4 ? 2 : 1, i), hjf1Var.r, hjf1Var.s, hjf1Var.t, z4, hjf1Var.v, hjf1Var.w);
    }
}
