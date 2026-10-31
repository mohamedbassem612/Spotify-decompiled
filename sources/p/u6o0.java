package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u6o0 {
    public static final u6o0 a;
    public static final u6o0 b;
    public static final u6o0 c;
    public static final /* synthetic */ u6o0[] d;

    static {
        u6o0 u6o0Var = new u6o0("ENABLED", 0);
        a = u6o0Var;
        u6o0 u6o0Var2 = new u6o0("DISABLED", 1);
        b = u6o0Var2;
        u6o0 u6o0Var3 = new u6o0("UNKNOWN", 2);
        c = u6o0Var3;
        d = new u6o0[]{u6o0Var, u6o0Var2, u6o0Var3};
    }

    public static u6o0 valueOf(String str) {
        return (u6o0) Enum.valueOf(u6o0.class, str);
    }

    public static u6o0[] values() {
        return (u6o0[]) d.clone();
    }
}
