package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wnt0 {
    public static final wnt0 a;
    public static final wnt0 b;
    public static final /* synthetic */ wnt0[] c;

    static {
        wnt0 wnt0Var = new wnt0("RowClicked", 0);
        a = wnt0Var;
        wnt0 wnt0Var2 = new wnt0("LearnMoreButtonClicked", 1);
        b = wnt0Var2;
        c = new wnt0[]{wnt0Var, wnt0Var2};
    }

    public static wnt0 valueOf(String str) {
        return (wnt0) Enum.valueOf(wnt0.class, str);
    }

    public static wnt0[] values() {
        return (wnt0[]) c.clone();
    }
}
