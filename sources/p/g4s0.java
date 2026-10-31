package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g4s0 {
    public static final g4s0 a;
    public static final g4s0 b;
    public static final g4s0 c;
    public static final g4s0 d;
    public static final /* synthetic */ g4s0[] e;

    static {
        g4s0 g4s0Var = new g4s0("SCHEDULED", 0);
        a = g4s0Var;
        g4s0 g4s0Var2 = new g4s0("STARTING_SOON", 1);
        b = g4s0Var2;
        g4s0 g4s0Var3 = new g4s0("LIVE", 2);
        c = g4s0Var3;
        g4s0 g4s0Var4 = new g4s0("ENDED", 3);
        d = g4s0Var4;
        e = new g4s0[]{g4s0Var, g4s0Var2, g4s0Var3, g4s0Var4};
    }

    public static g4s0 valueOf(String str) {
        return (g4s0) Enum.valueOf(g4s0.class, str);
    }

    public static g4s0[] values() {
        return (g4s0[]) e.clone();
    }
}
