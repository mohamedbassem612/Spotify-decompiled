package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r130 {
    public static final r130 a;
    public static final r130 b;
    public static final r130 c;
    public static final r130 d;
    public static final r130 e;
    public static final /* synthetic */ r130[] f;

    static {
        r130 r130Var = new r130("BackButtonClicked", 0);
        a = r130Var;
        r130 r130Var2 = new r130("HeaderTextClicked", 1);
        b = r130Var2;
        r130 r130Var3 = new r130("PlayButtonClicked", 2);
        c = r130Var3;
        r130 r130Var4 = new r130("CreateButtonClicked", 3);
        d = r130Var4;
        r130 r130Var5 = new r130("ContextMenuButtonClicked", 4);
        e = r130Var5;
        f = new r130[]{r130Var, r130Var2, r130Var3, r130Var4, r130Var5};
    }

    public static r130 valueOf(String str) {
        return (r130) Enum.valueOf(r130.class, str);
    }

    public static r130[] values() {
        return (r130[]) f.clone();
    }
}
