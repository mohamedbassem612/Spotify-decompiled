package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gf91 {
    public static final gf91 a;
    public static final gf91 b;
    public static final gf91 c;
    public static final gf91 d;
    public static final /* synthetic */ gf91[] e;

    static {
        gf91 gf91Var = new gf91("Media", 0);
        a = gf91Var;
        gf91 gf91Var2 = new gf91("Leading", 1);
        gf91 gf91Var3 = new gf91("Pretitle", 2);
        b = gf91Var3;
        gf91 gf91Var4 = new gf91("Title", 3);
        c = gf91Var4;
        gf91 gf91Var5 = new gf91("Subtitle", 4);
        d = gf91Var5;
        e = new gf91[]{gf91Var, gf91Var2, gf91Var3, gf91Var4, gf91Var5, new gf91("Trailing", 5), new gf91("Body", 6), new gf91("Footer", 7)};
    }

    public static gf91 valueOf(String str) {
        return (gf91) Enum.valueOf(gf91.class, str);
    }

    public static gf91[] values() {
        return (gf91[]) e.clone();
    }
}
