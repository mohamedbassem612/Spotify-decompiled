package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c8c0 {
    public static final c8c0 a;
    public static final c8c0 b;
    public static final c8c0 c;
    public static final c8c0 d;
    public static final c8c0 e;
    public static final c8c0 f;
    public static final /* synthetic */ c8c0[] g;

    static {
        c8c0 c8c0Var = new c8c0("ON_DEMAND_WHEN_FREE_JUMPIN", 0);
        a = c8c0Var;
        c8c0 c8c0Var2 = new c8c0("ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS", 1);
        b = c8c0Var2;
        c8c0 c8c0Var3 = new c8c0("ON_DEMAND_WHEN_FREE_TFT", 2);
        c = c8c0Var3;
        c8c0 c8c0Var4 = new c8c0("SHUFFLE_WHEN_FREE", 3);
        d = c8c0Var4;
        c8c0 c8c0Var5 = new c8c0("TRACK_LIST_WHEN_FREE_REINVENTION", 4);
        e = c8c0Var5;
        c8c0 c8c0Var6 = new c8c0("ON_DEMAND_WHEN_PREMIUM", 5);
        f = c8c0Var6;
        g = new c8c0[]{c8c0Var, c8c0Var2, c8c0Var3, c8c0Var4, c8c0Var5, c8c0Var6};
    }

    public static c8c0 valueOf(String str) {
        return (c8c0) Enum.valueOf(c8c0.class, str);
    }

    public static c8c0[] values() {
        return (c8c0[]) g.clone();
    }
}
