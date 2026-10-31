package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xwj1 {
    public static final xwj1 a;
    public static final xwj1 b;
    public static final /* synthetic */ xwj1[] c;

    static {
        xwj1 xwj1Var = new xwj1("RowClicked", 0);
        a = xwj1Var;
        xwj1 xwj1Var2 = new xwj1("RowLongClicked", 1);
        b = xwj1Var2;
        c = new xwj1[]{xwj1Var, xwj1Var2};
    }

    public static xwj1 valueOf(String str) {
        return (xwj1) Enum.valueOf(xwj1.class, str);
    }

    public static xwj1[] values() {
        return (xwj1[]) c.clone();
    }
}
