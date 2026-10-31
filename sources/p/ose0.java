package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ose0 {
    public static final ose0 a;
    public static final ose0 b;
    public static final ose0 c;
    public static final ose0 d;
    public static final ose0 e;
    public static final ose0 f;
    public static final ose0 g;
    public static final /* synthetic */ ose0[] h;

    static {
        ose0 ose0Var = new ose0("VERBOSE", 0);
        a = ose0Var;
        ose0 ose0Var2 = new ose0("DEBUG", 1);
        b = ose0Var2;
        ose0 ose0Var3 = new ose0("INFO", 2);
        c = ose0Var3;
        ose0 ose0Var4 = new ose0("WARNING", 3);
        d = ose0Var4;
        ose0 ose0Var5 = new ose0("ERROR", 4);
        e = ose0Var5;
        ose0 ose0Var6 = new ose0("BREADCRUMB", 5);
        f = ose0Var6;
        ose0 ose0Var7 = new ose0("YELL", 6);
        g = ose0Var7;
        h = new ose0[]{ose0Var, ose0Var2, ose0Var3, ose0Var4, ose0Var5, ose0Var6, ose0Var7};
    }

    public static ose0 valueOf(String str) {
        return (ose0) Enum.valueOf(ose0.class, str);
    }

    public static ose0[] values() {
        return (ose0[]) h.clone();
    }
}
