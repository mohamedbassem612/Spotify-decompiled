package p;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class bbp1 {
    public static b180 a;
    public static b180 b;

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-521585476);
        int i2 = i | (x340Var.i(qim0Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131951993);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0Var, cbx.d(x340Var).j, ((vex) zex.a.e).m, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 << 3) & 112, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 5);
        }
    }

    public static final void b(d8t d8tVar, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1117237894);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(d8tVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function2) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            WeakHashMap weakHashMap = osl1.x;
            bgc0 bgc0Var = new bgc0(lhc.g(x340Var).g, 32);
            qim0Var2 = nim0.a;
            irn1.u(qim0Var2, apo.r(1603735667, new bvk(function0, (byte) 13), x340Var), (vu30) null, bgc0Var, apo.r(1279669997, new nzd((Object) d8tVar, (Object) function1, (Object) function2, (byte) 18), x340Var), x340Var, ((i3 >> 12) & 14) | 24624, 4);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 2, i, (Object) d8tVar, (Object) function0, (Object) function1, (Object) function2, (Object) qim0Var2);
        }
    }

    public static final void c(int i, int i2, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-557415419);
        int i4 = (x340Var.g(str) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 32 : 16);
        }
        int i6 = i3 | (x340Var.g(str2) ? 256 : 128);
        if (x340Var.Y(i6 & 1, (i6 & 147) != 146)) {
            qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
            int i7 = i6 >> 3;
            suo1.g(qim0Var4, str2, apo.r(-1563190688, new y5d0(str, (byte) 12), x340Var), x340Var, (i7 & 14) | 384 | (i7 & 112), 0);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27((byte) 11, i, i2, (Object) str, (Object) str2, qim0Var3);
        }
    }

    public static final km3 d(rf01 rf01Var) {
        return new km3(rf01Var);
    }

    public static final void e(zeu zeuVar, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        Object wba1Var;
        n511 n511Var;
        int i3;
        zeu zeuVar2 = zeuVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1922992105);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(zeuVar2) : x340Var.i(zeuVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            Configuration configuration = (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a);
            wat watVar = (wat) x340Var.k(t4k.h);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(null);
                x340Var.s0(objT2);
            }
            float fX0 = watVar.X0(configuration.screenHeightDp);
            float fX1 = watVar.X0(configuration.screenWidthDp);
            ven0 ven0Var2 = (ven0) objT2;
            n511 n511Var2 = new n511(0.0f, 0.0f, fX1, fX0);
            n511 n511Var3 = (n511) ven0Var2.getValue();
            int i5 = i4 & 14;
            boolean zG = x340Var.g(n511Var2) | (i5 == 4 || ((i4 & 8) != 0 && x340Var.i(zeuVar2)));
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                n511Var = n511Var3;
                i3 = i5;
                wba1Var = new wba1(ven0Var2, zeuVar2, n511Var2, ven0Var, (lnm) null, (byte) 19);
                ven0Var2 = ven0Var2;
                zeuVar2 = zeuVar2;
                x340Var.s0(wba1Var);
            } else {
                n511Var = n511Var3;
                wba1Var = objT3;
                i3 = i5;
            }
            qxd0.t(n511Var, x340Var, (vu30) wba1Var);
            boolean z = i3 == 4 || ((i4 & 8) != 0 && x340Var.i(zeuVar2));
            Object objT4 = x340Var.T();
            if (z || objT4 == m4cVar) {
                objT4 = new hij1(zeuVar2, ven0Var, (byte) 17);
                x340Var.s0(objT4);
            }
            qxd0.i(rih1.a, (iu30) objT4, x340Var);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = new i2g1(ven0Var2, (byte) 15);
                x340Var.s0(objT5);
            }
            qim0 qim0VarX = ern1.x(qim0Var, (iu30) objT5);
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
            dv20.l((i4 >> 6) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(zeuVar2, qim0Var, j2iVar, i, (byte) 11);
        }
    }

    public static final bk7 f(iu30 iu30Var) {
        c1i c1iVar = new c1i();
        iu30Var.invoke(c1iVar);
        List list = c1iVar.a;
        h5z h5zVar = c1iVar.f;
        if (h5zVar == null) {
            h5zVar = null;
        }
        return new bk7(new c21(list, c1iVar.b, c1iVar.c, c1iVar.d, c1iVar.e), h5zVar, (byte) 1);
    }

    public static m6e0 g(Single single) {
        return new m6e0(single.toObservable().map(new uh61((byte) 8)).onErrorReturn(new uh61((byte) 9)), u0e0.X0, fnc0.Z0);
    }

    public static m6e0 h(final Single single) {
        final AtomicReference atomicReference = new AtomicReference();
        return new m6e0(Observable.defer(new Supplier() { // from class: p.a091
            public final Object get() {
                AtomicReference atomicReference2 = atomicReference;
                Object obj = atomicReference2.get();
                return obj != null ? Observable.just(new f5e0(obj)) : single.toObservable().doOnNext(new fv5(atomicReference2, (byte) 24)).map(new uh61((byte) 8)).onErrorReturn(new uh61((byte) 9));
            }
        }), u0e0.X0, fnc0.Z0);
    }

    public static final String i(int i) {
        if (i < 0) {
            hhg1.f(f4i1.c(i, "Negative time value: "));
            return null;
        }
        long j = i;
        long j2 = (j / 3600000) % 24;
        long j3 = (j / 60000) % 60;
        long j4 = (j / 1000) % 60;
        return j2 == 0 ? String.format(null, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2)) : String.format(null, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3));
    }

    public static final b180 j() {
        b180 b180Var = a;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.CollectionActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(9.125f, 1.098f);
        cwh0VarG.b(0.75f, 0.75f, false, false, 8.0f, 1.748f);
        cwh0VarG.j(8.0f, 15.25f);
        cwh0VarG.c(0.75f, 0.75f, false, false, 0.75f, 0.75f);
        cwh0VarG.i(5.5f);
        cwh0VarG.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
        cwh0VarG.j(15.0f, 4.923f);
        cwh0VarG.c(0.75f, 0.75f, false, false, -0.375f, -0.65f);
        cwh0VarG.e();
        cwh0VarG.l(1.0f, 1.75f);
        cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
        cwh0VarG.v(13.5f);
        cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
        cwh0VarG.e();
        cwh0VarG.l(6.0f, 1.75f);
        cwh0VarG.c(0.75f, 0.75f, false, false, -1.5f, 0.0f);
        cwh0VarG.v(13.5f);
        cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
        cwh0VarG.e();
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        a = b180VarB;
        return b180VarB;
    }

    public static final boolean k(String str) {
        return l(str) || m(str);
    }

    public static final boolean l(String str) {
        return nhc1.Y(str, "spotify:prerelease:", false);
    }

    public static final boolean m(String str) {
        return nhc1.Y(str, "spotify:album:", false) || nhc1.Y(str, "spotify:track:", false);
    }

    public static tdl0 n() {
        return new tdl0((byte) 17);
    }

    public static final pi30 o(b0k b0kVar) {
        Object[] objArr = new Object[0];
        df41 df41Var = new df41(new u1c((byte) 29), new n75((byte) 25));
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new xh3((byte) 28);
            x340Var.s0(objT);
        }
        return (pi30) k5p1.u(objArr, df41Var, (Function0) objT, x340Var, 384);
    }

    public static final osp0 p(jvp0 jvp0Var, Resources resources) {
        if (jvp0Var.a.isEmpty()) {
            return null;
        }
        return new osp0(new bvp0(new hvl1(resources.getString(2131953960), 254, (String) null, (String) null, false, (String) null)), b7x.a);
    }

    public static final tcd1 q(qpe1 qpe1Var) {
        int iOrdinal = qpe1Var.ordinal();
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? tcd1.c : tcd1.b;
        }
        return tcd1.a;
    }
}
