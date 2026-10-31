package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ast0 {
    public static final ast0 a;
    public static final ast0 b;
    public static final ast0 c;
    public static final /* synthetic */ ast0[] d;

    static {
        ast0 ast0Var = new ast0("Playing", 0);
        a = ast0Var;
        ast0 ast0Var2 = new ast0("Paused", 1);
        b = ast0Var2;
        ast0 ast0Var3 = new ast0("None", 2);
        c = ast0Var3;
        d = new ast0[]{ast0Var, ast0Var2, ast0Var3};
    }

    public static ast0 valueOf(String str) {
        return (ast0) Enum.valueOf(ast0.class, str);
    }

    public static ast0[] values() {
        return (ast0[]) d.clone();
    }
}
