package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.versionedparcelable.ParcelImpl;
import coil3.request.NullRequestDataException;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.cosmos.Request;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class eqr0 {
    public static final String[] a = {"B", "kB", "MB", "GB", "TB", "PB", "EB"};

    public static boolean A(String str) {
        Set set = s4b1.f;
        return uic.h(str, new blc0[]{blc0.ti, blc0.ui});
    }

    public static final qim0 B(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new kyp0(iu30Var, true));
    }

    public static final qim0 C(qim0 qim0Var, float f, float f2) {
        return qim0Var.then(new fyp0(f, f2, true));
    }

    public static qim0 D(float f, float f2, int i, qim0 qim0Var) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return C(qim0Var, f, f2);
    }

    public static final gt40 E(gt40 gt40Var, float f) {
        pzq0 pzq0VarQ = Q(f);
        return gt40Var.c(new rzq0(pzq0VarQ, pzq0VarQ, pzq0VarQ, pzq0VarQ));
    }

    public static final gt40 F(gt40 gt40Var, float f, float f2) {
        return gt40Var.c(new rzq0(Q(f), Q(f2), Q(f), Q(f2)));
    }

    public static final gt40 G(gt40 gt40Var, float f, float f2, float f3, float f4) {
        return gt40Var.c(new rzq0(Q(f), Q(f2), Q(f3), Q(f4)));
    }

    public static gt40 H(gt40 gt40Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return G(gt40Var, f, f2, f3, f4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final p6r0 I(String str) {
        switch (str.hashCode()) {
            case -1977284186:
                if (str.equals("podcasts-following-chip")) {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    return yon1.U1();
                }
                break;
            case -1667493181:
                if (str.equals("podcasts-videos-chip")) {
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    return yon1.V1();
                }
                break;
            case -1664534946:
                if (str.equals("video-chip")) {
                    AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                    return yon1.Y1();
                }
                break;
            case -826681612:
                if (str.equals("music-chip")) {
                    AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                    return yon1.Q1();
                }
                break;
            case -465439259:
                if (str.equals("audiobooks-chip")) {
                    AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                    return yon1.P1();
                }
                break;
            case -396085910:
                if (str.equals("podcasts-chip")) {
                    AtomicReferenceArray atomicReferenceArray6 = p6r0.e;
                    return yon1.T1();
                }
                break;
            case 0:
                if (str.equals("")) {
                    AtomicReferenceArray atomicReferenceArray7 = p6r0.e;
                    return yon1.O1();
                }
                break;
            case 699650036:
                if (str.equals("trending-chip")) {
                    AtomicReferenceArray atomicReferenceArray8 = p6r0.e;
                    return yon1.W1();
                }
                break;
            case 1305885844:
                if (str.equals("wrapped-chip")) {
                    AtomicReferenceArray atomicReferenceArray9 = p6r0.e;
                    return yon1.Z1();
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    AtomicReferenceArray atomicReferenceArray10 = p6r0.e;
                    return yon1.O1();
                }
                break;
            case 1642972848:
                if (str.equals("music-following-chip")) {
                    AtomicReferenceArray atomicReferenceArray11 = p6r0.e;
                    return yon1.R1();
                }
                break;
            case 2034336249:
                if (str.equals("music-videos-chip")) {
                    AtomicReferenceArray atomicReferenceArray12 = p6r0.e;
                    return yon1.S1();
                }
                break;
        }
        AtomicReferenceArray atomicReferenceArray13 = p6r0.e;
        return yon1.X1();
    }

    public static final boolean J(String str) {
        return (str.equals(Request.GET) || str.equals("HEAD")) ? false : true;
    }

    public static final void K(vga0 vga0Var, String str, Object obj) {
        try {
            if (obj instanceof String) {
                vga0Var.b(str, fga0.c((String) obj));
                return;
            }
            if (obj instanceof Boolean) {
                vga0Var.b(str, fga0.a((Boolean) obj));
                return;
            }
            if (!(obj instanceof Number)) {
                if (obj != null) {
                    vga0Var.b(str, fga0.c(obj.toString()));
                    return;
                } else {
                    mf80 mf80Var = fga0.a;
                    vga0Var.b(str, rga0.INSTANCE);
                    return;
                }
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            if (!Double.isNaN(dDoubleValue) && !Double.isInfinite(dDoubleValue)) {
                vga0Var.b(str, fga0.b((Number) obj));
                return;
            }
            throw new IllegalArgumentException(("Cannot represent " + obj + " as JSON").toString());
        } catch (Exception e) {
            Logger.e(e, "Unable to create json data", new Object[0]);
        }
    }

    public static void L(Bundle bundle, h5j1 h5j1Var) {
        if (h5j1Var == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", new ParcelImpl(h5j1Var));
        bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle2);
    }

    public static i8o0 M(ff01 ff01Var) {
        int i = Integer.parseInt(ff01Var.p(Long.MAX_VALUE));
        long j = Long.parseLong(ff01Var.p(Long.MAX_VALUE));
        long j2 = Long.parseLong(ff01Var.p(Long.MAX_VALUE));
        jpa0 jpa0Var = new jpa0((byte) 28);
        int i2 = Integer.parseInt(ff01Var.p(Long.MAX_VALUE));
        for (int i3 = 0; i3 < i2; i3++) {
            String strP = ff01Var.p(Long.MAX_VALUE);
            int iV0 = ihc1.v0(strP, ':', 0, 6);
            if (iV0 == -1) {
                hhg1.f("Unexpected header: ".concat(strP));
                return null;
            }
            jpa0Var.a(ihc1.e1(strP.substring(0, iV0)).toString(), strP.substring(iV0 + 1));
        }
        return new i8o0(i, j, j2, jpa0Var.b());
    }

    public static final void N(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void O(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final float P(Resources resources, List list) {
        Iterator it = list.iterator();
        float dimension = 0.0f;
        while (it.hasNext()) {
            dimension += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    public static final pzq0 Q(float f) {
        return new pzq0(f, 2);
    }

    public static final anb0 R(b5u b5uVar, Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bpl1.a.a(b5uVar);
        }
        b5u b5uVarF = qnb0.f(b5uVar, context);
        if (b5uVarF instanceof t4u) {
            return anb0.b;
        }
        if (b5uVarF instanceof z4u) {
            return anb0.c;
        }
        if (b5uVarF instanceof v4u) {
            return anb0.d;
        }
        if (b5uVarF instanceof u4u) {
            return anb0.e;
        }
        eg.m("After resolution, no other type should be present");
        return null;
    }

    public static final knb0 S(int i) {
        if (ol3.b(i, 0)) {
            return knb0.b;
        }
        if (ol3.b(i, 1)) {
            return knb0.c;
        }
        if (ol3.b(i, 2)) {
            return knb0.d;
        }
        bhn0.B(ol3.c(i), "unknown vertical alignment ");
        return null;
    }

    public static final bnb0 T(int i) {
        if (ml3.b(i, 0)) {
            return bnb0.b;
        }
        if (ml3.b(i, 1)) {
            return bnb0.c;
        }
        if (ml3.b(i, 2)) {
            return bnb0.d;
        }
        bhn0.B(ml3.c(i), "unknown horizontal alignment ");
        return null;
    }

    public static String U(int i) {
        if (i == 1) {
            return "Clip";
        }
        if (i == 2) {
            return "Ellipsis";
        }
        if (i == 5) {
            return "MiddleEllipsis";
        }
        if (i == 3) {
            return "Visible";
        }
        return i == 4 ? "StartEllipsis" : "Invalid";
    }

    public static void V(i8o0 i8o0Var, df01 df01Var) {
        df01Var.m0(i8o0Var.b());
        df01Var.writeByte(10);
        df01Var.m0(i8o0Var.d());
        df01Var.writeByte(10);
        df01Var.m0(i8o0Var.e());
        df01Var.writeByte(10);
        Set<Map.Entry> setEntrySet = i8o0Var.c().a().entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        df01Var.m0(size);
        df01Var.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                df01Var.Q((String) entry.getKey());
                df01Var.Q(":");
                df01Var.Q(str);
                df01Var.writeByte(10);
            }
        }
    }

    public static void W(Object obj, Object obj2) {
        if (obj == null) {
            bhn0.i("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            String string = obj.toString();
            bhn0.i(l1d.q(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
        }
    }

    public static void X(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final void a(gt40 gt40Var, int i, int i2, j2i j2iVar, b0k b0kVar, int i3, int i4) {
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1883910253);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (x340Var.g(gt40Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= x340Var.e(i) ? 32 : 16;
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= x340Var.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= x340Var.g(j2iVar) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && x340Var.H()) {
            x340Var.b0();
        } else {
            if (i6 != 0) {
                gt40Var = et40.a;
            }
            if (i7 != 0) {
                i = 0;
            }
            if (i8 != 0) {
                i2 = 0;
            }
            hbh hbhVar = hbh.a;
            x340Var.j0(578571862);
            x340Var.j0(-548224868);
            if (!(x340Var.a instanceof i06)) {
                tgp1.p();
                throw null;
            }
            x340Var.g0();
            if (x340Var.S) {
                x340Var.l(hbhVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gt40Var, x340Var, rng.N0);
            nko1.H(ml3.a(i2), x340Var, rng.O0);
            nko1.H(ol3.a(i), x340Var, rng.P0);
            j2iVar.invoke(obh.a, x340Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            x340Var.r(true);
            x340Var.r(false);
            x340Var.r(false);
        }
        gt40 gt40Var2 = gt40Var;
        int i9 = i;
        int i10 = i2;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ibh(gt40Var2, i9, i10, j2iVar, i3, i4);
        }
    }

    public static final void b(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) {
        int i3;
        qim0 qim0Var2;
        int i4;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1497975862);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i4 = i3 | (x340Var.g(qim0Var2) ? 32 : 16);
        }
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            qim0Var3 = i5 != 0 ? nim0.a : qim0Var2;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = a9o.X;
                x340Var.s0(objT);
            }
            uwo1.e(str, qim0Var3, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new ajc0((iu30) objT), 0, (qx8) null, x340Var, (i4 & 14) | 1572864 | (i4 & 112), 0, 1724);
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rex(i, i2, str, qim0Var3);
        }
    }

    public static final void c(af5 af5Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1506567652);
        int i4 = i | (x340Var.g(af5Var) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.g(qim0Var2) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0Var3 = i5 != 0 ? nim0.a : qim0Var2;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = s8x.X;
                x340Var.s0(objT);
            }
            uwo1.f(af5Var, qim0Var3, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 2, false, new ajc0((iu30) objT), 0, (qx8) null, (cqs0) null, x340Var, (i3 & 14) | 1572864 | (i3 & 112), 0, 3772);
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sex(af5Var, qim0Var3, i, i2);
        }
    }

    public static final viz d(zy70 zy70Var, Throwable th) {
        oq70 oq70Var;
        if (th instanceof NullRequestDataException) {
            iu30 iu30Var = zy70Var.o;
            wy70 wy70Var = zy70Var.u;
            oq70Var = (oq70) iu30Var.invoke(zy70Var);
            if (oq70Var == null) {
                oq70Var = (oq70) wy70Var.j.invoke(zy70Var);
            }
            if (oq70Var == null && (oq70Var = (oq70) zy70Var.n.invoke(zy70Var)) == null) {
                oq70Var = (oq70) wy70Var.i.invoke(zy70Var);
            }
        } else {
            oq70Var = (oq70) zy70Var.n.invoke(zy70Var);
            if (oq70Var == null) {
                oq70Var = (oq70) zy70Var.u.i.invoke(zy70Var);
            }
        }
        return new viz(oq70Var, zy70Var, th);
    }

    public static final void e(boolean z, Integer num, boolean z2, Function0 function0, boolean z3, b0k b0kVar, int i) {
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-316424564);
        int i2 = i | (x340Var.h(z) ? 32 : 16) | (x340Var.g(num) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.h(z3) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            if (num == null) {
                x340Var.i0(849284347);
                x340Var.r(false);
                strK = null;
            } else {
                strK = kk0.k(x340Var, 849284348, num, x340Var, false);
            }
            if (z3) {
                x340Var.i0(858682345);
                uwr uwrVar = cbx.a;
                bth.i(false, (qim0) null, ((vex) zex.a.e).e, (String) null, (Function0) null, x340Var, 54, 26);
                x340Var.r(false);
            } else if (z) {
                x340Var.i0(858687314);
                bth.i(false, (qim0) null, 0L, (String) null, (Function0) null, x340Var, 54, 30);
                x340Var.r(false);
            } else if (z2) {
                x340Var.i0(849569579);
                boolean z4 = ((i2 & 896) == 256) | ((i2 & 57344) == 16384);
                Object objT = x340Var.T();
                if (z4 || objT == fkj0.X) {
                    objT = new dvg0(num, function0, (byte) 9);
                    x340Var.s0(objT);
                }
                bth.i(true, (qim0) null, 0L, strK, (Function0) objT, x340Var, 54, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(849768630);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gj80(z, num, z2, function0, z3, i);
        }
    }

    public static final void f(hob1 hob1Var, iu30 iu30Var, Function0 function0, boolean z, qim0 qim0Var, yqg yqgVar, znb0 znb0Var, boolean z2, i091 i091Var, boolean z3, vu30 vu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-324987659);
        int i2 = i | (x340Var2.i(hob1Var) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.h(z) ? 2048 : 1024) | 24576 | (x340Var2.g(yqgVar) ? 131072 : 65536) | (x340Var2.i(znb0Var) ? 1048576 : 524288) | (x340Var2.h(z2) ? 8388608 : 4194304) | (x340Var2.i(i091Var) ? 67108864 : 33554432) | (x340Var2.h(z3) ? 536870912 : 268435456);
        boolean z4 = true;
        if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && ((x340Var2.i(vu30Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            x340Var2.d0();
            if ((i & 1) == 0 || x340Var2.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var2.b0();
                qim0Var3 = qim0Var;
            }
            x340Var2.s();
            dr00 dr00Var = hob1Var.h;
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = xto.t(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zA = hob1Var.a();
            boolean zP = i091Var != null ? ebp1.p(i091Var) : false;
            if (!zP || !hob1Var.D) {
                z4 = false;
            }
            qim0 qim0Var4 = qim0Var3;
            x340Var = x340Var2;
            j(((i2 >> 27) & 14) | 3072, apo.r(-1604370526, new uii0(z && dr00Var.b() && !zA && !z4, iu30Var, ven0Var, i091Var, hob1Var, zP, function0, z2, zA, vu30Var, znb0Var, yqgVar, z, z3, dr00Var, z4), x340Var), x340Var, u291.f(qim0Var3, 1.0f), z3, hob1Var.A);
            qim0Var2 = qim0Var4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vii0(hob1Var, iu30Var, function0, z, qim0Var2, yqgVar, znb0Var, z2, i091Var, z3, vu30Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(hob1 hob1Var, yqg yqgVar, boolean z, i091 i091Var, znb0 znb0Var, boolean z2, boolean z3, boolean z4, boolean z5, b0k b0kVar, int i) {
        x340 x340Var;
        int i2;
        long jC;
        x340 x340Var2;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-1335126970);
        int i3 = i | (x340Var3.i(hob1Var) ? 32 : 16) | (x340Var3.g(yqgVar) ? 256 : 128) | (x340Var3.h(z) ? 2048 : 1024) | (x340Var3.i(i091Var) ? 16384 : 8192) | (x340Var3.i(znb0Var) ? 131072 : 65536) | (x340Var3.h(z2) ? 1048576 : 524288) | (x340Var3.h(z3) ? 8388608 : 4194304) | (x340Var3.h(z4) ? 67108864 : 33554432) | (x340Var3.h(z5) ? 536870912 : 268435456);
        if (x340Var3.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            if (!z || i091Var == null || i091Var.d < 0) {
                i2 = 0;
                x340 x340Var4 = x340Var3;
                x340Var4.i0(925409397);
                x340Var4.r(false);
                jC = hob1Var.z;
                x340Var2 = x340Var4;
            } else {
                x340Var3.i0(925039939);
                Float fValueOf = Float.valueOf(i091Var.f);
                if (!u890.j(i091Var.h, n091.a)) {
                    fValueOf = null;
                }
                i2 = 0;
                x340 x340Var5 = x340Var3;
                jC = z1p1.C(i091.a(i091Var, 0L, fValueOf != null ? fValueOf.floatValue() : 0.0f, false, 479), hob1Var.z, yqgVar, x340Var5, i3 & 896);
                x340Var5.r(false);
                x340Var2 = x340Var5;
            }
            long j = jC;
            nim0 nim0Var = nim0.a;
            h2c h2cVar = h2c.a;
            if (z5) {
                x340Var2.i0(925486494);
                qim0 qim0VarA = h2cVar.a(nim0Var, een.d);
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, i2);
                int iHashCode = Long.hashCode(tgp1.l(x340Var2));
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
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
                nko1.H(qim0VarE, x340Var2, y580.Y);
                bth.e(j, hob1Var.A, (z2 || z3) ? false : true, (qim0) null, x340Var2, 0);
                x340Var2.r(true);
                x340Var2.r(false);
            } else {
                x340Var2.i0(925730588);
                x340Var2.r(i2);
            }
            if (znb0Var != null) {
                x340Var2.i0(925777677);
                fq7.g(z && yoi1.o(1.0f - (((float) j) / ((float) hob1Var.z)), 0.0f, 1.0f) > 0.0f && !z4, D(0.0f, 22.0f, 1, h2cVar.a(nim0Var, een.t)), (bby) null, (ln00) null, (String) null, apo.r(585464432, new icz(znb0Var, (byte) 1), x340Var2), x340Var2, 196608, 28);
                x340Var2.r(false);
                x340Var = x340Var2;
            } else {
                x340Var2.i0(926222620);
                x340Var2.r(false);
                x340Var = x340Var2;
            }
        } else {
            x340 x340Var6 = x340Var3;
            x340Var6.b0();
            x340Var = x340Var6;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wii0(hob1Var, yqgVar, z, i091Var, znb0Var, z2, z3, z4, z5, i);
        }
    }

    public static final void h(iu30 iu30Var, yrg0 yrg0Var, qim0 qim0Var, p091 p091Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(503350836);
        int i2 = (x340Var.i(iu30Var) ? 32 : 16) | i | (x340Var.i(yrg0Var) ? 256 : 128) | 3072 | (x340Var.i(p091Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9361) != 9360)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("MCDVideoSurface", u291.d(nim0Var, 1.0f));
            boolean zI = x340Var.i(yrg0Var) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new uah0(yrg0Var, iu30Var, (byte) 12);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean zI2 = x340Var.i(p091Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new z6h0(p091Var, (byte) 21);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var2, qim0VarN, (iu30) objT2, x340Var, 0, 0);
            qim0Var = nim0Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(iu30Var, yrg0Var, qim0Var, p091Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(za51 za51Var, boolean z, qim0 qim0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1216179);
        int i2 = (x340Var.g(za51Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | 384 | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0Var = nim0.a;
            qim0 qim0VarB = z ? qim0Var : f8d1.b(d9y0.q(s161.b(qim0Var, false, ej41.V0), ej41.W0), rih1.a, mia.q);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = ej41.U0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0Var, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
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
            x340Var.i0(-836002875);
            for (xa51 xa51Var : za51Var.a()) {
                if (xa51Var instanceof wa51) {
                    x340Var.i0(1380680708);
                    wa51 wa51Var = (wa51) xa51Var;
                    j2h1.a(new fn1(wa51Var.a(), wa51Var.b()), qim0VarB, function0, x340Var, (i2 >> 3) & 896);
                    x340Var.r(false);
                } else {
                    if (!(xa51Var instanceof xa51)) {
                        throw p3d1.k(x340Var, 1380678352, false);
                    }
                    x340Var.i0(1380689442);
                    mno1.b(xa51Var, qim0VarB, function1, x340Var, (i2 >> 6) & 896);
                    x340Var.r(false);
                }
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(za51Var, z, qim0Var2, function0, function1, i);
        }
    }

    public static final void j(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2089532615);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarJ = zr7.j(qim0Var, new qpf(z2, z, (byte) 3));
            int i3 = u7h.l;
            qim0 qim0VarG = dug.g(nfb.i(), qim0VarJ);
            int i4 = i2 & 7168;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarG);
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
            ywx0.l(((i4 >> 6) & 112) | 6, j2iVar, h2c.a, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kq2(z, z2, qim0Var, j2iVar, i, (byte) 2);
        }
    }

    public static final qim0 k(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new kyp0(iu30Var, false));
    }

    public static final qim0 l(qim0 qim0Var, float f) {
        return qim0Var.then(new fyp0(f, -13.5f, false));
    }

    public static final ezc m(xm41 xm41Var) {
        return bs51.k(eth.X(xm41Var).map(f4x0.O0));
    }

    public static void n(Object obj, StringBuilder sb) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void o(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            k220.e(i3, cy30.q(i, i2, "startIndex: ", ", endIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            hhg1.n(cy30.i(i, "startIndex: ", i2, " > endIndex: "));
        }
    }

    public static void p(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            k220.e(i3, cy30.q(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            hhg1.n(cy30.i(i, "fromIndex: ", i2, " > toIndex: "));
        }
    }

    public static void q(lw4 lw4Var, BlurMaskFilter blurMaskFilter, int i) {
        int i2 = u7h.l;
        long jI = nfb.i();
        int i3 = (i & 8) != 0 ? 0 : 1;
        lw4Var.c(jI);
        lw4Var.b(3);
        lw4Var.g(i3);
        sbl.F(lw4Var, blurMaskFilter);
    }

    public static final boolean r(wsc0 wsc0Var, dlc0... dlc0VarArr) {
        int iIntValue = 0;
        for (dlc0 dlc0Var : (dlc0[]) Arrays.copyOf(dlc0VarArr, dlc0VarArr.length)) {
            Integer num = (Integer) wsc0Var.j.get(dlc0Var);
            iIntValue += num != null ? num.intValue() : 0;
        }
        return iIntValue > 0;
    }

    public static final boolean s(wsc0 wsc0Var, dlc0... dlc0VarArr) {
        if (r(wsc0Var, (dlc0[]) Arrays.copyOf(dlc0VarArr, dlc0VarArr.length))) {
            dlc0[] dlc0VarArrValues = dlc0.values();
            ArrayList arrayList = new ArrayList();
            for (dlc0 dlc0Var : dlc0VarArrValues) {
                if (!f46.M(dlc0VarArr, dlc0Var)) {
                    arrayList.add(dlc0Var);
                }
            }
            dlc0[] dlc0VarArr2 = (dlc0[]) arrayList.toArray(new dlc0[0]);
            if (!r(wsc0Var, (dlc0[]) Arrays.copyOf(dlc0VarArr2, dlc0VarArr2.length))) {
                return true;
            }
        }
        return false;
    }

    public static final hnb0 t(Context context, i3x i3xVar) {
        inb0 inb0Var;
        zmb0 zmb0Var;
        gnb0 gnb0VarN = hnb0.n();
        if (i3xVar instanceof j3x) {
            inb0Var = inb0.d;
        } else if (i3xVar instanceof o3x) {
            inb0Var = hno1.k(((o3x) i3xVar).b()) ? inb0.t : inb0.b;
        } else if (i3xVar instanceof l3x) {
            inb0Var = hno1.k(((l3x) i3xVar).b()) ? inb0.X : inb0.c;
        } else if (i3xVar instanceof r3x) {
            inb0Var = inb0.e;
        } else if (i3xVar instanceof q3x) {
            inb0Var = inb0.f;
        } else if (i3xVar instanceof n3x) {
            inb0Var = inb0.h;
        } else if (i3xVar instanceof k3x) {
            inb0Var = inb0.i;
        } else if (i3xVar instanceof e421) {
            inb0Var = inb0.g;
        } else {
            if (!(i3xVar instanceof p3x)) {
                tw20.t(i3xVar.getClass().getCanonicalName(), "Unknown element type ");
                return null;
            }
            inb0Var = inb0.Y;
        }
        gnb0VarN.r(inb0Var);
        iql1 iql1Var = (iql1) i3xVar.b().foldIn((Object) null, u5l1.P0);
        b5u b5uVarD = z4u.a;
        gnb0VarN.t(R(iql1Var != null ? iql1Var.d() : b5uVarD, context));
        f660 f660Var = (f660) i3xVar.b().foldIn((Object) null, u5l1.Q0);
        if (f660Var != null) {
            b5uVarD = f660Var.d();
        }
        gnb0VarN.k(R(b5uVarD, context));
        gnb0VarN.h(i3xVar.b().foldIn((Object) null, u5l1.N0) != null);
        if (i3xVar.b().foldIn((Object) null, u5l1.O0) != null) {
            gnb0VarN.n();
        }
        if (i3xVar instanceof n3x) {
            n3x n3xVar = (n3x) i3xVar;
            int iE = n3xVar.e();
            if (i6m.b(iE, 1)) {
                zmb0Var = zmb0.b;
            } else if (i6m.b(iE, 0)) {
                zmb0Var = zmb0.c;
            } else {
                if (!i6m.b(iE, 2)) {
                    bhn0.B(i6m.c(n3xVar.e()), "Unknown content scale ");
                    return null;
                }
                zmb0Var = zmb0.d;
            }
            gnb0VarN.q(zmb0Var);
            gnb0VarN.j(!yoi1.D(n3xVar));
            gnb0VarN.i(n3xVar.d() != null);
        } else if (i3xVar instanceof l3x) {
            gnb0VarN.l(T(((l3x) i3xVar).f()));
        } else if (i3xVar instanceof o3x) {
            gnb0VarN.s(S(((o3x) i3xVar).f()));
        } else if (i3xVar instanceof j3x) {
            j3x j3xVar = (j3x) i3xVar;
            gnb0VarN.l(T(j3xVar.f().a()));
            gnb0VarN.s(S(j3xVar.f().b()));
        }
        if (i3xVar instanceof s3x) {
            ArrayList arrayListE = ((s3x) i3xVar).e();
            ArrayList arrayList = new ArrayList(q7h.U(arrayListE, 10));
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                arrayList.add(t(context, (i3x) it.next()));
            }
            gnb0VarN.g(arrayList);
        }
        return (hnb0) gnb0VarN.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final String u(ugn ugnVar) throws NoWhenBranchMatchedException {
        if (ugnVar instanceof ufn) {
            return "os";
        }
        if (ugnVar.equals(cgn.a)) {
            return "product";
        }
        if (ugnVar instanceof sfn) {
            return "locale";
        }
        if (ugnVar instanceof ogn) {
            return "uptime";
        }
        if (ugnVar instanceof pgn) {
            return "version";
        }
        if (ugnVar instanceof hgn) {
            return "revision";
        }
        if (ugnVar instanceof ven) {
            return "device_id";
        }
        if (ugnVar instanceof wen) {
            return "diagnostic_session_id";
        }
        if (ugnVar instanceof ign) {
            return "signature";
        }
        if (ugnVar instanceof zen) {
            return "font-scale";
        }
        if (ugnVar instanceof tfn) {
            return "low_memory";
        }
        if (ugnVar instanceof afn) {
            return "foreground";
        }
        if (ugnVar instanceof dfn) {
            return "free_memory";
        }
        if (ugnVar instanceof vfn) {
            return "orientation";
        }
        if (ugnVar instanceof qen) {
            return "car_detected";
        }
        if (ugnVar instanceof qfn) {
            return "lighthouse";
        }
        if (ugnVar instanceof fgn) {
            return "raw_platform";
        }
        if (ugnVar instanceof oen) {
            return "architecture";
        }
        if (ugnVar instanceof dgn) {
            return "product_state";
        }
        if (ugnVar instanceof egn) {
            return "quasar_scopes";
        }
        if (ugnVar instanceof jgn) {
            return "spotify_locale";
        }
        if (ugnVar instanceof bfn) {
            return "fragment-stack";
        }
        if (ugnVar instanceof ffn) {
            return "hardware_model";
        }
        if (ugnVar instanceof rfn) {
            return "local_playback";
        }
        if (ugnVar instanceof ggn) {
            return "remote_playback";
        }
        if (ugnVar instanceof gfn) {
            return "hardware_vendor";
        }
        if (ugnVar instanceof sen) {
            return "lifecycle";
        }
        if (ugnVar instanceof ren) {
            return "client_build_type";
        }
        if (ugnVar instanceof mgn) {
            return "trim_memory_level";
        }
        if (ugnVar instanceof hfn) {
            return "headset_connected";
        }
        if (ugnVar instanceof ifn) {
            return "installer-package";
        }
        if (ugnVar instanceof uen) {
            return "startup_type";
        }
        if (ugnVar instanceof kgn) {
            return "startup_progress";
        }
        if (ugnVar instanceof yfn) {
            return "process_importance";
        }
        if (ugnVar instanceof agn) {
            return "process_start_reason";
        }
        if (ugnVar instanceof zfn) {
            return "process_start_component";
        }
        if (ugnVar instanceof xen) {
            return "first_component";
        }
        if (ugnVar instanceof yen) {
            return "first_component_type";
        }
        if (ugnVar instanceof lgn) {
            return "thermal_status";
        }
        if (ugnVar instanceof bgn) {
            return "process_uptime_ms";
        }
        if (ugnVar instanceof nen) {
            return "app_protocol_client";
        }
        if (ugnVar instanceof pen) {
            return "bluetooth_connected";
        }
        if (ugnVar instanceof ten) {
            return "startup_reason";
        }
        if (ugnVar instanceof cfn) {
            return "free_internal_storage";
        }
        if (ugnVar instanceof ngn) {
            return "trim_memory_threshold";
        }
        if (ugnVar instanceof men) {
            return "android_auto_connected";
        }
        if (ugnVar instanceof wfn) {
            return "partner_id_from_cache";
        }
        if (ugnVar instanceof jfn) {
            return "is_preinstalled_app";
        }
        if (ugnVar instanceof xfn) {
            return "persistent_usage_milestone";
        }
        if (ugnVar instanceof ofn) {
            return "latest_known_page_identifier";
        }
        if (ugnVar instanceof tgn) {
            return "wrapped_home_subfeed_active";
        }
        if (ugnVar instanceof rgn) {
            return "wrapped_home_chip_visible";
        }
        if (ugnVar instanceof qgn) {
            return "wrapped_home_banner_visible";
        }
        if (ugnVar instanceof sgn) {
            return "wrapped_home_shelf_visible";
        }
        if (ugnVar instanceof nfn) {
            return "latest_known_navigation_action";
        }
        if (ugnVar instanceof kfn) {
            return "latest_known_interaction";
        }
        if (ugnVar instanceof lfn) {
            return "latest_known_interaction_identifier";
        }
        if (ugnVar instanceof pfn) {
            return "latest_known_page_instance_identifier";
        }
        if (ugnVar instanceof mfn) {
            return "latest_known_page_instance_identifier_for_latest_known_interaction";
        }
        if (ugnVar instanceof efn) {
            return "gabito_correlation_id";
        }
        eg.o();
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final String v(ugn ugnVar) throws NoWhenBranchMatchedException {
        if (ugnVar.equals(ren.a)) {
            return "";
        }
        if (ugnVar.equals(cgn.a)) {
            return "com.spotify.music";
        }
        if (ugnVar instanceof ufn) {
            return Build.VERSION.RELEASE;
        }
        if (ugnVar instanceof sfn) {
            return ((sfn) ugnVar).a;
        }
        if (ugnVar instanceof pgn) {
            return ((pgn) ugnVar).a;
        }
        if (ugnVar instanceof ven) {
            return ((ven) ugnVar).a;
        }
        if (ugnVar instanceof wen) {
            return ((wen) ugnVar).a();
        }
        if (ugnVar instanceof qfn) {
            return "=YjMuAjLy4SO";
        }
        if (ugnVar instanceof dgn) {
            return ((dgn) ugnVar).a;
        }
        if (ugnVar instanceof ign) {
            return ((ign) ugnVar).a;
        }
        if (ugnVar instanceof oen) {
            String str = ((oen) ugnVar).a;
            switch (str.hashCode()) {
                case -806050265:
                    return !str.equals("x86_64") ? "unknown" : "x64";
                case 117110:
                    return !str.equals("x86") ? "unknown" : "i386";
                case 145444210:
                    return !str.equals("armeabi-v7a") ? "unknown" : "armv7";
                case 1431565292:
                    return !str.equals("arm64-v8a") ? "unknown" : "arm64";
                default:
                    return "unknown";
            }
        }
        if (ugnVar instanceof egn) {
            return ((egn) ugnVar).a;
        }
        if (ugnVar instanceof jgn) {
            return ((jgn) ugnVar).a;
        }
        if (ugnVar instanceof ffn) {
            return Build.MODEL;
        }
        if (ugnVar instanceof gfn) {
            return Build.MANUFACTURER;
        }
        if (ugnVar instanceof sen) {
            return ((sen) ugnVar).a;
        }
        if (ugnVar instanceof ifn) {
            return ((ifn) ugnVar).a;
        }
        if (ugnVar instanceof ofn) {
            return ((ofn) ugnVar).a;
        }
        if (ugnVar instanceof tgn) {
            return String.valueOf(((tgn) ugnVar).a());
        }
        if (ugnVar instanceof rgn) {
            return String.valueOf(((rgn) ugnVar).a());
        }
        if (ugnVar instanceof qgn) {
            return String.valueOf(((qgn) ugnVar).a());
        }
        if (ugnVar instanceof sgn) {
            return String.valueOf(((sgn) ugnVar).a());
        }
        if (ugnVar instanceof uen) {
            return ((uen) ugnVar).a;
        }
        if (ugnVar instanceof kgn) {
            return ((kgn) ugnVar).a();
        }
        if (ugnVar instanceof nen) {
            return ((nen) ugnVar).a;
        }
        if (ugnVar instanceof yfn) {
            return ((yfn) ugnVar).a;
        }
        if (ugnVar instanceof agn) {
            return ((agn) ugnVar).a();
        }
        if (ugnVar instanceof zfn) {
            return ((zfn) ugnVar).a();
        }
        if (ugnVar instanceof xen) {
            return ((xen) ugnVar).a();
        }
        if (ugnVar instanceof yen) {
            return ((yen) ugnVar).a();
        }
        if (ugnVar instanceof lgn) {
            return ((lgn) ugnVar).a();
        }
        if (ugnVar instanceof bgn) {
            return String.valueOf(((bgn) ugnVar).a());
        }
        if (ugnVar instanceof ten) {
            return ((ten) ugnVar).a;
        }
        if (ugnVar instanceof nfn) {
            return ((nfn) ugnVar).a;
        }
        if (ugnVar instanceof kfn) {
            return ((kfn) ugnVar).a;
        }
        if (ugnVar instanceof lfn) {
            return ((lfn) ugnVar).a;
        }
        if (ugnVar instanceof pfn) {
            return ((pfn) ugnVar).a;
        }
        if (ugnVar instanceof mfn) {
            return ((mfn) ugnVar).a;
        }
        if (ugnVar instanceof efn) {
            return ((efn) ugnVar).a;
        }
        if (ugnVar instanceof ogn) {
            return String.valueOf(((ogn) ugnVar).a);
        }
        if (ugnVar instanceof zen) {
            return String.valueOf(((zen) ugnVar).a);
        }
        if (ugnVar instanceof dfn) {
            return String.valueOf(((dfn) ugnVar).a);
        }
        if (ugnVar instanceof tfn) {
            return String.valueOf(((tfn) ugnVar).a);
        }
        if (ugnVar instanceof qen) {
            return String.valueOf(((qen) ugnVar).a);
        }
        if (ugnVar instanceof hgn) {
            return String.valueOf(((hgn) ugnVar).a);
        }
        if (ugnVar instanceof afn) {
            return String.valueOf(((afn) ugnVar).a);
        }
        if (ugnVar instanceof rfn) {
            return String.valueOf(((rfn) ugnVar).a);
        }
        if (ugnVar instanceof mgn) {
            return String.valueOf(((mgn) ugnVar).a);
        }
        if (ugnVar instanceof ggn) {
            return String.valueOf(((ggn) ugnVar).a);
        }
        if (ugnVar instanceof hfn) {
            return String.valueOf(((hfn) ugnVar).a);
        }
        if (ugnVar instanceof pen) {
            return String.valueOf(((pen) ugnVar).a);
        }
        if (ugnVar instanceof ngn) {
            return String.valueOf(((ngn) ugnVar).a());
        }
        if (ugnVar instanceof men) {
            return String.valueOf(((men) ugnVar).a());
        }
        if (ugnVar instanceof wfn) {
            return String.valueOf(((wfn) ugnVar).a());
        }
        if (ugnVar instanceof jfn) {
            return String.valueOf(((jfn) ugnVar).a());
        }
        if (ugnVar instanceof xfn) {
            return ((xfn) ugnVar).a();
        }
        int i = 0;
        if (ugnVar instanceof cfn) {
            long jA = ((cfn) ugnVar).a();
            while (jA >= 1024) {
                jA /= 1024;
                i++;
            }
            return jA + " " + a[i];
        }
        if (ugnVar instanceof bfn) {
            String str2 = ((bfn) ugnVar).a;
            return str2.substring(Math.max(str2.length() - 512, 0));
        }
        if (ugnVar instanceof vfn) {
            return ((vfn) ugnVar).a ? "landscape" : "portrait";
        }
        if (ugnVar instanceof fgn) {
            fgn fgnVar = (fgn) ugnVar;
            return String.format(Locale.US, "Android%s OS %s API %d (%s, %s)", Arrays.copyOf(new Object[]{fgnVar.a ? "-tablet" : "", Build.VERSION.RELEASE, Integer.valueOf(fgnVar.b), Build.MANUFACTURER, Build.MODEL}, 5));
        }
        eg.o();
        return null;
    }

    public static h5j1 w(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(eqr0.class.getClassLoader());
            ParcelImpl parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return parcelable.a();
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static String x(String str) {
        return nhc1.W(nhc1.W(nhc1.W(nhc1.W(str, "&", "&amp;"), "\"", "&quot;"), "<", "&lt;"), ">", "&gt;");
    }

    public static final boolean y(String str) {
        return str.equals(Request.POST) || str.equals("PATCH") || str.equals(Request.PUT) || str.equals(Request.DELETE) || str.equals("MOVE");
    }

    public static boolean z(String str) {
        Set set = s4b1.f;
        return uic.h(str, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6});
    }
}
