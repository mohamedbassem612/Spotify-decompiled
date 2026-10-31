package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dp2 {
    public static final dp2 a;
    public static final dp2 b;
    public static final /* synthetic */ dp2[] c;

    static {
        dp2 dp2Var = new dp2("Completed", 0);
        a = dp2Var;
        dp2 dp2Var2 = new dp2("Failed", 1);
        b = dp2Var2;
        c = new dp2[]{dp2Var, dp2Var2};
    }

    public static dp2 valueOf(String str) {
        return (dp2) Enum.valueOf(dp2.class, str);
    }

    public static dp2[] values() {
        return (dp2[]) c.clone();
    }
}
