package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ijg1 {
    public static final ijg1 a;
    public static final ijg1 b;
    public static final ijg1 c;
    public static final /* synthetic */ ijg1[] d;

    static {
        ijg1 ijg1Var = new ijg1("TRANSITION_MODE_UNSPECIFIED", 0);
        a = ijg1Var;
        ijg1 ijg1Var2 = new ijg1("TRANSITION_MODE_INSTANT", 1);
        b = ijg1Var2;
        ijg1 ijg1Var3 = new ijg1("TRANSITION_MODE_SEAMLESS", 2);
        c = ijg1Var3;
        d = new ijg1[]{ijg1Var, ijg1Var2, ijg1Var3};
    }

    public static ijg1 valueOf(String str) {
        return (ijg1) Enum.valueOf(ijg1.class, str);
    }

    public static ijg1[] values() {
        return (ijg1[]) d.clone();
    }
}
