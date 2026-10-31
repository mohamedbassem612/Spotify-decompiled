package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fzf1 {
    public static final /* synthetic */ fzf1[] X;
    public static final fzf1 a;
    public static final fzf1 b;
    public static final fzf1 c;
    public static final fzf1 d;
    public static final fzf1 e;
    public static final fzf1 f;
    public static final fzf1 g;
    public static final fzf1 h;
    public static final fzf1 i;
    public static final fzf1 t;

    static {
        fzf1 fzf1Var = new fzf1("RowClicked", 0);
        a = fzf1Var;
        fzf1 fzf1Var2 = new fzf1("RowDragged", 1);
        b = fzf1Var2;
        fzf1 fzf1Var3 = new fzf1("MoveUp", 2);
        c = fzf1Var3;
        fzf1 fzf1Var4 = new fzf1("MoveDown", 3);
        d = fzf1Var4;
        fzf1 fzf1Var5 = new fzf1("AddToQueue", 4);
        e = fzf1Var5;
        fzf1 fzf1Var6 = new fzf1("PlayNext", 5);
        f = fzf1Var6;
        fzf1 fzf1Var7 = new fzf1("RemoveTrack", 6);
        g = fzf1Var7;
        fzf1 fzf1Var8 = new fzf1("ShowUpsell", 7);
        h = fzf1Var8;
        fzf1 fzf1Var9 = new fzf1("TrackSelected", 8);
        i = fzf1Var9;
        fzf1 fzf1Var10 = new fzf1("TrackUnselected", 9);
        t = fzf1Var10;
        X = new fzf1[]{fzf1Var, fzf1Var2, fzf1Var3, fzf1Var4, fzf1Var5, fzf1Var6, fzf1Var7, fzf1Var8, fzf1Var9, fzf1Var10};
    }

    public static fzf1 valueOf(String str) {
        return (fzf1) Enum.valueOf(fzf1.class, str);
    }

    public static fzf1[] values() {
        return (fzf1[]) X.clone();
    }
}
