package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qpb1 {
    public static final qpb1 a;
    public static final qpb1 b;
    public static final qpb1 c;
    public static final qpb1 d;
    public static final /* synthetic */ qpb1[] e;

    static {
        qpb1 qpb1Var = new qpb1("PAGE_MATCHED", 0);
        a = qpb1Var;
        qpb1 qpb1Var2 = new qpb1("ALMOST_THERE", 1);
        b = qpb1Var2;
        qpb1 qpb1Var3 = new qpb1("FLIP_FORWARD", 2);
        c = qpb1Var3;
        qpb1 qpb1Var4 = new qpb1("FLIP_BACK", 3);
        d = qpb1Var4;
        e = new qpb1[]{qpb1Var, qpb1Var2, qpb1Var3, qpb1Var4};
    }

    public static qpb1 valueOf(String str) {
        return (qpb1) Enum.valueOf(qpb1.class, str);
    }

    public static qpb1[] values() {
        return (qpb1[]) e.clone();
    }
}
