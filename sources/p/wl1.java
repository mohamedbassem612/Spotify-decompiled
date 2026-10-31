package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wl1 {
    public static final wl1 a;
    public static final wl1 b;
    public static final /* synthetic */ wl1[] c;

    static {
        wl1 wl1Var = new wl1("AddHit", 0);
        a = wl1Var;
        wl1 wl1Var2 = new wl1("AddedHit", 1);
        b = wl1Var2;
        c = new wl1[]{wl1Var, wl1Var2};
    }

    public static wl1 valueOf(String str) {
        return (wl1) Enum.valueOf(wl1.class, str);
    }

    public static wl1[] values() {
        return (wl1[]) c.clone();
    }
}
