package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lbk0 {
    public static final lbk0 a;
    public static final lbk0 b;
    public static final /* synthetic */ lbk0[] c;

    static {
        lbk0 lbk0Var = new lbk0("OnPlayClicked", 0);
        a = lbk0Var;
        lbk0 lbk0Var2 = new lbk0("OnStopClicked", 1);
        b = lbk0Var2;
        c = new lbk0[]{lbk0Var, lbk0Var2};
    }

    public static lbk0 valueOf(String str) {
        return (lbk0) Enum.valueOf(lbk0.class, str);
    }

    public static lbk0[] values() {
        return (lbk0[]) c.clone();
    }
}
