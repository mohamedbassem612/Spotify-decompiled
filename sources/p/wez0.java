package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wez0 {
    public static final wez0 a;
    public static final wez0 b;
    public static final wez0 c;
    public static final /* synthetic */ wez0[] d;

    static {
        wez0 wez0Var = new wez0("AddClicked", 0);
        a = wez0Var;
        wez0 wez0Var2 = new wez0("HeartClicked", 1);
        wez0 wez0Var3 = new wez0("HideClicked", 2);
        b = wez0Var3;
        wez0 wez0Var4 = new wez0("BanClicked", 3);
        c = wez0Var4;
        d = new wez0[]{wez0Var, wez0Var2, wez0Var3, wez0Var4, new wez0("ProfileClicked", 4)};
    }

    public static wez0 valueOf(String str) {
        return (wez0) Enum.valueOf(wez0.class, str);
    }

    public static wez0[] values() {
        return (wez0[]) d.clone();
    }
}
