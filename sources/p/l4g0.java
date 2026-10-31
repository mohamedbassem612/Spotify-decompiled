package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l4g0 {
    public static final l4g0 a;
    public static final l4g0 b;
    public static final /* synthetic */ l4g0[] c;

    static {
        l4g0 l4g0Var = new l4g0("CancelButtonClicked", 0);
        a = l4g0Var;
        l4g0 l4g0Var2 = new l4g0("MakePlaylistVisibleOnProfileClicked", 1);
        b = l4g0Var2;
        c = new l4g0[]{l4g0Var, l4g0Var2};
    }

    public static l4g0 valueOf(String str) {
        return (l4g0) Enum.valueOf(l4g0.class, str);
    }

    public static l4g0[] values() {
        return (l4g0[]) c.clone();
    }
}
