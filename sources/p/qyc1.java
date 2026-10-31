package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qyc1 {
    public static final qyc1 a;
    public static final qyc1 b;
    public static final qyc1 c;
    public static final /* synthetic */ qyc1[] d;

    static {
        qyc1 qyc1Var = new qyc1("YEAR_IN_MUSIC", 0);
        a = qyc1Var;
        qyc1 qyc1Var2 = new qyc1("TOP_MOMENTS", 1);
        b = qyc1Var2;
        qyc1 qyc1Var3 = new qyc1("IDENTITY", 2);
        c = qyc1Var3;
        d = new qyc1[]{qyc1Var, qyc1Var2, qyc1Var3};
    }

    public static qyc1 valueOf(String str) {
        return (qyc1) Enum.valueOf(qyc1.class, str);
    }

    public static qyc1[] values() {
        return (qyc1[]) d.clone();
    }
}
