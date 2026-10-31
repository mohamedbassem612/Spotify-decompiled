package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xnw0 {
    public static final xnw0 a;
    public static final xnw0 b;
    public static final xnw0 c;
    public static final /* synthetic */ xnw0[] d;

    static {
        xnw0 xnw0Var = new xnw0("DEFAULT", 0);
        a = xnw0Var;
        xnw0 xnw0Var2 = new xnw0("VERY_LOW", 1);
        b = xnw0Var2;
        xnw0 xnw0Var3 = new xnw0("HIGHEST", 2);
        c = xnw0Var3;
        d = new xnw0[]{xnw0Var, xnw0Var2, xnw0Var3};
    }

    public static xnw0 valueOf(String str) {
        return (xnw0) Enum.valueOf(xnw0.class, str);
    }

    public static xnw0[] values() {
        return (xnw0[]) d.clone();
    }
}
