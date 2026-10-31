package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l311 {
    public static final l311 a;
    public static final l311 b;
    public static final l311 c;
    public static final l311 d;
    public static final l311 e;
    public static final l311 f;
    public static final /* synthetic */ l311[] g;

    static {
        l311 l311Var = new l311("ShutDown", 0);
        a = l311Var;
        l311 l311Var2 = new l311("ShuttingDown", 1);
        b = l311Var2;
        l311 l311Var3 = new l311("Inactive", 2);
        c = l311Var3;
        l311 l311Var4 = new l311("InactivePendingWork", 3);
        d = l311Var4;
        l311 l311Var5 = new l311("Idle", 4);
        e = l311Var5;
        l311 l311Var6 = new l311("PendingWork", 5);
        f = l311Var6;
        g = new l311[]{l311Var, l311Var2, l311Var3, l311Var4, l311Var5, l311Var6};
    }

    public static l311 valueOf(String str) {
        return (l311) Enum.valueOf(l311.class, str);
    }

    public static l311[] values() {
        return (l311[]) g.clone();
    }
}
