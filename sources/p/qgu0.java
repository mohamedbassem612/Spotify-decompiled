package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qgu0 {
    public static final qgu0 a;
    public static final qgu0 b;
    public static final /* synthetic */ qgu0[] c;

    static {
        qgu0 qgu0Var = new qgu0("CardClicked", 0);
        a = qgu0Var;
        qgu0 qgu0Var2 = new qgu0("CardLongClicked", 1);
        b = qgu0Var2;
        c = new qgu0[]{qgu0Var, qgu0Var2};
    }

    public static qgu0 valueOf(String str) {
        return (qgu0) Enum.valueOf(qgu0.class, str);
    }

    public static qgu0[] values() {
        return (qgu0[]) c.clone();
    }
}
