package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nia0 {
    public static final nia0 a;
    public static final nia0 b;
    public static final nia0 c;
    public static final nia0 d;
    public static final nia0 e;
    public static final /* synthetic */ nia0[] f;

    static {
        nia0 nia0Var = new nia0("HIDDEN", 0);
        a = nia0Var;
        nia0 nia0Var2 = new nia0("VISIBLE", 1);
        b = nia0Var2;
        nia0 nia0Var3 = new nia0("DEPRECATED_LIST_METHODS", 2);
        c = nia0Var3;
        nia0 nia0Var4 = new nia0("NOT_CONSIDERED", 3);
        d = nia0Var4;
        nia0 nia0Var5 = new nia0("DROP", 4);
        e = nia0Var5;
        f = new nia0[]{nia0Var, nia0Var2, nia0Var3, nia0Var4, nia0Var5};
    }

    public static nia0 valueOf(String str) {
        return (nia0) Enum.valueOf(nia0.class, str);
    }

    public static nia0[] values() {
        return (nia0[]) f.clone();
    }
}
