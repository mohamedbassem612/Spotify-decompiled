package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ivq0 {
    public static final ivq0 a;
    public static final ivq0 b;
    public static final ivq0 c;
    public static final ivq0 d;
    public static final /* synthetic */ ivq0[] e;

    static {
        ivq0 ivq0Var = new ivq0("AUTO_HIDE", 0);
        a = ivq0Var;
        ivq0 ivq0Var2 = new ivq0("HIDE_DISABLED", 1);
        b = ivq0Var2;
        ivq0 ivq0Var3 = new ivq0("HIDE_ENABLED", 2);
        c = ivq0Var3;
        ivq0 ivq0Var4 = new ivq0("MINIMIZE_ENABLED", 3);
        d = ivq0Var4;
        e = new ivq0[]{ivq0Var, ivq0Var2, ivq0Var3, ivq0Var4};
    }

    public static ivq0 valueOf(String str) {
        return (ivq0) Enum.valueOf(ivq0.class, str);
    }

    public static ivq0[] values() {
        return (ivq0[]) e.clone();
    }
}
