package p;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wqn1 {
    public static final jm a = new jm("NULL", (byte) 5);
    public static final jm b = new jm("UNINITIALIZED", (byte) 5);
    public static final jm c = new jm("DONE", (byte) 5);
    public static b180 d = null;
    public static boolean e = false;
    public static Method f = null;
    public static boolean g = false;
    public static Field h;

    public static final jl50 A(kl50 kl50Var) {
        Object next;
        List list = kl50Var.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            yk50 yk50Var = ((jl50) next2).e;
            if ((yk50Var != null ? yk50Var.c : null) instanceof fl50) {
                arrayList.add(next2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                Long lV = v((jl50) next);
                long jLongValue = lV != null ? lV.longValue() : Long.MIN_VALUE;
                do {
                    Object next3 = it2.next();
                    Long lV2 = v((jl50) next3);
                    long jLongValue2 = lV2 != null ? lV2.longValue() : Long.MIN_VALUE;
                    if (jLongValue < jLongValue2) {
                        next = next3;
                        jLongValue = jLongValue2;
                    }
                } while (it2.hasNext());
            }
        }
        return (jl50) next;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a A[PHI: r5
      0x009a: PHI (r5v17 int) = (r5v15 int), (r5v18 int) binds: [B:36:0x0098, B:32:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    public static final float B(int i, dlv dlvVar, float f2, int i2, Float f3, b0k b0kVar, int i3) {
        int i4;
        boolean zI;
        Object objT;
        m4c m4cVar = fkj0.X;
        boolean zE = ((x340) b0kVar).e(i);
        x340 x340Var = (x340) b0kVar;
        Object objT2 = x340Var.T();
        if (zE || objT2 == m4cVar) {
            objT2 = c97.b(f3 != null ? f3.floatValue() : 1.0f);
            x340Var.s0(objT2);
        }
        o95 o95Var = (o95) objT2;
        Integer numValueOf = Integer.valueOf(i);
        boolean zI2 = ((((57344 & i3) ^ 24576) > 16384 && x340Var.g(f3)) || (i3 & 24576) == 16384) | x340Var.i(o95Var);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            objT3 = new qc5(f3, o95Var, (lnm) null, (byte) 0);
            x340Var.s0(objT3);
        }
        qxd0.t(numValueOf, x340Var, (vu30) objT3);
        Float fValueOf = Float.valueOf(f2);
        boolean zI3 = x340Var.i(o95Var) | ((((i3 & 896) ^ 384) > 256 && x340Var.d(f2)) || (i3 & 384) == 256);
        if (((i3 & 7168) ^ 3072) > 2048) {
            i4 = i2;
            if (!x340Var.e(i4)) {
            }
            zI = zI3 | z | x340Var.i(dlvVar);
            objT = x340Var.T();
            if (zI || objT == m4cVar) {
                rc5 rc5Var = new rc5(o95Var, f2, i4, dlvVar, (lnm) null, (byte) 0);
                x340Var.s0(rc5Var);
                objT = rc5Var;
            }
            qxd0.t(fValueOf, x340Var, (vu30) objT);
            return ((Number) o95Var.e()).floatValue();
        }
        i4 = i2;
        boolean z = (i3 & 3072) == 2048;
        zI = zI3 | z | x340Var.i(dlvVar);
        objT = x340Var.T();
        if (zI) {
            rc5 rc5Var2 = new rc5(o95Var, f2, i4, dlvVar, (lnm) null, (byte) 0);
            x340Var.s0(rc5Var2);
            objT = rc5Var2;
        } else {
            rc5 rc5Var3 = new rc5(o95Var, f2, i4, dlvVar, (lnm) null, (byte) 0);
            x340Var.s0(rc5Var3);
            objT = rc5Var3;
        }
        qxd0.t(fValueOf, x340Var, (vu30) objT);
        return ((Number) o95Var.e()).floatValue();
    }

    public static final xvd C(Map map) {
        return new xvd((Object) map, (byte) 29);
    }

    public static final void a(int i, dlv dlvVar, String str, String str2, float f2, int i2, int i3, Float f3, vu30 vu30Var, b0k b0kVar, int i4) {
        float f4 = f2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(180909099);
        int i5 = (x340Var.i(vu30Var) ? 67108864 : 33554432) | i4 | (x340Var.e(i) ? 4 : 2) | (x340Var.i(dlvVar) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.d(f4) ? 16384 : 8192) | (x340Var.e(i2) ? 131072 : 65536) | (x340Var.e(i3) ? 1048576 : 524288) | (x340Var.g(f3) ? 8388608 : 4194304);
        if (x340Var.Y(i5 & 1, (38347923 & i5) != 38347922)) {
            if (f3 == null && f4 == 1.0f) {
                x340Var.i0(-720653338);
                x340Var.r(false);
            } else {
                x340Var.i0(-720566507);
                int i6 = i5 >> 9;
                float fB = B(i, dlvVar, f4, i3, f3, x340Var, (i5 & 126) | ((i5 >> 6) & 896) | (i6 & 7168) | (i6 & 57344));
                x340Var.r(false);
                f4 = fB;
            }
            boolean z = ((234881024 & i5) == 67108864) | ((i5 & 7168) == 2048) | ((458752 & i5) == 131072);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ic5(vu30Var, str2, i2);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zD = x340Var.d(f4);
            Object objT2 = x340Var.T();
            if (zD || objT2 == m4cVar) {
                objT2 = new jc5((byte) 0, f4);
                x340Var.s0(objT2);
            }
            adg.a((i5 >> 6) & 14, str, function0, x340Var, i541.C(nim0.a, (iu30) objT2));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kc5(i, dlvVar, str, str2, f2, i2, i3, f3, vu30Var, i4);
        }
    }

    public static final void b(String str, qim0 qim0Var, boolean z, lee1 lee1Var, long j, dlv dlvVar, iu30 iu30Var, int i, int i2, List list, b0k b0kVar, int i3) {
        b0k b0kVar2;
        int i4;
        int i5;
        List list2;
        List listM;
        int i6;
        int i7;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(447130035);
        int i8 = (b0kVar3.g(str) ? 4 : 2) | i3 | (b0kVar3.i(qim0Var) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i8 |= b0kVar3.h(z) ? 256 : 128;
        }
        int i9 = i8 | (b0kVar3.i(lee1Var) ? 2048 : 1024) | (b0kVar3.f(j) ? 16384 : 8192) | (b0kVar3.i(dlvVar) ? 131072 : 65536) | (b0kVar3.i(iu30Var) ? 1048576 : 524288) | 918552576;
        if (b0kVar3.Y(i9 & 1, (306783379 & i9) != 306783378)) {
            b0kVar3.d0();
            if ((i3 & 1) == 0 || b0kVar3.E()) {
                listM = p7h.M(new Float[]{Float.valueOf(0.0f), Float.valueOf(0.33f), Float.valueOf(0.66f)});
                i6 = 250;
                i7 = 40;
            } else {
                b0kVar3.b0();
                i6 = i;
                i7 = i2;
                listM = list;
            }
            b0kVar3.s();
            boolean z2 = (i9 & 3670016) == 1048576;
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = new sm(iu30Var, (byte) 8);
                b0kVar3.s0(objT);
            }
            int i10 = (i9 & 14) | ((i9 >> 3) & 112) | ((i9 << 6) & 7168);
            int i11 = i9 << 3;
            b0kVar2 = b0kVar3;
            c(str, z, (vu30) objT, qim0Var, lee1Var, j, dlvVar, i6, i7, listM, b0kVar2, i10 | (57344 & i11) | (458752 & i11) | (i11 & 3670016) | 918552576);
            i4 = i6;
            i5 = i7;
            list2 = listM;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            i4 = i;
            i5 = i2;
            list2 = list;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lc5(str, qim0Var, z, lee1Var, j, dlvVar, iu30Var, i4, i5, list2, i3);
        }
    }

    public static final void c(String str, boolean z, vu30 vu30Var, qim0 qim0Var, lee1 lee1Var, long j, dlv dlvVar, int i, int i2, List list, b0k b0kVar, int i3) {
        int i4;
        b0k b0kVar2;
        Boolean bool;
        boolean z2;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-132060945);
        if ((i3 & 6) == 0) {
            i4 = (b0kVar3.g(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar3.i(vu30Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar3.i(lee1Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= b0kVar3.f(j) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= b0kVar3.i(dlvVar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= b0kVar3.e(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= b0kVar3.e(i2) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= b0kVar3.g(list) ? 536870912 : 268435456;
        }
        if (b0kVar3.Y(i4 & 1, (306783379 & i4) != 306783378)) {
            b0kVar3.d0();
            if ((i3 & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            boolean z3 = (i4 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z3 || objT == obj) {
                objT = adg.b(str);
                b0kVar3.s0(objT);
            }
            List list2 = (List) objT;
            int size = list.size();
            int i5 = i4 & 112;
            boolean zG = b0kVar3.g(list2) | (i5 == 32);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == obj) {
                objT2 = bb00.h(z ? -1 : p7h.L(list2), b0kVar3);
            }
            hdn0 hdn0Var = (hdn0) objT2;
            ven0 ven0VarS = v8r.s(Integer.valueOf(i2 < 1 ? 1 : i2), b0kVar3);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = (i5 == 32) | b0kVar3.i(list2) | b0kVar3.i(hdn0Var) | b0kVar3.i(ven0VarS) | b0kVar3.e(size);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == obj) {
                bool = boolValueOf;
                z2 = true;
                mc5 mc5Var = new mc5(z, list2, size, hdn0Var, ven0VarS, (lnm) null);
                list2 = list2;
                b0kVar3.s0(mc5Var);
                objT3 = mc5Var;
            } else {
                bool = boolValueOf;
                z2 = true;
            }
            qxd0.r(list2, list, bool, (vu30) objT3, b0kVar3);
            Object objT4 = b0kVar3.T();
            if (objT4 == obj) {
                objT4 = k74.Y;
                b0kVar3.s0(objT4);
            }
            qim0 qim0VarB = s161.b(qim0Var, z2, (iu30) objT4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            k5p1.d(qim0VarB, new d36(4.0f, z2, new um5(false)), null, null, 0, 0, apo.r(-401247574, new nc5(list2, z, list, j, lee1Var, dlvVar, i, vu30Var, hdn0Var, size), b0kVar3), b0kVar2, 1572864, 60);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oc5(str, z, vu30Var, qim0Var, lee1Var, j, dlvVar, i, i2, list, i3);
        }
    }

    public static final void d(float f2, int i, int i2, int i3, long j, Float f3, String str, b0k b0kVar, dlv dlvVar, lee1 lee1Var) {
        float fB = f2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-723690726);
        int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.i(lee1Var) ? 2048 : 1024) | (x340Var.i(dlvVar) ? 16384 : 8192) | (x340Var.d(fB) ? 131072 : 65536) | (x340Var.e(i2) ? 1048576 : 524288) | (x340Var.g(f3) ? 8388608 : 4194304);
        if (x340Var.Y(i4 & 1, (i4 & 4793491) != 4793490)) {
            if (f3 == null && fB == 1.0f) {
                x340Var.i0(1265663127);
            } else {
                x340Var.i0(1265749958);
                int i5 = i4 >> 9;
                fB = B(i, dlvVar, fB, i2, f3, x340Var, (i4 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344));
            }
            x340Var.r(false);
            uwo1.e(str, null, lee1Var, u7h.b(j, fB, 0.0f, 0.0f, 0.0f, 14), null, null, 0, false, null, 0, null, x340Var, (i4 >> 3) & 910, 0, 2034);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pc5(i, str, j, lee1Var, dlvVar, f2, i2, f3, i3);
        }
    }

    public static final void e(float f2, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2066363305);
        int i2 = (x340Var.d(f2) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j37((byte) 4, f2);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vyx(f2, qim0Var, j2iVar, i, (byte) 1);
        }
    }

    public static final void f(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1765031171);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new kek0(function0, (byte) 13);
                x340Var.s0(objT);
            }
            qim0 qim0VarY = uyn1.y(bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15), 16.0f, 16.0f);
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var, 54);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            pmx pmxVar = pmx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            qim0 qim0VarN = anm1.N("manage-automatic-invites-devices-icon", u291.r(nim0Var, 24.0f));
            int i3 = pmx.d | 432;
            isl islVar = isl.a;
            w0h1.a(pmxVar, islVar, qim0VarN, j, 0L, false, x340Var, i3, 48);
            uwo1.e(cwl1.o0(x340Var, 2131956911), anm1.N("manage-automatic-invites-title", nim0Var), cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 48, 0, 2032);
            x340Var = x340Var;
            kk0.s(1.0f, true, x340Var);
            w0h1.a(plx.c, islVar, anm1.N("manage-automatic-invites-chevron", u291.r(nim0Var, 16.0f)), cbx.a(x340Var).b.a, 0L, false, x340Var, plx.d | 432, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 20, i, function0, false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(int i, Function0 function0, Function0 function1, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(-422671674, i, x340Var) ? 4 : 2) | i2 | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int iC = l1d.C(i);
            if (iC == 0) {
                x340Var.i0(1842140597);
                f(function0, x340Var, (i3 >> 3) & 14);
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(1842261528);
                i(function1, x340Var, (i3 >> 6) & 14);
                x340Var.r(false);
            } else if (iC == 2) {
                x340Var.i0(1842368912);
                f(function0, x340Var, (i3 >> 3) & 14);
                i(function1, x340Var, (i3 >> 6) & 14);
                x340Var.r(false);
            } else {
                if (iC != 3) {
                    throw p3d1.k(x340Var, -1187503741, false);
                }
                x340Var.i0(1842544062);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k16(i, function0, function1, i2, (byte) 5);
        }
    }

    public static final void h(ysf0 ysf0Var, xtb0 xtb0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        xtb0 xtb0Var2;
        Function0 function1;
        m4c m4cVar = fkj0.X;
        ssf0 ssf0Var = ysf0Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1072826219);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ysf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            xtb0Var2 = xtb0Var;
            i2 |= x340Var.g(xtb0Var2) ? 32 : 16;
        } else {
            xtb0Var2 = xtb0Var;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q(ssf0Var);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z = ssf0Var instanceof ssf0;
            ssf0 ssf0Var2 = z ? ssf0Var : null;
            Integer numValueOf = ssf0Var2 != null ? Integer.valueOf(ssf0Var2.a) : null;
            Object value = ven0Var.getValue();
            ssf0 ssf0Var3 = value instanceof ssf0 ? (ssf0) value : null;
            if (u890.j(numValueOf, ssf0Var3 != null ? Integer.valueOf(ssf0Var3.a) : null)) {
                function1.invoke();
            }
            ssf0 ssf0Var4 = z ? ssf0Var : null;
            Integer numValueOf2 = ssf0Var4 != null ? Integer.valueOf(ssf0Var4.a) : null;
            ssf0 ssf0Var5 = z ? ssf0Var : null;
            Boolean boolValueOf = ssf0Var5 != null ? Boolean.valueOf(ssf0Var5.b) : null;
            boolean zG = ((i2 & 14) == 4) | ((i2 & 112) == 32) | x340Var.g(watVar) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                hgo0 hgo0Var = new hgo0((byte) 17, ven0Var, ysf0Var, xtb0Var2, watVar, function0, (lnm) null);
                x340Var.s0(hgo0Var);
                objT2 = hgo0Var;
            }
            qxd0.s(numValueOf2, boolValueOf, (vu30) objT2, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(ysf0Var, xtb0Var, function0, i, (byte) 7);
        }
    }

    public static final void i(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-401990200);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new kek0(function0, (byte) 14);
                x340Var.s0(objT);
            }
            qim0 qim0VarY = uyn1.y(bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15), 16.0f, 16.0f);
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var, 54);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            rnx rnxVar = rnx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            qim0 qim0VarN = anm1.N("view-activity-user-icon", u291.r(nim0Var, 24.0f));
            int i3 = rnx.d | 432;
            isl islVar = isl.a;
            w0h1.a(rnxVar, islVar, qim0VarN, j, 0L, false, x340Var, i3, 48);
            uwo1.e(cwl1.o0(x340Var, 2131956918), anm1.N("view-activity-title", nim0Var), cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 48, 0, 2032);
            x340Var = x340Var;
            kk0.s(1.0f, true, x340Var);
            w0h1.a(plx.c, islVar, anm1.N("view-activity-chevron", u291.r(nim0Var, 16.0f)), cbx.a(x340Var).b.a, 0L, false, x340Var, plx.d | 432, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 21, i, function0, false);
        }
    }

    public static final void j(hzm1 hzm1Var, iu30 iu30Var, cgq cgqVar, dgq dgqVar, u911 u911Var, iu30 iu30Var2, ptf1 ptf1Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        cgq cgqVar2;
        dgq dgqVar2;
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-374698899);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(hzm1Var) : b0kVar3.i(hzm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            cgqVar2 = cgqVar;
            i2 |= b0kVar3.i(cgqVar2) ? 256 : 128;
        } else {
            cgqVar2 = cgqVar;
        }
        if ((i & 3072) == 0) {
            dgqVar2 = dgqVar;
            i2 |= b0kVar3.i(dgqVar2) ? 2048 : 1024;
        } else {
            dgqVar2 = dgqVar;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(u911Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (i & 2097152) == 0 ? b0kVar3.g(ptf1Var) : b0kVar3.i(ptf1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.h(z) ? 8388608 : 4194304;
        }
        int i3 = i2 | 100663296;
        if (b0kVar3.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            drq0 drq0Var = hzm1Var.b;
            x811 x811Var = drq0Var.k;
            x811 x811Var2 = x811Var instanceof x811 ? x811Var : null;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = ((i3 & 3670016) == 1048576 || ((i3 & 2097152) != 0 && b0kVar3.i(ptf1Var))) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && b0kVar3.i(hzm1Var))) | ((i3 & 29360128) == 8388608);
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = new h8m1(ptf1Var, hzm1Var, z, (lnm) null);
                b0kVar3.s0(objT);
            }
            qxd0.s(drq0Var, boolValueOf, (vu30) objT, b0kVar3);
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            boolean z3 = x811Var2 != null;
            float fX0 = ((wat) b0kVar3.k(t4k.h)).X0(48.0f);
            uwr uwrVar = cbx.a;
            xpv0 xpv0Var = cbx.c(b0kVar3).c;
            boolean z4 = z3;
            n8b1 n8b1VarL0 = irn1.l0(pto1.q(360, 2, 48.0f), 360.0f, null, 4);
            boolean zG = b0kVar3.g(es41VarC) | b0kVar3.d(fX0) | b0kVar3.g(n8b1VarL0);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new j911(fX0, es41VarC, n8b1VarL0);
                b0kVar3.s0(objT2);
            }
            j911 j911Var = (j911) objT2;
            boolean zG2 = b0kVar3.g(es41VarC) | b0kVar3.d(fX0);
            Object objT3 = b0kVar3.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = yv91.a(new v2c(es41VarC, fX0));
                b0kVar3.s0(objT3);
            }
            tob1 tob1Var = (tob1) objT3;
            x811 x811Var3 = x811Var2;
            qim0 qim0Var3 = nim0.a;
            uxy0 uxy0Var = new uxy0(tob1Var, z4 ? bmq0.L(qim0Var3, j911Var, (g6o0) null) : qim0Var3, (byte) 13);
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            irn1.u(null, apo.r(-1165806310, new wyy0(x811Var3, uxy0Var, es41VarC, dgqVar2, u911Var, iu30Var2, (byte) 25), b0kVar3), null, null, apo.r(-735508204, new pih(hzm1Var, iu30Var, es41VarC, cgqVar2, u911Var, iu30Var2, uxy0Var), b0kVar3), b0kVar2, 24624, 13);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ob8(hzm1Var, iu30Var, cgqVar, dgqVar, u911Var, iu30Var2, ptf1Var, z, qim0Var2, i);
        }
    }

    public static final String l(Intent intent) {
        return r("watchFeed", intent);
    }

    public static final float m(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final String n(String str) {
        return String.format("%s%s", Arrays.copyOf(new Object[]{"spotify-video://", str}, 2));
    }

    public static String o(d4d d4dVar, Integer num, List list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) d4dVar.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) d4dVar.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    public static boolean p(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = b8k1.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        a8k1 a8k1VarA = a8k1.a(view);
        WeakReference weakReference2 = a8k1VarA.c;
        if (weakReference2 == null || weakReference2.get() != keyEvent) {
            a8k1VarA.c = new WeakReference(keyEvent);
            SparseArray sparseArray = a8k1VarA.b;
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                a8k1VarA.b = sparseArray;
            }
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                sparseArray.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference != null) {
                View view2 = (View) weakReference.get();
                if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(2131431212)) == null || (size = arrayList.size() - 1) < 0) {
                    return true;
                }
                arrayList.get(size).getClass();
                bhn0.d();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fe  */
    public static boolean q(dpa0 dpa0Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue;
        if (dpa0Var != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                return dpa0Var.w(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!e) {
                            try {
                                f = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            e = true;
                        }
                        Method method = f;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else {
                            zBooleanValue = false;
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                WeakHashMap weakHashMap = b8k1.a;
                if (Build.VERSION.SDK_INT < 28 ? a8k1.a(decorView).b(decorView, keyEvent) : false) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (!(callback instanceof Dialog)) {
                if (view != null) {
                    WeakHashMap weakHashMap2 = b8k1.a;
                    if (!(i >= 28 ? false : a8k1.a(view).b(view, keyEvent))) {
                        if (dpa0Var.w(keyEvent)) {
                        }
                    }
                } else if (dpa0Var.w(keyEvent)) {
                }
                return true;
            }
            Dialog dialog = (Dialog) callback;
            if (!g) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    h = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                g = true;
            }
            Field field = h;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused4) {
                    onKeyListener = null;
                }
            } else {
                onKeyListener = null;
            }
            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            WeakHashMap weakHashMap3 = b8k1.a;
            if (Build.VERSION.SDK_INT < 28 ? a8k1.a(decorView2).b(decorView2, keyEvent) : false) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        return false;
    }

    public static final String r(String str, Intent intent) {
        Set set = s4b1.f;
        return uic.x(intent.getDataString()).n(str);
    }

    public static final t6e0 s(bbr0 bbr0Var) {
        return new t6e0(bbr0Var, (byte) 1);
    }

    public static final mre0 t(bbr0 bbr0Var) {
        return new mre0(bbr0Var, (byte) 26);
    }

    public static final m4e0 u(bbr0 bbr0Var) {
        return new m4e0(bbr0Var, (byte) 27);
    }

    public static final Long v(jl50 jl50Var) {
        yk50 yk50Var = jl50Var.e;
        hl50 hl50Var = yk50Var != null ? yk50Var.c : null;
        fl50 fl50Var = hl50Var instanceof fl50 ? (fl50) hl50Var : null;
        if (fl50Var != null) {
            return fl50Var.a;
        }
        return null;
    }

    public static final String w(String str) {
        if (y(str)) {
            return nhc1.W(str, "spotify-video://", "");
        }
        return null;
    }

    public static final u8h1 x(bbr0 bbr0Var) {
        u8h1 u8h1Var;
        bn70 bn70VarA = bbr0Var.b0(bn70.class).a();
        if (bn70VarA != null && (u8h1Var = bn70VarA.d) != null) {
            return u8h1Var;
        }
        zh10 zh10VarA = bbr0Var.b0(zh10.class).a();
        return zh10VarA != null ? zh10VarA.c : (u8h1) e8h1.b.b;
    }

    public static final boolean y(String str) {
        return nhc1.Y(str, "spotify-video://", false);
    }

    public static final YourLibraryRequest z(rsm1 rsm1Var, ksm1... ksm1VarArr) {
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        hvm1VarQ.q(true);
        hvm1VarQ.w();
        hvm1VarQ.C(Integer.MAX_VALUE);
        qsm1 qsm1VarN = YourLibraryConfig.YourLibrarySortOrder.n();
        qsm1VarN.n(rsm1Var);
        hvm1VarQ.I(qsm1VarN.build());
        jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
        jsm1VarR.q(ksm1.d);
        for (ksm1 ksm1Var : ksm1VarArr) {
            jsm1VarR.q(ksm1Var);
        }
        hvm1VarQ.u(jsm1VarR.build());
        gvm1VarO.n(hvm1VarQ);
        return gvm1VarO.build();
    }
}
