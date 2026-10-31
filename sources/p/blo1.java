package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class blo1 {
    public static final int[] a = {2130969030};
    public static final int[] b = {2130969035};
    public static b180 c;

    public static final void a(o960 o960Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2012397049);
        int i2 = (x340Var.g(o960Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (o960Var instanceof gy81) {
            x340Var.i0(1178287029);
            pap1.m(((gy81) o960Var).a, u291.f(qim0Var, 1.0f), x340Var, 0);
            x340Var.r(false);
        } else if (o960Var instanceof uab0) {
            x340Var.i0(1178292379);
            y4o1.d(0, ((uab0) o960Var).a, x340Var, u291.f(qim0Var, 1.0f));
            x340Var.r(false);
        } else if (o960Var instanceof tuq0) {
            x340Var.i0(1178298340);
            tuq0 tuq0Var = (tuq0) o960Var;
            j1e1.g(tuq0Var.a, tuq0Var.b, u291.f(qim0Var, 1.0f), x340Var, 0);
            x340Var.r(false);
        } else if (o960Var instanceof uuq0) {
            x340Var.i0(1178306498);
            uuq0 uuq0Var = (uuq0) o960Var;
            j1e1.h(uuq0Var.a, uuq0Var.b, u291.f(qim0Var, 1.0f), x340Var, 0);
            x340Var.r(false);
        } else if (o960Var instanceof mf50) {
            x340Var.i0(1178314069);
            bqn1.i(((mf50) o960Var).a, u291.f(qim0Var, 1.0f), x340Var, 0);
            x340Var.r(false);
        } else {
            x340Var.i0(-2126846391);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jj50(o960Var, qim0Var, i, (byte) 7);
        }
    }

    public static final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1234575986);
        int i2 = i | 6 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(dsa0.m(x340Var, 2131167026), 0.0f, 2, u291.d(qim0Var3, 1.0f));
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, cbx.b(x340Var).b.f, 0.0f, 0.0f, 13);
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
            qim0 qim0VarB2 = u291.B(qim0Var3, een.h, 2);
            String strO0 = cwl1.o0(x340Var, 2131955484);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = s8x.f;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0VarB2, false, (iu30) objT), cbx.d(x340Var).d, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            uwo1.e(cwl1.o0(x340Var, 2131955483), uyn1.B(qim0VarB2, 0.0f, dsa0.m(x340Var, 2131167024), 0.0f, 0.0f, 13), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            foo1.c(new gbx(z50.c, function0), new idx(), uyn1.B(qim0Var3, 0.0f, dsa0.m(x340Var, 2131167024), 0.0f, 0.0f, 13), null, null, null, null, null, null, null, tli.a, x340Var, 0, 48, 2040);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var2, function0, i, (byte) 24);
        }
    }

    public static final long c(int i) {
        if (!(i > 0)) {
            tf80.a("The span value should be higher than 0");
        }
        return i;
    }

    public static final void d(sa60 sa60Var, srt0 srt0Var, zfx zfxVar, Function0 function0, Function0 function1, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z;
        Function0 function2 = function1;
        c380 c380Var = sa60Var.X;
        o960 o960Var = sa60Var.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(894108748);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(sa60Var) ? 4 : 2) | (x340Var.i(srt0Var) ? 32 : 16) | (x340Var.i(zfxVar) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(function2) ? 16384 : 8192) | (x340Var.i(iu30Var) ? 131072 : 65536) | (x340Var.i(iu30Var2) ? 1048576 : 524288) | 12582912;
        if (x340Var.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            boolean z2 = o960Var instanceof uab0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), f5p1.k(x340Var, 2131101284), d4o1.a);
            if (!z2) {
                qim0VarF2 = qim0VarF2.then(hqn1.s("highlight-card-tag", sa60Var.h.b, function0, qim0Var3));
            }
            qim0 qim0VarN = anm1.N("highlight-card-tag", qim0VarF2);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarN, 0.0f, 16.0f, 0.0f, 16.0f, 5);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            cvx cvxVar3 = cbx.b(x340Var).b;
            a(o960Var, uyn1.z(16.0f, 0.0f, 2, qim0Var3), x340Var, 0);
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.b));
            String str = sa60Var.b;
            lee1 lee1Var = cbx.d(x340Var).d;
            cjc0 cjc0Var = new cjc0(3);
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF3);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = z860.d;
                x340Var.s0(objT);
            }
            uwo1.e(str, anm1.N("highlight-title-tag", s161.b(qim0VarZ, false, (iu30) objT)), lee1Var, 0L, null, null, 2, false, cjc0Var, 0, null, x340Var, 0, 0, 1720);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            vnr0 vnr0VarG = sa60Var.c.g((djc0) null, x340Var, 1);
            qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar6 = cbx.b(x340Var).b;
            qgo1.f(vnr0VarG, anm1.N("highlight-description-tag", uyn1.z(16.0f, 0.0f, 2, qim0VarF4)), new a0e1(5), 0, false, null, x340Var, 8, 56);
            x340Var = x340Var;
            if (c380Var.isEmpty()) {
                z = false;
                x340Var.i0(-736202324);
                x340Var.r(false);
            } else {
                x340Var.i0(-736516571);
                cvx cvxVar7 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var3, 8.0f));
                int i3 = i2 >> 6;
                h(mqo1.A(c380Var), zfxVar, srt0Var, iu30Var, iu30Var2, x340Var, ((i2 >> 3) & 112) | ((i2 << 3) & 896) | (i3 & 7168) | (i3 & 57344));
                x340Var = x340Var;
                z = false;
                x340Var.r(false);
            }
            cvx cvxVar8 = cbx.b(x340Var).b;
            qim0 qim0VarO = ab80.o(qim0Var3, 16.0f, x340Var, qim0Var3, 1.0f);
            cvx cvxVar9 = cbx.b(x340Var).b;
            qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0VarO);
            gfh0 gfh0VarC = t1c.c(een.d, z);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String str2 = sa60Var.g;
            String str3 = sa60Var.t;
            q960 q960Var = sa60Var.i;
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            rno1.a(str2, str3, q960Var, h2cVar.a(qim0Var3, graVar), x340Var, 0);
            if (sa60Var.e instanceof e371) {
                x340Var.i0(558507928);
                fsx fsxVar = fsx.c;
                long j = cbx.a(x340Var).b.b;
                qim0 qim0VarA = h2cVar.a(qim0Var3, een.i);
                zov0 zov0Var = cbx.b(x340Var).g;
                function2 = function1;
                x340 x340Var2 = x340Var;
                w0h1.a(fsxVar, isl.a, hqn1.s("highlight-share-button-tag", null, function2, u291.r(qim0VarA, 24.0f)), j, 0L, false, x340Var2, fsx.d | 48, 48);
                x340Var = x340Var2;
                x340Var.r(z);
            } else {
                function2 = function1;
                x340Var.i0(559002130);
                x340Var.r(z);
            }
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(sa60Var, srt0Var, zfxVar, function0, function2, iu30Var, iu30Var2, qim0Var2, i, (byte) 10);
        }
    }

    public static final void e(uwy0 uwy0Var, String str, i8h1 i8h1Var, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        b0k b0kVar2;
        uwy0 uwy0Var2 = uwy0Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1328585685);
        int i2 = i | (b0kVar3.i(uwy0Var2) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.i(i8h1Var) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | (b0kVar3.i(function1) ? 16384 : 8192) | (b0kVar3.i(function2) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean zG = b0kVar3.g(uwy0Var2);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new ogl0(str);
                b0kVar3.s0(objT);
            }
            ogl0 ogl0Var = (ogl0) objT;
            boolean zI = b0kVar3.i(i8h1Var) | b0kVar3.i(ogl0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new hyg0(i8h1Var, ogl0Var, (lnm) null, (byte) 26);
                b0kVar3.s0(objT2);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT2);
            boolean zI2 = ((i2 & 458752) == 131072) | b0kVar3.i(i8h1Var) | b0kVar3.i(ogl0Var);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new iso0(i8h1Var, ogl0Var, function2, (byte) 0);
                b0kVar3.s0(objT3);
            }
            j2i j2iVarR = apo.r(874306675, new kso0(i8h1Var, ogl0Var, function0, uwy0Var2, (byte) 0), b0kVar3);
            uwy0Var2 = uwy0Var;
            b0kVar2 = b0kVar3;
            fn31.b((Function0) objT3, j2iVarR, (qim0) null, apo.r(905943797, new kso0(i8h1Var, ogl0Var, function1, uwy0Var2, (byte) 1), b0kVar3), apo.r(937580919, new lso0(uwy0Var2, (byte) 0), b0kVar3), apo.r(-1194084168, new lso0(uwy0Var2, (byte) 1), b0kVar3), (hw61) null, 0L, 0L, 0L, 0L, (i3u) null, b0kVar2, 1772592, 16276);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy(uwy0Var2, str, i8h1Var, function0, function1, function2, i);
        }
    }

    public static final void f(hxa0 hxa0Var, xk xkVar, qwr0 qwr0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(40032454);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(hxa0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(xkVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(qwr0Var) : b0kVar3.i(qwr0Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 16384 : 8192;
        }
        int i4 = i3;
        if (b0kVar3.Y(i4 & 1, (i4 & 9363) != 9362)) {
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = new cxr0(hxa0Var.c, hxa0Var.d, new k2g0(iu30Var, (byte) 27));
                b0kVar3.s0(objT);
            }
            cxr0 cxr0Var = (cxr0) objT;
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(b0kVar3).g;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            irn1.u(qim0Var3, apo.r(120095609, new vbn0(hxa0Var, qwr0Var, xkVar, (byte) 26), b0kVar3), null, u85Var, apo.r(-1010490817, new mse(es41VarC, hxa0Var, cxr0Var, qwr0Var, iu30Var, xkVar, (byte) 7), b0kVar3), b0kVar2, ((i4 >> 9) & 14) | 24624, 4);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uwr0(hxa0Var, xkVar, qwr0Var, qim0Var2, iu30Var, i, (byte) 1);
        }
    }

    public static final void g(r960 r960Var, zfx zfxVar, srt0 srt0Var, iu30 iu30Var, iu30 iu30Var2, int i, b0k b0kVar, int i2) {
        int i3;
        iu30 iu30Var3;
        iu30 iu30Var4;
        r960 r960Var2;
        b0k b0kVar2;
        ven0 ven0Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1494971291);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.i(r960Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.i(zfxVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(srt0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            iu30Var3 = iu30Var;
            i3 |= b0kVar3.i(iu30Var3) ? 2048 : 1024;
        } else {
            iu30Var3 = iu30Var;
        }
        if ((i2 & 24576) == 0) {
            iu30Var4 = iu30Var2;
            i3 |= b0kVar3.i(iu30Var4) ? 16384 : 8192;
        } else {
            iu30Var4 = iu30Var2;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar3.e(i) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            String str = r960Var.a;
            if (srt0Var.equals(new mrt0(str))) {
                i4 = 1;
            } else if (!srt0Var.equals(new krt0(str))) {
                i4 = 3;
            }
            b0kVar3.f0(2146644581, r960Var.a);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            qim0 qim0VarN = anm1.N("track-row-" + i, u291.f(nim0.a, 1.0f));
            boolean zI = ((i3 & 7168) == 2048) | b0kVar3.i(zfxVar) | b0kVar3.i(ven0Var2) | b0kVar3.i(r960Var) | b0kVar3.e(l1d.C(i4)) | ((i3 & 57344) == 16384);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                iu30 iu30Var5 = iu30Var3;
                ven0Var = ven0Var2;
                pvj pvjVar = new pvj(zfxVar, r960Var, i4, ven0Var, iu30Var5, iu30Var4);
                r960Var2 = r960Var;
                b0kVar3.s0(pvjVar);
                objT2 = pvjVar;
            } else {
                r960Var2 = r960Var;
                ven0Var = ven0Var2;
            }
            iu30 iu30Var6 = (iu30) objT2;
            boolean zI2 = b0kVar3.i(ven0Var) | b0kVar3.i(r960Var2) | b0kVar3.e(l1d.C(i4));
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new gu2((Object) r960Var2, i4, (Object) ven0Var, (byte) 21);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            dm5.a(iu30Var6, qim0VarN, (iu30) objT3, b0kVar2, 0, 0);
            b0kVar2.r(false);
        } else {
            r960Var2 = r960Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bxy(r960Var2, zfxVar, srt0Var, iu30Var, iu30Var2, i, i2);
        }
    }

    public static final void h(c380 c380Var, zfx zfxVar, srt0 srt0Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1011272924);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        zfx zfxVar2 = zfxVar;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(zfxVar2) ? 32 : 16;
        }
        srt0 srt0Var2 = srt0Var;
        if ((i & 384) == 0) {
            i2 |= x340Var.i(srt0Var2) ? 256 : 128;
        }
        iu30 iu30Var3 = iu30Var;
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var3) ? 2048 : 1024;
        }
        iu30 iu30Var4 = iu30Var2;
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var4) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarN = anm1.N("highlight-track-rows-tag", u291.f(nim0.a, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, 674360025, c380Var);
            int i3 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                g((r960) next, zfxVar2, srt0Var2, iu30Var3, iu30Var4, i3, x340Var, 65520 & i2);
                zfxVar2 = zfxVar;
                srt0Var2 = srt0Var;
                iu30Var3 = iu30Var;
                iu30Var4 = iu30Var2;
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 18, i, c380Var, zfxVar, srt0Var, iu30Var2, iu30Var);
        }
    }

    public static final eoz i(lzx lzxVar) {
        int iOrdinal = lzxVar.ordinal();
        if (iOrdinal == 0) {
            return eoz.c;
        }
        if (iOrdinal == 1) {
            return eoz.d;
        }
        eg.o();
        return null;
    }

    public static final loz j(dij1 dij1Var) {
        int iOrdinal = dij1Var.ordinal();
        if (iOrdinal == 0) {
            return loz.c;
        }
        if (iOrdinal == 1) {
            return loz.d;
        }
        if (iOrdinal == 2) {
            return loz.e;
        }
        eg.o();
        return null;
    }

    public static final vr20 k(vr20 vr20Var, o8n o8nVar) {
        return ((vr20Var instanceof d561) || (vr20Var instanceof kfo0)) ? vr20Var : new efb1(vr20Var, o8nVar);
    }

    public static final String l(String str) {
        return (String) o7h.A0(ihc1.Q0(str, new String[]{":"}, 0, 6));
    }

    public static void m(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, omz0.O, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(2130969498, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                o(context, b, "Theme.MaterialComponents");
            }
        }
        o(context, a, "Theme.AppCompat");
    }

    public static void n(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, omz0.O, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        hhg1.n("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void o(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                hhg1.n(f4i1.f("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static igz0 p(String str, String str2, ogz0 ogz0Var, int i) {
        String str3;
        String str4;
        if (ogz0Var.equals(ngz0.a)) {
            str3 = "PLAYBACK_STARTED";
        } else {
            if (!ogz0Var.equals(mgz0.a)) {
                eg.o();
                return null;
            }
            str3 = "NOTHING_TO_PLAY";
        }
        switch (i) {
            case 1:
                str4 = "PLAYBACK_STARTED_BY_CLIENT";
                break;
            case 2:
                str4 = "OFFLINE_FALLBACK";
                break;
            case 3:
                str4 = "OFFLINE_RESUME_FALLBACK";
                break;
            case 4:
                str4 = "LIKED_SONGS_FALLBACK";
                break;
            case 5:
                str4 = "RESUME_FALLBACK";
                break;
            case 6:
                str4 = "UNKNOWN_ERROR";
                break;
            default:
                throw null;
        }
        return new igz0(str, str2, str3, str4);
    }

    public static axh1 q(byte[] bArr) {
        return new axh1(ByteBuffer.wrap(bArr, 0, bArr.length).slice(), (byte) 0);
    }

    public static final void r(BroadcastReceiver broadcastReceiver, o8n o8nVar, vu30 vu30Var) {
        llm llmVarE = smo1.e(flo1.l(guo1.B(), o8nVar));
        fn31.T(llmVarE, (o8n) null, 0, new x4c(vu30Var, llmVarE, broadcastReceiver.goAsync(), (lnm) null, (byte) 29), 3);
    }

    public static TypedArray s(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m(context, attributeSet, i, i2);
        n(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static final Object t(uu00 uu00Var, String str, Class cls, onm onmVar) {
        return fc11.l(((zu00) uu00Var).b(new oi("image-gallery", false, new f0z(cls, str, (byte) 24))).filter(mpi1.d1).flatMap(new w2z((byte) 7, cls, str)), 2, (Object) null, onmVar);
    }

    public static final void u(n161 n161Var, String str) {
        n161Var.b(lgo1.a, Collections.singletonList(str));
    }

    public static final String v(String str) {
        return (String) o7h.A0(ihc1.Q0(str, new String[]{":"}, 0, 6));
    }

    public static final ze5 w(ze5 ze5Var) {
        return new ze5(ze5Var.b, ze5Var.c, ((qgc1) ze5Var.a).a, ze5Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object x(o8n o8nVar, Object obj, Object obj2, vu30 vu30Var, lnm lnmVar) throws Throwable {
        cge cgeVar;
        Object objW;
        Object objInvoke;
        if (lnmVar instanceof cge) {
            cgeVar = (cge) lnmVar;
            int i = cgeVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cgeVar.f = i - Integer.MIN_VALUE;
            } else {
                cgeVar = new cge(lnmVar);
            }
        } else {
            cgeVar = new cge(lnmVar);
        }
        Object obj3 = cgeVar.e;
        int i2 = cgeVar.f;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = cgeVar.d;
            o8n o8nVar2 = cgeVar.c;
            o8n o8nVar3 = cgeVar.a;
            try {
                hm5.M(obj3);
                objW = obj4;
                o8nVar = o8nVar2;
                flo1.p(o8nVar, objW);
                return obj3;
            } catch (Throwable th) {
                objW = obj4;
                o8nVar = o8nVar2;
                th = th;
                flo1.p(o8nVar, objW);
                throw th;
            }
        }
        hm5.M(obj3);
        objW = flo1.w(o8nVar, obj2);
        try {
            cgeVar.a = o8nVar;
            cgeVar.b = obj;
            cgeVar.c = o8nVar;
            cgeVar.d = objW;
            cgeVar.f = 1;
            v9b1 v9b1Var = new v9b1(cgeVar, o8nVar);
            if (vu30Var == null) {
                o6x context = v9b1Var.getContext();
                z890 z890Var = context == o6x.a ? new z890(v9b1Var) : new a990(v9b1Var, context);
                w0h1.o(2, vu30Var);
                objInvoke = vu30Var.invoke(obj, z890Var);
            } else {
                w0h1.o(2, vu30Var);
                objInvoke = vu30Var.invoke(obj, v9b1Var);
            }
            obj3 = objInvoke;
            d9n d9nVar = d9n.a;
            if (obj3 == d9nVar) {
                return d9nVar;
            }
            flo1.p(o8nVar, objW);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            flo1.p(o8nVar, objW);
            throw th;
        }
    }

    public static String z(Context context, String str) {
        zod.s(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = ijo1.A(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
