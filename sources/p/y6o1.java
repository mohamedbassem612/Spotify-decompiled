package p;

import com.google.android.gms.internal.wearable.zzcm;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class y6o1 {
    public static final y1x0 a;

    static {
        int i = asn1.a;
        a = new y1x0((byte) 25);
    }

    public static int A(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (vun1.q(i << 3) + 4) * size;
    }

    public static int B(List list) {
        return list.size() * 8;
    }

    public static int C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (vun1.q(i << 3) + 8) * size;
    }

    public static int D(int i, qrn1 qrn1Var, r6o1 r6o1Var) {
        int iQ = vun1.q(i << 3);
        return qrn1Var.a(r6o1Var) + iQ + iQ;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    public static void b(Object obj, Object obj2) {
        vyn1 vyn1Var = (vyn1) obj;
        n8o1 n8o1Var = vyn1Var.zzc;
        n8o1 n8o1Var2 = ((vyn1) obj2).zzc;
        n8o1 n8o1Var3 = n8o1.f;
        if (!n8o1Var3.equals(n8o1Var2)) {
            if (n8o1Var3.equals(n8o1Var)) {
                int i = n8o1Var.a + n8o1Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(n8o1Var.b, i);
                System.arraycopy(n8o1Var2.b, 0, iArrCopyOf, n8o1Var.a, n8o1Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(n8o1Var.c, i);
                System.arraycopy(n8o1Var2.c, 0, objArrCopyOf, n8o1Var.a, n8o1Var2.a);
                n8o1Var = new n8o1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                n8o1Var.getClass();
                if (!n8o1Var2.equals(n8o1Var3)) {
                    if (!n8o1Var.e) {
                        k220.c();
                        return;
                    }
                    int i2 = n8o1Var.a + n8o1Var2.a;
                    n8o1Var.f(i2);
                    System.arraycopy(n8o1Var2.b, 0, n8o1Var.b, n8o1Var.a, n8o1Var2.a);
                    System.arraycopy(n8o1Var2.c, 0, n8o1Var.c, n8o1Var.a, n8o1Var2.a);
                    n8o1Var.a = i2;
                }
            }
        }
        vyn1Var.zzc = n8o1Var;
    }

    public static Object c(Object obj, int i, c0o1 c0o1Var, rgp1 rgp1Var, Object obj2, y1x0 y1x0Var) {
        if (rgp1Var == null) {
            return obj2;
        }
        if (c0o1Var == null) {
            Iterator it = c0o1Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!rgp1.a(iIntValue)) {
                    obj2 = d(obj, i, iIntValue, obj2, y1x0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = c0o1Var.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) c0o1Var.get(i3);
            int iIntValue2 = num.intValue();
            if (rgp1.a(iIntValue2)) {
                if (i3 != i2) {
                    c0o1Var.set(i2, num);
                }
                i2++;
            } else {
                obj2 = d(obj, i, iIntValue2, obj2, y1x0Var);
            }
        }
        if (i2 != size) {
            c0o1Var.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object d(Object obj, int i, int i2, Object obj2, y1x0 y1x0Var) {
        n8o1 n8o1Var;
        Object obj3 = obj2;
        if (obj2 == null) {
            y1x0Var.getClass();
            vyn1 vyn1Var = (vyn1) obj;
            n8o1Var = vyn1Var.zzc;
            if (n8o1Var == n8o1.f) {
                obj3 = n8o1Var;
                n8o1 n8o1VarA = n8o1.a();
                vyn1Var.zzc = n8o1VarA;
                obj3 = n8o1VarA;
            }
        }
        obj3 = n8o1Var;
        y1x0Var.getClass();
        ((n8o1) obj3).e(i << 3, Long.valueOf(i2));
        return obj3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void e(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        if (list instanceof uvn1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vun1Var.f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        vun1Var.l(i3);
        while (i2 < list.size()) {
            vun1Var.o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void f(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        int i2 = 0;
        if (!(list instanceof kxn1)) {
            if (!z) {
                while (i2 < list.size()) {
                    vun1Var.d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            vun1Var.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            vun1Var.l(i3);
            while (i2 < list.size()) {
                vun1Var.m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        kxn1 kxn1Var = (kxn1) list;
        if (!z) {
            while (i2 < kxn1Var.c) {
                vun1Var.d(i, Float.floatToRawIntBits(kxn1Var.e(i2)));
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kxn1Var.c; i6++) {
            kxn1Var.e(i6);
            i5 += 4;
        }
        vun1Var.l(i5);
        while (i2 < kxn1Var.c) {
            vun1Var.m(Float.floatToRawIntBits(kxn1Var.e(i2)));
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void g(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        int i2 = 0;
        if (!(list instanceof r2o1)) {
            if (!z) {
                while (i2 < list.size()) {
                    vun1Var.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            vun1Var.a(i, 2);
            int iR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iR += vun1.r(((Long) list.get(i3)).longValue());
            }
            vun1Var.l(iR);
            while (i2 < list.size()) {
                vun1Var.n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        r2o1 r2o1Var = (r2o1) list;
        if (!z) {
            while (i2 < r2o1Var.c) {
                vun1Var.e(i, r2o1Var.e(i2));
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int iR2 = 0;
        for (int i4 = 0; i4 < r2o1Var.c; i4++) {
            iR2 += vun1.r(r2o1Var.e(i4));
        }
        vun1Var.l(iR2);
        while (i2 < r2o1Var.c) {
            vun1Var.n(r2o1Var.e(i2));
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void h(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        int i2 = 0;
        if (!(list instanceof r2o1)) {
            if (!z) {
                while (i2 < list.size()) {
                    vun1Var.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            vun1Var.a(i, 2);
            int iR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iR += vun1.r(((Long) list.get(i3)).longValue());
            }
            vun1Var.l(iR);
            while (i2 < list.size()) {
                vun1Var.n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        r2o1 r2o1Var = (r2o1) list;
        if (!z) {
            while (i2 < r2o1Var.c) {
                vun1Var.e(i, r2o1Var.e(i2));
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int iR2 = 0;
        for (int i4 = 0; i4 < r2o1Var.c; i4++) {
            iR2 += vun1.r(r2o1Var.e(i4));
        }
        vun1Var.l(iR2);
        while (i2 < r2o1Var.c) {
            vun1Var.n(r2o1Var.e(i2));
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void i(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        int i2 = 0;
        if (!(list instanceof r2o1)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    vun1Var.e(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            vun1Var.a(i, 2);
            int iR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iR += vun1.r((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            vun1Var.l(iR);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                vun1Var.n((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        r2o1 r2o1Var = (r2o1) list;
        if (!z) {
            while (i2 < r2o1Var.c) {
                long jE = r2o1Var.e(i2);
                vun1Var.e(i, (jE >> 63) ^ (jE + jE));
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int iR2 = 0;
        for (int i4 = 0; i4 < r2o1Var.c; i4++) {
            long jE2 = r2o1Var.e(i4);
            iR2 += vun1.r((jE2 >> 63) ^ (jE2 + jE2));
        }
        vun1Var.l(iR2);
        while (i2 < r2o1Var.c) {
            long jE3 = r2o1Var.e(i2);
            vun1Var.n((jE3 >> 63) ^ (jE3 + jE3));
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void j(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        int i2 = 0;
        if (!(list instanceof r2o1)) {
            if (!z) {
                while (i2 < list.size()) {
                    vun1Var.f(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            vun1Var.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            vun1Var.l(i3);
            while (i2 < list.size()) {
                vun1Var.o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        r2o1 r2o1Var = (r2o1) list;
        if (!z) {
            while (i2 < r2o1Var.c) {
                vun1Var.f(i, r2o1Var.e(i2));
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < r2o1Var.c; i6++) {
            r2o1Var.e(i6);
            i5 += 8;
        }
        vun1Var.l(i5);
        while (i2 < r2o1Var.c) {
            vun1Var.o(r2o1Var.e(i2));
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void k(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        int i2 = 0;
        if (!(list instanceof r2o1)) {
            if (!z) {
                while (i2 < list.size()) {
                    vun1Var.f(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            vun1Var.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            vun1Var.l(i3);
            while (i2 < list.size()) {
                vun1Var.o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        r2o1 r2o1Var = (r2o1) list;
        if (!z) {
            while (i2 < r2o1Var.c) {
                vun1Var.f(i, r2o1Var.e(i2));
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < r2o1Var.c; i6++) {
            r2o1Var.e(i6);
            i5 += 8;
        }
        vun1Var.l(i5);
        while (i2 < r2o1Var.c) {
            vun1Var.o(r2o1Var.e(i2));
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void l(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        if (list instanceof zyn1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vun1Var.b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += vun1.r(((Integer) list.get(i3)).intValue());
        }
        vun1Var.l(iR);
        while (i2 < list.size()) {
            vun1Var.k(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void m(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        if (list instanceof zyn1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vun1Var.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int iQ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iQ += vun1.q(((Integer) list.get(i3)).intValue());
        }
        vun1Var.l(iQ);
        while (i2 < list.size()) {
            vun1Var.l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void n(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        if (list instanceof zyn1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                vun1Var.c(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int iQ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iQ += vun1.q((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        vun1Var.l(iQ);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            vun1Var.l((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void o(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        if (list instanceof zyn1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vun1Var.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        vun1Var.l(i3);
        while (i2 < list.size()) {
            vun1Var.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void p(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        if (list instanceof zyn1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vun1Var.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        vun1Var.l(i3);
        while (i2 < list.size()) {
            vun1Var.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void q(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        if (list instanceof zyn1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vun1Var.b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += vun1.r(((Integer) list.get(i3)).intValue());
        }
        vun1Var.l(iR);
        while (i2 < list.size()) {
            vun1Var.k(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public static void r(int i, List list, y1t0 y1t0Var, boolean z) throws zzcm {
        if (list == null || list.isEmpty()) {
            return;
        }
        vun1 vun1Var = (vun1) y1t0Var.b;
        if (list instanceof jsn1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vun1Var.g(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        vun1Var.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        vun1Var.l(i3);
        while (i2 < list.size()) {
            vun1Var.j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r2o1)) {
            int iR = 0;
            while (i < size) {
                iR += vun1.r(((Long) list.get(i)).longValue());
                i++;
            }
            return iR;
        }
        r2o1 r2o1Var = (r2o1) list;
        int iR2 = 0;
        while (i < size) {
            iR2 += vun1.r(r2o1Var.e(i));
            i++;
        }
        return iR2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r2o1)) {
            int iR = 0;
            while (i < size) {
                iR += vun1.r(((Long) list.get(i)).longValue());
                i++;
            }
            return iR;
        }
        r2o1 r2o1Var = (r2o1) list;
        int iR2 = 0;
        while (i < size) {
            iR2 += vun1.r(r2o1Var.e(i));
            i++;
        }
        return iR2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r2o1)) {
            int iR = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iR += vun1.r((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iR;
        }
        r2o1 r2o1Var = (r2o1) list;
        int iR2 = 0;
        while (i < size) {
            long jE = r2o1Var.e(i);
            iR2 += vun1.r((jE >> 63) ^ (jE + jE));
            i++;
        }
        return iR2;
    }

    public static int v(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zyn1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += vun1.r(((Integer) list.get(i)).intValue());
        }
        return iR;
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zyn1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += vun1.r(((Integer) list.get(i)).intValue());
        }
        return iR;
    }

    public static int x(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zyn1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iQ = 0;
        for (int i = 0; i < size; i++) {
            iQ += vun1.q(((Integer) list.get(i)).intValue());
        }
        return iQ;
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zyn1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iQ = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iQ += vun1.q((iIntValue >> 31) ^ (iIntValue + iIntValue));
        }
        return iQ;
    }

    public static int z(List list) {
        return list.size() * 4;
    }
}
