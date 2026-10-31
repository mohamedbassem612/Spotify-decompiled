package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qpe1 {
    public static final qpe1 a;
    public static final qpe1 b;
    public static final qpe1 c;
    public static final qpe1 d;
    public static final /* synthetic */ qpe1[] e;

    static {
        qpe1 qpe1Var = new qpe1("Unknown", 0);
        a = qpe1Var;
        qpe1 qpe1Var2 = new qpe1("Static", 1);
        b = qpe1Var2;
        qpe1 qpe1Var3 = new qpe1("SyllableSynced", 2);
        c = qpe1Var3;
        qpe1 qpe1Var4 = new qpe1("SentenceSynced", 3);
        d = qpe1Var4;
        e = new qpe1[]{qpe1Var, qpe1Var2, qpe1Var3, qpe1Var4};
    }

    public static qpe1 valueOf(String str) {
        return (qpe1) Enum.valueOf(qpe1.class, str);
    }

    public static qpe1[] values() {
        return (qpe1[]) e.clone();
    }
}
