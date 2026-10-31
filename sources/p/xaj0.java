package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xaj0 {
    public static final xaj0 a;
    public static final xaj0 b;
    public static final /* synthetic */ xaj0[] c;

    static {
        xaj0 xaj0Var = new xaj0("OnMaybeLaterClicked", 0);
        a = xaj0Var;
        xaj0 xaj0Var2 = new xaj0("OnExplorePremiumClicked", 1);
        b = xaj0Var2;
        c = new xaj0[]{xaj0Var, xaj0Var2};
    }

    public static xaj0 valueOf(String str) {
        return (xaj0) Enum.valueOf(xaj0.class, str);
    }

    public static xaj0[] values() {
        return (xaj0[]) c.clone();
    }
}
