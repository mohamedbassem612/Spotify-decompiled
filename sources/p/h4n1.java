package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h4n1 {
    public static final h4n1 a;
    public static final h4n1 b;
    public static final /* synthetic */ h4n1[] c;

    static {
        h4n1 h4n1Var = new h4n1("CONNECT", 0);
        a = h4n1Var;
        h4n1 h4n1Var2 = new h4n1("CAST", 1);
        b = h4n1Var2;
        c = new h4n1[]{h4n1Var, h4n1Var2};
    }

    public static h4n1 valueOf(String str) {
        return (h4n1) Enum.valueOf(h4n1.class, str);
    }

    public static h4n1[] values() {
        return (h4n1[]) c.clone();
    }
}
