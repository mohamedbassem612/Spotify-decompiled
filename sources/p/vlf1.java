package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vlf1 {
    public static final vlf1 a;
    public static final vlf1 b;
    public static final vlf1 c;
    public static final vlf1 d;
    public static final vlf1 e;
    public static final vlf1 f;
    public static final /* synthetic */ vlf1[] g;

    static {
        vlf1 vlf1Var = new vlf1("RowClicked", 0);
        a = vlf1Var;
        vlf1 vlf1Var2 = new vlf1("RowLongClicked", 1);
        b = vlf1Var2;
        vlf1 vlf1Var3 = new vlf1("ContextMenuClicked", 2);
        c = vlf1Var3;
        vlf1 vlf1Var4 = new vlf1("AddToQueueSwiped", 3);
        d = vlf1Var4;
        vlf1 vlf1Var5 = new vlf1("AddToLibrarySwiped", 4);
        e = vlf1Var5;
        vlf1 vlf1Var6 = new vlf1("AddToLibraryClicked", 5);
        f = vlf1Var6;
        g = new vlf1[]{vlf1Var, vlf1Var2, vlf1Var3, vlf1Var4, vlf1Var5, vlf1Var6};
    }

    public static vlf1 valueOf(String str) {
        return (vlf1) Enum.valueOf(vlf1.class, str);
    }

    public static vlf1[] values() {
        return (vlf1[]) g.clone();
    }
}
