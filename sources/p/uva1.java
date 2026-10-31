package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uva1 {
    public static final uva1 a;
    public static final uva1 b;
    public static final uva1 c;
    public static final /* synthetic */ uva1[] d;

    static {
        uva1 uva1Var = new uva1("ContinueButtonClicked", 0);
        a = uva1Var;
        uva1 uva1Var2 = new uva1("CancelButtonClicked", 1);
        b = uva1Var2;
        uva1 uva1Var3 = new uva1("DialogDismissed", 2);
        c = uva1Var3;
        d = new uva1[]{uva1Var, uva1Var2, uva1Var3};
    }

    public static uva1 valueOf(String str) {
        return (uva1) Enum.valueOf(uva1.class, str);
    }

    public static uva1[] values() {
        return (uva1[]) d.clone();
    }
}
