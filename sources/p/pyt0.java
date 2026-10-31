package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pyt0 {
    public static final pyt0 a;
    public static final pyt0 b;
    public static final /* synthetic */ pyt0[] c;

    static {
        pyt0 pyt0Var = new pyt0("AVAILABLE", 0);
        a = pyt0Var;
        pyt0 pyt0Var2 = new pyt0("NOT_AVAILABLE", 1);
        b = pyt0Var2;
        c = new pyt0[]{pyt0Var, pyt0Var2};
    }

    public static pyt0 valueOf(String str) {
        return (pyt0) Enum.valueOf(pyt0.class, str);
    }

    public static pyt0[] values() {
        return (pyt0[]) c.clone();
    }
}
