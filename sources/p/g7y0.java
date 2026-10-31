package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g7y0 {
    public static final g7y0 a;
    public static final g7y0 b;
    public static final g7y0 c;
    public static final g7y0 d;
    public static final g7y0 e;
    public static final /* synthetic */ g7y0[] f;

    static {
        g7y0 g7y0Var = new g7y0("TRACK", 0);
        a = g7y0Var;
        g7y0 g7y0Var2 = new g7y0("EPISODE", 1);
        b = g7y0Var2;
        g7y0 g7y0Var3 = new g7y0("AUDIOBOOK", 2);
        c = g7y0Var3;
        g7y0 g7y0Var4 = new g7y0("CLIP", 3);
        d = g7y0Var4;
        g7y0 g7y0Var5 = new g7y0("CHAPTER", 4);
        e = g7y0Var5;
        f = new g7y0[]{g7y0Var, g7y0Var2, g7y0Var3, g7y0Var4, g7y0Var5};
    }

    public static g7y0 valueOf(String str) {
        return (g7y0) Enum.valueOf(g7y0.class, str);
    }

    public static g7y0[] values() {
        return (g7y0[]) f.clone();
    }
}
