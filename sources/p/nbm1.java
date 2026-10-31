package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nbm1 {
    public static final nbm1 a;
    public static final nbm1 b;
    public static final nbm1 c;
    public static final nbm1 d;
    public static final nbm1 e;
    public static final /* synthetic */ nbm1[] f;

    static {
        nbm1 nbm1Var = new nbm1("ECHO", 0);
        a = nbm1Var;
        nbm1 nbm1Var2 = new nbm1("GRAIN", 1);
        b = nbm1Var2;
        nbm1 nbm1Var3 = new nbm1("RINGS", 2);
        c = nbm1Var3;
        nbm1 nbm1Var4 = new nbm1("LOGO", 3);
        d = nbm1Var4;
        nbm1 nbm1Var5 = new nbm1("PLAYLIST_COVER", 4);
        e = nbm1Var5;
        f = new nbm1[]{nbm1Var, nbm1Var2, nbm1Var3, nbm1Var4, nbm1Var5};
    }

    public static nbm1 valueOf(String str) {
        return (nbm1) Enum.valueOf(nbm1.class, str);
    }

    public static nbm1[] values() {
        return (nbm1[]) f.clone();
    }
}
