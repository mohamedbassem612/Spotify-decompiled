package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pqa1 {
    public static final pqa1 a;
    public static final pqa1 b;
    public static final pqa1 c;
    public static final /* synthetic */ pqa1[] d;

    static {
        pqa1 pqa1Var = new pqa1("ContinueButtonClicked", 0);
        a = pqa1Var;
        pqa1 pqa1Var2 = new pqa1("CancelButtonClicked", 1);
        b = pqa1Var2;
        pqa1 pqa1Var3 = new pqa1("DialogDismissed", 2);
        c = pqa1Var3;
        d = new pqa1[]{pqa1Var, pqa1Var2, pqa1Var3};
    }

    public static pqa1 valueOf(String str) {
        return (pqa1) Enum.valueOf(pqa1.class, str);
    }

    public static pqa1[] values() {
        return (pqa1[]) d.clone();
    }
}
