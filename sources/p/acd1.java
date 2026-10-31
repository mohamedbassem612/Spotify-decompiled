package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class acd1 {
    public static final acd1 a;
    public static final acd1 b;
    public static final acd1 c;
    public static final /* synthetic */ acd1[] d;

    static {
        acd1 acd1Var = new acd1("FORCE_NONE", 0);
        a = acd1Var;
        acd1 acd1Var2 = new acd1("FORCE_SQUARE", 1);
        b = acd1Var2;
        acd1 acd1Var3 = new acd1("FORCE_RECTANGLE", 2);
        c = acd1Var3;
        d = new acd1[]{acd1Var, acd1Var2, acd1Var3};
    }

    public static acd1 valueOf(String str) {
        return (acd1) Enum.valueOf(acd1.class, str);
    }

    public static acd1[] values() {
        return (acd1[]) d.clone();
    }
}
