package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c840 {
    public static final c840 a;
    public static final c840 b;
    public static final /* synthetic */ c840[] c;

    static {
        c840 c840Var = new c840("NONE", 0);
        a = c840Var;
        c840 c840Var2 = new c840("SUPPORTER_DIALOG", 1);
        b = c840Var2;
        c = new c840[]{c840Var, c840Var2};
    }

    public static c840 valueOf(String str) {
        return (c840) Enum.valueOf(c840.class, str);
    }

    public static c840[] values() {
        return (c840[]) c.clone();
    }
}
