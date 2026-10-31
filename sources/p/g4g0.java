package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g4g0 {
    public static final g4g0 a;
    public static final g4g0 b;
    public static final /* synthetic */ g4g0[] c;

    static {
        g4g0 g4g0Var = new g4g0("MakePlaylistPrivateButtonClicked", 0);
        a = g4g0Var;
        g4g0 g4g0Var2 = new g4g0("OnCancelButtonClicked", 1);
        b = g4g0Var2;
        c = new g4g0[]{g4g0Var, g4g0Var2};
    }

    public static g4g0 valueOf(String str) {
        return (g4g0) Enum.valueOf(g4g0.class, str);
    }

    public static g4g0[] values() {
        return (g4g0[]) c.clone();
    }
}
