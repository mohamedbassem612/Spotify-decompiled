package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g1i0 {
    public static final g1i0 a;
    public static final g1i0 b;
    public static final g1i0 c;
    public static final g1i0 d;
    public static final g1i0 e;
    public static final g1i0 f;
    public static final g1i0 g;
    public static final /* synthetic */ g1i0[] h;

    static {
        g1i0 g1i0Var = new g1i0("NONE", 0);
        a = g1i0Var;
        g1i0 g1i0Var2 = new g1i0("CONNECTING", 1);
        b = g1i0Var2;
        g1i0 g1i0Var3 = new g1i0("PLAYING", 2);
        c = g1i0Var3;
        g1i0 g1i0Var4 = new g1i0("PAUSED", 3);
        d = g1i0Var4;
        g1i0 g1i0Var5 = new g1i0("STOPPED", 4);
        e = g1i0Var5;
        g1i0 g1i0Var6 = new g1i0("ERROR", 5);
        f = g1i0Var6;
        g1i0 g1i0Var7 = new g1i0("BUFFERING", 6);
        g = g1i0Var7;
        h = new g1i0[]{g1i0Var, g1i0Var2, g1i0Var3, g1i0Var4, g1i0Var5, g1i0Var6, g1i0Var7};
    }

    public static g1i0 valueOf(String str) {
        return (g1i0) Enum.valueOf(g1i0.class, str);
    }

    public static g1i0[] values() {
        return (g1i0[]) h.clone();
    }
}
