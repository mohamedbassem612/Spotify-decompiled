package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ltt0 {
    public static final ltt0 a;
    public static final ltt0 b;
    public static final ltt0 c;
    public static final ltt0 d;
    public static final ltt0 e;
    public static final ltt0 f;
    public static final ltt0 g;
    public static final /* synthetic */ ltt0[] h;

    static {
        ltt0 ltt0Var = new ltt0("UNKNOWN", 0);
        a = ltt0Var;
        ltt0 ltt0Var2 = new ltt0("NO_RESTRICTION", 1);
        b = ltt0Var2;
        ltt0 ltt0Var3 = new ltt0("EXPLICIT_CONTENT", 2);
        c = ltt0Var3;
        ltt0 ltt0Var4 = new ltt0("AGE_RESTRICTED", 3);
        d = ltt0Var4;
        ltt0 ltt0Var5 = new ltt0("NOT_IN_CATALOGUE", 4);
        e = ltt0Var5;
        ltt0 ltt0Var6 = new ltt0("NOT_AVAILABLE_OFFLINE", 5);
        f = ltt0Var6;
        ltt0 ltt0Var7 = new ltt0("PREMIUM_ONLY", 6);
        g = ltt0Var7;
        h = new ltt0[]{ltt0Var, ltt0Var2, ltt0Var3, ltt0Var4, ltt0Var5, ltt0Var6, ltt0Var7};
    }

    public static ltt0 valueOf(String str) {
        return (ltt0) Enum.valueOf(ltt0.class, str);
    }

    public static ltt0[] values() {
        return (ltt0[]) h.clone();
    }
}
