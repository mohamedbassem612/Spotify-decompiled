package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tak0 {
    public static final tak0 a;
    public static final tak0 b;
    public static final tak0 c;
    public static final /* synthetic */ tak0[] d;

    static {
        tak0 tak0Var = new tak0("OnGoBackButtonClicked", 0);
        a = tak0Var;
        tak0 tak0Var2 = new tak0("OnEditMixOrderButtonClicked", 1);
        b = tak0Var2;
        tak0 tak0Var3 = new tak0("OnDismissRequest", 2);
        c = tak0Var3;
        d = new tak0[]{tak0Var, tak0Var2, tak0Var3};
    }

    public static tak0 valueOf(String str) {
        return (tak0) Enum.valueOf(tak0.class, str);
    }

    public static tak0[] values() {
        return (tak0[]) d.clone();
    }
}
