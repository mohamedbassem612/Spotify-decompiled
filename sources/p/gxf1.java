package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gxf1 {
    public static final gxf1 a;
    public static final gxf1 b;
    public static final gxf1 c;
    public static final gxf1 d;
    public static final gxf1 e;
    public static final gxf1 f;
    public static final gxf1 g;
    public static final /* synthetic */ gxf1[] h;

    static {
        gxf1 gxf1Var = new gxf1("AddClicked", 0);
        a = gxf1Var;
        gxf1 gxf1Var2 = new gxf1("RowClicked", 1);
        b = gxf1Var2;
        gxf1 gxf1Var3 = new gxf1("RowLongClicked", 2);
        c = gxf1Var3;
        gxf1 gxf1Var4 = new gxf1("ContextMenuClicked", 3);
        d = gxf1Var4;
        gxf1 gxf1Var5 = new gxf1("HeartClicked", 4);
        e = gxf1Var5;
        gxf1 gxf1Var6 = new gxf1("HideClicked", 5);
        f = gxf1Var6;
        gxf1 gxf1Var7 = new gxf1("BanClicked", 6);
        g = gxf1Var7;
        h = new gxf1[]{gxf1Var, gxf1Var2, gxf1Var3, gxf1Var4, gxf1Var5, gxf1Var6, gxf1Var7};
    }

    public static gxf1 valueOf(String str) {
        return (gxf1) Enum.valueOf(gxf1.class, str);
    }

    public static gxf1[] values() {
        return (gxf1[]) h.clone();
    }
}
