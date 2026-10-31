package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ln9 {
    public static final ln9 a;
    public static final ln9 b;
    public static final /* synthetic */ ln9[] c;

    static {
        ln9 ln9Var = new ln9("Collapse", 0);
        a = ln9Var;
        ln9 ln9Var2 = new ln9("ContextMenu", 1);
        b = ln9Var2;
        c = new ln9[]{ln9Var, ln9Var2};
    }

    public static ln9 valueOf(String str) {
        return (ln9) Enum.valueOf(ln9.class, str);
    }

    public static ln9[] values() {
        return (ln9[]) c.clone();
    }
}
