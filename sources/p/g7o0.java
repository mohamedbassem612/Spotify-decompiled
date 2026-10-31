package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g7o0 {
    public static final g7o0 a;
    public static final g7o0 b;
    public static final g7o0 c;
    public static final g7o0 d;
    public static final /* synthetic */ g7o0[] e;

    static {
        g7o0 g7o0Var = new g7o0("FORCED_OFFLINE", 0);
        a = g7o0Var;
        g7o0 g7o0Var2 = new g7o0("AIRPLANE_MODE", 1);
        b = g7o0Var2;
        g7o0 g7o0Var3 = new g7o0("NO_NETWORK_CONNECTION", 2);
        c = g7o0Var3;
        g7o0 g7o0Var4 = new g7o0("UNKNOWN", 3);
        d = g7o0Var4;
        e = new g7o0[]{g7o0Var, g7o0Var2, g7o0Var3, g7o0Var4};
    }

    public static g7o0 valueOf(String str) {
        return (g7o0) Enum.valueOf(g7o0.class, str);
    }

    public static g7o0[] values() {
        return (g7o0[]) e.clone();
    }
}
