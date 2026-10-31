package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import com.spotify.scrollsita.v1.Section;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ltn1 {
    public static final boolean[] a = new boolean[3];
    public static b180 b;

    public static final tka0 A(h661 h661Var) {
        if (h661Var instanceof kbm) {
            return ((kbm) h661Var).b;
        }
        if (h661Var instanceof i661) {
            return A(((i661) h661Var).a);
        }
        return null;
    }

    public static final h661 B(kl1 kl1Var, h661 h661Var) {
        nma0 nma0VarO;
        tka0 tka0VarA = A(h661Var);
        if (tka0VarA == null || (nma0VarO = kl1Var.o(z6x.a, tka0VarA)) == null) {
            return null;
        }
        return nma0VarO.getDescriptor();
    }

    public static final int C(AtomicInteger atomicInteger, int i) {
        int i2;
        int i3;
        do {
            i2 = atomicInteger.get();
            if ((i2 & i) != 0) {
                return 0;
            }
            i3 = i2 | i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i3;
    }

    public static void E(hwn0 hwn0Var, Parcel parcel) {
        if (hwn0Var == null) {
            parcel.writeInt(0);
            return;
        }
        gwn0 gwn0Var = hwn0Var.b;
        parcel.writeInt(1);
        parcel.writeSerializable(hwn0Var.a);
        parcel.writeString(gwn0Var.a);
        parcel.writeString(gwn0Var.b);
        parcel.writeString(gwn0Var.c);
        parcel.writeSerializable(gwn0Var.d);
        parcel.writeInt(hwn0Var.d ? 1 : 0);
    }

    public static Parcelable F(Bundle bundle, String str) {
        ClassLoader classLoader = ltn1.class.getClassLoader();
        zod.s(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void G(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable parcelableF = F(bundle, "MapOptions");
        if (parcelableF != null) {
            H(bundle2, "MapOptions", parcelableF);
        }
        Parcelable parcelableF2 = F(bundle, "StreetViewPanoramaOptions");
        if (parcelableF2 != null) {
            H(bundle2, "StreetViewPanoramaOptions", parcelableF2);
        }
        Parcelable parcelableF3 = F(bundle, "camera");
        if (parcelableF3 != null) {
            H(bundle2, "camera", parcelableF3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void H(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = ltn1.class.getClassLoader();
        zod.s(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(y7e1 y7e1Var, iu30 iu30Var, lz20 lz20Var, qim0 qim0Var, boolean z, int i, boolean z2, boolean z3, iu30 iu30Var2, boolean z4, boolean z5, Function0 function0, Function0 function1, boolean z6, Function0 function2, xta0 xta0Var, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        int i4;
        boolean z7;
        int i5;
        boolean z8;
        Function0 function3;
        b0k b0kVar2;
        int i6;
        Function0 function4;
        b0k b0kVar3;
        m4c m4cVar = fkj0.X;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(-1285072924);
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar4.i(y7e1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar4.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar4.i(lz20Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar4.i(qim0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar4.h(z) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= b0kVar4.e(i == 0 ? -1 : l1d.C(i)) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            z7 = z2;
            i4 |= b0kVar4.h(z7) ? 1048576 : 524288;
        } else {
            z7 = z2;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= b0kVar4.h(z3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= b0kVar4.i(iu30Var2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= b0kVar4.h(z4) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (b0kVar4.h(z5) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar4.i(function0) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= b0kVar4.i(function1) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= b0kVar4.h(z6) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= b0kVar4.i(function2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= b0kVar4.i(xta0Var) ? 131072 : 65536;
        }
        if (b0kVar4.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 74899) == 74898) ? false : true)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                i6 = 2131957004;
            } else if (iC == 1) {
                i6 = 2131957007;
            } else if (iC == 2) {
                i6 = 2131957005;
            } else {
                if (iC != 3) {
                    eg.o();
                    return;
                }
                i6 = 2131957006;
            }
            String strO0 = cwl1.o0(b0kVar4, i6);
            boolean zI = ((i4 & 57344) == 16384) | b0kVar4.i(y7e1Var) | ((i4 & 112) == 32);
            Object objT = b0kVar4.T();
            if (zI || objT == m4cVar) {
                objT = new vm1(y7e1Var, z, iu30Var, (byte) 14);
                b0kVar4.s0(objT);
            }
            Function0 function5 = (Function0) objT;
            boolean zY0 = ihc1.y0(y7e1Var.d().d);
            Object objT2 = b0kVar4.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(1, b0kVar4);
            }
            err0 err0Var = (hdn0) objT2;
            err0 err0Var2 = err0Var;
            boolean zG = vqo1.g(err0Var2.s(), y7e1Var.d().d.toString());
            boolean z9 = err0Var2.s() > 3;
            Boolean boolValueOf = Boolean.valueOf(z9);
            boolean zI2 = b0kVar4.i(xta0Var) | b0kVar4.h(z9);
            Object objT3 = b0kVar4.T();
            j2i j2iVarR = null;
            if (zI2 || objT3 == m4cVar) {
                objT3 = new no70(xta0Var, z9, (lnm) null);
                b0kVar4.s0(objT3);
            }
            qxd0.s(boolValueOf, xta0Var, (vu30) objT3, b0kVar4);
            if (zY0 == 0) {
                b0kVar4.i0(1732713264);
                b0kVar3 = b0kVar4;
                function4 = function5;
                j2iVarR = apo.r(2095287449, new ota0(z3, z7, z, iu30Var2, function5), b0kVar3);
                b0kVar3.r(false);
            } else {
                function4 = function5;
                b0kVar3 = b0kVar4;
                if (z4 || z5) {
                    b0kVar3.i0(1733084985);
                    j2iVarR = apo.r(-543896176, new xoe(z4, function1, z5, function0), b0kVar3);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(1734242617);
                    b0kVar3.r(false);
                }
            }
            j2i j2iVar = j2iVarR;
            jys0 jys0Var = (!zY0 || z4 || z5) ? kys0.b : jys0.b;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, 16.0f, 8.0f, 16.0f, 12.0f);
            b0kVar2 = b0kVar3;
            function3 = function2;
            z8 = z6;
            rqo1.d(apo.r(-2071927655, new q3(function4, lz20Var, xta0Var, y7e1Var, strO0, j2iVar, err0Var, zG), b0kVar2), qim0VarA, p7f.f, zG, null, apo.r(-152719522, new ie1(z8, function3, (byte) 12), b0kVar2), jys0Var, b0kVar2, 196614, 16);
        } else {
            z8 = z6;
            function3 = function2;
            b0kVar2 = b0kVar4;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nta0(y7e1Var, iu30Var, lz20Var, qim0Var, z, i, z2, z3, iu30Var2, z4, z5, function0, function1, z8, function3, xta0Var, i2, i3);
        }
    }

    public static final void b(String str, Function0 function0, qim0 qim0Var, hux huxVar, float f, b0k b0kVar, int i) {
        qim0 qim0Var2;
        float f2;
        int i2;
        float f3;
        qim0 qim0Var3;
        qim0 qim0Var4;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2123604894);
        int i3 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 384 | (b0kVar3.i(huxVar) ? 2048 : 1024) | 745472;
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            b0kVar3.d0();
            int i4 = i & 1;
            qim0 qim0Var5 = nim0.a;
            if (i4 == 0 || b0kVar3.E()) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                i2 = i3 & (-3670017);
                f3 = 8.0f;
                qim0Var3 = qim0Var5;
            } else {
                b0kVar3.b0();
                f3 = f;
                i2 = i3 & (-3670017);
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            cr31 cr31VarB = er31.b(f3);
            uwr uwrVar2 = cbx.a;
            mta mtaVar = cbx.b(b0kVar3).d;
            qim0 qim0VarX = bin.x(dug.f(i1p1.q(u291.h(qim0Var3, 32.0f), cr31VarB), cbx.a(b0kVar3).a.b.a(), d4o1.a), false, null, new pm31(0), null, function0, 11);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarX);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarZ);
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
            if (huxVar != null) {
                b0kVar3.i0(-617345159);
                zov0 zov0Var = cbx.b(b0kVar3).g;
                qim0Var4 = qim0Var3;
                b0kVar2 = b0kVar3;
                w0h1.a(huxVar, isl.a, u291.r(qim0Var5, 16.0f), cbx.a(b0kVar3).b.b, 0L, false, b0kVar2, 8 | ((i2 >> 9) & 14), 48);
                b0kVar2.i0(-617025332);
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                op71.g(b0kVar2, u291.v(qim0Var5, 8.0f));
                b0kVar2.r(false);
                b0kVar2.r(false);
            } else {
                qim0Var4 = qim0Var3;
                b0kVar2 = b0kVar3;
                b0kVar2.i0(-616934812);
                b0kVar2.r(false);
            }
            b0kVar2.i0(-616910446);
            b0kVar3 = b0kVar2;
            uwo1.e(str, null, cbx.d(b0kVar2).k, cbx.a(b0kVar2).b.a, null, null, 0, false, null, 0, null, b0kVar3, i2 & 14, 0, 2034);
            b0kVar3.r(false);
            b0kVar3.r(true);
            f2 = f3;
            qim0Var2 = qim0Var4;
        } else {
            b0kVar3.b0();
            qim0Var2 = qim0Var;
            f2 = f;
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new e0a(str, function0, qim0Var2, huxVar, f2, i);
        }
    }

    public static final void c(c380 c380Var, iu30 iu30Var, qim0 qim0Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(113982212);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(function0) ? 16384 : 8192;
        }
        int i4 = i3;
        if (!x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            x340Var.b0();
            qim0Var2 = qim0Var;
        } else {
            if (c380Var.isEmpty() && !z) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new qk7(c380Var, iu30Var, z, function0, i);
                    return;
                }
                return;
            }
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = yv91.a(new ih1(xtb0VarA, (byte) 28));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("KeyboardAccessory.PillsRow", uyn1.B(qim0VarF, 16.0f, 12.0f, 16.0f, 0.0f, 8));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarR = i1p1.r(u291.h(wnb0VarQ, 32.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarR);
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
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            zzq0 zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
            boolean zI = x340Var.i(c380Var) | ((i4 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new li1((byte) 4, iu30Var, c380Var);
                x340Var.s0(objT2);
            }
            ujo1.e(qim0VarF2, xtb0VarA, zzq0VarH, d36Var, null, null, false, null, (iu30) objT2, x340Var, 0, 488);
            if (((Boolean) tob1Var.getValue()).booleanValue()) {
                x340Var.i0(-816659772);
                o(h2c.a.a(qim0Var3, x340Var.k(t4k.n) == flb0.a ? een.i : een.g), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-816429132);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (z) {
                x340Var.i0(1541549854);
                cvx cvxVar5 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.v(qim0Var3, 8.0f));
                i((i4 >> 12) & 14, 2, function0, x340Var, false);
                x340Var.r(false);
            } else {
                x340Var.i0(1541669018);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new pta0(c380Var, iu30Var, qim0Var2, z, function0, i);
        }
    }

    public static final void d(boolean z, boolean z2, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(949380046);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            vqo1.a(z, iu30Var, apo.r(-84946306, new mv8(z, cwl1.o0(x340Var, 2131957010), (byte) 3), x340Var), apo.r(-1353616385, new ie1(z2, function0, (byte) 13), x340Var), null, anm1.N("KeyboardAccessory.TtsToggleButton", nim0.a), 0, 0.0f, null, x340Var, (i2 & 14) | 3456 | ((i2 >> 3) & 112), 464);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cla(z, z2, (Object) iu30Var, (Object) function0, i, (byte) 5);
        }
    }

    public static final void e(String str, g9m g9mVar, Function0 function0, long j, qim0 qim0Var, Long l, Function0 function1, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        vu30 vu30Var;
        qim0 qim0Var3;
        vu30 vu30Var2;
        vu30 vu30Var3;
        float f;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1117563920);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(g9mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.f(j) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= b0kVar3.g(l) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= b0kVar3.i(function1) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (b0kVar3.Y(i4 & 1, (i4 & 599187) != 599186)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            vu30 vu30Var4 = y580.O0;
            nko1.H(mbhVarA, b0kVar3, vu30Var4);
            vu30 vu30Var5 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, vu30Var5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar);
            nko1.F(b0kVar3);
            vu30 vu30Var6 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, vu30Var6);
            String strO0 = cwl1.o0(b0kVar3, 2131956998);
            if (l != null) {
                long jLongValue = l.longValue();
                if (Math.abs(j - jLongValue) < 60000) {
                    vu30Var2 = vu30Var5;
                    vu30Var3 = vu30Var6;
                    vu30Var = vu30Var4;
                    qim0Var3 = qim0Var4;
                    f = 1.0f;
                } else {
                    vu30Var = vu30Var4;
                    qim0Var3 = qim0Var4;
                    vu30Var3 = vu30Var6;
                    vu30Var2 = vu30Var5;
                    f = 1.0f;
                    strO0 = DateUtils.getRelativeTimeSpanString(jLongValue, j, 60000L, 262144).toString();
                }
            } else {
                vu30Var = vu30Var4;
                qim0Var3 = qim0Var4;
                vu30Var2 = vu30Var5;
                vu30Var3 = vu30Var6;
                f = 1.0f;
                strO0 = null;
            }
            f((i4 >> 15) & 112, strO0, function1, b0kVar3, null);
            qim0 qim0Var5 = qim0Var3;
            qim0 qim0VarF2 = u291.f(qim0Var5, f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarB = uyn1.B(qim0VarF2, 16.0f, 0.0f, 16.0f, 0.0f, 10);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarB);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, vu30Var);
            nko1.H(xos0VarM2, b0kVar3, vu30Var2);
            x0d.q(iHashCode2, b0kVar3, lljVar, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, vu30Var3);
            b0kVar2 = b0kVar3;
            otw.c(g9mVar, new f9m(str, (String) null, (String) null, 2, false, false, false, (iu30) null, (Function0) null, (Function0) null, (String) null, (otf0) null, 8182), anm1.N("KeyboardAccessory.CachedResponse", bin.x(new wnb0(f, true), false, null, null, null, function0, 15)), (ipb1) null, b0kVar2, (i4 >> 3) & 14, 8);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qta0(str, g9mVar, function0, j, qim0Var2, l, function1, i);
        }
    }

    public static final void f(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1188384862);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131957002);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(32.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            cvx cvxVar6 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarJ, 16.0f, 8.0f, 16.0f, 4.0f);
            cvx cvxVar7 = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            uwo1.e(str == null ? "" : str, anm1.N("KeyboardAccessory.CachedResponseAge", new wnb0(1.0f, true)), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            qim0 qim0VarN = anm1.N("KeyboardAccessory.NewChatButton", uyn1.B(bin.x(j9k1.x(qim0Var3, new ac8(3, (byte) 16)), false, strO0, new pm31(0), null, function0, 9), 16.0f, 12.0f, 16.0f, 0.0f, 8));
            cvx cvxVar8 = cbx.b(x340Var).b;
            jw31 jw31VarA2 = ew31.a(new d36(6.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            ylx ylxVar = ylx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(ylxVar, isl.a, u291.r(qim0Var3, 12.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, ylx.d | 48, 48);
            uwo1.e(cwl1.o0(x340Var, 2131957001), null, cbx.d(x340Var).k, cbx.a(x340Var).b.b, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o82(str, function0, qim0Var2, i, (byte) 8);
        }
    }

    public static final void g(String str, String str2, long j, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(420876569);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, cjc0Var, 0, null, x340Var, i2 & 14, 0, 1714);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 4.0f));
            wsx wsxVar = wsx.c;
            long j2 = cbx.a(x340Var).c.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsxVar, isl.a, u291.r(nim0Var, 12.0f), j2, 0L, false, x340Var, wsx.d | 48, 48);
            x340Var.r(true);
            uwo1.e(str2, null, cbx.d(x340Var).j, j, null, null, 2, false, new cjc0(1), 0, null, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 7168), 0, 1714);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cg6((Object) str, (Object) str2, j, (Object) qim0Var, i, (byte) 7);
        }
    }

    public static final void h(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(613037860);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            wro1.h(new gbx(new y50("Retry"), function0), ldx.c, null, null, null, null, false, null, null, vmi.a, x340Var, 0, 6, 1020);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1(function0, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:49:0x013a  */
    /* JADX WARN: Code duplicated, block: B:50:0x013e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0199  */
    /* JADX WARN: Code duplicated, block: B:54:0x019d  */
    /* JADX WARN: Code duplicated, block: B:56:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void i(int i, int i2, Function0 function0, b0k b0kVar, boolean z) {
        int i3;
        boolean z2;
        boolean z3;
        Function0 function1;
        h311 h311VarV;
        boolean z4;
        String strO0;
        Object objT;
        m4c m4cVar;
        idn0 idn0Var;
        long jA;
        nim0 nim0Var;
        qim0 qim0VarA;
        boolean zG;
        Object objT2;
        long j;
        boolean z5;
        gra graVar;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z6;
        n4k n4kVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1789856192);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i4 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                strO0 = cwl1.o0(x340Var, 2131956999);
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                idn0Var = (idn0) objT;
                if (((Boolean) k1u.m(idn0Var, x340Var, 0).getValue()).booleanValue()) {
                    x340Var.i0(413487021);
                    uwr uwrVar = cbx.a;
                    jA = cbx.a(x340Var).a.b.b();
                    x340Var.r(false);
                } else {
                    x340Var.i0(413545518);
                    uwr uwrVar2 = cbx.a;
                    jA = cbx.a(x340Var).a.b.a();
                    x340Var.r(false);
                }
                nim0Var = nim0.a;
                if (z4) {
                    x340Var.i0(413640502);
                    mta mtaVar = cbx.b(x340Var).d;
                    qim0VarA = u291.r(nim0Var, 32.0f);
                    x340Var.r(false);
                } else {
                    x340Var.i0(413724233);
                    x340Var.r(false);
                    qim0VarA = u291.a(nim0Var, 48.0f, 48.0f);
                }
                zG = x340Var.g(strO0);
                objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new ry40(strO0, (byte) 24);
                    x340Var.s0(objT2);
                }
                j = jA;
                z5 = z4;
                qim0 qim0VarN = anm1.N("KeyboardAccessory.ExpandButton", bin.v(s161.b(qim0VarA, false, (iu30) objT2), idn0Var, new vch(vno1.o((hw61) ((yf) kdx.c).b, x340Var, 0)), false, null, new pm31(0), function0, 12));
                graVar = een.h;
                gfh0VarC = t1c.c(graVar, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarN);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z6 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z6) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                mta mtaVar2 = cbx.b(x340Var).d;
                qim0 qim0VarF = dug.f(i1p1.q(u291.r(nim0Var, 32.0f), er31.a), j, d4o1.a);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarX = uyn1.x(qim0VarF, 4.0f);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                inx inxVar = inx.c;
                zov0 zov0Var = cbx.b(x340Var).g;
                function1 = function0;
                w0h1.a(inxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, inx.d | 48, 48);
                x340Var.r(true);
                x340Var.r(true);
                z2 = z5;
            } else {
                function1 = function0;
                x340Var.b0();
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new rta0(i, i2, function1, z2);
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            if (i4 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            strO0 = cwl1.o0(x340Var, 2131956999);
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0Var = (idn0) objT;
            if (((Boolean) k1u.m(idn0Var, x340Var, 0).getValue()).booleanValue()) {
                x340Var.i0(413487021);
                uwr uwrVar3 = cbx.a;
                jA = cbx.a(x340Var).a.b.b();
                x340Var.r(false);
            } else {
                x340Var.i0(413545518);
                uwr uwrVar4 = cbx.a;
                jA = cbx.a(x340Var).a.b.a();
                x340Var.r(false);
            }
            nim0Var = nim0.a;
            if (z4) {
                x340Var.i0(413640502);
                mta mtaVar3 = cbx.b(x340Var).d;
                qim0VarA = u291.r(nim0Var, 32.0f);
                x340Var.r(false);
            } else {
                x340Var.i0(413724233);
                x340Var.r(false);
                qim0VarA = u291.a(nim0Var, 48.0f, 48.0f);
            }
            zG = x340Var.g(strO0);
            objT2 = x340Var.T();
            if (zG) {
                objT2 = new ry40(strO0, (byte) 24);
                x340Var.s0(objT2);
            } else {
                objT2 = new ry40(strO0, (byte) 24);
                x340Var.s0(objT2);
            }
            j = jA;
            z5 = z4;
            qim0 qim0VarN2 = anm1.N("KeyboardAccessory.ExpandButton", bin.v(s161.b(qim0VarA, false, (iu30) objT2), idn0Var, new vch(vno1.o((hw61) ((yf) kdx.c).b, x340Var, 0)), false, null, new pm31(0), function0, 12));
            graVar = een.h;
            gfh0VarC = t1c.c(graVar, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarN2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z6 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z6) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar7);
            nko1.F(x340Var);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar8);
            mta mtaVar4 = cbx.b(x340Var).d;
            qim0 qim0VarF2 = dug.f(i1p1.q(u291.r(nim0Var, 32.0f), er31.a), j, d4o1.a);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarF2, 4.0f);
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar5);
            nko1.H(xos0VarM3, x340Var, lljVar6);
            x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar8);
            inx inxVar2 = inx.c;
            zov0 zov0Var2 = cbx.b(x340Var).g;
            function1 = function0;
            w0h1.a(inxVar2, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, inx.d | 48, 48);
            x340Var.r(true);
            x340Var.r(true);
            z2 = z5;
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rta0(i, i2, function1, z2);
        }
    }

    public static final void j(zv31 zv31Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1838056344);
        int i2 = i | (b0kVar3.g(zv31Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384;
        byte b2 = 0;
        byte b3 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = b0kVar3.g(zv31Var.a);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarJ = u291.j(56.0f, 0.0f, 2, qim0Var3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarN = anm1.N("groupable-device-row", uyn1.y(qim0VarJ, 8.0f, 4.0f));
            String strN0 = cwl1.n0(2131951667, new Object[]{zv31Var.b.a}, b0kVar3);
            boolean zG2 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | b0kVar3.g(ven0Var);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new xvy(iu30Var, zv31Var, ven0Var, (byte) 14);
                b0kVar3.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(strN0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strN0), function0);
            zov0 zov0Var = cbx.b(b0kVar3).g;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, new uvx(0, (pgx) null, 2, new zzq0(12.0f, 6.0f, 12.0f, 6.0f), (zzq0) null, (tvx) null, (hw61) null, 0, new p3v(24.0f), 243), null, false, null, null, gbxVar, null, null, apo.r(-1525728993, new ap50(zv31Var, b2), b0kVar3), null, null, apo.r(1875486113, new nf0(ven0Var, (byte) 4), b0kVar3), null, null, apo.r(-20757596, new ap50(zv31Var, b3), b0kVar3), b0kVar2, 805306432, 196992, 28092);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50((Object) zv31Var, (Object) iu30Var, (Object) qim0Var2, i, (byte) 0);
        }
    }

    public static final void k(boolean z, boolean z2, boolean z3, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        iu30 iu30Var2;
        boolean z4;
        boolean z5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1339084645);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.h(z2) ? 32 : 16) | (x340Var.h(z3) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        if (!x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            function1 = function0;
            iu30Var2 = iu30Var;
            z4 = z3;
            z5 = z2;
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-1014210213);
            function1 = function0;
            d(z2, z3, iu30Var, function1, x340Var, (i2 >> 3) & 8190);
            z5 = z2;
            z4 = z3;
            iu30Var2 = iu30Var;
            x340Var.r(false);
        } else {
            function1 = function0;
            iu30Var2 = iu30Var;
            z4 = z3;
            z5 = z2;
            x340Var.i0(-1014036737);
            p(((i2 >> 6) & 14) | ((i2 >> 9) & 112), function1, x340Var, z4);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ota0(z, z5, z4, iu30Var2, function1, i);
        }
    }

    public static final void l(c380 c380Var, vu30 vu30Var, hfp hfpVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-830525389);
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(hfpVar) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarS = v8r.s(vu30Var, x340Var);
            boolean zG = x340Var.g(hfpVar);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = hfpVar.a(new xd2(ven0VarS, (byte) 12));
                x340Var.s0(objT);
            }
            ot80 ot80Var = new ot80(c380Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            otw.c((pt80) objT, ot80Var, uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, 0.0f, 13), (ipb1) null, x340Var, 0, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(i, (Object) c380Var, (Object) vu30Var, (Object) hfpVar, (Object) qim0Var2, (byte) 15);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void m(String str, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, qim0 qim0Var, lz20 lz20Var, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, Function0 function0, Function0 function1, boolean z6, Function0 function2, xta0 xta0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(634371311);
        int i3 = i2 | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(iu30Var2) ? 256 : 128) | (b0kVar3.i(iu30Var3) ? 2048 : 1024) | 24576 | (b0kVar3.i(lz20Var) ? 131072 : 65536) | (b0kVar3.h(z) ? 1048576 : 524288) | (b0kVar3.e(i == 0 ? -1 : l1d.C(i)) ? 8388608 : 4194304) | (b0kVar3.h(z2) ? 67108864 : 33554432) | (b0kVar3.h(z3) ? 536870912 : 268435456);
        int i4 = 6 | (b0kVar3.h(z5) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(function1) ? 2048 : 1024) | (b0kVar3.h(z6) ? 16384 : 8192) | (b0kVar3.i(function2) ? 131072 : 65536) | (b0kVar3.i(xta0Var) ? 1048576 : 524288);
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 599187) == 599186) ? false : true)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                qim0Var3 = nim0.a;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            int i5 = i3 & 14;
            qim0 qim0Var4 = qim0Var3;
            y7e1 y7e1VarD = c4p1.D(i5, 2, str, b0kVar3);
            boolean zI = (i5 == 4) | b0kVar3.i(y7e1VarD);
            Object objT = b0kVar3.T();
            lnm lnmVar = null;
            if (zI || objT == m4cVar) {
                objT = new woe(str, y7e1VarD, lnmVar, (byte) 2);
                b0kVar3.s0(objT);
            }
            qxd0.t(str, b0kVar3, (vu30) objT);
            boolean zI2 = b0kVar3.i(y7e1VarD) | ((i3 & 896) == 256);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new qy5(y7e1VarD, iu30Var2, (lnm) null, (byte) 7);
                b0kVar3.s0(objT2);
            }
            qxd0.t(y7e1VarD, b0kVar3, (vu30) objT2);
            int i6 = i3 >> 6;
            b0kVar2 = b0kVar3;
            a(y7e1VarD, iu30Var, lz20Var, qim0Var4, z, i, z2, z3, iu30Var3, z4, z5, function0, function1, z6, function2, xta0Var, b0kVar2, (i3 & 112) | ((i3 >> 9) & 896) | 3072 | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (i6 & 29360128) | ((i3 << 15) & 234881024) | 805306368, (i4 >> 3) & 524286);
            qim0Var2 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sta0(str, iu30Var, iu30Var2, iu30Var3, qim0Var2, lz20Var, z, i, z2, z3, z4, z5, function0, function1, z6, function2, xta0Var, i2);
        }
    }

    public static final void n(c380 c380Var, iu30 iu30Var, long j, qim0 qim0Var, boolean z, String str, g9m g9mVar, Function0 function0, Long l, Function0 function1, Function0 function2, c380 c380Var2, lpu lpuVar, iu30 iu30Var2, hfp hfpVar, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1052776049);
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | 3072 | (x340Var.h(z) ? 16384 : 8192) | (x340Var.g(str) ? 131072 : 65536) | (x340Var.i(g9mVar) ? 1048576 : 524288) | (x340Var.i(function0) ? 8388608 : 4194304) | (x340Var.g(l) ? 67108864 : 33554432) | (x340Var.i(function1) ? 536870912 : 268435456);
        int i3 = 196608 | (x340Var.i(function2) ? 4 : 2) | (x340Var.i(c380Var2) ? 32 : 16) | (x340Var.i(lpuVar) ? 256 : 128) | (x340Var.i(iu30Var2) ? 2048 : 1024) | (x340Var.i(hfpVar) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (74899 & i3) == 74898) ? false : true)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            qim0 qim0Var4 = qim0Var3;
            qim0 qim0VarL = bmq0.L(u291.f(qim0Var3, 1.0f), k1o1.q(x340Var), (g6o0) null);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarL);
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
            if (str == null || g9mVar == null) {
                z2 = true;
                if (!z || ((c380Var2.isEmpty() && !(lpuVar.a && c380Var.isEmpty())) || hfpVar == null)) {
                    x340Var.i0(429176272);
                    c(c380Var, iu30Var, null, !(z && (str == null || g9mVar == null)), function2, x340Var, (i2 & 126) | (57344 & (i3 << 12)));
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(428879013);
                    r(c380Var2, lpuVar, iu30Var, iu30Var2, hfpVar, null, x340Var, ((i3 >> 3) & 126) | ((i2 << 3) & 896) | (i3 & 7168) | (57344 & i3));
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(428389089);
                int i4 = i2 >> 9;
                z2 = true;
                e(str, g9mVar, function0, j, null, l, function1, x340Var, ((i2 >> 15) & 1022) | ((i2 << 3) & 7168) | (458752 & i4) | (i4 & 3670016));
                x340Var = x340Var;
                x340Var.r(false);
            }
            j2iVar2 = j2iVar;
            dv20.l(6, j2iVar2, x340Var, z2);
            qim0Var2 = qim0Var4;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tta0(c380Var, iu30Var, j, qim0Var2, z, str, g9mVar, function0, l, function1, function2, c380Var2, lpuVar, iu30Var2, hfpVar, j2iVar2, i);
        }
    }

    public static final void o(qim0 qim0Var, b0k b0kVar, int i) {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(195168374);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            boolean z = x340Var.k(t4k.n) == flb0.a;
            qim0 qim0VarV = u291.v(qim0Var, 40.0f);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarH = u291.h(qim0VarV, 32.0f);
            mmr0[] mmr0VarArr = z ? new mmr0[]{new mmr0(fValueOf2, new u7h(u7h.b(jA, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf, new u7h(jA))} : new mmr0[]{new mmr0(fValueOf2, new u7h(jA)), new mmr0(fValueOf, new u7h(u7h.b(jA, 0.0f, 0.0f, 0.0f, 0.0f, 14)))};
            t1c.a(dug.e(qim0VarH, v9c.k((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length), 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 18);
        }
    }

    public static final void p(int i, Function0 function0, b0k b0kVar, boolean z) {
        int i2;
        jax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2064626073);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new aba0(function0, (byte) 3);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx();
            if (z) {
                x340Var.i0(-951074941);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(-951029123);
                haxVar = new hax(cwl1.o0(x340Var, 2131957008));
                x340Var.r(false);
            }
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarN = anm1.N("KeyboardAccessory.SendButton", u291.r(nim0.a, 32.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            wro1.h(gbxVar, idxVar, qim0VarN, haxVar, gdxVarS, new zzq0(4.0f, 4.0f, 4.0f, 4.0f), false, null, null, kui.b, x340Var, 12582912, 6, 776);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u2y((byte) 4, i, function0, z);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void q(d8a d8aVar, x4a x4aVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        String strO0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1313096566);
        int i2 = i | (x340Var.g(d8aVar) ? 4 : 2) | (x340Var.g(x4aVar) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            c380 c380VarS = null;
            if (d8aVar instanceof c8a) {
                x340Var.i0(834595654);
                strO0 = cwl1.o0(x340Var, ((c8a) d8aVar).a);
                x340Var.r(false);
            } else {
                if (!(d8aVar instanceof b8a)) {
                    throw p3d1.k(x340Var, 834593967, false);
                }
                x340Var.i0(102725235);
                x340Var.r(false);
                strO0 = null;
            }
            wh91 wh91Var = d8aVar instanceof b8a ? new wh91(d8aVar, (byte) 17) : null;
            if (x4aVar == null) {
                x340Var.i0(102922891);
                x340Var.r(false);
            } else {
                x340Var.i0(102922892);
                c380VarS = mqo1.s(new txd1(cwl1.o0(x340Var, x4aVar.a), x4aVar.b));
                x340Var.r(false);
            }
            if (c380VarS == null) {
                c380VarS = fg91.b;
            }
            u1p1.o(l5a.a, qim0Var, 2131233220, strO0, wh91Var, null, null, c380VarS, function0, x340Var, ((i2 >> 6) & 112) | ((i2 << 18) & 234881024), 96);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qth(d8aVar, x4aVar, function0, qim0Var, i, (byte) 2);
        }
    }

    public static final void r(c380 c380Var, lpu lpuVar, iu30 iu30Var, iu30 iu30Var2, hfp hfpVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-892778127);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lpuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(hfpVar) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            String strO0 = cwl1.o0(x340Var, 2131957003);
            boolean zG = x340Var.g(c380Var) | x340Var.g(lpuVar) | x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = xa4.A(strO0, lpuVar, c380Var);
                x340Var.s0(objT);
            }
            c380 c380Var2 = (c380) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new zen0(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            zen0 zen0Var = (zen0) objT2;
            zen0Var.w1(Boolean.valueOf(!c380Var2.isEmpty()));
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            bby bbyVarA = xay.d((ni20) null, (fra) null, 15).a(xay.e(3, (ni20) null));
            ln00 ln00VarA = xay.l(15, (ni20) null).a(xay.f(3, (ni20) null));
            qim0Var = qim0Var2;
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            fq7.h(zen0Var, new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), bbyVarA, ln00VarA, (String) null, apo.r(1398314677, new c9y(c380Var2, iu30Var2, iu30Var, hfpVar, (byte) 9), x340Var), x340Var, 1572870, 16);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var3 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(c380Var, lpuVar, iu30Var, iu30Var2, hfpVar, qim0Var3, i, (byte) 24);
        }
    }

    public static final c0y0 s(Bundle bundle) {
        c0y0 c0y0Var = (c0y0) jhc1.t(bundle, "STATE_KEY_PromptableSectionElement", c0y0.class);
        return c0y0Var == null ? new b0y0("", z6x.a, "") : c0y0Var;
    }

    public static final qim0 t(qim0 qim0Var, boolean z) {
        return zr7.i(qim0Var, new aw1((byte) 2, z));
    }

    public static final String u(String str, String str2) {
        if (ihc1.y0(str2) || ihc1.h0(str, "?si=", false) || ihc1.h0(str, "&si=", false)) {
            return str;
        }
        return str + (ihc1.i0(str, '?') ? '&' : '?') + "si=" + str2;
    }

    public static void v(djl djlVar, yic0 yic0Var, cjl cjlVar) {
        cjlVar.p = -1;
        lhl lhlVar = cjlVar.N;
        lhl lhlVar2 = cjlVar.M;
        lhl lhlVar3 = cjlVar.K;
        lhl lhlVar4 = cjlVar.L;
        lhl lhlVar5 = cjlVar.J;
        cjlVar.q = -1;
        bjl bjlVar = ((cjl) djlVar).U[0];
        bjl bjlVar2 = bjl.d;
        bjl bjlVar3 = bjl.b;
        if (bjlVar != bjlVar3 && cjlVar.U[0] == bjlVar2) {
            int i = lhlVar5.g;
            int iS = djlVar.s() - lhlVar4.g;
            lhlVar5.i = yic0Var.k(lhlVar5);
            lhlVar4.i = yic0Var.k(lhlVar4);
            yic0Var.d(lhlVar5.i, i);
            yic0Var.d(lhlVar4.i, iS);
            cjlVar.p = 2;
            cjlVar.a0 = i;
            int i2 = iS - i;
            cjlVar.W = i2;
            int i3 = cjlVar.d0;
            if (i2 < i3) {
                cjlVar.W = i3;
            }
        }
        if (((cjl) djlVar).U[1] == bjlVar3 || cjlVar.U[1] != bjlVar2) {
            return;
        }
        int i4 = lhlVar3.g;
        int iM = djlVar.m() - lhlVar2.g;
        lhlVar3.i = yic0Var.k(lhlVar3);
        lhlVar2.i = yic0Var.k(lhlVar2);
        yic0Var.d(lhlVar3.i, i4);
        yic0Var.d(lhlVar2.i, iM);
        if (cjlVar.c0 > 0 || cjlVar.i0 == 8) {
            p6a1 p6a1VarK = yic0Var.k(lhlVar);
            lhlVar.i = p6a1VarK;
            yic0Var.d(p6a1VarK, cjlVar.c0 + i4);
        }
        cjlVar.q = 2;
        cjlVar.b0 = i4;
        int i5 = iM - i4;
        cjlVar.X = i5;
        int i6 = cjlVar.e0;
        if (i5 < i6) {
            cjlVar.X = i6;
        }
    }

    public static boolean w(z8 z8Var, Map.Entry entry) {
        Object obj = z8Var.get(entry.getKey());
        Boolean boolValueOf = obj == null ? null : Boolean.valueOf(obj.equals(entry.getValue()));
        if (boolValueOf == null) {
            return entry.getValue() == null && z8Var.containsKey(entry.getKey());
        }
        return boolValueOf.booleanValue();
    }

    public static hwn0 x(Parcel parcel) {
        if (parcel.readInt() != 0) {
            y6r0 serializable = parcel.readSerializable();
            y6r0 y6r0Var = serializable instanceof y6r0 ? serializable : null;
            if (y6r0Var != null) {
                String string = parcel.readString();
                if (string == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Serializable serializable2 = parcel.readSerializable();
                return new hwn0(y6r0Var, new gwn0(string, string2, string3, serializable2 instanceof u8h1 ? (u8h1) serializable2 : null), parcel.readInt() != 0, 4);
            }
            eg.m("Required value was null.");
        }
        return null;
    }

    public static final Section y(iu30 iu30Var) {
        bf51 bf51VarT0 = Section.t0();
        bf51VarT0.getClass();
        iu30Var.invoke(bf51VarT0);
        return bf51VarT0.build();
    }

    public static final boolean z(int i, int i2) {
        return (i & i2) == i2;
    }

    public abstract qh31 D(teb tebVar, e8b0 e8b0Var);
}
