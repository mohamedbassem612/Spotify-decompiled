package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ijf1 {
    public static final ijf1 a;
    public static final ijf1 b;
    public static final /* synthetic */ ijf1[] c;

    static {
        ijf1 ijf1Var = new ijf1("TRACK_A", 0);
        a = ijf1Var;
        ijf1 ijf1Var2 = new ijf1("TRACK_B", 1);
        b = ijf1Var2;
        c = new ijf1[]{ijf1Var, ijf1Var2};
    }

    public static ijf1 valueOf(String str) {
        return (ijf1) Enum.valueOf(ijf1.class, str);
    }

    public static ijf1[] values() {
        return (ijf1[]) c.clone();
    }
}
