package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tgu0 {
    public static final tgu0 a;
    public static final tgu0 b;
    public static final tgu0 c;
    public static final tgu0 d;
    public static final tgu0 e;
    public static final tgu0 f;
    public static final /* synthetic */ tgu0[] g;

    static {
        tgu0 tgu0Var = new tgu0("AddToButtonClicked", 0);
        a = tgu0Var;
        tgu0 tgu0Var2 = new tgu0("CardClicked", 1);
        b = tgu0Var2;
        tgu0 tgu0Var3 = new tgu0("CardLongClicked", 2);
        c = tgu0Var3;
        tgu0 tgu0Var4 = new tgu0("ContextMenuButtonClicked", 3);
        d = tgu0Var4;
        tgu0 tgu0Var5 = new tgu0("LikeButtonClicked", 4);
        e = tgu0Var5;
        tgu0 tgu0Var6 = new tgu0("PlayButtonClicked", 5);
        f = tgu0Var6;
        g = new tgu0[]{tgu0Var, tgu0Var2, tgu0Var3, tgu0Var4, tgu0Var5, tgu0Var6};
    }

    public static tgu0 valueOf(String str) {
        return (tgu0) Enum.valueOf(tgu0.class, str);
    }

    public static tgu0[] values() {
        return (tgu0[]) g.clone();
    }
}
