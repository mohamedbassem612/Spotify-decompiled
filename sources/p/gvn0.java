package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gvn0 {
    public static final gvn0 a;
    public static final gvn0 b;
    public static final gvn0 c;
    public static final gvn0 d;
    public static final gvn0 e;
    public static final /* synthetic */ gvn0[] f;

    /* JADX INFO: Fake field, exist only in values array */
    gvn0 EF0;

    static {
        gvn0 gvn0Var = new gvn0("NONE", 0);
        gvn0 gvn0Var2 = new gvn0("HOME", 1);
        a = gvn0Var2;
        gvn0 gvn0Var3 = new gvn0("SEARCH", 2);
        b = gvn0Var3;
        gvn0 gvn0Var4 = new gvn0("YOUR_LIBRARY", 3);
        c = gvn0Var4;
        gvn0 gvn0Var5 = new gvn0("PREMIUM", 4);
        d = gvn0Var5;
        gvn0 gvn0Var6 = new gvn0("CREATE", 5);
        e = gvn0Var6;
        f = new gvn0[]{gvn0Var, gvn0Var2, gvn0Var3, gvn0Var4, gvn0Var5, gvn0Var6};
    }

    public static gvn0 valueOf(String str) {
        return (gvn0) Enum.valueOf(gvn0.class, str);
    }

    public static gvn0[] values() {
        return (gvn0[]) f.clone();
    }
}
