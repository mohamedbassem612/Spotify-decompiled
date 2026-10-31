package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k3o0 {
    public static final k3o0 a;
    public static final k3o0 b;
    public static final /* synthetic */ k3o0[] c;

    static {
        k3o0 k3o0Var = new k3o0("PermissionRequested", 0);
        a = k3o0Var;
        k3o0 k3o0Var2 = new k3o0("NavigatedToSettings", 1);
        b = k3o0Var2;
        c = new k3o0[]{k3o0Var, k3o0Var2};
    }

    public static k3o0 valueOf(String str) {
        return (k3o0) Enum.valueOf(k3o0.class, str);
    }

    public static k3o0[] values() {
        return (k3o0[]) c.clone();
    }
}
