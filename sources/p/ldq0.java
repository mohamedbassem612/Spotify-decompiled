package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ldq0 {
    public static final ldq0 a;
    public static final ldq0 b;
    public static final ldq0 c;
    public static final /* synthetic */ ldq0[] d;

    static {
        ldq0 ldq0Var = new ldq0("PositiveButtonClicked", 0);
        a = ldq0Var;
        ldq0 ldq0Var2 = new ldq0("NegativeButtonClicked", 1);
        b = ldq0Var2;
        ldq0 ldq0Var3 = new ldq0("DismissButtonClicked", 2);
        c = ldq0Var3;
        d = new ldq0[]{ldq0Var, ldq0Var2, ldq0Var3};
    }

    public static ldq0 valueOf(String str) {
        return (ldq0) Enum.valueOf(ldq0.class, str);
    }

    public static ldq0[] values() {
        return (ldq0[]) d.clone();
    }
}
