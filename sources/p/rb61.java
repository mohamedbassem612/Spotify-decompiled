package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rb61 {
    public static final rb61 a;
    public static final rb61 b;
    public static final rb61 c;
    public static final /* synthetic */ rb61[] d;

    static {
        rb61 rb61Var = new rb61("LOADING", 0);
        a = rb61Var;
        rb61 rb61Var2 = new rb61("SELECTED", 1);
        b = rb61Var2;
        rb61 rb61Var3 = new rb61("UNSELECTED", 2);
        c = rb61Var3;
        d = new rb61[]{rb61Var, rb61Var2, rb61Var3};
    }

    public static rb61 valueOf(String str) {
        return (rb61) Enum.valueOf(rb61.class, str);
    }

    public static rb61[] values() {
        return (rb61[]) d.clone();
    }
}
