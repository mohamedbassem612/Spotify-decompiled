package p;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class mht {
    public static final lht a;
    public static final lht b;
    public static final lht c;
    public static final lht d;
    public static final lht e;
    public static final lht f;
    public static final lht g;
    public static final lht h;
    public static final lht i;
    public static final Map j;
    public static final lht k;
    public static final mhc l;
    public static final nhc m;
    public static final vhc n;
    public static final ejm0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final HashMap f31p;

    static {
        k9a0 k9a0Var = k9a0.Y;
        lht lhtVar = new lht(k9a0Var, (byte) 0);
        a = lhtVar;
        k9a0 k9a0Var2 = k9a0.Z;
        lht lhtVar2 = new lht(k9a0Var2, (byte) 1);
        b = lhtVar2;
        k9a0 k9a0Var3 = k9a0.N0;
        lht lhtVar3 = new lht(k9a0Var3, (byte) 2);
        c = lhtVar3;
        k9a0 k9a0Var4 = k9a0.i;
        lht lhtVar4 = new lht(k9a0Var4, (byte) 3);
        d = lhtVar4;
        k9a0 k9a0Var5 = k9a0.O0;
        lht lhtVar5 = new lht(k9a0Var5, (byte) 4);
        e = lhtVar5;
        k9a0 k9a0Var6 = k9a0.X;
        lht lhtVar6 = new lht(k9a0Var6, (byte) 5);
        f = lhtVar6;
        k9a0 k9a0Var7 = k9a0.h;
        lht lhtVar7 = new lht(k9a0Var7, (byte) 6);
        g = lhtVar7;
        k9a0 k9a0Var8 = k9a0.t;
        lht lhtVar8 = new lht(k9a0Var8, (byte) 7);
        h = lhtVar8;
        k9a0 k9a0Var9 = k9a0.P0;
        lht lhtVar9 = new lht(k9a0Var9, (byte) 8);
        i = lhtVar9;
        Collections.unmodifiableSet(f46.S0(new lht[]{lhtVar, lhtVar2, lhtVar4, lhtVar6}));
        HashMap mapQ = h4p1.q(4);
        mapQ.put(lhtVar2, 0);
        mapQ.put(lhtVar, 0);
        mapQ.put(lhtVar4, 1);
        mapQ.put(lhtVar3, 1);
        mapQ.put(lhtVar5, 2);
        j = Collections.unmodifiableMap(mapQ);
        k = lhtVar5;
        l = new mhc((byte) 7);
        m = new nhc((byte) 7);
        n = new vhc((byte) 7);
        try {
            Iterator it = Arrays.asList(new ejm0[0]).iterator();
            o = it.hasNext() ? (ejm0) it.next() : ejm0.a;
            HashMap map = new HashMap();
            f31p = map;
            map.put(k9a0Var, lhtVar);
            map.put(k9a0Var2, lhtVar2);
            map.put(k9a0Var3, lhtVar3);
            map.put(k9a0Var4, lhtVar4);
            map.put(k9a0Var5, lhtVar5);
            map.put(k9a0Var6, lhtVar6);
            map.put(k9a0Var7, lhtVar7);
            map.put(k9a0Var8, lhtVar8);
            map.put(k9a0Var9, lhtVar9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i2) {
        String str = i2 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 16 ? 3 : 2];
        if (i2 != 1 && i2 != 3 && i2 != 5 && i2 != 7) {
            switch (i2) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i2 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(lht lhtVar, lht lhtVar2) {
        if (lhtVar == null) {
            a(12);
            throw null;
        }
        o60 o60Var = lhtVar.a;
        if (lhtVar2 == null) {
            a(13);
            throw null;
        }
        o60 o60Var2 = lhtVar2.a;
        Integer numA = o60Var.a(o60Var2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = o60Var2.a(o60Var);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static s9r c(yl01 yl01Var, jyc jycVar, n9r n9rVar) {
        s9r s9rVarC;
        if (jycVar == null) {
            a(8);
            throw null;
        }
        for (s9r s9rVar = (s9r) jycVar.w1(); s9rVar != null && s9rVar.getVisibility() != f; s9rVar = (s9r) iht.h(s9rVar, s9r.class, true)) {
            if (!s9rVar.getVisibility().a(yl01Var, s9rVar, n9rVar)) {
                return s9rVar;
            }
        }
        if (!(jycVar instanceof a0h1) || (s9rVarC = c(yl01Var, null, n9rVar)) == null) {
            return null;
        }
        return s9rVarC;
    }

    public static boolean d(n9r n9rVar, n9r n9rVar2) {
        e4x0 e4x0VarE = iht.e(n9rVar2);
        return e4x0VarE != e4x0.P0 && e4x0VarE == iht.e(n9rVar);
    }

    public static boolean e(lht lhtVar) {
        if (lhtVar != null) {
            return lhtVar == a || lhtVar == b;
        }
        a(14);
        throw null;
    }

    public static boolean f(jyc jycVar, n9r n9rVar) {
        return c(m, jycVar, n9rVar) == null;
    }

    public static lht g(o60 o60Var) {
        if (o60Var == null) {
            a(15);
            throw null;
        }
        lht lhtVar = (lht) f31p.get(o60Var);
        if (lhtVar != null) {
            return lhtVar;
        }
        hhg1.g(o60Var, "Inapplicable visibility: ");
        return null;
    }
}
