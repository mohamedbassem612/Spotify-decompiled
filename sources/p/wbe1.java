package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wbe1 {
    public static final wbe1 a;
    public static final wbe1 b;
    public static final wbe1 c;
    public static final wbe1 d;
    public static final wbe1 e;
    public static final /* synthetic */ wbe1[] f;

    static {
        wbe1 wbe1Var = new wbe1("CONFIDENCE", 0);
        a = wbe1Var;
        wbe1 wbe1Var2 = new wbe1("AREA", 1);
        b = wbe1Var2;
        wbe1 wbe1Var3 = new wbe1("DISTANCE_TO_TOP_EDGE", 2);
        c = wbe1Var3;
        wbe1 wbe1Var4 = new wbe1("DISTANCE_TO_CENTER", 3);
        d = wbe1Var4;
        wbe1 wbe1Var5 = new wbe1("WORDS_COUNT", 4);
        e = wbe1Var5;
        f = new wbe1[]{wbe1Var, wbe1Var2, wbe1Var3, wbe1Var4, wbe1Var5};
    }

    public static wbe1 valueOf(String str) {
        return (wbe1) Enum.valueOf(wbe1.class, str);
    }

    public static wbe1[] values() {
        return (wbe1[]) f.clone();
    }
}
