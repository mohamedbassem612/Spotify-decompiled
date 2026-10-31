package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u37 {
    public static final u37 a;
    public static final u37 b;
    public static final /* synthetic */ u37[] c;

    static {
        u37 u37Var = new u37("Ratio16by9", 0);
        a = u37Var;
        u37 u37Var2 = new u37("Ratio1by1", 1);
        b = u37Var2;
        c = new u37[]{u37Var, u37Var2};
    }

    public static u37 valueOf(String str) {
        return (u37) Enum.valueOf(u37.class, str);
    }

    public static u37[] values() {
        return (u37[]) c.clone();
    }
}
