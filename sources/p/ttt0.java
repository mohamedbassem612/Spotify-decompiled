package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ttt0 {
    public static final ttt0 a;
    public static final ttt0 b;
    public static final ttt0 c;
    public static final ttt0 d;
    public static final ttt0 e;
    public static final ttt0 f;
    public static final /* synthetic */ ttt0[] g;

    static {
        ttt0 ttt0Var = new ttt0("Explicit", 0);
        a = ttt0Var;
        ttt0 ttt0Var2 = new ttt0("ExplicitContentObfuscated", 1);
        b = ttt0Var2;
        ttt0 ttt0Var3 = new ttt0("Age", 2);
        c = ttt0Var3;
        ttt0 ttt0Var4 = new ttt0("UnavailableOffline", 3);
        d = ttt0Var4;
        ttt0 ttt0Var5 = new ttt0("BlockedByAccountManager", 4);
        e = ttt0Var5;
        ttt0 ttt0Var6 = new ttt0("Unknown", 5);
        f = ttt0Var6;
        g = new ttt0[]{ttt0Var, ttt0Var2, ttt0Var3, ttt0Var4, ttt0Var5, ttt0Var6};
    }

    public static ttt0 valueOf(String str) {
        return (ttt0) Enum.valueOf(ttt0.class, str);
    }

    public static ttt0[] values() {
        return (ttt0[]) g.clone();
    }
}
