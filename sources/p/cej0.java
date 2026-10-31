package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cej0 {
    public static final cej0 a;
    public static final cej0 b;
    public static final /* synthetic */ cej0[] c;

    static {
        cej0 cej0Var = new cej0("OnYesReorderClicked", 0);
        a = cej0Var;
        cej0 cej0Var2 = new cej0("OnKeepCurrentOrderClicked", 1);
        b = cej0Var2;
        c = new cej0[]{cej0Var, cej0Var2};
    }

    public static cej0 valueOf(String str) {
        return (cej0) Enum.valueOf(cej0.class, str);
    }

    public static cej0[] values() {
        return (cej0[]) c.clone();
    }
}
