package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t3o0 {
    public static final t3o0 a;
    public static final t3o0 b;
    public static final /* synthetic */ t3o0[] c;

    static {
        t3o0 t3o0Var = new t3o0("PermissionRequested", 0);
        a = t3o0Var;
        t3o0 t3o0Var2 = new t3o0("NavigatedToSettings", 1);
        b = t3o0Var2;
        c = new t3o0[]{t3o0Var, t3o0Var2};
    }

    public static t3o0 valueOf(String str) {
        return (t3o0) Enum.valueOf(t3o0.class, str);
    }

    public static t3o0[] values() {
        return (t3o0[]) c.clone();
    }
}
