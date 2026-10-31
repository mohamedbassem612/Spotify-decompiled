package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uf6 {
    public static final uf6 a;
    public static final uf6 b;
    public static final uf6 c;
    public static final uf6 d;
    public static final uf6 e;
    public static final uf6 f;
    public static final uf6 g;
    public static final /* synthetic */ uf6[] h;

    static {
        uf6 uf6Var = new uf6("OVERVIEW", 0);
        a = uf6Var;
        uf6 uf6Var2 = new uf6("RANK_1_ARTIST", 1);
        b = uf6Var2;
        uf6 uf6Var3 = new uf6("RANK_2_ARTIST", 2);
        c = uf6Var3;
        uf6 uf6Var4 = new uf6("RANK_3_ARTIST", 3);
        d = uf6Var4;
        uf6 uf6Var5 = new uf6("RANK_4_ARTIST", 4);
        e = uf6Var5;
        uf6 uf6Var6 = new uf6("RANK_5_ARTIST", 5);
        f = uf6Var6;
        uf6 uf6Var7 = new uf6("BONUS", 6);
        g = uf6Var7;
        h = new uf6[]{uf6Var, uf6Var2, uf6Var3, uf6Var4, uf6Var5, uf6Var6, uf6Var7};
    }

    public static uf6 valueOf(String str) {
        return (uf6) Enum.valueOf(uf6.class, str);
    }

    public static uf6[] values() {
        return (uf6[]) h.clone();
    }
}
