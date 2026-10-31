package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qc31 {
    public static final qc31 a;
    public static final qc31 b;
    public static final qc31 c;
    public static final /* synthetic */ qc31[] d;

    static {
        qc31 qc31Var = new qc31("POSITIVE", 0);
        a = qc31Var;
        qc31 qc31Var2 = new qc31("NEGATIVE", 1);
        b = qc31Var2;
        qc31 qc31Var3 = new qc31("CANCEL", 2);
        c = qc31Var3;
        d = new qc31[]{qc31Var, qc31Var2, qc31Var3};
    }

    public static qc31 valueOf(String str) {
        return (qc31) Enum.valueOf(qc31.class, str);
    }

    public static qc31[] values() {
        return (qc31[]) d.clone();
    }
}
