package p;

import com.google.android.gms.internal.cast.zzxo;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wjp1 {
    public static final wbn1 a;

    static {
        int i = wgp1.a;
        a = new wbn1();
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
        cip1 cip1Var = (cip1) obj;
        ubn1 ubn1Var = cip1Var.zzc;
        ubn1 ubn1Var2 = ((cip1) obj2).zzc;
        ubn1 ubn1Var3 = ubn1.e;
        if (!ubn1Var3.equals(ubn1Var2)) {
            if (ubn1Var3.equals(ubn1Var)) {
                ubn1Var.getClass();
                ubn1Var2.getClass();
                int[] iArrCopyOf = Arrays.copyOf(ubn1Var.a, 0);
                System.arraycopy(ubn1Var2.a, 0, iArrCopyOf, 0, 0);
                Object[] objArrCopyOf = Arrays.copyOf(ubn1Var.b, 0);
                System.arraycopy(ubn1Var2.b, 0, objArrCopyOf, 0, 0);
                ubn1Var = new ubn1(iArrCopyOf, objArrCopyOf, true);
            } else {
                ubn1Var.getClass();
                if (!ubn1Var2.equals(ubn1Var3)) {
                    if (!ubn1Var.d) {
                        k220.c();
                        return;
                    } else {
                        System.arraycopy(ubn1Var2.a, 0, ubn1Var.a, 0, 0);
                        System.arraycopy(ubn1Var2.b, 0, ubn1Var.b, 0, 0);
                    }
                }
            }
        }
        cip1Var.zzc = ubn1Var;
    }

    public static void c(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        if (list instanceof khp1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fhp1Var.C(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        fhp1Var.G(i3);
        while (i2 < list.size()) {
            fhp1Var.J(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void d(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof shp1)) {
            if (!z) {
                while (i2 < list.size()) {
                    fhp1Var.A(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            fhp1Var.G(i3);
            while (i2 < list.size()) {
                fhp1Var.H(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        shp1 shp1Var = (shp1) list;
        if (!z) {
            while (i2 < shp1Var.c) {
                shp1Var.c(i2);
                fhp1Var.A(i, Float.floatToRawIntBits(shp1Var.b[i2]));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < shp1Var.c; i6++) {
            shp1Var.c(i6);
            float f = shp1Var.b[i6];
            i5 += 4;
        }
        fhp1Var.G(i5);
        while (i2 < shp1Var.c) {
            shp1Var.c(i2);
            fhp1Var.H(Float.floatToRawIntBits(shp1Var.b[i2]));
            i2++;
        }
    }

    public static void e(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof yip1)) {
            if (!z) {
                while (i2 < list.size()) {
                    fhp1Var.B(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int iM = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM += fhp1.M(((Long) list.get(i3)).longValue());
            }
            fhp1Var.G(iM);
            while (i2 < list.size()) {
                fhp1Var.I(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yip1 yip1Var = (yip1) list;
        if (!z) {
            while (i2 < yip1Var.c) {
                fhp1Var.B(i, yip1Var.c(i2));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int iM2 = 0;
        for (int i4 = 0; i4 < yip1Var.c; i4++) {
            iM2 += fhp1.M(yip1Var.c(i4));
        }
        fhp1Var.G(iM2);
        while (i2 < yip1Var.c) {
            fhp1Var.I(yip1Var.c(i2));
            i2++;
        }
    }

    public static void f(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof yip1)) {
            if (!z) {
                while (i2 < list.size()) {
                    fhp1Var.B(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int iM = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM += fhp1.M(((Long) list.get(i3)).longValue());
            }
            fhp1Var.G(iM);
            while (i2 < list.size()) {
                fhp1Var.I(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yip1 yip1Var = (yip1) list;
        if (!z) {
            while (i2 < yip1Var.c) {
                fhp1Var.B(i, yip1Var.c(i2));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int iM2 = 0;
        for (int i4 = 0; i4 < yip1Var.c; i4++) {
            iM2 += fhp1.M(yip1Var.c(i4));
        }
        fhp1Var.G(iM2);
        while (i2 < yip1Var.c) {
            fhp1Var.I(yip1Var.c(i2));
            i2++;
        }
    }

    public static void g(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof yip1)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    fhp1Var.B(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int iM = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iM += fhp1.M((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            fhp1Var.G(iM);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                fhp1Var.I((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        yip1 yip1Var = (yip1) list;
        if (!z) {
            while (i2 < yip1Var.c) {
                long jC = yip1Var.c(i2);
                fhp1Var.B(i, (jC >> 63) ^ (jC + jC));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int iM2 = 0;
        for (int i4 = 0; i4 < yip1Var.c; i4++) {
            long jC2 = yip1Var.c(i4);
            iM2 += fhp1.M((jC2 >> 63) ^ (jC2 + jC2));
        }
        fhp1Var.G(iM2);
        while (i2 < yip1Var.c) {
            long jC3 = yip1Var.c(i2);
            fhp1Var.I((jC3 >> 63) ^ (jC3 + jC3));
            i2++;
        }
    }

    public static void h(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof yip1)) {
            if (!z) {
                while (i2 < list.size()) {
                    fhp1Var.C(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            fhp1Var.G(i3);
            while (i2 < list.size()) {
                fhp1Var.J(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yip1 yip1Var = (yip1) list;
        if (!z) {
            while (i2 < yip1Var.c) {
                fhp1Var.C(i, yip1Var.c(i2));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < yip1Var.c; i6++) {
            yip1Var.c(i6);
            i5 += 8;
        }
        fhp1Var.G(i5);
        while (i2 < yip1Var.c) {
            fhp1Var.J(yip1Var.c(i2));
            i2++;
        }
    }

    public static void i(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof yip1)) {
            if (!z) {
                while (i2 < list.size()) {
                    fhp1Var.C(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            fhp1Var.G(i3);
            while (i2 < list.size()) {
                fhp1Var.J(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        yip1 yip1Var = (yip1) list;
        if (!z) {
            while (i2 < yip1Var.c) {
                fhp1Var.C(i, yip1Var.c(i2));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < yip1Var.c; i6++) {
            yip1Var.c(i6);
            i5 += 8;
        }
        fhp1Var.G(i5);
        while (i2 < yip1Var.c) {
            fhp1Var.J(yip1Var.c(i2));
            i2++;
        }
    }

    public static void j(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof eip1)) {
            if (!z) {
                while (i2 < list.size()) {
                    fhp1Var.y(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int iM = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM += fhp1.M(((Integer) list.get(i3)).intValue());
            }
            fhp1Var.G(iM);
            while (i2 < list.size()) {
                fhp1Var.F(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eip1 eip1Var = (eip1) list;
        if (!z) {
            while (i2 < eip1Var.c) {
                fhp1Var.y(i, eip1Var.d(i2));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int iM2 = 0;
        for (int i4 = 0; i4 < eip1Var.c; i4++) {
            iM2 += fhp1.M(eip1Var.d(i4));
        }
        fhp1Var.G(iM2);
        while (i2 < eip1Var.c) {
            fhp1Var.F(eip1Var.d(i2));
            i2++;
        }
    }

    public static void k(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof eip1)) {
            if (!z) {
                while (i2 < list.size()) {
                    fhp1Var.z(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int iL = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iL += fhp1.L(((Integer) list.get(i3)).intValue());
            }
            fhp1Var.G(iL);
            while (i2 < list.size()) {
                fhp1Var.G(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eip1 eip1Var = (eip1) list;
        if (!z) {
            while (i2 < eip1Var.c) {
                fhp1Var.z(i, eip1Var.d(i2));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int iL2 = 0;
        for (int i4 = 0; i4 < eip1Var.c; i4++) {
            iL2 += fhp1.L(eip1Var.d(i4));
        }
        fhp1Var.G(iL2);
        while (i2 < eip1Var.c) {
            fhp1Var.G(eip1Var.d(i2));
            i2++;
        }
    }

    public static void l(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof eip1)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    fhp1Var.z(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int iL = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iL += fhp1.L((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            fhp1Var.G(iL);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                fhp1Var.G((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        eip1 eip1Var = (eip1) list;
        if (!z) {
            while (i2 < eip1Var.c) {
                int iD = eip1Var.d(i2);
                fhp1Var.z(i, (iD >> 31) ^ (iD + iD));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int iL2 = 0;
        for (int i4 = 0; i4 < eip1Var.c; i4++) {
            int iD2 = eip1Var.d(i4);
            iL2 += fhp1.L((iD2 >> 31) ^ (iD2 + iD2));
        }
        fhp1Var.G(iL2);
        while (i2 < eip1Var.c) {
            int iD3 = eip1Var.d(i2);
            fhp1Var.G((iD3 >> 31) ^ (iD3 + iD3));
            i2++;
        }
    }

    public static void m(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof eip1)) {
            if (!z) {
                while (i2 < list.size()) {
                    fhp1Var.A(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            fhp1Var.G(i3);
            while (i2 < list.size()) {
                fhp1Var.H(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eip1 eip1Var = (eip1) list;
        if (!z) {
            while (i2 < eip1Var.c) {
                fhp1Var.A(i, eip1Var.d(i2));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eip1Var.c; i6++) {
            eip1Var.d(i6);
            i5 += 4;
        }
        fhp1Var.G(i5);
        while (i2 < eip1Var.c) {
            fhp1Var.H(eip1Var.d(i2));
            i2++;
        }
    }

    public static void n(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof eip1)) {
            if (!z) {
                while (i2 < list.size()) {
                    fhp1Var.A(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            fhp1Var.G(i3);
            while (i2 < list.size()) {
                fhp1Var.H(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eip1 eip1Var = (eip1) list;
        if (!z) {
            while (i2 < eip1Var.c) {
                fhp1Var.A(i, eip1Var.d(i2));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eip1Var.c; i6++) {
            eip1Var.d(i6);
            i5 += 4;
        }
        fhp1Var.G(i5);
        while (i2 < eip1Var.c) {
            fhp1Var.H(eip1Var.d(i2));
            i2++;
        }
    }

    public static void o(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 0;
        if (!(list instanceof eip1)) {
            if (!z) {
                while (i2 < list.size()) {
                    fhp1Var.y(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fhp1Var.x(i, 2);
            int iM = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM += fhp1.M(((Integer) list.get(i3)).intValue());
            }
            fhp1Var.G(iM);
            while (i2 < list.size()) {
                fhp1Var.F(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eip1 eip1Var = (eip1) list;
        if (!z) {
            while (i2 < eip1Var.c) {
                fhp1Var.y(i, eip1Var.d(i2));
                i2++;
            }
            return;
        }
        fhp1Var.x(i, 2);
        int iM2 = 0;
        for (int i4 = 0; i4 < eip1Var.c; i4++) {
            iM2 += fhp1.M(eip1Var.d(i4));
        }
        fhp1Var.G(iM2);
        while (i2 < eip1Var.c) {
            fhp1Var.F(eip1Var.d(i2));
            i2++;
        }
    }

    public static void p(int i, List list, i2i1 i2i1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = fhp1Var.g;
        byte[] bArr = fhp1Var.f;
        if (list instanceof ygp1) {
            bhn0.d();
            return;
        }
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i3)).booleanValue();
                fhp1Var.G(i << 3);
                int i4 = fhp1Var.h;
                int i5 = i4 + 1;
                try {
                    bArr[i4] = bBooleanValue;
                    fhp1Var.h = i5;
                    i3++;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzxo(i5, i2, 1, e);
                }
            }
            return;
        }
        fhp1Var.x(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        fhp1Var.G(i6);
        while (i3 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i3)).booleanValue();
            int i8 = fhp1Var.h;
            int i9 = i8 + 1;
            try {
                bArr[i8] = bBooleanValue2;
                fhp1Var.h = i9;
                i3++;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzxo(i9, i2, 1, e2);
            }
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yip1)) {
            int iM = 0;
            while (i < size) {
                iM += fhp1.M(((Long) list.get(i)).longValue());
                i++;
            }
            return iM;
        }
        yip1 yip1Var = (yip1) list;
        int iM2 = 0;
        while (i < size) {
            iM2 += fhp1.M(yip1Var.c(i));
            i++;
        }
        return iM2;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yip1)) {
            int iM = 0;
            while (i < size) {
                iM += fhp1.M(((Long) list.get(i)).longValue());
                i++;
            }
            return iM;
        }
        yip1 yip1Var = (yip1) list;
        int iM2 = 0;
        while (i < size) {
            iM2 += fhp1.M(yip1Var.c(i));
            i++;
        }
        return iM2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yip1)) {
            int iM = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM += fhp1.M((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iM;
        }
        yip1 yip1Var = (yip1) list;
        int iM2 = 0;
        while (i < size) {
            long jC = yip1Var.c(i);
            iM2 += fhp1.M((jC >> 63) ^ (jC + jC));
            i++;
        }
        return iM2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof eip1)) {
            int iM = 0;
            while (i < size) {
                iM += fhp1.M(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM;
        }
        eip1 eip1Var = (eip1) list;
        int iM2 = 0;
        while (i < size) {
            iM2 += fhp1.M(eip1Var.d(i));
            i++;
        }
        return iM2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof eip1)) {
            int iM = 0;
            while (i < size) {
                iM += fhp1.M(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM;
        }
        eip1 eip1Var = (eip1) list;
        int iM2 = 0;
        while (i < size) {
            iM2 += fhp1.M(eip1Var.d(i));
            i++;
        }
        return iM2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof eip1)) {
            int iL = 0;
            while (i < size) {
                iL += fhp1.L(((Integer) list.get(i)).intValue());
                i++;
            }
            return iL;
        }
        eip1 eip1Var = (eip1) list;
        int iL2 = 0;
        while (i < size) {
            iL2 += fhp1.L(eip1Var.d(i));
            i++;
        }
        return iL2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof eip1)) {
            int iL = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iL += fhp1.L((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iL;
        }
        eip1 eip1Var = (eip1) list;
        int iL2 = 0;
        while (i < size) {
            int iD = eip1Var.d(i);
            iL2 += fhp1.L((iD >> 31) ^ (iD + iD));
            i++;
        }
        return iL2;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fhp1.L(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fhp1.L(i << 3) + 8) * size;
    }
}
