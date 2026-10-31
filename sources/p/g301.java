package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g301 {
    public static final g301 a;
    public static final g301 b;
    public static final /* synthetic */ g301[] c;

    static {
        g301 g301Var = new g301("ADD_REACTION", 0);
        a = g301Var;
        g301 g301Var2 = new g301("SHOW_REACTIONS", 1);
        b = g301Var2;
        c = new g301[]{g301Var, g301Var2};
    }

    public static g301 valueOf(String str) {
        return (g301) Enum.valueOf(g301.class, str);
    }

    public static g301[] values() {
        return (g301[]) c.clone();
    }
}
