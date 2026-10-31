package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n621 {
    public static final n621 a;
    public static final n621 b;
    public static final n621 c;
    public static final /* synthetic */ n621[] d;

    static {
        n621 n621Var = new n621("NegativeSignalHit", 0);
        a = n621Var;
        n621 n621Var2 = new n621("BanHit", 1);
        b = n621Var2;
        n621 n621Var3 = new n621("UnbanHit", 2);
        c = n621Var3;
        d = new n621[]{n621Var, n621Var2, n621Var3};
    }

    public static n621 valueOf(String str) {
        return (n621) Enum.valueOf(n621.class, str);
    }

    public static n621[] values() {
        return (n621[]) d.clone();
    }
}
