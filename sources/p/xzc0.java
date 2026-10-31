package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xzc0 {
    public static final xzc0 a;
    public static final xzc0 b;
    public static final xzc0 c;
    public static final /* synthetic */ xzc0[] d;

    static {
        xzc0 xzc0Var = new xzc0("ShuffleOnly", 0);
        a = xzc0Var;
        xzc0 xzc0Var2 = new xzc0("JumpInOnDemand", 1);
        b = xzc0Var2;
        xzc0 xzc0Var3 = new xzc0("None", 2);
        c = xzc0Var3;
        d = new xzc0[]{xzc0Var, xzc0Var2, xzc0Var3};
    }

    public static xzc0 valueOf(String str) {
        return (xzc0) Enum.valueOf(xzc0.class, str);
    }

    public static xzc0[] values() {
        return (xzc0[]) d.clone();
    }
}
