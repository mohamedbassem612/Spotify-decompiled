package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cy10 {
    public static final cy10 a;
    public static final cy10 b;
    public static final /* synthetic */ cy10[] c;

    static {
        cy10 cy10Var = new cy10("POSITIVE", 0);
        a = cy10Var;
        cy10 cy10Var2 = new cy10("NEGATIVE", 1);
        b = cy10Var2;
        c = new cy10[]{cy10Var, cy10Var2};
    }

    public static cy10 valueOf(String str) {
        return (cy10) Enum.valueOf(cy10.class, str);
    }

    public static cy10[] values() {
        return (cy10[]) c.clone();
    }
}
