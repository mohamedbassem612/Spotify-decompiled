package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rwf1 {
    public static final rwf1 a;
    public static final rwf1 b;
    public static final rwf1 c;
    public static final rwf1 d;
    public static final rwf1 e;
    public static final rwf1 f;
    public static final rwf1 g;
    public static final rwf1 h;
    public static final rwf1 i;
    public static final /* synthetic */ rwf1[] t;

    static {
        rwf1 rwf1Var = new rwf1("RowClicked", 0);
        a = rwf1Var;
        rwf1 rwf1Var2 = new rwf1("RowLongClicked", 1);
        b = rwf1Var2;
        rwf1 rwf1Var3 = new rwf1("ContextMenuClicked", 2);
        c = rwf1Var3;
        rwf1 rwf1Var4 = new rwf1("AddClicked", 3);
        d = rwf1Var4;
        rwf1 rwf1Var5 = new rwf1("HeartClicked", 4);
        e = rwf1Var5;
        rwf1 rwf1Var6 = new rwf1("HideClicked", 5);
        f = rwf1Var6;
        rwf1 rwf1Var7 = new rwf1("BanClicked", 6);
        g = rwf1Var7;
        rwf1 rwf1Var8 = new rwf1("ProfileClicked", 7);
        h = rwf1Var8;
        rwf1 rwf1Var9 = new rwf1("PreviewClicked", 8);
        i = rwf1Var9;
        t = new rwf1[]{rwf1Var, rwf1Var2, rwf1Var3, rwf1Var4, rwf1Var5, rwf1Var6, rwf1Var7, rwf1Var8, rwf1Var9};
    }

    public static rwf1 valueOf(String str) {
        return (rwf1) Enum.valueOf(rwf1.class, str);
    }

    public static rwf1[] values() {
        return (rwf1[]) t.clone();
    }
}
