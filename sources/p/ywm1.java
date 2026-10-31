package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ywm1 {
    public static final ywm1 a;
    public static final ywm1 b;
    public static final ywm1 c;
    public static final ywm1 d;
    public static final ywm1 e;
    public static final ywm1 f;
    public static final ywm1 g;
    public static final ywm1 h;
    public static final ywm1 i;
    public static final /* synthetic */ ywm1[] t;

    static {
        ywm1 ywm1Var = new ywm1("CREATOR", 0);
        a = ywm1Var;
        ywm1 ywm1Var2 = new ywm1("NAME", 1);
        b = ywm1Var2;
        ywm1 ywm1Var3 = new ywm1("ADDED", 2);
        c = ywm1Var3;
        ywm1 ywm1Var4 = new ywm1("PLAYED", 3);
        ywm1 ywm1Var5 = new ywm1("CUSTOM", 4);
        d = ywm1Var5;
        ywm1 ywm1Var6 = new ywm1("UPDATED", 5);
        e = ywm1Var6;
        ywm1 ywm1Var7 = new ywm1("RECENT", 6);
        f = ywm1Var7;
        ywm1 ywm1Var8 = new ywm1("RELEVANCE", 7);
        g = ywm1Var8;
        ywm1 ywm1Var9 = new ywm1("DATE", 8);
        h = ywm1Var9;
        ywm1 ywm1Var10 = new ywm1("RELEASE_DATE", 9);
        i = ywm1Var10;
        t = new ywm1[]{ywm1Var, ywm1Var2, ywm1Var3, ywm1Var4, ywm1Var5, ywm1Var6, ywm1Var7, ywm1Var8, ywm1Var9, ywm1Var10};
    }

    public static ywm1 valueOf(String str) {
        return (ywm1) Enum.valueOf(ywm1.class, str);
    }

    public static ywm1[] values() {
        return (ywm1[]) t.clone();
    }
}
