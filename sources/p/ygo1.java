package p;

import com.google.android.gms.internal.play_billing.zzfa;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ygo1 {
    public static final fen1 a;

    static {
        int i = z3o1.a;
        a = new fen1();
    }

    public static void a(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        if (list instanceof tdo1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x6o1Var.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        x6o1Var.l(i3);
        while (i2 < list.size()) {
            x6o1Var.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void b(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        int i2 = 0;
        if (!(list instanceof mao1)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    x6o1Var.k(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            x6o1Var.j(i, 2);
            int iO = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iO += x6o1.o((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            x6o1Var.l(iO);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                x6o1Var.l((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        mao1 mao1Var = (mao1) list;
        if (!z) {
            while (i2 < mao1Var.c) {
                int iZze = mao1Var.zze(i2);
                x6o1Var.k(i, (iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int iO2 = 0;
        for (int i4 = 0; i4 < mao1Var.c; i4++) {
            int iZze2 = mao1Var.zze(i4);
            iO2 += x6o1.o((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        x6o1Var.l(iO2);
        while (i2 < mao1Var.c) {
            int iZze3 = mao1Var.zze(i2);
            x6o1Var.l((iZze3 >> 31) ^ (iZze3 + iZze3));
            i2++;
        }
    }

    public static void c(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        if (list instanceof tdo1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                x6o1Var.m(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iP += x6o1.p((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        x6o1Var.l(iP);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            x6o1Var.n((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void d(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        int i2 = 0;
        if (!(list instanceof mao1)) {
            if (!z) {
                while (i2 < list.size()) {
                    x6o1Var.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            x6o1Var.j(i, 2);
            int iO = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO += x6o1.o(((Integer) list.get(i3)).intValue());
            }
            x6o1Var.l(iO);
            while (i2 < list.size()) {
                x6o1Var.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mao1 mao1Var = (mao1) list;
        if (!z) {
            while (i2 < mao1Var.c) {
                x6o1Var.k(i, mao1Var.zze(i2));
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int iO2 = 0;
        for (int i4 = 0; i4 < mao1Var.c; i4++) {
            iO2 += x6o1.o(mao1Var.zze(i4));
        }
        x6o1Var.l(iO2);
        while (i2 < mao1Var.c) {
            x6o1Var.l(mao1Var.zze(i2));
            i2++;
        }
    }

    public static void e(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        if (list instanceof tdo1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x6o1Var.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iP += x6o1.p(((Long) list.get(i3)).longValue());
        }
        x6o1Var.l(iP);
        while (i2 < list.size()) {
            x6o1Var.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mao1)) {
            int iP = 0;
            while (i < size) {
                iP += x6o1.p(((Integer) list.get(i)).intValue());
                i++;
            }
            return iP;
        }
        mao1 mao1Var = (mao1) list;
        int iP2 = 0;
        while (i < size) {
            iP2 += x6o1.p(mao1Var.zze(i));
            i++;
        }
        return iP2;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x6o1.o(i << 3) + 4) * size;
    }

    public static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x6o1.o(i << 3) + 8) * size;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mao1)) {
            int iP = 0;
            while (i < size) {
                iP += x6o1.p(((Integer) list.get(i)).intValue());
                i++;
            }
            return iP;
        }
        mao1 mao1Var = (mao1) list;
        int iP2 = 0;
        while (i < size) {
            iP2 += x6o1.p(mao1Var.zze(i));
            i++;
        }
        return iP2;
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof tdo1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iP = 0;
        for (int i = 0; i < size; i++) {
            iP += x6o1.p(((Long) list.get(i)).longValue());
        }
        return iP;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mao1)) {
            int iO = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iO += x6o1.o((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iO;
        }
        mao1 mao1Var = (mao1) list;
        int iO2 = 0;
        while (i < size) {
            int iZze = mao1Var.zze(i);
            iO2 += x6o1.o((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iO2;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof tdo1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iP = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iP += x6o1.p((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iP;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mao1)) {
            int iO = 0;
            while (i < size) {
                iO += x6o1.o(((Integer) list.get(i)).intValue());
                i++;
            }
            return iO;
        }
        mao1 mao1Var = (mao1) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += x6o1.o(mao1Var.zze(i));
            i++;
        }
        return iO2;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof tdo1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iP = 0;
        for (int i = 0; i < size; i++) {
            iP += x6o1.p(((Long) list.get(i)).longValue());
        }
        return iP;
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
    public static void p(Object obj, Object obj2) {
        iao1 iao1Var = (iao1) obj;
        cjo1 cjo1Var = iao1Var.zzc;
        cjo1 cjo1Var2 = ((iao1) obj2).zzc;
        cjo1 cjo1Var3 = cjo1.f;
        if (!cjo1Var3.equals(cjo1Var2)) {
            if (cjo1Var3.equals(cjo1Var)) {
                int i = cjo1Var.a + cjo1Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(cjo1Var.b, i);
                System.arraycopy(cjo1Var2.b, 0, iArrCopyOf, cjo1Var.a, cjo1Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(cjo1Var.c, i);
                System.arraycopy(cjo1Var2.c, 0, objArrCopyOf, cjo1Var.a, cjo1Var2.a);
                cjo1Var = new cjo1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                cjo1Var.getClass();
                if (!cjo1Var2.equals(cjo1Var3)) {
                    if (!cjo1Var.e) {
                        k220.c();
                        return;
                    }
                    int i2 = cjo1Var.a + cjo1Var2.a;
                    cjo1Var.e(i2);
                    System.arraycopy(cjo1Var2.b, 0, cjo1Var.b, cjo1Var.a, cjo1Var2.a);
                    System.arraycopy(cjo1Var2.c, 0, cjo1Var.c, cjo1Var.a, cjo1Var2.a);
                    cjo1Var.a = i2;
                }
            }
        }
        iao1Var.zzc = cjo1Var;
    }

    public static void q(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        if (list instanceof m4o1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                x6o1Var.l(i << 3);
                x6o1Var.a(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        x6o1Var.l(i3);
        while (i2 < list.size()) {
            x6o1Var.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void r(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        if (list instanceof z7o1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x6o1Var.f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        x6o1Var.l(i3);
        while (i2 < list.size()) {
            x6o1Var.g(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void s(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        int i2 = 0;
        if (!(list instanceof mao1)) {
            if (!z) {
                while (i2 < list.size()) {
                    x6o1Var.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            x6o1Var.j(i, 2);
            int iP = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iP += x6o1.p(((Integer) list.get(i3)).intValue());
            }
            x6o1Var.l(iP);
            while (i2 < list.size()) {
                x6o1Var.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mao1 mao1Var = (mao1) list;
        if (!z) {
            while (i2 < mao1Var.c) {
                x6o1Var.h(i, mao1Var.zze(i2));
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int iP2 = 0;
        for (int i4 = 0; i4 < mao1Var.c; i4++) {
            iP2 += x6o1.p(mao1Var.zze(i4));
        }
        x6o1Var.l(iP2);
        while (i2 < mao1Var.c) {
            x6o1Var.i(mao1Var.zze(i2));
            i2++;
        }
    }

    public static void t(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        int i2 = 0;
        if (!(list instanceof mao1)) {
            if (!z) {
                while (i2 < list.size()) {
                    x6o1Var.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            x6o1Var.j(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            x6o1Var.l(i3);
            while (i2 < list.size()) {
                x6o1Var.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mao1 mao1Var = (mao1) list;
        if (!z) {
            while (i2 < mao1Var.c) {
                x6o1Var.d(i, mao1Var.zze(i2));
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < mao1Var.c; i6++) {
            mao1Var.zze(i6);
            i5 += 4;
        }
        x6o1Var.l(i5);
        while (i2 < mao1Var.c) {
            x6o1Var.e(mao1Var.zze(i2));
            i2++;
        }
    }

    public static void u(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        if (list instanceof tdo1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x6o1Var.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        x6o1Var.l(i3);
        while (i2 < list.size()) {
            x6o1Var.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void v(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        if (list instanceof k9o1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x6o1Var.d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        x6o1Var.l(i3);
        while (i2 < list.size()) {
            x6o1Var.e(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void w(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        int i2 = 0;
        if (!(list instanceof mao1)) {
            if (!z) {
                while (i2 < list.size()) {
                    x6o1Var.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            x6o1Var.j(i, 2);
            int iP = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iP += x6o1.p(((Integer) list.get(i3)).intValue());
            }
            x6o1Var.l(iP);
            while (i2 < list.size()) {
                x6o1Var.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mao1 mao1Var = (mao1) list;
        if (!z) {
            while (i2 < mao1Var.c) {
                x6o1Var.h(i, mao1Var.zze(i2));
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int iP2 = 0;
        for (int i4 = 0; i4 < mao1Var.c; i4++) {
            iP2 += x6o1.p(mao1Var.zze(i4));
        }
        x6o1Var.l(iP2);
        while (i2 < mao1Var.c) {
            x6o1Var.i(mao1Var.zze(i2));
            i2++;
        }
    }

    public static void x(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        if (list instanceof tdo1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x6o1Var.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iP += x6o1.p(((Long) list.get(i3)).longValue());
        }
        x6o1Var.l(iP);
        while (i2 < list.size()) {
            x6o1Var.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void y(int i, List list, qeh1 qeh1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        int i2 = 0;
        if (!(list instanceof mao1)) {
            if (!z) {
                while (i2 < list.size()) {
                    x6o1Var.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            x6o1Var.j(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            x6o1Var.l(i3);
            while (i2 < list.size()) {
                x6o1Var.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mao1 mao1Var = (mao1) list;
        if (!z) {
            while (i2 < mao1Var.c) {
                x6o1Var.d(i, mao1Var.zze(i2));
                i2++;
            }
            return;
        }
        x6o1Var.j(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < mao1Var.c; i6++) {
            mao1Var.zze(i6);
            i5 += 4;
        }
        x6o1Var.l(i5);
        while (i2 < mao1Var.c) {
            x6o1Var.e(mao1Var.zze(i2));
            i2++;
        }
    }
}
