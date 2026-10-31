package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qk1 {
    public static final qk1 a;
    public static final qk1 b;
    public static final /* synthetic */ qk1[] c;

    static {
        qk1 qk1Var = new qk1("ADD", 0);
        a = qk1Var;
        qk1 qk1Var2 = new qk1("ADDED", 1);
        b = qk1Var2;
        c = new qk1[]{qk1Var, qk1Var2};
    }

    public static qk1 valueOf(String str) {
        return (qk1) Enum.valueOf(qk1.class, str);
    }

    public static qk1[] values() {
        return (qk1[]) c.clone();
    }
}
