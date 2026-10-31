package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.upsells.v1.proto.GatedFeatureContext;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class k1o1 {
    public static b180 a;

    public static final void a(ykd ykdVar, yqg yqgVar, Function0 function0, xid xidVar, los losVar, bf4 bf4Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object obj;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1648993086);
        int i2 = i | (x340Var.g(ykdVar) ? 4 : 2) | (x340Var.g(yqgVar) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.g(xidVar) ? 2048 : 1024) | (x340Var.i(losVar) ? 16384 : 8192) | (x340Var.i(bf4Var) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                obj = objT;
                boolean[] zArr = {false};
                x340Var.s0(zArr);
                obj = zArr;
            }
            obj = objT;
            boolean[] zArr2 = (boolean[]) obj;
            boolean zI = ((i2 & 7168) == 2048) | x340Var.i(losVar) | x340Var.i(zArr2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new o0d(losVar, zArr2, xidVar, (byte) 2);
                x340Var.s0(objT2);
            }
            qxd0.i(rih1.a, (iu30) objT2, x340Var);
            boolean zI2 = x340Var.i(zArr2) | ((i2 & 896) == 256);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new rqa(zArr2, function0, (byte) 15);
                x340Var.s0(objT3);
            }
            x340Var.i0(160620913);
            c(ykdVar.a, yqgVar, (Function0) objT3, bf4Var, x340Var, ((i2 >> 6) & 7168) | (i2 & 112) | 24576);
            x340Var.r(false);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(ykdVar, yqgVar, function0, xidVar, losVar, bf4Var, qim0Var2, i, (byte) 4);
        }
    }

    public static final void b(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        String str3;
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-628650862);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (x340Var2.g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarP, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
            lee1 lee1Var = cbx.d(x340Var2).e;
            nim0 nim0Var = nim0.a;
            int i3 = i2;
            uwo1.e(str3, u291.f(nim0Var, 1.0f), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i2 & 14, 0, 2024);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            uwo1.e(str2, u291.f(nim0Var, 1.0f), kk0.p(nim0Var, 8.0f, x340Var2, x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, (i3 >> 3) & 14, 0, 2016);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.h(nim0Var, 16.0f));
            idx idxVar = new idx(4);
            gdx gdxVarP = yla.p(x340Var2);
            boolean z = (i3 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new pj8(function0, (byte) 19);
                x340Var2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, null, null, gdxVarP, null, null, null, null, null, uai.a, x340Var2, 0, 48, 2012);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmd(str, str2, function0, qim0Var, i, (byte) 0);
        }
    }

    public static final void c(long j, yqg yqgVar, Function0 function0, bf4 bf4Var, b0k b0kVar, int i) {
        int i2;
        yqg yqgVar2;
        wpe1 wpe1Var;
        String strU;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1127798535);
        if ((i & 6) == 0) {
            i2 = (x340Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            yqgVar2 = yqgVar;
            i2 |= x340Var.g(yqgVar2) ? 32 : 16;
        } else {
            yqgVar2 = yqgVar;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(bf4Var) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            long jB = yqgVar2.b();
            if (jB > j) {
                jB = j;
            }
            long j2 = j - jB;
            long j3 = j2 / 86400000;
            TimeUnit timeUnit = TimeUnit.DAYS;
            if (j3 >= 1) {
                wpe1Var = new wpe1((int) Math.ceil(j2 / 8.64E7d), timeUnit);
            } else {
                int iCeil = (int) Math.ceil(j2 / 3600000.0d);
                wpe1Var = new wpe1(iCeil >= 1 ? iCeil : 1, TimeUnit.HOURS);
            }
            TimeUnit timeUnit2 = wpe1Var.b;
            int i4 = wpe1Var.a;
            if (timeUnit2 == timeUnit) {
                x340Var.i0(-1282664784);
                strU = cwl1.U(bf4Var.b() ? 2131820603 : 2131820602, i4, new Object[]{Integer.valueOf(i4)}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-1282362162);
                strU = cwl1.U(bf4Var.b() ? 2131820605 : 2131820604, i4, new Object[]{Integer.valueOf(i4)}, x340Var);
                x340Var.r(false);
            }
            b((i2 & 896) | ((i2 >> 3) & 7168), cwl1.o0(x340Var, 2131953448), strU, function0, x340Var, nim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q18(j, yqgVar2, function0, bf4Var, i);
        }
    }

    public static final void d(isb0 isb0Var, ijr0 ijr0Var, List list) {
        Trace.beginSection("compose:pager:cache_window:keepAroundItems");
        try {
            if (ijr0Var.b() && !list.isEmpty()) {
                int i = ((mfh0) o7h.q0(list)).a;
                int i2 = ((mfh0) o7h.A0(list)).a;
                for (int i3 = ijr0Var.h; i3 < i; i3++) {
                    isb0Var.a(i3);
                }
                int i4 = i2 + 1;
                int i5 = ijr0Var.i;
                if (i4 <= i5) {
                    while (true) {
                        isb0Var.a(i4);
                        if (i4 == i5) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public static final int e(float f) {
        return jch0.U(f) * (-1);
    }

    public static final ukj0 f(bbr0 bbr0Var) {
        n5b0 n5b0VarA = bbr0Var.b0(n5b0.class).a();
        if (n5b0VarA != null) {
            return n5b0VarA.a;
        }
        return null;
    }

    public static final c380 g(xv2 xv2Var) {
        c380 c380Var = xv2Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            if (obj instanceof frl) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((frl) it.next()).a, arrayList2);
        }
        return mqo1.A(arrayList2);
    }

    public static final int h(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    public static final String i(xv2 xv2Var) {
        String str;
        c380<drl> c380Var = xv2Var.b;
        ArrayList arrayList = new ArrayList();
        for (drl drlVar : c380Var) {
            if (drlVar instanceof drl) {
                str = drlVar.a;
            } else if (drlVar instanceof crl) {
                str = ((crl) drlVar).a;
            } else {
                if (!(drlVar instanceof frl) && !(drlVar instanceof erl)) {
                    eg.o();
                    return null;
                }
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return o7h.y0(arrayList, "\n", (String) null, (String) null, (iu30) null, 62);
    }

    public static final c380 j(xv2 xv2Var) {
        c380 c380Var = xv2Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            if (obj instanceof erl) {
                arrayList.add(obj);
            }
        }
        return mqo1.A(arrayList);
    }

    public static final ni20 k(boolean z, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        if (!z) {
            x340Var.i0(-1137382807);
            x340Var.r(false);
            return irn1.o0(0, 0, null, 6);
        }
        x340Var.i0(-1137383582);
        uwr uwrVar = cbx.a;
        xpv0 xpv0Var = cbx.c(x340Var).c;
        n8b1 n8b1VarE = xpv0.e();
        x340Var.r(false);
        return n8b1VarE;
    }

    public static final boolean l(List list, List list2) {
        Iterator it = list2.iterator();
        List<String> list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return true;
        }
        for (String str : list3) {
            Iterator it2 = z561.Q(it).iterator();
            while (it2.hasNext()) {
                if (u890.j((String) it2.next(), str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean m(List list, List list2, int i, int i2, int i3) {
        if (list.isEmpty()) {
            return list2.isEmpty();
        }
        if (i < 0 || list2.isEmpty() || !l(list2, list) || i >= list2.size()) {
            return false;
        }
        return list2.size() == list.size() || i2 >= i3;
    }

    public static final qim0 n(qim0 qim0Var) {
        return qim0Var.then(qwv0.a);
    }

    public static final rey0 o(xu30 xu30Var) {
        return new rey0(xu30Var);
    }

    public static rey0 p() {
        return new rey0(gft.Z);
    }

    public static final i6o0 q(b0k b0kVar) {
        View view = (View) ((x340) b0kVar).k(AndroidCompositionLocals_androidKt.f);
        x340 x340Var = (x340) b0kVar;
        e8k1 e8k1Var = (e8k1) x340Var.k(t4k.t);
        boolean zG = x340Var.g(view) | x340Var.g(e8k1Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            e8k1Var.c();
            objT = new i6o0(view);
            x340Var.s0(objT);
        }
        return (i6o0) objT;
    }

    public static final String r(Context context, int i) {
        String str;
        int iC = l1d.C(i);
        if (iC == 0) {
            str = "com.android.vending";
        } else if (iC == 1) {
            str = "com.sec.android.app.samsungapps";
        } else if (iC != 2) {
            str = null;
            if (iC != 3 && iC != 4) {
                eg.o();
                return null;
            }
        } else {
            str = "com.amazon.venezia";
        }
        if (str == null) {
            return context.getString(2131952372);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return context.getString(2131952372);
        }
    }

    public static void s(Bundle bundle, Object obj, ipb1 ipb1Var, mc41 mc41Var) {
        Object objE;
        if (bundle.getBoolean("com.spotify.element.state_holder_saved_state")) {
            ipb1Var.j(bundle.getBundle("ui_state"));
            bundle = bundle.getBundle("element_state");
        }
        if (bundle != null) {
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (bundle == null || (objE = mc41Var.e(bundle, obj)) == null) {
                return;
            }
            ipb1Var.e(objE);
        }
    }

    public static Bundle t(ipb1 ipb1Var, mc41 mc41Var) {
        Bundle bundleG;
        Bundle bundleG2 = pzm.g("com.spotify.element.state_holder_saved_state", true);
        try {
            bundleG = mc41Var.d(ipb1Var.getState());
        } catch (Exception unused) {
            bundleG = mno1.g();
        }
        bundleG2.putBundle("element_state", bundleG);
        Bundle bundleC = ipb1Var.c();
        if (bundleC != null) {
            bundleG2.putBundle("ui_state", bundleC);
        }
        return bundleG2;
    }

    public static k8d1 u(zu30 zu30Var) {
        return new k8d1(igu.b, zu30Var);
    }

    public static final ojm v(lzn0 lzn0Var) {
        return new ojm(lzn0Var);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c A[PHI: r11
      0x004c: PHI (r11v11 float) = (r11v4 float), (r11v12 float) binds: [B:16:0x0059, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0073 A[PHI: r11
      0x0073: PHI (r11v9 float) = (r11v6 float), (r11v10 float) binds: [B:24:0x0080, B:21:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long w(int i, int i2, int[] iArr, long j) {
        float f;
        float fIntBitsToFloat;
        float f2;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3 = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j >> 32)) - (i * (-1.0f));
        float fIntBitsToFloat4 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j & 4294967295L)) - (i2 * (-1.0f));
        int i3 = (int) (j >> 32);
        if (Float.intBitsToFloat(i3) >= 0.0f) {
            f = (iArr[0] * (-1.0f)) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i3);
            if (f > fIntBitsToFloat) {
                f = fIntBitsToFloat;
            }
        } else {
            f = (iArr[0] * (-1.0f)) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i3);
            if (f < fIntBitsToFloat) {
                f = fIntBitsToFloat;
            }
        }
        int i4 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i4) >= 0.0f) {
            f2 = (iArr[1] * (-1.0f)) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i4);
            if (f2 > fIntBitsToFloat2) {
                f2 = fIntBitsToFloat2;
            }
        } else {
            f2 = (iArr[1] * (-1.0f)) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i4);
            if (f2 < fIntBitsToFloat2) {
                f2 = fIntBitsToFloat2;
            }
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final GatedFeatureContext x(z740 z740Var) {
        y740 y740Var;
        x740 x740VarP = GatedFeatureContext.p();
        x740VarP.q(z740Var.a);
        x740VarP.n(z740Var.b);
        int iC = l1d.C(z740Var.c);
        if (iC == 0) {
            y740Var = y740.CAPPED;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            y740Var = y740.ENTITLEMENT_MISSING;
        }
        x740VarP.r(y740Var);
        return (GatedFeatureContext) x740VarP.build();
    }

    public static final ArrayList y(String str, List list) {
        List<pf3> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (pf3 pf3Var : list2) {
            arrayList.add(new pf3(pf3Var.a, pf3Var.b, pf3Var.c, pf3Var.d, pf3Var.e, str != null && u890.j(pf3Var.d, str), pf3Var.g));
        }
        return arrayList;
    }

    public static String z(ahn1 ahn1Var) throws GeneralSecurityException {
        int iOrdinal = ahn1Var.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(ahn1Var.toString()));
    }
}
