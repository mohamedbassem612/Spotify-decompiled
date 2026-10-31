package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qvd1 {
    public static final qvd1 a;
    public static final qvd1 b;
    public static final /* synthetic */ qvd1[] c;

    static {
        qvd1 qvd1Var = new qvd1("CIRCLE", 0);
        a = qvd1Var;
        qvd1 qvd1Var2 = new qvd1("SQUARE", 1);
        b = qvd1Var2;
        c = new qvd1[]{qvd1Var, qvd1Var2};
    }

    public static qvd1 valueOf(String str) {
        return (qvd1) Enum.valueOf(qvd1.class, str);
    }

    public static qvd1[] values() {
        return (qvd1[]) c.clone();
    }
}
