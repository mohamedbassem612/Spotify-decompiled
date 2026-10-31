package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wi8 {
    public static final wi8 a;
    public static final wi8 b;
    public static final wi8 c;
    public static final wi8 d;
    public static final /* synthetic */ wi8[] e;

    static {
        wi8 wi8Var = new wi8("HOME", 0);
        a = wi8Var;
        wi8 wi8Var2 = new wi8("ACCOUNT_SELECTION", 1);
        b = wi8Var2;
        wi8 wi8Var3 = new wi8("ONBOARDING", 2);
        c = wi8Var3;
        wi8 wi8Var4 = new wi8("PREMIUM_UPSELL", 3);
        d = wi8Var4;
        e = new wi8[]{wi8Var, wi8Var2, wi8Var3, wi8Var4};
    }

    public static wi8 valueOf(String str) {
        return (wi8) Enum.valueOf(wi8.class, str);
    }

    public static wi8[] values() {
        return (wi8[]) e.clone();
    }
}
