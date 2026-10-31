package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xpr0 {
    public static final xpr0 a;
    public static final xpr0 b;
    public static final xpr0 c;
    public static final /* synthetic */ xpr0[] d;

    static {
        xpr0 xpr0Var = new xpr0("ALL", 0);
        a = xpr0Var;
        xpr0 xpr0Var2 = new xpr0("ONLY_NON_SYNTHESIZED", 1);
        b = xpr0Var2;
        xpr0 xpr0Var3 = new xpr0("NONE", 2);
        c = xpr0Var3;
        d = new xpr0[]{xpr0Var, xpr0Var2, xpr0Var3};
    }

    public static xpr0 valueOf(String str) {
        return (xpr0) Enum.valueOf(xpr0.class, str);
    }

    public static xpr0[] values() {
        return (xpr0[]) d.clone();
    }
}
