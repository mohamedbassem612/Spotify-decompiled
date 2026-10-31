package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wvl1 {
    public static final wvl1 a;
    public static final wvl1 b;
    public static final wvl1 c;
    public static final wvl1 d;
    public static final wvl1 e;
    public static final wvl1 f;
    public static final /* synthetic */ wvl1[] g;

    static {
        wvl1 wvl1Var = new wvl1("ENQUEUED", 0);
        a = wvl1Var;
        wvl1 wvl1Var2 = new wvl1("RUNNING", 1);
        b = wvl1Var2;
        wvl1 wvl1Var3 = new wvl1("SUCCEEDED", 2);
        c = wvl1Var3;
        wvl1 wvl1Var4 = new wvl1("FAILED", 3);
        d = wvl1Var4;
        wvl1 wvl1Var5 = new wvl1("BLOCKED", 4);
        e = wvl1Var5;
        wvl1 wvl1Var6 = new wvl1("CANCELLED", 5);
        f = wvl1Var6;
        g = new wvl1[]{wvl1Var, wvl1Var2, wvl1Var3, wvl1Var4, wvl1Var5, wvl1Var6};
    }

    public static wvl1 valueOf(String str) {
        return (wvl1) Enum.valueOf(wvl1.class, str);
    }

    public static wvl1[] values() {
        return (wvl1[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
