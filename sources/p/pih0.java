package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pih0 {
    public static final pih0 a;
    public static final pih0 b;
    public static final pih0 c;
    public static final /* synthetic */ pih0[] d;

    static {
        pih0 pih0Var = new pih0("INTEGRATION_UNAUTHORIZED", 0);
        a = pih0Var;
        pih0 pih0Var2 = new pih0("BAD_REQUEST", 1);
        b = pih0Var2;
        pih0 pih0Var3 = new pih0("INTERNAL_ERROR", 2);
        c = pih0Var3;
        d = new pih0[]{pih0Var, pih0Var2, pih0Var3};
    }

    public static pih0 valueOf(String str) {
        return (pih0) Enum.valueOf(pih0.class, str);
    }

    public static pih0[] values() {
        return (pih0[]) d.clone();
    }
}
