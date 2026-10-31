package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bi00 {
    public static final bi00 a;
    public static final bi00 b;
    public static final /* synthetic */ bi00[] c;

    static {
        bi00 bi00Var = new bi00("ClickRow", 0);
        a = bi00Var;
        bi00 bi00Var2 = new bi00("ClickCta", 1);
        b = bi00Var2;
        c = new bi00[]{bi00Var, bi00Var2};
    }

    public static bi00 valueOf(String str) {
        return (bi00) Enum.valueOf(bi00.class, str);
    }

    public static bi00[] values() {
        return (bi00[]) c.clone();
    }
}
