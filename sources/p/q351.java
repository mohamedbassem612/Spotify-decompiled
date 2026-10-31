package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q351 {
    public static final q351 a;
    public static final q351 b;
    public static final /* synthetic */ q351[] c;

    static {
        q351 q351Var = new q351("UNSPECIFIED", 0);
        a = q351Var;
        q351 q351Var2 = new q351("ENTITLEMENT_MISSING", 1);
        b = q351Var2;
        c = new q351[]{q351Var, q351Var2};
    }

    public static q351 valueOf(String str) {
        return (q351) Enum.valueOf(q351.class, str);
    }

    public static q351[] values() {
        return (q351[]) c.clone();
    }
}
