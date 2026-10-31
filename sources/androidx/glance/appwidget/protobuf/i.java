package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import java.util.List;
import p.bhn0;
import p.cr80;
import p.f290;
import p.fp8;
import p.k220;
import p.liy0;
import p.owg;
import p.pze0;
import p.r4f0;
import p.squ;
import p.wq20;
import p.xob;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class i {
    public static final Class a;
    public static final j b;
    public static final l c;

    static {
        Class<?> cls;
        Class<?> cls2;
        liy0 liy0Var = liy0.c;
        j jVar = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            liy0 liy0Var2 = liy0.c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                jVar = (j) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = jVar;
        c = new l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cr80) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM0 = 0;
        for (int i = 0; i < size; i++) {
            iM0 += owg.m0(((Integer) list.get(i)).intValue());
        }
        return iM0;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (owg.k0(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (owg.k0(i) + 8) * size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cr80) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM0 = 0;
        for (int i = 0; i < size; i++) {
            iM0 += owg.m0(((Integer) list.get(i)).intValue());
        }
        return iM0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof r4f0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM0 = 0;
        for (int i = 0; i < size; i++) {
            iM0 += owg.m0(((Long) list.get(i)).longValue());
        }
        return iM0;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof cr80)) {
                int iL0 = 0;
                for (int i = 0; i < size; i++) {
                    int iIntValue = ((Integer) list.get(i)).intValue();
                    iL0 += owg.l0((iIntValue >> 31) ^ (iIntValue << 1));
                }
                return iL0;
            }
            pze0.m(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof r4f0)) {
                int iM0 = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iM0 += owg.m0((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iM0;
            }
            pze0.m(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cr80) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iL0 = 0;
        for (int i = 0; i < size; i++) {
            iL0 += owg.l0(((Integer) list.get(i)).intValue());
        }
        return iL0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof r4f0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM0 = 0;
        for (int i = 0; i < size; i++) {
            iM0 += owg.m0(((Long) list.get(i)).longValue());
        }
        return iM0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(j jVar, Object obj, Object obj2) {
        ((l) jVar).getClass();
        e eVar = (e) obj;
        k kVar = eVar.unknownFields;
        k kVar2 = ((e) obj2).unknownFields;
        k kVar3 = k.f;
        if (!kVar3.equals(kVar2)) {
            if (kVar3.equals(kVar)) {
                int i = kVar.a + kVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(kVar.b, i);
                System.arraycopy(kVar2.b, 0, iArrCopyOf, kVar.a, kVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(kVar.c, i);
                System.arraycopy(kVar2.c, 0, objArrCopyOf, kVar.a, kVar2.a);
                kVar = new k(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                kVar.getClass();
                if (!kVar2.equals(kVar3)) {
                    if (!kVar.e) {
                        k220.c();
                        return;
                    }
                    int i2 = kVar.a + kVar2.a;
                    kVar.a(i2);
                    System.arraycopy(kVar2.b, 0, kVar.b, kVar.a, kVar2.a);
                    System.arraycopy(kVar2.c, 0, kVar.c, kVar.a, kVar2.a);
                    kVar.a = i2;
                }
            }
        }
        eVar.unknownFields = kVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof xob) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.q0(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        owgVar.C0(i3);
        while (i2 < list.size()) {
            byte b2 = ((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0;
            if (owgVar.u == owgVar.t) {
                owgVar.n0();
            }
            byte[] bArr = owgVar.s;
            int i5 = owgVar.u;
            owgVar.u = i5 + 1;
            bArr[i5] = b2;
            i2++;
        }
    }

    public static void n(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof squ) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.u0(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        owgVar.C0(i3);
        while (i2 < list.size()) {
            owgVar.v0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof cr80) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.w0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int iM0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM0 += owg.m0(((Integer) list.get(i3)).intValue());
        }
        owgVar.C0(iM0);
        while (i2 < list.size()) {
            owgVar.x0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof cr80) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.s0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        owgVar.C0(i3);
        while (i2 < list.size()) {
            owgVar.t0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof r4f0) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.u0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        owgVar.C0(i3);
        while (i2 < list.size()) {
            owgVar.v0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof wq20) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.s0(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        owgVar.C0(i3);
        while (i2 < list.size()) {
            owgVar.t0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof cr80) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.w0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int iM0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM0 += owg.m0(((Integer) list.get(i3)).intValue());
        }
        owgVar.C0(iM0);
        while (i2 < list.size()) {
            owgVar.x0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof r4f0) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.D0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int iM0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM0 += owg.m0(((Long) list.get(i3)).longValue());
        }
        owgVar.C0(iM0);
        while (i2 < list.size()) {
            owgVar.E0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof cr80) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.s0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        owgVar.C0(i3);
        while (i2 < list.size()) {
            owgVar.t0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof r4f0) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.u0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        owgVar.C0(i3);
        while (i2 < list.size()) {
            owgVar.v0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof cr80) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                owgVar.B0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int iL0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iL0 += owg.l0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        owgVar.C0(iL0);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            owgVar.C0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof r4f0) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                owgVar.D0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int iM0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM0 += owg.m0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        owgVar.C0(iM0);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            owgVar.E0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof cr80) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.B0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int iL0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL0 += owg.l0(((Integer) list.get(i3)).intValue());
        }
        owgVar.C0(iL0);
        while (i2 < list.size()) {
            owgVar.C0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, fp8 fp8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        owg owgVar = (owg) fp8Var.b;
        if (list instanceof r4f0) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                owgVar.D0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        owgVar.A0(i, 2);
        int iM0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM0 += owg.m0(((Long) list.get(i3)).longValue());
        }
        owgVar.C0(iM0);
        while (i2 < list.size()) {
            owgVar.E0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, f290 f290Var, Object obj2, j jVar) {
        return obj2;
    }
}
