package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xma0 {
    public static final xma0 a;
    public static final xma0 b;
    public static final xma0 c;
    public static final xma0 d;
    public static final /* synthetic */ xma0[] e;

    static {
        xma0 xma0Var = new xma0("PUBLIC", 0);
        a = xma0Var;
        xma0 xma0Var2 = new xma0("PROTECTED", 1);
        b = xma0Var2;
        xma0 xma0Var3 = new xma0("INTERNAL", 2);
        c = xma0Var3;
        xma0 xma0Var4 = new xma0("PRIVATE", 3);
        d = xma0Var4;
        e = new xma0[]{xma0Var, xma0Var2, xma0Var3, xma0Var4};
    }

    public static xma0 valueOf(String str) {
        return (xma0) Enum.valueOf(xma0.class, str);
    }

    public static xma0[] values() {
        return (xma0[]) e.clone();
    }
}
