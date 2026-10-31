package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class y7a0 {
    public static final lht a;
    public static final lht b;
    public static final lht c;
    public static final HashMap d;

    static {
        k9a0 k9a0Var = k9a0.e;
        lht lhtVar = new lht(k9a0Var, (byte) 9);
        a = lhtVar;
        k9a0 k9a0Var2 = k9a0.g;
        lht lhtVar2 = new lht(k9a0Var2, (byte) 10);
        b = lhtVar2;
        k9a0 k9a0Var3 = k9a0.f;
        lht lhtVar3 = new lht(k9a0Var3, (byte) 11);
        c = lhtVar3;
        HashMap map = new HashMap();
        d = map;
        map.put(k9a0Var, lhtVar);
        map.put(k9a0Var2, lhtVar2);
        map.put(k9a0Var3, lhtVar3);
    }

    public static boolean a(s9r s9rVar, n9r n9rVar) {
        if (s9rVar != null) {
            dzq0 dzq0Var = (dzq0) iht.h(s9rVar, dzq0.class, false);
            dzq0 dzq0Var2 = (dzq0) iht.h(n9rVar, dzq0.class, false);
            return (dzq0Var2 == null || dzq0Var == null || !((ezq0) dzq0Var).f.equals(((ezq0) dzq0Var2).f)) ? false : true;
        }
        Object[] objArr = new Object[3];
        switch (2) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        objArr[2] = "areInSamePackage";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(yl01 yl01Var, s9r s9rVar, n9r n9rVar) {
        s9r s9rVarQ;
        if (s9rVar instanceof jyc) {
            s9rVarQ = iht.q((jyc) s9rVar);
        } else {
            int i = iht.a;
            s9rVarQ = s9rVar;
        }
        if (a(s9rVarQ, n9rVar)) {
            return true;
        }
        return mht.c.a(yl01Var, s9rVar, n9rVar);
    }
}
