package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xk51 {
    public static final xk51 a;
    public static final xk51 b;
    public static final /* synthetic */ xk51[] c;

    static {
        xk51 xk51Var = new xk51("Collapsed", 0);
        a = xk51Var;
        xk51 xk51Var2 = new xk51("Expanded", 1);
        b = xk51Var2;
        c = new xk51[]{xk51Var, xk51Var2};
    }

    public static xk51 valueOf(String str) {
        return (xk51) Enum.valueOf(xk51.class, str);
    }

    public static xk51[] values() {
        return (xk51[]) c.clone();
    }
}
