package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class prc0 {
    public static final prc0 a;
    public static final prc0 b;
    public static final prc0 c;
    public static final /* synthetic */ prc0[] d;

    static {
        prc0 prc0Var = new prc0("NO_LENGTH_RESTRICTION", 0);
        a = prc0Var;
        prc0 prc0Var2 = new prc0("RESTRICT_SOURCE_LENGTH_TO_50", 1);
        b = prc0Var2;
        prc0 prc0Var3 = new prc0("RESTRICT_SOURCE_LENGTH_TO_500", 2);
        c = prc0Var3;
        d = new prc0[]{prc0Var, prc0Var2, prc0Var3};
    }

    public static prc0 valueOf(String str) {
        return (prc0) Enum.valueOf(prc0.class, str);
    }

    public static prc0[] values() {
        return (prc0[]) d.clone();
    }
}
