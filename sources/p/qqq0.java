package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qqq0 {
    public static final qqq0 a;
    public static final qqq0 b;
    public static final /* synthetic */ qqq0[] c;

    static {
        qqq0 qqq0Var = new qqq0("Vertical", 0);
        a = qqq0Var;
        qqq0 qqq0Var2 = new qqq0("Horizontal", 1);
        b = qqq0Var2;
        c = new qqq0[]{qqq0Var, qqq0Var2};
    }

    public static qqq0 valueOf(String str) {
        return (qqq0) Enum.valueOf(qqq0.class, str);
    }

    public static qqq0[] values() {
        return (qqq0[]) c.clone();
    }
}
