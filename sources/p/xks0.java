package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xks0 {
    public static final xks0 a;
    public static final xks0 b;
    public static final xks0 c;
    public static final xks0 d;
    public static final xks0 e;
    public static final xks0 f;
    public static final xks0 g;
    public static final /* synthetic */ xks0[] h;

    static {
        xks0 xks0Var = new xks0("Unspecified", 0);
        a = xks0Var;
        xks0 xks0Var2 = new xks0("Draft", 1);
        b = xks0Var2;
        xks0 xks0Var3 = new xks0("Active", 2);
        c = xks0Var3;
        xks0 xks0Var4 = new xks0("Canceled", 3);
        d = xks0Var4;
        xks0 xks0Var5 = new xks0("Deleted", 4);
        e = xks0Var5;
        xks0 xks0Var6 = new xks0("Rejected", 5);
        f = xks0Var6;
        xks0 xks0Var7 = new xks0("Inactive", 6);
        g = xks0Var7;
        h = new xks0[]{xks0Var, xks0Var2, xks0Var3, xks0Var4, xks0Var5, xks0Var6, xks0Var7};
    }

    public static xks0 valueOf(String str) {
        return (xks0) Enum.valueOf(xks0.class, str);
    }

    public static xks0[] values() {
        return (xks0[]) h.clone();
    }
}
