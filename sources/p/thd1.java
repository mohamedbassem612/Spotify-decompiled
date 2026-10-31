package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class thd1 {
    public static final thd1 a;
    public static final thd1 b;
    public static final /* synthetic */ thd1[] c;

    static {
        thd1 thd1Var = new thd1("Tabs", 0);
        a = thd1Var;
        thd1 thd1Var2 = new thd1("Indicator", 1);
        b = thd1Var2;
        c = new thd1[]{thd1Var, thd1Var2};
    }

    public static thd1 valueOf(String str) {
        return (thd1) Enum.valueOf(thd1.class, str);
    }

    public static thd1[] values() {
        return (thd1[]) c.clone();
    }
}
