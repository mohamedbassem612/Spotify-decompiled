package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x0 {
    public static final x0 a;
    public static final x0 b;
    public static final /* synthetic */ x0[] c;

    static {
        x0 x0Var = new x0("NAVIGATE_TO_ENTITY", 0);
        a = x0Var;
        x0 x0Var2 = new x0("NAVIGATE_TO_DETAILS", 1);
        b = x0Var2;
        c = new x0[]{x0Var, x0Var2};
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) c.clone();
    }
}
