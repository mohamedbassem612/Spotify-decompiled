package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class di61 {
    public static final di61 a;
    public static final di61 b;
    public static final /* synthetic */ di61[] c;

    static {
        di61 di61Var = new di61("CRASHLYTICS", 0);
        a = di61Var;
        di61 di61Var2 = new di61("PERFORMANCE", 1);
        b = di61Var2;
        c = new di61[]{di61Var, di61Var2, new di61("MATT_SAYS_HI", 2)};
    }

    public static di61 valueOf(String str) {
        return (di61) Enum.valueOf(di61.class, str);
    }

    public static di61[] values() {
        return (di61[]) c.clone();
    }
}
