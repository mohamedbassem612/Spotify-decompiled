package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jj7 {
    public static final jj7 a;
    public static final jj7 b;
    public static final /* synthetic */ jj7[] c;

    static {
        jj7 jj7Var = new jj7("AUTOMATIC", 0);
        a = jj7Var;
        jj7 jj7Var2 = new jj7("ENABLED", 1);
        b = jj7Var2;
        c = new jj7[]{jj7Var, jj7Var2, new jj7("DISABLED", 2)};
    }

    public static jj7 valueOf(String str) {
        return (jj7) Enum.valueOf(jj7.class, str);
    }

    public static jj7[] values() {
        return (jj7[]) c.clone();
    }
}
