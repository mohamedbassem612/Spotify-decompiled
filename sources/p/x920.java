package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x920 {
    public static final x920 a;
    public static final x920 b;
    public static final /* synthetic */ x920[] c;

    static {
        x920 x920Var = new x920("TagFilterClicked", 0);
        a = x920Var;
        x920 x920Var2 = new x920("AddToFiltersClicked", 1);
        b = x920Var2;
        c = new x920[]{x920Var, x920Var2};
    }

    public static x920 valueOf(String str) {
        return (x920) Enum.valueOf(x920.class, str);
    }

    public static x920[] values() {
        return (x920[]) c.clone();
    }
}
