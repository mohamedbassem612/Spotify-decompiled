package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g79 {
    public static final g79 a;
    public static final g79 b;
    public static final g79 c;
    public static final g79 d;
    public static final g79 e;
    public static final /* synthetic */ g79[] f;

    static {
        g79 g79Var = new g79("LinearGain", 0);
        a = g79Var;
        g79 g79Var2 = new g79("EqGain", 1);
        b = g79Var2;
        g79 g79Var3 = new g79("FilterCutoff", 2);
        c = g79Var3;
        g79 g79Var4 = new g79("DryWet", 3);
        d = g79Var4;
        g79 g79Var5 = new g79("NoiseColor", 4);
        e = g79Var5;
        f = new g79[]{g79Var, g79Var2, g79Var3, g79Var4, g79Var5};
    }

    public static g79 valueOf(String str) {
        return (g79) Enum.valueOf(g79.class, str);
    }

    public static g79[] values() {
        return (g79[]) f.clone();
    }
}
