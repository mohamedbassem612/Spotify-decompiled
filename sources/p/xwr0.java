package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xwr0 {
    public static final xwr0 a;
    public static final xwr0 b;
    public static final /* synthetic */ xwr0[] c;

    static {
        xwr0 xwr0Var = new xwr0("EXPLICIT", 0);
        a = xwr0Var;
        xwr0 xwr0Var2 = new xwr0("VIDEOS", 1);
        b = xwr0Var2;
        c = new xwr0[]{xwr0Var, xwr0Var2};
    }

    public static xwr0 valueOf(String str) {
        return (xwr0) Enum.valueOf(xwr0.class, str);
    }

    public static xwr0[] values() {
        return (xwr0[]) c.clone();
    }
}
