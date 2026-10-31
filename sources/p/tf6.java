package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tf6 {
    public static final tf6 a;
    public static final tf6 b;
    public static final /* synthetic */ tf6[] c;

    static {
        tf6 tf6Var = new tf6("FRONT", 0);
        a = tf6Var;
        tf6 tf6Var2 = new tf6("BACK", 1);
        b = tf6Var2;
        c = new tf6[]{tf6Var, tf6Var2};
    }

    public static tf6 valueOf(String str) {
        return (tf6) Enum.valueOf(tf6.class, str);
    }

    public static tf6[] values() {
        return (tf6[]) c.clone();
    }
}
