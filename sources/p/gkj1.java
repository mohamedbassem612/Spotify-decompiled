package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gkj1 {
    public static final gkj1 a;
    public static final gkj1 b;
    public static final gkj1 c;
    public static final gkj1 d;
    public static final gkj1 e;
    public static final /* synthetic */ gkj1[] f;

    /* JADX INFO: Fake field, exist only in values array */
    gkj1 EF0;

    static {
        gkj1 gkj1Var = new gkj1("Unavailable", 0);
        gkj1 gkj1Var2 = new gkj1("NotDownloaded", 1);
        a = gkj1Var2;
        gkj1 gkj1Var3 = new gkj1("Waiting", 2);
        b = gkj1Var3;
        gkj1 gkj1Var4 = new gkj1("Downloading", 3);
        c = gkj1Var4;
        gkj1 gkj1Var5 = new gkj1("Downloaded", 4);
        d = gkj1Var5;
        gkj1 gkj1Var6 = new gkj1("Error", 5);
        e = gkj1Var6;
        f = new gkj1[]{gkj1Var, gkj1Var2, gkj1Var3, gkj1Var4, gkj1Var5, gkj1Var6};
    }

    public static gkj1 valueOf(String str) {
        return (gkj1) Enum.valueOf(gkj1.class, str);
    }

    public static gkj1[] values() {
        return (gkj1[]) f.clone();
    }
}
