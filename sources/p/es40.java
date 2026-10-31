package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class es40 {
    public static final es40 a;
    public static final es40 b;
    public static final /* synthetic */ es40[] c;

    static {
        es40 es40Var = new es40("ButtonClicked", 0);
        a = es40Var;
        es40 es40Var2 = new es40("CardClicked", 1);
        b = es40Var2;
        c = new es40[]{es40Var, es40Var2};
    }

    public static es40 valueOf(String str) {
        return (es40) Enum.valueOf(es40.class, str);
    }

    public static es40[] values() {
        return (es40[]) c.clone();
    }
}
