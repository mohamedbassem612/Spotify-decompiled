package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ma80 {
    public static final ma80 a;
    public static final ma80 b;
    public static final ma80 c;
    public static final /* synthetic */ ma80[] d;

    static {
        ma80 ma80Var = new ma80("Hidden", 0);
        a = ma80Var;
        ma80 ma80Var2 = new ma80("NextPageIndicatorVisible", 1);
        b = ma80Var2;
        ma80 ma80Var3 = new ma80("PreviousPageIndicatorVisible", 2);
        c = ma80Var3;
        d = new ma80[]{ma80Var, ma80Var2, ma80Var3};
    }

    public static ma80 valueOf(String str) {
        return (ma80) Enum.valueOf(ma80.class, str);
    }

    public static ma80[] values() {
        return (ma80[]) d.clone();
    }
}
