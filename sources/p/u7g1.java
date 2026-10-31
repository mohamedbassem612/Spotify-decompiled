package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u7g1 {
    public static final u7g1 a;
    public static final u7g1 b;
    public static final /* synthetic */ u7g1[] c;

    static {
        u7g1 u7g1Var = new u7g1("DEFERRED", 0);
        a = u7g1Var;
        u7g1 u7g1Var2 = new u7g1("IMMEDIATE", 1);
        b = u7g1Var2;
        c = new u7g1[]{u7g1Var, u7g1Var2, new u7g1("EXCLUSIVE", 2)};
    }

    public static u7g1 valueOf(String str) {
        return (u7g1) Enum.valueOf(u7g1.class, str);
    }

    public static u7g1[] values() {
        return (u7g1[]) c.clone();
    }
}
