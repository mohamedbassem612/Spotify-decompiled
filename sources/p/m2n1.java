package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m2n1 {
    public static final m2n1 a;
    public static final m2n1 b;
    public static final m2n1 c;
    public static final m2n1 d;
    public static final /* synthetic */ m2n1[] e;

    static {
        m2n1 m2n1Var = new m2n1("RowClicked", 0);
        a = m2n1Var;
        m2n1 m2n1Var2 = new m2n1("Impression", 1);
        b = m2n1Var2;
        m2n1 m2n1Var3 = new m2n1("ContextMenuClicked", 2);
        c = m2n1Var3;
        m2n1 m2n1Var4 = new m2n1("SwipedEnd", 3);
        d = m2n1Var4;
        e = new m2n1[]{m2n1Var, m2n1Var2, m2n1Var3, m2n1Var4};
    }

    public static m2n1 valueOf(String str) {
        return (m2n1) Enum.valueOf(m2n1.class, str);
    }

    public static m2n1[] values() {
        return (m2n1[]) e.clone();
    }
}
