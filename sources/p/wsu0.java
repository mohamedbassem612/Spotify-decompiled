package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wsu0 {
    public static final wsu0 a;
    public static final wsu0 b;
    public static final /* synthetic */ wsu0[] c;

    static {
        wsu0 wsu0Var = new wsu0("RowClicked", 0);
        a = wsu0Var;
        wsu0 wsu0Var2 = new wsu0("AddToLibraryClicked", 1);
        b = wsu0Var2;
        c = new wsu0[]{wsu0Var, wsu0Var2};
    }

    public static wsu0 valueOf(String str) {
        return (wsu0) Enum.valueOf(wsu0.class, str);
    }

    public static wsu0[] values() {
        return (wsu0[]) c.clone();
    }
}
