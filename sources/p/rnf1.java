package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rnf1 {
    public static final rnf1 a;
    public static final rnf1 b;
    public static final rnf1 c;
    public static final rnf1 d;
    public static final rnf1 e;
    public static final rnf1 f;
    public static final rnf1 g;
    public static final rnf1 h;
    public static final /* synthetic */ rnf1[] i;

    static {
        rnf1 rnf1Var = new rnf1("AddToButtonClicked", 0);
        a = rnf1Var;
        rnf1 rnf1Var2 = new rnf1("ContextMenuClicked", 1);
        b = rnf1Var2;
        rnf1 rnf1Var3 = new rnf1("PlayButtonClicked", 2);
        c = rnf1Var3;
        rnf1 rnf1Var4 = new rnf1("BackButtonClicked", 3);
        d = rnf1Var4;
        rnf1 rnf1Var5 = new rnf1("ShuffleButtonClicked", 4);
        e = rnf1Var5;
        rnf1 rnf1Var6 = new rnf1("UnBanButtonClicked", 5);
        f = rnf1Var6;
        rnf1 rnf1Var7 = new rnf1("WatchFeedEntityExplorerShown", 6);
        g = rnf1Var7;
        rnf1 rnf1Var8 = new rnf1("WatchFeedEntityExplorerClicked", 7);
        h = rnf1Var8;
        i = new rnf1[]{rnf1Var, rnf1Var2, rnf1Var3, rnf1Var4, rnf1Var5, rnf1Var6, rnf1Var7, rnf1Var8};
    }

    public static rnf1 valueOf(String str) {
        return (rnf1) Enum.valueOf(rnf1.class, str);
    }

    public static rnf1[] values() {
        return (rnf1[]) i.clone();
    }
}
