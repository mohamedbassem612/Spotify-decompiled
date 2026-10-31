package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xc21 {
    public static final xc21 a;
    public static final xc21 b;
    public static final xc21 c;
    public static final /* synthetic */ xc21[] d;

    static {
        xc21 xc21Var = new xc21("AUTOMATIC", 0);
        a = xc21Var;
        xc21 xc21Var2 = new xc21("HARDWARE", 1);
        b = xc21Var2;
        xc21 xc21Var3 = new xc21("SOFTWARE", 2);
        c = xc21Var3;
        d = new xc21[]{xc21Var, xc21Var2, xc21Var3};
    }

    public static xc21 valueOf(String str) {
        return (xc21) Enum.valueOf(xc21.class, str);
    }

    public static xc21[] values() {
        return (xc21[]) d.clone();
    }
}
