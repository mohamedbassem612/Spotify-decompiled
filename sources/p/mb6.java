package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mb6 implements k260 {
    public static final mb6 a;
    public static final mb6 b;
    public static final mb6 c;
    public static final mb6 d;
    public static final /* synthetic */ mb6[] e;

    static {
        mb6 mb6Var = new mb6("EntityExplorer", 0);
        a = mb6Var;
        mb6 mb6Var2 = new mb6("PlayButton", 1);
        b = mb6Var2;
        mb6 mb6Var3 = new mb6("ShuffleButton", 2);
        c = mb6Var3;
        mb6 mb6Var4 = new mb6("Share", 3);
        d = mb6Var4;
        e = new mb6[]{mb6Var, mb6Var2, mb6Var3, mb6Var4};
    }

    public static mb6 valueOf(String str) {
        return (mb6) Enum.valueOf(mb6.class, str);
    }

    public static mb6[] values() {
        return (mb6[]) e.clone();
    }
}
