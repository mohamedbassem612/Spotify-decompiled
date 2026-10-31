package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c630 {
    public static final c630 a;
    public static final c630 b;
    public static final /* synthetic */ c630[] c;

    static {
        c630 c630Var = new c630("SHOWN", 0);
        a = c630Var;
        c630 c630Var2 = new c630("POSITIVE_BUTTON_CLICKED", 1);
        b = c630Var2;
        c = new c630[]{c630Var, c630Var2};
    }

    public static c630 valueOf(String str) {
        return (c630) Enum.valueOf(c630.class, str);
    }

    public static c630[] values() {
        return (c630[]) c.clone();
    }
}
