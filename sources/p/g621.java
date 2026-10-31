package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g621 {
    public static final g621 a;
    public static final g621 b;
    public static final g621 c;
    public static final /* synthetic */ g621[] d;

    static {
        g621 g621Var = new g621("Remove", 0);
        a = g621Var;
        g621 g621Var2 = new g621("RemoveKeepingFolderContent", 1);
        b = g621Var2;
        g621 g621Var3 = new g621("Cancel", 2);
        c = g621Var3;
        d = new g621[]{g621Var, g621Var2, g621Var3};
    }

    public static g621 valueOf(String str) {
        return (g621) Enum.valueOf(g621.class, str);
    }

    public static g621[] values() {
        return (g621[]) d.clone();
    }
}
