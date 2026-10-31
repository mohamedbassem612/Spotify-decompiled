package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class of61 {
    public static final of61 a;
    public static final of61 b;
    public static final /* synthetic */ of61[] c;

    static {
        of61 of61Var = new of61("FLOW", 0);
        a = of61Var;
        of61 of61Var2 = new of61("SEARCH", 1);
        b = of61Var2;
        c = new of61[]{of61Var, of61Var2};
    }

    public static of61 valueOf(String str) {
        return (of61) Enum.valueOf(of61.class, str);
    }

    public static of61[] values() {
        return (of61[]) c.clone();
    }
}
