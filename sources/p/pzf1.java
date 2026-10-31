package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pzf1 {
    public static final pzf1 a;
    public static final pzf1 b;
    public static final pzf1 c;
    public static final pzf1 d;
    public static final pzf1 e;
    public static final pzf1 f;
    public static final /* synthetic */ pzf1[] g;

    static {
        pzf1 pzf1Var = new pzf1("RowClicked", 0);
        a = pzf1Var;
        pzf1 pzf1Var2 = new pzf1("RowLongClicked", 1);
        b = pzf1Var2;
        pzf1 pzf1Var3 = new pzf1("ContextMenuClicked", 2);
        c = pzf1Var3;
        pzf1 pzf1Var4 = new pzf1("AddToQueueSwiped", 3);
        d = pzf1Var4;
        pzf1 pzf1Var5 = new pzf1("AddToLibrarySwiped", 4);
        e = pzf1Var5;
        pzf1 pzf1Var6 = new pzf1("AddToLibraryClicked", 5);
        f = pzf1Var6;
        g = new pzf1[]{pzf1Var, pzf1Var2, pzf1Var3, pzf1Var4, pzf1Var5, pzf1Var6};
    }

    public static pzf1 valueOf(String str) {
        return (pzf1) Enum.valueOf(pzf1.class, str);
    }

    public static pzf1[] values() {
        return (pzf1[]) g.clone();
    }
}
