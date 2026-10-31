package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wdj1 {
    public static final wdj1 a;
    public static final wdj1 b;
    public static final wdj1 c;
    public static final wdj1 d;
    public static final /* synthetic */ wdj1[] e;

    static {
        wdj1 wdj1Var = new wdj1("TitleRowClicked", 0);
        a = wdj1Var;
        wdj1 wdj1Var2 = new wdj1("MainImageClicked", 1);
        b = wdj1Var2;
        wdj1 wdj1Var3 = new wdj1("PlayButtonClicked", 2);
        c = wdj1Var3;
        wdj1 wdj1Var4 = new wdj1("LockButtonClicked", 3);
        d = wdj1Var4;
        e = new wdj1[]{wdj1Var, wdj1Var2, wdj1Var3, wdj1Var4};
    }

    public static wdj1 valueOf(String str) {
        return (wdj1) Enum.valueOf(wdj1.class, str);
    }

    public static wdj1[] values() {
        return (wdj1[]) e.clone();
    }
}
