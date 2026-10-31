package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h3b1 {
    public static final h3b1 a;
    public static final h3b1 b;
    public static final h3b1 c;
    public static final h3b1 d;
    public static final /* synthetic */ h3b1[] e;

    static {
        h3b1 h3b1Var = new h3b1("SUCCESS", 0);
        a = h3b1Var;
        h3b1 h3b1Var2 = new h3b1("CANCELED", 1);
        b = h3b1Var2;
        h3b1 h3b1Var3 = new h3b1("CANCELLED_SESSION_CHANGED", 2);
        c = h3b1Var3;
        h3b1 h3b1Var4 = new h3b1("ABORTED", 3);
        d = h3b1Var4;
        e = new h3b1[]{h3b1Var, h3b1Var2, h3b1Var3, h3b1Var4};
    }

    public static h3b1 valueOf(String str) {
        return (h3b1) Enum.valueOf(h3b1.class, str);
    }

    public static h3b1[] values() {
        return (h3b1[]) e.clone();
    }
}
