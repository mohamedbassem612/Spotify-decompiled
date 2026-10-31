package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h1s0 {
    public static final h1s0 a;
    public static final h1s0 b;
    public static final /* synthetic */ h1s0[] c;

    static {
        h1s0 h1s0Var = new h1s0("LOGGED_IN", 0);
        a = h1s0Var;
        h1s0 h1s0Var2 = new h1s0("NOT_LOGGED_IN", 1);
        b = h1s0Var2;
        c = new h1s0[]{h1s0Var, h1s0Var2, new h1s0("ERROR", 2)};
    }

    public static h1s0 valueOf(String str) {
        return (h1s0) Enum.valueOf(h1s0.class, str);
    }

    public static h1s0[] values() {
        return (h1s0[]) c.clone();
    }
}
