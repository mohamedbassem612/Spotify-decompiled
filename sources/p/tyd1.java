package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tyd1 {
    public static final tyd1 a;
    public static final tyd1 b;
    public static final /* synthetic */ tyd1[] c;

    /* JADX INFO: Fake field, exist only in values array */
    tyd1 EF0;

    static {
        tyd1 tyd1Var = new tyd1("GREEN", 0);
        tyd1 tyd1Var2 = new tyd1("WHITE", 1);
        a = tyd1Var2;
        tyd1 tyd1Var3 = new tyd1("BLACK", 2);
        b = tyd1Var3;
        c = new tyd1[]{tyd1Var, tyd1Var2, tyd1Var3};
    }

    public static tyd1 valueOf(String str) {
        return (tyd1) Enum.valueOf(tyd1.class, str);
    }

    public static tyd1[] values() {
        return (tyd1[]) c.clone();
    }
}
