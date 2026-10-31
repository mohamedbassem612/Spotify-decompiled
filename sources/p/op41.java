package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class op41 {
    public static final op41 a;
    public static final op41 b;
    public static final /* synthetic */ op41[] c;

    static {
        op41 op41Var = new op41("PROMPT_TITLE_SCREEN", 0);
        a = op41Var;
        op41 op41Var2 = new op41("PROMPT_DETAIL_SCREEN", 1);
        b = op41Var2;
        c = new op41[]{op41Var, op41Var2};
    }

    public static op41 valueOf(String str) {
        return (op41) Enum.valueOf(op41.class, str);
    }

    public static op41[] values() {
        return (op41[]) c.clone();
    }
}
