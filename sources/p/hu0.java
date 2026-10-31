package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hu0 {
    public static final hu0 a;
    public static final hu0 b;
    public static final hu0 c;
    public static final hu0 d;
    public static final hu0 e;
    public static final hu0 f;
    public static final /* synthetic */ hu0[] g;

    static {
        hu0 hu0Var = new hu0("SUCCESS", 0);
        a = hu0Var;
        hu0 hu0Var2 = new hu0("FAIL", 1);
        b = hu0Var2;
        hu0 hu0Var3 = new hu0("INVALID_SLOT", 2);
        c = hu0Var3;
        hu0 hu0Var4 = new hu0("INVALID_DEMAND_STATUS", 3);
        d = hu0Var4;
        hu0 hu0Var5 = new hu0("INVALID_ELIGIBILITY_STATUS", 4);
        e = hu0Var5;
        hu0 hu0Var6 = new hu0("UNRECOGNIZED", 5);
        f = hu0Var6;
        g = new hu0[]{hu0Var, hu0Var2, hu0Var3, hu0Var4, hu0Var5, hu0Var6};
    }

    public static hu0 valueOf(String str) {
        return (hu0) Enum.valueOf(hu0.class, str);
    }

    public static hu0[] values() {
        return (hu0[]) g.clone();
    }
}
