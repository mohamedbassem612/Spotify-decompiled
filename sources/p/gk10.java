package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gk10 {
    public static final gk10 a;
    public static final gk10 b;
    public static final gk10 c;
    public static final gk10 d;
    public static final gk10 e;
    public static final /* synthetic */ gk10[] f;

    static {
        gk10 gk10Var = new gk10("OFFLINE", 0);
        a = gk10Var;
        gk10 gk10Var2 = new gk10("SERVER_ERROR", 1);
        b = gk10Var2;
        gk10 gk10Var3 = new gk10("CLIENT_ERROR", 2);
        c = gk10Var3;
        gk10 gk10Var4 = new gk10("UNEXPECTED_RESPONSE", 3);
        d = gk10Var4;
        gk10 gk10Var5 = new gk10("UNKNOWN", 4);
        e = gk10Var5;
        f = new gk10[]{gk10Var, gk10Var2, gk10Var3, gk10Var4, gk10Var5};
    }

    public static gk10 valueOf(String str) {
        return (gk10) Enum.valueOf(gk10.class, str);
    }

    public static gk10[] values() {
        return (gk10[]) f.clone();
    }
}
