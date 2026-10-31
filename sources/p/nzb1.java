package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nzb1 {
    public static final nzb1 X;
    public static final /* synthetic */ nzb1[] Y;
    public static final nzb1 a;
    public static final nzb1 b;
    public static final nzb1 c;
    public static final nzb1 d;
    public static final nzb1 e;
    public static final nzb1 f;
    public static final nzb1 g;
    public static final nzb1 h;
    public static final nzb1 i;
    public static final nzb1 t;

    static {
        nzb1 nzb1Var = new nzb1("Album", 0);
        a = nzb1Var;
        nzb1 nzb1Var2 = new nzb1("Artist", 1);
        b = nzb1Var2;
        nzb1 nzb1Var3 = new nzb1("Book", 2);
        c = nzb1Var3;
        nzb1 nzb1Var4 = new nzb1("Downloaded", 3);
        d = nzb1Var4;
        nzb1 nzb1Var5 = new nzb1("Playlist", 4);
        e = nzb1Var5;
        nzb1 nzb1Var6 = new nzb1("Podcast", 5);
        f = nzb1Var6;
        nzb1 nzb1Var7 = new nzb1("Tag", 6);
        g = nzb1Var7;
        nzb1 nzb1Var8 = new nzb1("Unfiltered", 7);
        h = nzb1Var8;
        nzb1 nzb1Var9 = new nzb1("Event", 8);
        i = nzb1Var9;
        nzb1 nzb1Var10 = new nzb1("Author", 9);
        t = nzb1Var10;
        nzb1 nzb1Var11 = new nzb1("Course", 10);
        X = nzb1Var11;
        Y = new nzb1[]{nzb1Var, nzb1Var2, nzb1Var3, nzb1Var4, nzb1Var5, nzb1Var6, nzb1Var7, nzb1Var8, nzb1Var9, nzb1Var10, nzb1Var11};
    }

    public static nzb1 valueOf(String str) {
        return (nzb1) Enum.valueOf(nzb1.class, str);
    }

    public static nzb1[] values() {
        return (nzb1[]) Y.clone();
    }
}
