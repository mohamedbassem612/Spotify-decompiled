package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h7x0 {
    public static final h7x0 a;
    public static final h7x0 b;
    public static final h7x0 c;
    public static final /* synthetic */ h7x0[] d;

    static {
        h7x0 h7x0Var = new h7x0("FOLLOW", 0);
        a = h7x0Var;
        h7x0 h7x0Var2 = new h7x0("UNFOLLOW", 1);
        b = h7x0Var2;
        h7x0 h7x0Var3 = new h7x0("FOLLOW_BACK", 2);
        c = h7x0Var3;
        d = new h7x0[]{h7x0Var, h7x0Var2, h7x0Var3};
    }

    public static h7x0 valueOf(String str) {
        return (h7x0) Enum.valueOf(h7x0.class, str);
    }

    public static h7x0[] values() {
        return (h7x0[]) d.clone();
    }
}
