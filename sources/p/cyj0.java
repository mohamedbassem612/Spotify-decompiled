package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cyj0 {
    public static final cyj0 a;
    public static final cyj0 b;
    public static final cyj0 c;
    public static final /* synthetic */ cyj0[] d;

    static {
        cyj0 cyj0Var = new cyj0("OnPrimaryButtonClicked", 0);
        a = cyj0Var;
        cyj0 cyj0Var2 = new cyj0("OnSecondaryButtonClicked", 1);
        b = cyj0Var2;
        cyj0 cyj0Var3 = new cyj0("OnDismissRequest", 2);
        c = cyj0Var3;
        d = new cyj0[]{cyj0Var, cyj0Var2, cyj0Var3};
    }

    public static cyj0 valueOf(String str) {
        return (cyj0) Enum.valueOf(cyj0.class, str);
    }

    public static cyj0[] values() {
        return (cyj0[]) d.clone();
    }
}
