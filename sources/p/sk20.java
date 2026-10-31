package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sk20 {
    public static final sk20 a;
    public static final sk20 b;
    public static final sk20 c;
    public static final sk20 d;
    public static final /* synthetic */ sk20[] e;

    static {
        sk20 sk20Var = new sk20("Audiobook", 0);
        a = sk20Var;
        sk20 sk20Var2 = new sk20("ShowEpisode", 1);
        b = sk20Var2;
        sk20 sk20Var3 = new sk20("Track", 2);
        c = sk20Var3;
        sk20 sk20Var4 = new sk20("Unknown", 3);
        d = sk20Var4;
        e = new sk20[]{sk20Var, sk20Var2, sk20Var3, sk20Var4};
    }

    public static sk20 valueOf(String str) {
        return (sk20) Enum.valueOf(sk20.class, str);
    }

    public static sk20[] values() {
        return (sk20[]) e.clone();
    }
}
