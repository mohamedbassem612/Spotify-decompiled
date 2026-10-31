package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g390 {
    public static final g390 a;
    public static final g390 b;
    public static final g390 c;
    public static final /* synthetic */ g390[] d;

    static {
        g390 g390Var = new g390("ALWAYS_SHOW", 0);
        a = g390Var;
        g390 g390Var2 = new g390("HIDE_EXPLICIT", 1);
        b = g390Var2;
        g390 g390Var3 = new g390("ALWAYS_HIDE", 2);
        c = g390Var3;
        d = new g390[]{g390Var, g390Var2, g390Var3};
    }

    public static g390 valueOf(String str) {
        return (g390) Enum.valueOf(g390.class, str);
    }

    public static g390[] values() {
        return (g390[]) d.clone();
    }
}
