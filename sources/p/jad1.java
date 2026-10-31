package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jad1 {
    public static final jad1 a;
    public static final jad1 b;
    public static final jad1 c;
    public static final /* synthetic */ jad1[] d;

    static {
        jad1 jad1Var = new jad1("StartToEnd", 0);
        a = jad1Var;
        jad1 jad1Var2 = new jad1("EndToStart", 1);
        b = jad1Var2;
        jad1 jad1Var3 = new jad1("Settled", 2);
        c = jad1Var3;
        d = new jad1[]{jad1Var, jad1Var2, jad1Var3};
    }

    public static jad1 valueOf(String str) {
        return (jad1) Enum.valueOf(jad1.class, str);
    }

    public static jad1[] values() {
        return (jad1[]) d.clone();
    }
}
