package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g920 {
    public static final g920 a;
    public static final g920 b;
    public static final g920 c;
    public static final g920 d;
    public static final g920 e;
    public static final g920 f;
    public static final g920 g;
    public static final g920 h;
    public static final /* synthetic */ g920[] i;

    static {
        g920 g920Var = new g920("LocationClicked", 0);
        a = g920Var;
        g920 g920Var2 = new g920("ClearFiltersClicked", 1);
        b = g920Var2;
        g920 g920Var3 = new g920("BrowseLocationClicked", 2);
        c = g920Var3;
        g920 g920Var4 = new g920("ClearBrowseLocationClicked", 3);
        d = g920Var4;
        g920 g920Var5 = new g920("DateFilterClicked", 4);
        e = g920Var5;
        g920 g920Var6 = new g920("ClearDateFilterClicked", 5);
        f = g920Var6;
        g920 g920Var7 = new g920("ConceptFilterClicked", 6);
        g = g920Var7;
        g920 g920Var8 = new g920("ClearConceptFilterClicked", 7);
        h = g920Var8;
        i = new g920[]{g920Var, g920Var2, g920Var3, g920Var4, g920Var5, g920Var6, g920Var7, g920Var8};
    }

    public static g920 valueOf(String str) {
        return (g920) Enum.valueOf(g920.class, str);
    }

    public static g920[] values() {
        return (g920[]) i.clone();
    }
}
